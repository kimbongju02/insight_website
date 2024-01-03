package com.website.insight;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "File")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long num;

    private String name;
    private long size;
    private String storage_path;
    private long board_num;

    public FileEntity() {
    }

    public FileEntity(String name, int size, String storage_path, long board_num) {
        this.name = name;
        this.size = size;
        this.storage_path = storage_path;
        this.board_num = board_num;
    }
}
