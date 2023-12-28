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
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String formatedNow = date.format(formatter);
		this.date = formatedNow;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public void settitle(String title) {
		this.title = title;
	}
	public void setcontent(String content) {
		this.content = content;
	}
	public void setdate(LocalDate date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String formatedNow = date.format(formatter);
		this.date = formatedNow;
	}

	public int getNum() {
		return num;
	}
	public String gettitle() {
		return title;
	}
	public String getcontent() {
		return content;
	}
	public String getdate() {
		return date;
	}
}
