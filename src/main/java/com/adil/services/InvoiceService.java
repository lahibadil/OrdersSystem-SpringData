package com.adil.services;

import com.adil.entities.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adil.repositories.InvoiceRepository;

import java.util.List;

/**
 * Created by Adil on 3/26/2017.
 */

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;

    public Invoice findById(long id) {
        return invoiceRepository.findOne(id);
    }

    public List<Invoice> findAll() {
        return invoiceRepository.findAll();
    }

    public Invoice save(Invoice invoice) {
        return invoiceRepository.saveAndFlush(invoice);
    }

    public Invoice update(Invoice invoice) {
        return save(invoice);
    }

    public void delete(Invoice invoice) {
        invoiceRepository.delete(invoice);
    }

    public void delete(long id) {
        invoiceRepository.delete(id);
    }
}
