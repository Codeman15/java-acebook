package com.makersacademy.acebook.model;

public class PostForm {

    private String content; //class attribute (variable)

    public PostForm(String blah) {
        this.content = blah;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String blah) { //void as not returning anything
        this.content = blah;
    }
}
