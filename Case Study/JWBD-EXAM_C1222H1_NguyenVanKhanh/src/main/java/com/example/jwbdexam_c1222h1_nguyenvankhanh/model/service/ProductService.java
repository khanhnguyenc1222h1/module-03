package com.example.jwbdexam_c1222h1_nguyenvankhanh.model.service;

import com.example.jwbdexam_c1222h1_nguyenvankhanh.model.dao.ProductDao;
import com.example.jwbdexam_c1222h1_nguyenvankhanh.model.entity.Product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ProductService {
    public void showProduct(HttpServletRequest request, HttpServletResponse response){
        ProductDao dao = new ProductDao();
        List<Product> product = dao.getAllProduct();
        request.setAttribute("product",product);
        response.sendRedirect("product");
    }
}
