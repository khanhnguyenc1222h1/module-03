package com.example.casestudykhanh.model.dao;
import com.example.casestudykhanh.connection.jdbcConnection;
import com.example.casestudykhanh.model.entity.User;

import java.sql.*;


public class UserDao{
    static Connection conn = null;
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    private static final String INSERT_USER = "INSERT INTO USER(FULLNAME,EMAIL,PASSWORD,GENDER) VALUES (?,?,?,?);";
    private static final String SELECT_USER_BY_ID = "SELECT * FROM USER WHERE EMAIL=? && PASSWORD=?";
    public void insertUser(User user){
            try{
                conn = jdbcConnection.getConnection();
                ps = conn.prepareStatement(INSERT_USER);
                ps.setString(1, user.getFullname());
                ps.setString(2, user.getEmail());
                ps.setString(3, user.getPassword());
                ps.setString(4, user.getGender());
                ps.executeUpdate();
                conn.close();
                ps.close();
            }catch (Exception e){
            }
    }
    public static User getUserById(String email,String password){
        try{
            conn = jdbcConnection.getConnection();
            ps= conn.prepareStatement(SELECT_USER_BY_ID);
            ps.setString(1,email);
            ps.setString(2,password);
            rs = ps.executeQuery();
            while(rs.next()){
                String id = rs.getString("ID_USER");
                String fullname = rs.getString("FULLNAME");
                String emails = rs.getString("EMAIL");
                String passwords = rs.getString("PASSWORD");
                String gender = rs.getString("GENDER");
                return new User(id,fullname,emails,passwords,gender);
            }
        }catch (Exception e){
        }
        return null;
    }
}
