package com.walterkstro.services;

import com.walterkstro.data.ICustomerData;
import com.walterkstro.entry.Customer;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class CustomerServiceImpl implements ICustomerService{
    @Inject
    private ICustomerData interactive;

    @Override
    public List<Customer> all() {
        return interactive.getAllCustomers();
    }

    @Override
    public Customer findId(Customer c) {
        return interactive.findCustomerById(c);
    }

    @Override
    public Customer findEmail(Customer c) {
        return interactive.findCustomerByEmail(c);
    }

    @Override
    public void create(Customer c) {
        interactive.createNewCustomer(c);
    }

    @Override
    public void update(Customer c) {
        interactive.updateCustomer(c);
    }

    @Override
    public void delete(Customer c) {
        interactive.deleteCustomer(c);
    }
}
