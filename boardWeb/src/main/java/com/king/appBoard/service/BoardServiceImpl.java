package com.king.appBoard.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.king.appBoard.dao.BoardDao;
import com.king.appBoard.domain.BoardVO;
@Service
public class BoardServiceImpl implements BoardService{
	
	@Resource
	private BoardDao boardDao;
	
	public BoardDao getBoardDao() {
		return 	boardDao;
	}
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	@Override
	public List<BoardVO> list() {
		return boardDao.list();
	}
	@Override
	public void write(BoardVO boardVO) {
		boardDao.insert(boardVO); 
	}
	
	@Override
	public BoardVO read(int seq) {
		return boardDao.read(seq);
	}
	@Override
	public void update(BoardVO boardVO) {
		boardDao.update(boardVO);
	}
	@Override
	public void delete(int seq) {
		boardDao.delete(seq);
	}
}
