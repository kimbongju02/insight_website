package com.website.insight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Board {
	private Integer num;
	private String title;
	private String content;
	private String date;
	
	public Board() {}
	public Board(int num, String title, String content, LocalDate date) {
		this.num = num;
		this.title = title;
		this.content = content;
		setDate(date);
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setDate(LocalDate date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String formatedNow = date.format(formatter);
		this.date = formatedNow;
	}

	public int getNum() {
		return num;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getDate() {
		return date;
	}
}
