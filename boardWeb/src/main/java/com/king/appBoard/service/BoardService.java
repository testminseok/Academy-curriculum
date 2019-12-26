package com.king.appBoard.service;

import java.util.List;

import com.king.appBoard.domain.BoardVO;

public interface BoardService {
	
	public abstract List<BoardVO> list();
	public abstract void delete(int seq);
//	public abstract int edit(BoardVO boardVO);
	public abstract void update(BoardVO boardVO) ;
	public abstract void write(BoardVO boardVO); 
	public abstract BoardVO read(int seq);
	
}
