package com.king.appBoard.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.king.appBoard.domain.BoardVO;

@Repository
public class BoardDaoImpl implements BoardDao{

	private SqlSessionTemplate sqlSessionTemplate;
	
	@Autowired
	public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) { 
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	@Override
	public List<BoardVO> list() {
		return sqlSessionTemplate.selectList("list"); 
	}
	
	public void insert(BoardVO boardVO) {
		sqlSessionTemplate.insert("insert",boardVO);
	}
	
	@Override
	public BoardVO read(int seq) {
		return sqlSessionTemplate.selectOne("read",seq);
	}
	@Override
	public void update(BoardVO boardVO) {
		sqlSessionTemplate.update("update",boardVO);
	}
	public void delete(int seq) {
		sqlSessionTemplate.delete("delete",seq);
	}
	

}
