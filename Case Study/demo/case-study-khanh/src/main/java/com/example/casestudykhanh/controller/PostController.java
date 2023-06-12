package com.example.casestudykhanh.controller;

import com.example.casestudykhanh.model.service.PostService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/delete","/update","/add","/show"})
public class PostController extends HttpServlet {
    PostService postService = new PostService();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        switch (action){
            case "/update":
                    postService.updatePost(request,response);
                break;
            case "/add":
                    postService.addPost(request,response);
                break;
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        switch (action) {
            case "/delete":
                postService.deletePost(request,response);
                break;
            case "/update":
                postService.showUpdatePost(request,response);
                break;
            case "/add":
                postService.showAddPost(request,response);
                break;
            case "/show":
                postService.showPost(request,response);
                break;
        }
    }
}
