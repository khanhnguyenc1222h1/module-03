package com.example.casestudykhanh.controller;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import static com.example.casestudykhanh.model.service.UserService.*;

@WebServlet(urlPatterns = {"/home","","/"})
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "register":
                registerUser(request,response);
                break;
            case "login":
                loginUser(request,response);
                break;
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "register":
                showRegisterUser(request,response);
                break;
            case "login":
                showLoginUser(request,response);
                break;
            default:
                showHome(request,response);
                break;
        }
    }
}