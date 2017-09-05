package com.adil.services;

import com.adil.entities.OrderLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adil.repositories.OrderLineRepository;

import java.util.List;

/**
 * Created by Adil on 3/26/2017.
 */
@Service
public class OrderLineService {
    @Autowired
    private OrderLineRepository orderLineRepository;

    public OrderLine findById(long id) {
        return orderLineRepository.findOne(id);
    }

    public List<OrderLine> findAll() {
        return orderLineRepository.findAll();
    }

    public OrderLine save(OrderLine orderLine) {
        return orderLineRepository.saveAndFlush(orderLine);
    }

    public OrderLine update(OrderLine orderLine) {
        return save(orderLine);
    }

    public void delete(OrderLine orderLine) {
        orderLineRepository.delete(orderLine);
    }

    public void delete(long id) {
        orderLineRepository.delete(id);
    }
}
