package com.adil.entities;

import com.adil.entities.ids.OrderLineID;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Adil on 3/19/2017.
 */
@Entity
@Table(name = "orderLine")
public class OrderLine {

    @EmbeddedId
    private OrderLineID lineID;

    @ManyToOne
    @JoinColumn(name = "order_id")
    @MapsId("order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @MapsId("product_id")
    private Product product;

    @Column
    private int quantity;
    @Column
    private BigDecimal unitPrice;
    @Column
    private int lineNumber;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public OrderLineID getLineID() {
        return lineID;
    }

    public void setLineID(OrderLineID lineID) {
        this.lineID = lineID;
    }
}
