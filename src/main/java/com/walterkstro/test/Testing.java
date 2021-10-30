package com.walterkstro.test;

import com.walterkstro.entry.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Testing {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CustomerPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // stat transaction
        et.begin();

        // create the object
        Customer ctm = new Customer("Diego","Figeroa","diego@gmail.com","56895645");

        // insert
        em.persist(ctm);

        // commit
        et.commit();

        // close
        em.close();
    }
}
