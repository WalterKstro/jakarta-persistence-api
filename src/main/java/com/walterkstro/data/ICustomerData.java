package com.walterkstro.data;

import com.walterkstro.entry.Customer;

import java.util.List;

public interface ICustomerData {
    List<Customer> getAllCustomers();
    Customer findCustomerById(Customer c);
    Customer findCustomerByEmail(Customer c);
    void createNewCustomer(Customer c);
    void updateCustomer(Customer c);
    void deleteCustomer(Customer c);
}
