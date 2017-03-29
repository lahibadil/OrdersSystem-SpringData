package com.adil.entities;

import javax.persistence.*;
import java.util.Map;

/**
 * Created by Adil on 3/19/2017.
 */

@Entity
@Table(name = "shipper")
public class Shipper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shpper_id")
    private long id;

    @Column(name = "compnayName")
    private String compnay;

    @ElementCollection
    @CollectionTable(name = "shiper_contact", joinColumns = @JoinColumn(name = "shiper_id"))
    @MapKeyColumn(name = "contactJobTitle")
    @Column(name = "contactName")
    private Map<String, String> contacts;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompnay() {
        return compnay;
    }

    public void setCompnay(String compnay) {
        this.compnay = compnay;
    }

    public Map<String, String> getContacts() {
        return contacts;
    }

    public void setContacts(Map<String, String> contacts) {
        this.contacts = contacts;
    }
}
