package com.example.amirmaharjan.siproject.model;

import java.util.Date;

/**
 * Created by Amir Maharjan on 10/14/2016.
 */

public class UsedModel {
    private int Id;
    private String Name;
    private String Specification;
    private int Quantity;
    private Date date;
    private boolean Status;
    private int StockId;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSpecification() {
        return Specification;
    }

    public void setSpecification(String specification) {
        Specification = specification;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public int getStockId() {
        return StockId;
    }

    public void setStockId(int stockId) {
        StockId = stockId;
    }
}
