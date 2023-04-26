package com.example.casestudykhanh.model.dao;
import com.example.casestudykhanh.model.entity.User;

import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.example.casestudykhanh.connection.jdbcConnection.getConnection;

public class UserDao{
    private static final String insert_user = "INSERT INTO USER(FULLNAME,ADDRESS,PHONENUMBER,USERNAME,PASSWORD) VALUES (?,?,?,?,?);";
    private static final String select_user_id = "SELECT ID,FULLNAME,ADDRESS,PHONENUMBER,USERNAME,PASSWORD USER WHERE USERNAME=? AND PASSWORD=?";
    private static final String select_all_user = "SELECT * FROM USER";

    public static void insert(User user) {
        try{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(insert_user);
            preparedStatement.setString(1,user.getFullname());
            preparedStatement.setString(2,user.getAddress());
            preparedStatement.setString(3,user.getPhoneNumber());
            preparedStatement.setString(4,user.getUsername());
            preparedStatement.setString(5,user.getPassword());
            if(preparedStatement.executeUpdate() > 0) {
                System.out.println("Added user successfully.");
            } else {
                System.out.println("Failed to insert user.");
            }
            connection.close();
            preparedStatement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static boolean validUser(String username,String password) {
        boolean result = false;
        try{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(select_all_user);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                String userName = rs.getString("USERNAME");
                String passWord = rs.getString("PASSWORD");
                if(userName.equals(username) && passWord.equals(password)){
                    result = true;
                    System.out.println("valid user true");
                }
            }
        }catch (SerialException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
