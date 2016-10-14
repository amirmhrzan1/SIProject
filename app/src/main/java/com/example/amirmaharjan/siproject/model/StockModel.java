package com.example.amirmaharjan.siproject.model;

import java.util.Date;

/**
 * Created by Amir Maharjan on 10/14/2016.
 */

public class StockModel {
    private int Id;
    private String Name;
    private String Specification;
    private int Quantity;
    private boolean Status;
    private float Rate;

    public String getSpecification() {
        return Specification;
    }

    public void setSpecification(String specification) {
        Specification = specification;
    }

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

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public float getRate() {
        return Rate;
    }

    public void setRate(float rate) {
        Rate = rate;
    }
}
