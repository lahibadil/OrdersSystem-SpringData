package com.adil.entities;

import javax.persistence.*;
import java.util.Map;

/**
 * Created by Adil on 3/19/2017.
 */

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private long id;


    private String company;

    @ElementCollection
    @CollectionTable(name = "costumer_contacts", joinColumns = @JoinColumn(name = "customer_id"))
    @MapKeyColumn(name = "contactJobTitle")
    @Column(name = "contactName")
    private Map<String, String> contacts;

    @Column(name = "phoneOffice", length = 10)
    private String phoneOffice;

    @Column(name = "phoneMobile", length = 10)
    private String phoneMobile;

    @Column(name = "fax", length = 10)
    private String fax;

    @Embedded
    private Address address;

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

    public Map<String, String> getContacts() {
        return contacts;
    }

    public void setContacts(Map<String, String> contacts) {
        this.contacts = contacts;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
