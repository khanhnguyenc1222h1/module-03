package service;

import model.Customer;

public interface CustomerService {
    Customer viewCustomer();
    Customer deleteCustomer(int id);
    Customer createCustomer();
    Customer updateCustomer(int id);
}
