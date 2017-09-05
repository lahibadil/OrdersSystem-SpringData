package com.adil.services;

import com.adil.entities.InvoiceLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adil.repositories.InvoiceLineRepository;

import java.util.List;

/**
 * Created by Adil on 3/26/2017.
 */
@Service
public class InvoiceLineService {
    @Autowired
    private InvoiceLineRepository invoiceLineRepository;

    public InvoiceLine findById(long id) {
        return invoiceLineRepository.findOne(id);
    }

    public List<InvoiceLine> findAll() {
        return invoiceLineRepository.findAll();
    }

    public InvoiceLine save(InvoiceLine invoiceLine) {
        return invoiceLineRepository.saveAndFlush(invoiceLine);
    }

    public InvoiceLine update(InvoiceLine invoiceLine) {
        return save(invoiceLine);
    }

    public void delete(InvoiceLine invoiceLine) {
        invoiceLineRepository.delete(invoiceLine);
    }

    public void delete(long id) {
        invoiceLineRepository.delete(id);
    }
}
