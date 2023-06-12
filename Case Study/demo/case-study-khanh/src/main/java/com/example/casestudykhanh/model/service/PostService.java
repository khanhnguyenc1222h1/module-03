package com.example.casestudykhanh.model.service;

import com.example.casestudykhanh.model.dao.PostDao;
import com.example.casestudykhanh.model.entity.Post;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
public class PostService {
    public void addPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PostDao dao = new PostDao();
        request.setCharacterEncoding("UTF-8");
        String urlImage = request.getParameter("urlImage");
        String textPost = request.getParameter("textPost");
        String id = request.getParameter("id");
        dao.insertPost(urlImage,textPost,id);
        response.sendRedirect("/show");
    }
    public void showAddPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("\\WEB-INF\\view\\AddPost.jsp").forward(request,response);
    }
    public void showPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PostDao dao = new PostDao();
        List<Post> post = dao.getAllPost();
        request.setAttribute("postS",post);
        request.getRequestDispatcher("\\WEB-INF\\view\\ShowPost.jsp").forward(request,response);
    }
    public void deletePost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("pid");
        PostDao dao = new PostDao();
        dao.deletePost(id);
        response.sendRedirect("/show");
    }

    public void showUpdatePost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id = request.getParameter("pid");
        PostDao dao = new PostDao();
        Post p = dao.getPostById(id);
        request.setAttribute("pt",p);
        request.getRequestDispatcher("\\WEB-INF\\view\\UpdatePost.jsp").forward(request,response);
    }
    public void updatePost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PostDao dao = new PostDao();
        request.setCharacterEncoding("UTF-8");
        String image = request.getParameter("image");
        String txt = request.getParameter("txt");
        String id = request.getParameter("id");
        dao.setSelectPostById(id, image, txt);
        response.sendRedirect("/show");
    }
}
