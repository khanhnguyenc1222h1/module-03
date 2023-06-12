package com.example.casestudykhanh.model.entity;

public class Post {
    private int id;
    private String urlImage;
    private String textPost;

    public Post(String urlImage, String textPost) {
        this.urlImage = urlImage;
        this.textPost = textPost;
    }

    public Post(int id, String urlImage, String textPost) {
        this.id = id;
        this.urlImage = urlImage;
        this.textPost = textPost;
    }

    public int getId() {
        return id;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", urlImage='" + urlImage + '\'' +
                ", textPost='" + textPost + '\'' +
                '}';
    }
}
