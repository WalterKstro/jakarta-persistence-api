package com.walterkstro.services;


import com.walterkstro.entry.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> all();
    Customer findId(Customer c);
    Customer findEmail(Customer c);
    void create(Customer c);
    void update(Customer c);
    void delete(Customer c);
}
