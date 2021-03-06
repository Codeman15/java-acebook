package com.makersacademy.acebook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

import lombok.Data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@Entity                //creates the API
@Table(name = "POSTS") //database table is called posts
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //makes the id below incremental
    private Long id;
    private String content;
    private String time_stamp;

    private Post() {}

    public Post(String blah) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        this.content = blah;
        this.time_stamp = dateFormat.format(date);
    }

}
