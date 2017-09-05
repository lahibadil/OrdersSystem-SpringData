package com.adil.services;

import com.adil.entities.Shipper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import com.adil.repositories.ShipperRepository;

import java.util.List;

/**
 * Created by Adil on 3/26/2017.
 */
@Service
@Configurable
public class ShipperService {
    @Autowired
    private ShipperRepository shipperRepository;

    public Shipper findById(long id) {
        return shipperRepository.findOne(id);
    }

    public List<Shipper> findAll() {
        return shipperRepository.findAll();
    }

    public Shipper save(Shipper shipper) {
        return shipperRepository.saveAndFlush(shipper);
    }

    public Shipper update(Shipper shipper) {
        return save(shipper);
    }

    public void delete(Shipper shipper) {
        shipperRepository.delete(shipper);
    }

    public void delete(long id) {
        shipperRepository.delete(id);
    }
}
