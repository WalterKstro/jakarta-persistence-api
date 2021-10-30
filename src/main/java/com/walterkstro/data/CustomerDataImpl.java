package com.walterkstro.data;

import com.walterkstro.entry.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class CustomerDataImpl implements ICustomerData {
    /*INYECTAR UNIDAD DE PERSISTENCIA*/
    @PersistenceContext(unitName = "CustomerPU")
    EntityManager em;

    @Override
    public List getAllCustomers() {
        return em.createNamedQuery("findAll").getResultList();
    }

    @Override
    public Customer findCustomerById(Customer c) {
        return em.find(Customer.class, c.getIdCustomer());
    }

    @Override
    public Customer findCustomerByEmail(Customer c) {
        /*SE CRE UN QUERY PERSONALIZADO*/
        Query query = em.createQuery("SELECT c FROM Customer c WHERE c.Ct_Email = :email");
        /*SE ASIGNA EL PARAMETRO*/
        query.setParameter("email", c.getCt_Email());

        return (Customer) query.getSingleResult();

        //return em.find(Customer.class, c.getCt_Email());
    }

    @Override
    public void createNewCustomer(Customer c) {
        em.persist(c);
    }

    @Override
    public void updateCustomer(Customer c) {
        em.merge(c);
    }

    @Override
    public void deleteCustomer(Customer c) {
        em.remove(em.merge(c));
    }
}
