package com.example.casestudykhanh.model.dao;
import com.example.casestudykhanh.connection.jdbcConnection;
import com.example.casestudykhanh.model.entity.User;

import java.sql.*;

import static com.example.casestudykhanh.connection.jdbcConnection.getConnection;

public class UserDao{
    static Connection conn = null;
    static PreparedStatement ps = null;
    ResultSet rs ;
    private static final String INSERT_USER = "INSERT INTO USER VALUES (?,?,?,?,?);";
    private static final String SELECT_ALL_USER = "SELECT * FROM USER";
    public void insertUser(User user){
            try{
                conn = jdbcConnection.getConnection();
                ps = conn.prepareStatement(INSERT_USER);
                ps.setString(1, user.getFullname());
                ps.setString(2, user.getAddress());
                ps.setString(3, user.getPhoneNumber());
                ps.setString(4, user.getUsername());
                ps.setString(5, user.getPassword());
                ps.executeUpdate();
                conn.close();
                ps.close();
            }catch (Exception e){
            }
    }
/*    public void validUser(String username,String password) {
        boolean result = false;
        try{
            conn = getConnection();
            ps= conn.prepareStatement(SELECT_ALL_USER);
            rs = ps.executeQuery();
            while (rs.next()) {
                String userName = rs.getString("USERNAME");
                String passWord = rs.getString("PASSWORD");
                if (userName.equals(username) && passWord.equals(password)) {
                   result = true;
                }
            }
            conn.close();
            ps.close();
        }catch (Exception e){
        }
        return result;
    }*/
}
