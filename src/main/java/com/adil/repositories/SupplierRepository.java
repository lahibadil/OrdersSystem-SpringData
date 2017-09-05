package com.adil.repositories;

import com.adil.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Adil on 3/26/2017.
 */
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}
