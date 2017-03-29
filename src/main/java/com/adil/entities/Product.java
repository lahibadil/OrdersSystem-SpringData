package com.adil.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Adil on 3/19/2017.
 */
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long id;

    @Column(name = "productCode")
    private String code;

    @Column(name = "description")
    private String description;

    @Column(name = "suggestedUnitPrice")
    private BigDecimal suggestedUnitPrice;

    @Column(name = "buyUnitPrice")
    private BigDecimal buyUnitPrice;

    @Column(name = "unitsInStock")
    private int unitsInStock;

    @Column(name = "unitsOnOrder")
    private int unitsOnOrder;

    @Column(name = "reorderLevel")
    private int reorderLevel;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "productSupplier", joinColumns = @JoinColumn(name = "product_id")
            , inverseJoinColumns = @JoinColumn(name = "supplier_id"))
    private List<Supplier> suppliers;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getSuggestedUnitPrice() {
        return suggestedUnitPrice;
    }

    public void setSuggestedUnitPrice(BigDecimal suggestedUnitPrice) {
        this.suggestedUnitPrice = suggestedUnitPrice;
    }

    public BigDecimal getBuyUnitPrice() {
        return buyUnitPrice;
    }

    public void setBuyUnitPrice(BigDecimal buyUnitPrice) {
        this.buyUnitPrice = buyUnitPrice;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public int getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(int unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }
}
