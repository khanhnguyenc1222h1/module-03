package com.example.casestudykhanh.model.service;

import com.example.casestudykhanh.model.dao.UserDao;
import com.example.casestudykhanh.model.entity.User;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static com.example.casestudykhanh.model.dao.UserDao.validUser;

public class UserService{
    public static void registerUser(HttpServletRequest request, HttpServletResponse response) {
        String fullName = request.getParameter("fullname");
        String address = request.getParameter("address");
        String phoneNumber = request.getParameter("phonenumber");
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
        User user = new User(fullName,address,phoneNumber,userName,passWord);
        UserDao.insert(user);
        RequestDispatcher dispatcher = request.getRequestDispatcher("\\WEB-INF\\view\\home\\home.jsp");
        try{
            dispatcher.forward(request,response);
        }catch (ServletException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void showRegisterUser(HttpServletRequest request, HttpServletResponse response){
        RequestDispatcher dispatcher = request.getRequestDispatcher("\\WEB-INF\\view\\register\\register.jsp");
        try{
            dispatcher.forward(request,response);
        }catch (ServletException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void loginUser(HttpServletRequest request, HttpServletResponse response){
        RequestDispatcher dispatcher = null;
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validUser = validUser(userName,password);
        if(validUser){
            dispatcher = request.getRequestDispatcher("\\WEB-INF\\view\\home\\home.jsp");
        }else{
            dispatcher = request.getRequestDispatcher("\\WEB-INF\\view\\error\\error.jsp");
        }
        try{
            dispatcher.forward(request,response);
        }catch (ServletException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void showLoginUser(HttpServletRequest request, HttpServletResponse response){
        RequestDispatcher dispatcher = request.getRequestDispatcher("\\WEB-INF\\view\\login\\login.jsp");
        try{
            dispatcher.forward(request,response);
        }catch (ServletException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void showHome(HttpServletRequest request, HttpServletResponse response){
        RequestDispatcher dispatcher = request.getRequestDispatcher("\\WEB-INF\\view\\home\\home.jsp");
        try{
            dispatcher.forward(request,response);
        }catch (ServletException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
