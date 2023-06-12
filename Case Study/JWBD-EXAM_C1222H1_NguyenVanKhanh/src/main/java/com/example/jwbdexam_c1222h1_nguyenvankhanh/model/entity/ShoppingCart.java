package com.example.jwbdexam_c1222h1_nguyenvankhanh.model.entity;

public class ShoppingCart {
    private int Product_id;
    private String title;
    private String image;
    private float price;

    public ShoppingCart(int product_id, String title, String image, float price) {
        Product_id = product_id;
        this.title = title;
        this.image = image;
        this.price = price;
    }
}
