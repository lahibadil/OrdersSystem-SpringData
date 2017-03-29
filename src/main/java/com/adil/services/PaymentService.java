package com.adil.services;

import com.adil.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adil.repositories.PaymentRepository;

import java.util.List;

/**
 * Created by Adil on 3/26/2017.
 */
@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public Payment findById(long id) {
        return paymentRepository.findOne(id);
    }

    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    public Payment save(Payment payment) {
        return paymentRepository.saveAndFlush(payment);
    }

    public Payment update(Payment payment) {
        return save(payment);
    }

    public void delete(Payment payment) {
        paymentRepository.delete(payment);
    }

    public void delete(long id) {
        paymentRepository.delete(id);
    }

}
