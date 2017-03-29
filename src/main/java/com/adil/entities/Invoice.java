package com.adil.entities;

import com.adil.entities.enums.InvoiceStatus;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Adil on 3/19/2017.
 */
@Entity
@Table(name = "invoice")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "invoiceDate")
    private Date invoiceDate;

    @Enumerated(EnumType.STRING)
    private InvoiceStatus orderStatus;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
    private List<InvoiceLine> invoiceLines;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public InvoiceStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(InvoiceStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<InvoiceLine> getInvoiceLines() {
        return invoiceLines;
    }

    public void setInvoiceLines(List<InvoiceLine> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }
}
