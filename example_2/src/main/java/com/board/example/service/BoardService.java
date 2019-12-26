package com.board.example.service;

import java.util.List;
import com.board.example.dto.BoardDTO;

public interface BoardService {// 트랜잭션 역할 
	
	//1.게시물 목록 조회
	public List<BoardDTO> boardList() throws Exception;

	//2.게시물 상세내용 불러오기
	public BoardDTO boardRead(int bno) throws Exception;

	//3.게시물 글쓰기
	public void writerBoard(BoardDTO bdto) throws Exception;

	//4.게시물 수정 실행
	public void updateBoard(BoardDTO bdto) throws Exception;

	//5.게시물 삭제 실행 
	public void deleteBoard(int bno) throws Exception;
	
	//6.조회수 업데이트
	public void viewUpdate(int bno) throws Exception;
}
