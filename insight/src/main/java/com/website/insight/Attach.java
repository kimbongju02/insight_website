package com.website.insight;

import java.io.Serializable;
import java.sql.Blob;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
 
public class Attach{
	private Integer num;
	private String name;
	private Integer size;
	private String file;
	private Integer board_num;
	
	public Attach() {}
	public Attach(int num, String name, int size, String file, int board) {
		this.num = num;
		this.name = name;
		this.size = size;
		this.file = file;
		this.board_num = board;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setFile() {
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String formatedNow = now.format(formatter);
		String file_name = formatedNow + this.name;
		this.file = file_name;
	}
	public void setBoard(int board) {
		this.board_num = board;
	}
	
	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	public String getFile() {
		return file;
	}
	public int getBoard() {
		return board_num;
	}
}