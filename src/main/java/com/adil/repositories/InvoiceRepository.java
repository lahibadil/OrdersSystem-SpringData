package com.adil.repositories;

import com.adil.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Adil on 3/26/2017.
 */
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
