package com.adil.entities;

import com.adil.entities.ids.InvoiceLineID;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Adil on 3/19/2017.
 */

@Entity
public class InvoiceLine {
    @EmbeddedId
    private InvoiceLineID invoiceLineID;

    @ManyToOne
    @MapsId("invoice_id")
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    @ManyToOne
    @MapsId("product_id")
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "unitPrice")
    private BigDecimal unitPrice;
    @Column(name = "unitsShipped")
    private int unitsShipped;
    @Column(name = "lineNumber")
    private int lineNumber;

    public InvoiceLineID getInvoiceLineID() {
        return invoiceLineID;
    }

    public void setInvoiceLineID(InvoiceLineID invoiceLineID) {
        this.invoiceLineID = invoiceLineID;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitsShipped() {
        return unitsShipped;
    }

    public void setUnitsShipped(int unitsShipped) {
        this.unitsShipped = unitsShipped;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }
}
