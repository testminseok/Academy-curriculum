package com.board.example.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession; //i바티스가 my바티스 전에 있던것
import org.springframework.stereotype.Repository;

import com.board.example.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO { //Impl이란 어떠한 인터페이스를 상속받아서 구현한 클래스를 의미한다.
	
	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<BoardDTO> boardList() throws Exception {
		return sqlSession.selectList("board.boardList");
	}

}
