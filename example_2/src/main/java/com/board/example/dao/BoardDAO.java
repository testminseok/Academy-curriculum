package com.board.example.dao;

import java.util.List;
import com.board.example.dto.BoardDTO;

public interface BoardDAO {
	
	//1.게시물 목록 보기
	public List<BoardDTO> boardList() throws Exception;

	//2. 게시물 상세내용 불러오기 
	public BoardDTO boardRead(int bno)throws Exception;

	//3. 게시물 작성
	public void writerBoard(BoardDTO bdto)throws Exception;

	//4. 게시물 수정
	public void boardUpdate(BoardDTO bdto) throws Exception;

	//5. 게시물 삭제
	public void boardDelete(int bno) throws Exception;

	//6. 게시물 조회수 업데이트 
	public void viewCount(int bno) throws Exception;
}
