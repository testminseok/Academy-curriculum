package com.board.example.dto;

import java.util.Date;

public class BoardDTO {
	//Field
	
	private int bno;		//게시물번호		
	private String title;		//게시물제목
	private String content;	//게시물 내용
	private String writer;		//게시물 작성자
	private Date regdate;	//게시물 작성일자
	private int viewcnt;	//게시물 조회수
	
	
	
	//Constructor
	public BoardDTO() {} //DTO 데이터베이스 연결자
	public BoardDTO(int bno, String title, String content, String writer, Date regdate, int viewcnt) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
		this.viewcnt = viewcnt;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	
	
	
}
