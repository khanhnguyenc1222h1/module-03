package com.example.casestudykhanh.controller;
import com.example.casestudykhanh.model.service.UserService;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = {"/home","","/login","/register"})
public class UserController extends HttpServlet {
    UserService userService = new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getServletPath();
        switch (action){
            case "/register":
                   userService.registerUser(request,response);
                break;
            case "/login":
                   userService.loginUser(request,response);
                break;
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String action = request.getServletPath();
        switch (action){
            case "/login":
                    request.getRequestDispatcher("\\WEB-INF\\view\\Login.jsp").forward(request,response);
                break;
            case "/register":
                    request.getRequestDispatcher("\\WEB-INF\\view\\Register.jsp").forward(request,response);
                break;
            case "":
            case "/home":
                    request.getRequestDispatcher("\\WEB-INF\\view\\Home.jsp").forward(request,response);
                break;
            default:
                    request.getRequestDispatcher("\\WEB-INF\\view\\error.jsp").forward(request,response);
                break;
        }
    }
}