package com.example.jwbdexam_c1222h1_nguyenvankhanh;

import com.example.jwbdexam_c1222h1_nguyenvankhanh.model.dao.ProductDao;
import com.example.jwbdexam_c1222h1_nguyenvankhanh.model.entity.Product;

import java.util.List;

public class test {
    public static void main(String[] args) {
        ProductDao dao = new ProductDao();
        List<Product> list = dao.getAllProduct();
        for(Product lists : list) {
            System.out.println(lists);
        }
    }
}
