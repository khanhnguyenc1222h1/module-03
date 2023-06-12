package com.example.casestudykhanh.model.service;

import com.example.casestudykhanh.model.dao.UserDao;
import com.example.casestudykhanh.model.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.regex.Pattern;

public class UserService{

    static UserDao userDao = new UserDao();
    PostService postService = new PostService();

    public void registerUser(HttpServletRequest request, HttpServletResponse response){
        try{
            String fullname = request.getParameter("fullname");
            String email = request.getParameter("email");
            Pattern emailP = Pattern.compile("^(.+)@(.+)$");
//            request.setAttribute("messE",(emailP.matcher(email).find()) ? "":"nhập lại email");
            /*Mật khẩu phải chứa ít nhất một chữ số [0-9].
                    Mật khẩu phải chứa ít nhất một ký tự Latinh viết thường [az].
                    Mật khẩu phải chứa ít nhất một ký tự Latinh viết hoa [AZ].
                    Mật khẩu phải chứa ít nhất một ký tự đặc biệt như ! @ # & ( ).
                    Mật khẩu phải có độ dài ít nhất là 6 ký tự và tối đa là 8 ký tự.*/
            String password = request.getParameter("password");
            Pattern passP = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,8}$");
//            request.setAttribute("messP",(passP.matcher(password).find())?"":"nhập lại password");
            String confirm_password = request.getParameter("confirm_password");
            /*request.setAttribute("messCP",password.equals(confirm_password) ? "password đã được xác nhận"
                    : "password không chính xác");*/
            int num = Integer.parseInt(request.getParameter("gender"));
            String gender="";
            if(num == 0) {
                gender = "Female";
            }else{
                gender = "Male";
            }
            if(emailP.matcher(email).find() && passP.matcher(password).find() && password.equals(confirm_password)){
                PostService postService = new PostService();
                User user = new User(fullname,email,password,gender);
                userDao.insertUser(user);
                request.setAttribute("user",user);
                postService.showPost(request,response);
            }else{
                request.setAttribute("messE",(emailP.matcher(email).find()) ? "":"nhập lại email");
                request.setAttribute("messP",(passP.matcher(password).find())?"":"nhập lại password");
                request.setAttribute("messCP",password.equals(confirm_password) ? ""
                    : "password không chính xác");
                request.setAttribute("rsF",fullname);
                request.setAttribute("rsE",email);
                request.setAttribute("rsP",password);
                request.setAttribute("rsCP",confirm_password);
                request.getRequestDispatcher("\\WEB-INF\\view\\Register.jsp").forward(request,response);
            }

        }catch (Exception e){
        }
    }
    public void loginUser(HttpServletRequest request, HttpServletResponse response) {
       try{
           String email = request.getParameter("email");
           String password = request.getParameter("password");
           User result = UserDao.getUserById(email,password);
           if(result != null){
                response.sendRedirect("/show");
           }else{
                request.setAttribute("mess","Nhập lại email hoặc password");
                request.setAttribute("messE",email);
                request.getRequestDispatcher("\\WEB-INF\\view\\Login.jsp").forward(request,response);
           }
       }catch (Exception e){
       }
    }
}
