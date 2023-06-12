package com.example.casestudykhanh.model.service;

import com.example.casestudykhanh.model.dao.UserDao;
import com.example.casestudykhanh.model.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserService{

    static UserDao userDao = new UserDao();
    PostService postService = new PostService();

    public void registerUser(HttpServletRequest request, HttpServletResponse response){
        try{
            String fullname = request.getParameter("fullname");
            String address = request.getParameter("address");
            String phonenumber = request.getParameter("phonenumber");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            PostService postService = new PostService();
            if(fullname.equals("") || address.equals("")||phonenumber.equals("") || username.equals("")&&password.equals("")){
                request.getRequestDispatcher("\\WEB-INF\\view\\register.jsp").forward(request,response);
            }else{
                    User user = new User(fullname,address,phonenumber,username,password);
                    userDao.insertUser(user);
                    request.setAttribute("user",user);
                    postService.showPost(request,response);
            }
        }catch (Exception e){
        }
    }
    public void loginUser(HttpServletRequest request, HttpServletResponse response) {
       try{
           String username = request.getParameter("username");
           String password = request.getParameter("password");
           if(username == ""|| password == ""){
               response.sendRedirect("/login");
           }else{
                 postService.showPost(request,response);
//               response.sendRedirect("/show");
           }
       }catch (Exception e){
       }
    }
/*    public static void showHome(HttpServletRequest request, HttpServletResponse response) throws SQLException {
//        List<Post> listPost = PostDao.selectAllPost();
//        request.setAttribute("listPost",listPost);
        RequestDispatcher dispatcher = request.getRequestDispatcher("\\WEB-INF\\view\\Home.jsp");
        try{
            dispatcher.forward(request,response);
        }catch (ServletException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }*/
}
