package com.adil.services;

import com.adil.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adil.repositories.CustomerRepository;

import java.util.List;

/**
 * Created by Adil on 3/26/2017.
 */
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer findById(long id) {
        return customerRepository.findOne(id);
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer save(Customer customer) {
        return customerRepository.saveAndFlush(customer);
    }

    public Customer update(Customer customer) {
        return customerRepository.saveAndFlush(customer);
    }

    public void delete(Customer customer) {
        customerRepository.delete(customer);
    }

    public void delte(long id) {
        customerRepository.delete(id);
    }
}
