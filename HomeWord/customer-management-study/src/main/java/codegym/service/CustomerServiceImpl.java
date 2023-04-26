package codegym.service;

import codegym.model.Customer;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService{
    private static Map<Integer, Customer> customers;

    private String jdbcURL =  "jdbc:mysql://localhost:3306/customer";
    private String jdbcUsername = "root";
    private String jdbcPassword = "123456";

    private static final String insert_customer_sql = "INSERT INTO customer(name,email,address) VALUES (?,?,?);";
    private static final String select_customer_by_id = "select id,name,email,address from customer where id=?";
    private static final String select_all_customer = "select * from customer";
    private static final String delete_customer_sql = "delete from customer where id=?";
    private static final String update_customer_sql = "update customer set name=?,email=?,address=?;";

    protected Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return connection;
    }

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "John", "john@codegym.vn", "Hanoi"));
        customers.put(2, new Customer(2, "Bill", "bill@codegym.vn", "Danang"));
        customers.put(3, new Customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        customers.put(4, new Customer(4, "Adam", "adam@codegym.vn", "Beijin"));
        customers.put(5, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        customers.put(6, new Customer(6, "Rose", "rose@codegym.vn", "Newyork"));
    }

    @Override
    public List<Customer> findAll() {
        new ArrayList<>(customers.values());//customers.values() lấy giá trị trong key Map
        List<Customer> customers = new ArrayList<>();
        try{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(select_all_customer);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                customers.add(new Customer(id,name,email,address));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return customers;
    }

    @Override
    public void insertCustomer(Customer customer) {//insert
        customers.put(customer.getId(),customer);
        try{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(insert_customer_sql);
            preparedStatement.setString(1,customer.getName());
            preparedStatement.setString(2,customer.getEmail());
            preparedStatement.setString(3,customer.getAddress());
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public Customer findById(int id) {
        Customer customer = null;
        try{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(select_customer_by_id);
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                customer = new Customer(id,name,email,address);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);
        try{
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(update_customer_sql);
            statement.setString(1,customer.getName());
            statement.setString(2,customer.getEmail());
            statement.setString(3,customer.getAddress());
//            statement.setInt(4,customer.getId());
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
        try{
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(delete_customer_sql);
            statement.setInt(1,id);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
