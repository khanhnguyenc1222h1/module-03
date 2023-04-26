package codegym.service;

import codegym.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void insertCustomer(Customer customer);//insert
    Customer findById(int id);
    void update(int id, Customer customer);
    void remove(int id);
}
