package com.adil.services;

import com.adil.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adil.repositories.OrderRepository;

import java.util.List;

/**
 * Created by Adil on 3/26/2017.
 */
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order findById(long id) {
        return orderRepository.findOne(id);
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order save(Order order) {
        return orderRepository.saveAndFlush(order);
    }

    public Order update(Order order) {
        return save(order);
    }

    public void delete(Order order) {
        orderRepository.delete(order);
    }

    public void delete(long id) {
        orderRepository.delete(id);
    }
}
