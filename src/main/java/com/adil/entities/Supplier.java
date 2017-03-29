package com.adil.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Adil on 3/19/2017.
 */
@Entity
@Table(name = "supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id")
    private long id;

    @Column(name = "compnayName")
    private String company;

    @Column(name = "contactName")
    private String contact;

    @Column(name = "contactJobTitle")
    private String contactjobTitle;

    @Column(name = "phoneOffice", unique = true, length = 10)
    private String phoneOffice;

    @Column(name = "phoneMobile", unique = true, length = 10)
    private String phoneMobile;

    @Column(name = "fax", length = 10)
    private String fax;

    @Column(name = "email")
    private String email;

    @Embedded
    private Address address;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "suppliers")
    private List<Product> products;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactjobTitle() {
        return contactjobTitle;
    }

    public void setContactjobTitle(String contactjobTitle) {
        this.contactjobTitle = contactjobTitle;
    }

    public String getPhoneOffice() {
        return phoneOffice;
    }

    public void setPhoneOffice(String phoneOffice) {
        this.phoneOffice = phoneOffice;
    }

    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
