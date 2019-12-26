package com.king.appBoard.dao;

import java.util.List;

import com.king.appBoard.domain.BoardVO;

public interface BoardDao {
	
	public abstract List<BoardVO> list();
	public abstract void delete(int seq);
//	public abstract int deleteAll();
	public abstract void insert(BoardVO boardVO);
//	public abstract BoardVO select(int seq);
//	public abstract int updateReadCount(int seq);
	public abstract BoardVO read(int seq);
	public abstract void update(BoardVO boardVO); 

}
