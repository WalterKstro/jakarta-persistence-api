package com.walterkstro.entry;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "customers")
/*SE CRE UN QUERY PERSONALIZADO*/
@NamedQueries({
        @NamedQuery(name="findAll", query="SELECT c FROM Customer c ORDER BY c.idCustomer")
})

public class Customer implements Serializable {
    private static final long serialVersionLONG = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Ct_ID")
    private int idCustomer;

    private String Ct_First;
    private String Ct_Last;
    private String Ct_Email;
    private String Ct_Phone;

    public Customer() {
    }

    public Customer(String ct_First, String ct_Last, String ct_Email, String ct_Phone) {
        Ct_First = ct_First;
        Ct_Last = ct_Last;
        Ct_Email = ct_Email;
        Ct_Phone = ct_Phone;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCt_First() {
        return Ct_First;
    }

    public void setCt_First(String ct_First) {
        Ct_First = ct_First;
    }

    public String getCt_Last() {
        return Ct_Last;
    }

    public void setCt_Last(String ct_Last) {
        Ct_Last = ct_Last;
    }

    public String getCt_Email() {
        return Ct_Email;
    }

    public void setCt_Email(String ct_Email) {
        Ct_Email = ct_Email;
    }

    public String getCt_Phone() {
        return Ct_Phone;
    }

    public void setCt_Phone(String ct_Phone) {
        Ct_Phone = ct_Phone;
    }
}
