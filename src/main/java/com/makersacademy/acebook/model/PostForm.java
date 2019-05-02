package com.makersacademy.acebook.model;

public class PostForm {

    private String content; //class attribute (variable)

    public PostForm(String postFormContent) {
        this.content = postFormContent;
    }

    public String getContent() {
        return content;
    }

//    public void setContent(String beans) { //setter. void as not returning anything. not actually currently being used
//        this.content = beans;
//    }
}
