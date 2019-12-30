package com.king.appBoard.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.king.appBoard.domain.BoardVO;
import com.king.appBoard.service.BoardService;

@Controller
@SessionAttributes("boardVO")
public class BoardController {
	
	@Autowired
	private BoardService boardService; 
	
	public BoardService getBoardService() {
		return boardService;
	}
	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@RequestMapping(value="/board/list")
	public String list(Model model) {
		model.addAttribute("boardList", boardService.list());
		return "/board/list"; 
	}
	
//	@RequestMapping(value="/board/read/{seq}")
//	public String read(Model model, @PathVariable int seq) { 
//		BoardVO data = boardService.read(seq);
//		model.addAttribute("boardVO",data);
//		return "/board/read"; 
//	}
	@RequestMapping(value="/board/read/{seq}")
	public String read(Model model, @PathVariable int seq) {
		model.addAttribute("boardVO",boardService.read(seq));
		return "/board/read";
	}

	@RequestMapping(value = "/board/write", method=RequestMethod.GET) 
	public String write(Model model) {
		model.addAttribute("boardVO", new BoardVO());
		return "/board/write"; // jsp를 가리킨다.
	}
	
	@RequestMapping(value = "/board/write", method=RequestMethod.POST) 
	public String write(@Valid BoardVO boardVO, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "/board/write";
		}else {
			boardService.write(boardVO);
			return "redirect:/board/list";
		}
	}
	
//	@RequestMapping(value="/board/update/{seq}")
//	public String update(Model model, @PathVariable int seq) { 
//		System.out.println("업데이트 메소드 입장");
//		BoardVO data = boardService.read(seq);
//		model.addAttribute("data",data);
//		return "/board/update"; 
//	}
	@RequestMapping(value="/board/edit/{seq}", method=RequestMethod.GET)
	public String edit(@PathVariable int seq, Model model) {
		BoardVO vo = boardService.read(seq);
		model.addAttribute("boardVO",vo);
		return "/board/edit";
	}
	@RequestMapping(value="/board/edit/{seq}", method=RequestMethod.POST)
	public String edit(@Valid @ModelAttribute BoardVO boardVO,BindingResult result, int pwd, SessionStatus sessionStatus, Model model ) {
		if (result.hasErrors()) {
			return "/board/edit";
		}else {
			if (boardVO.getPassword() ==pwd) {
				boardService.edit(boardVO);
				sessionStatus.setComplete();
				return "redirect:/board/list";
			}
			model.addAttribute("msg","비밀번호가 일치하지 않습니다");
			return "/board/edit";
		}
	}
	
	
	
	@RequestMapping(value="/board/updatecomplate.do")
	public String updatecomplate(BoardVO boardVO) {
		boardService.update(boardVO); 
		return "redirect:list"; 
	}
	
	@RequestMapping(value="/board/delete/{seq}")
	public String delete(Model model, @PathVariable int seq) { 
		boardService.delete(seq);
		return "redirect:/board/list"; 
	}

	 
	
	
}
