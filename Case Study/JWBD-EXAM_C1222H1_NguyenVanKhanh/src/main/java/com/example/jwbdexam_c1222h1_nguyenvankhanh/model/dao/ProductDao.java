package com.example.jwbdexam_c1222h1_nguyenvankhanh.model.dao;

import com.example.jwbdexam_c1222h1_nguyenvankhanh.Connection.jdbcConnection;
import com.example.jwbdexam_c1222h1_nguyenvankhanh.model.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private static final String INSERT_PRODUCT = "INSERT INTO PRODUCT VALUES (?,?,?,?,?);";
    private static final String UPDATE_PRODUCT = "UPDATE PRODUCT SET NAME=?, PRICE=?, DESCRIPTION=?, IMAGE_URL=? WHERE ID=?;";
    private static final String DELETE_PRODUCT = "DELETE FROM PRODUCT WHERE ID=?;";
    private static final String SELECT_ALL_PRODUCT = "SELECT * FROM PRODUCT;";
    private static final String SELECT_ID_PRODUCT = "SELECT * FROM PRODUCT WHERE ID=?;";
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public List<Product> getAllProduct(){
        List<Product> products = new ArrayList<>();
        try{
            conn = jdbcConnection.getConnection();
            ps = conn.prepareStatement(SELECT_ALL_PRODUCT);
            rs = ps.executeQuery();
            while (rs.next()){
                products.add(new Product(rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getString(4),rs.getString(5)));
            }
            conn.close();
            ps.close();
            return products;
        }catch (Exception e){
        }
        return null;
    }
}
