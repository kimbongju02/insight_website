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
@Table(name = "Board")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long num;

    private String title;
    private String context;
    private Date date;

    public BoardEntity() {
    }

    public BoardEntity(int num, String title, String context, Date date) {
        this.num = num;
        this.title = title;
        this.context = context;
        this.date = date;
    }
}
