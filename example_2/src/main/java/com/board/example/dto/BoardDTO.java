package com.board.example.dto;

import java.util.Date;

public class BoardDTO { // data 전달자 
	
	//Field
	private int bno; // 게시물 번호
	private String title;   // 제목
	private String content; // 내용
	private String writer;  // 작성자
	private Date regdate;   // 작성일자
	private String viewcnt; // 조회수
	
	//Constructor Super
	public BoardDTO() {}
	
	// alt + shift + s   >  generate Constructor using field
	public BoardDTO(int bno, String title, String content, String writer, Date regdate, String viewcnt) {
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
	public String getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(String viewcnt) {
		this.viewcnt = viewcnt;
	}

}
