package com.adil.services;

import com.adil.entities.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adil.repositories.SupplierRepository;

import java.util.List;

/**
 * Created by Adil on 3/26/2017.
 */
@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    public Supplier findById(long id) {
        return supplierRepository.findOne(id);
    }

    public List<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    public Supplier save(Supplier supplier) {
        return supplierRepository.saveAndFlush(supplier);
    }

    public Supplier update(Supplier supplier) {
        return save(supplier);
    }

    public void delete(Supplier supplier) {
        supplierRepository.delete(supplier);
    }

    public void delete(long id) {
        supplierRepository.delete(id);
    }
}
