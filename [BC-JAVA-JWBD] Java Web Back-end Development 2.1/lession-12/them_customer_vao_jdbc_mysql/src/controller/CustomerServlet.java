package controller;
import model.Customer;

import java.sql.*;

public class CustomerServlet {
    String jdbcURL = "jdbc:mysql://localhost:3306/CASESTUDY";
    String jdbcUsername = "root";
    String jdbcPassword = "123456";
    private static final String INSERT_CUSTOMER_SQL = "INSERT INTO customer( username, password) VALUES (?, ?);";
    public Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    public Customer selectCustomer(int id){
        Customer customer = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_SQL)){
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
               String USERNAME = rs.getString("USERNAME");
               String PASSWORD = rs.getString("PASSWORD");
               customer = new Customer(USERNAME, PASSWORD);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
