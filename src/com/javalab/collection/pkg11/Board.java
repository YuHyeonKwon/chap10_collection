package com.javalab.collection.pkg11;

public class Board { // class s

	private Integer id;
	private String title;
	private String writer;
	private String date;
	private Integer hitcount;
	
	public Board() {
		super();
	}
	
	public Board(Integer id, String title, String writer, String date, Integer hitcount) {
		super();
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getHitcount() {
		return hitcount;
	}

	public void setHitcount(Integer hitcount) {
		this.hitcount = hitcount;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", title=" + title + ", writer=" + writer + ", date=" + date + ", hitcount="
				+ hitcount + "]";
	}
	
} // class e
