package com.example.amirmaharjan.siproject.database;

import java.util.ArrayList;

/**
 * Created by Amir Maharjan on 10/14/2016.
 */

public interface IRepository<T> {
    public String Insert(T Object);
    public ArrayList<T> GetAll();
    public T GetById(int id);
    public String Update(T Purchase, int id);

}
