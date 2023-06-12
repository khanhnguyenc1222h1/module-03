package com.example.casestudykhanh.model.dao;

import com.example.casestudykhanh.connection.jdbcConnection;
import com.example.casestudykhanh.model.entity.Post;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.example.casestudykhanh.connection.jdbcConnection.getConnection;

public class PostDao {
    public static Connection conn = null;
    public static PreparedStatement ps = null;
    public static Statement st = null;
    public static ResultSet rs = null;
    public static final String INSERT_POST = "INSERT INTO POST(URL_IMAGE,TEXT_POST,ID_USER) VALUES (?,?,?)";

    public static final String DELETE_POST = "DELETE FROM POST WHERE ID_POST=?";
    public static final String SELECT_POST_BY_ID = "SELECT * FROM POST WHERE ID_POST = ?";
    public static final String UPDATE_POST = "UPDATE POST SET URL_IMAGE=? , TEXT_POST=? WHERE ID_POST=?";
    public static final String SELECT_ALL_POST = "SELECT * FROM POST";

    public void insertPost(String urlImage,String textPost, String id) {
            try{
                conn = getConnection();
                ps = conn.prepareStatement(INSERT_POST);
                ps.setString(1, urlImage);
                ps.setString(2, textPost);
                ps.setString(3,id);
                ps.executeUpdate();
                conn.close();
                ps.close();
            }catch (Exception e){
            }
        }

    public void deletePost(String id){
            try{
                conn = getConnection();
                ps = conn.prepareStatement(DELETE_POST);
                ps.setString(1,id);
                ps.executeUpdate();
                conn.close();
                ps.close();
            }catch (Exception e){
            }
    }
    public Post getPostById(String id){
            try{
                conn = getConnection();
                ps = conn.prepareStatement(SELECT_POST_BY_ID);
                ps.setString(1,id);
                rs = ps.executeQuery();
                while (rs.next()){
                    return new Post(rs.getInt(1), rs.getString(2), rs.getString(3)) ;
                }
                conn.close();
                ps.close();
            }catch (Exception e){
            }
            return null;
    }

    public List<Post> getAllPost() {
        List<Post> list = new ArrayList<>();
        try {
            conn = getConnection();
            ps= conn.prepareStatement(SELECT_ALL_POST);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Post(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
            conn.close();
            ps.close();
        } catch (Exception e) {
        }
        return list;
    }
    public void setSelectPostById(String id, String urlImage, String textPost){
        try{
            conn = getConnection();
            ps = conn.prepareStatement(UPDATE_POST);
            ps.setString(1,urlImage);
            ps.setString(2,textPost);
            ps.setString(3,id);
            ps.executeUpdate();
            conn.close();
            ps.close();
        }catch (Exception e){
        }
    }

    public static void main(String[] args) {
        PostDao dao = new PostDao();
        List<Post> p = dao.getAllPost();
        for(Post list : p) {
            System.out.println(list);
        }
    }
}
