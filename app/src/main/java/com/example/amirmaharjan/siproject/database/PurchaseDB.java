package com.example.amirmaharjan.siproject.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by Amir Maharjan on 10/14/2016.
 */

class PurchaseDB implements IRepository {

    SQLiteOpenHelper dbHelper;
    SQLiteDatabase db;

    public PurchaseDB(Context context){
        dbHelper = new SIdatabasehelper(context);
    }

    public void Open()
    {
        db = dbHelper.getWritableDatabase();
    }


    @Override
    public String Insert(Object Purchase) {


        return null;
    }

    @Override
    public ArrayList GetAll() {
        return null;
    }

    @Override
    public Object GetById(int id) {
        return null;
    }

    @Override
    public String Update(Object Purchase, int id) {
        return null;
    }
}
