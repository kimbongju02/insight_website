package com.website.insight;

public class FileDTO {
	private String name;
    private long size;
    private long board_num;
    private String storage_path;
 
    public FileDTO(String name, long size, long board_num, String storage_path) {
        this.name = name;
        this.size = size;
        this.board_num = board_num;
        this.storage_path = storage_path;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public long getSize() {
        return size;
    }
 
    public void setSize(long size) {
        this.size = size;
    }
 
    public long getBoardNum() {
        return board_num;
    }
 
    public void setBoardNum(long board_num) {
        this.board_num = board_num;
    }
 
    public String getStoragePath() {
        return storage_path;
    }
 
    public void setStoragePath(String storage_path) {
        this.storage_path = storage_path;
    }
}
