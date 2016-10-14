package com.example.amirmaharjan.siproject.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Amir Maharjan on 10/14/2016.
 */

public class SIdatabasehelper extends SQLiteOpenHelper {

    private static final String DATABASENAME = "SIdatabase";
    private static final int DATABASEVERSION = 1;


    //Stock Table
    public static final String TABLE_STOCK = "Stock";
    public static final String STOCK_ID = "Id";
    public static final String STOCK_NAME = "Name";
    public static final String STOCK_STATUS = "Status";
    public static final String STOCK_SPECIFICATION = "Specification";
    public static final String STOCK_RATE = "Rate";
    public static final String STOCK_QUANTITY = "Quantity";
    private static final String CREATE_TABLE_STOCK = "CREATE TABLE "
            + TABLE_STOCK + "(" + STOCK_ID + " BIGINT PRIMARY KEY, "
            + STOCK_NAME + " VARCHAR(50), "
            + STOCK_STATUS + " BIT, "
            + STOCK_SPECIFICATION + " VARCHAR(50), "
            + STOCK_RATE + " float,"
            + STOCK_QUANTITY + "INTEGER"+");";


    //Purchase Table
    public static final String TABLE_PURCHASE = "Purchase";
    public static final String PURCHASE_ID = "Id";
    public static final String PURCHASE_NAME = "Name";
    public static final String PURCHASE_SPECIFICATION = "Specification";
    public static final String PURCHASE_STOCK_ID = "StockId";
    public static final String PURCHASE_QUANTITY = "Quantity";
    public static final String PURCHASE_DATE = "Date";
    public static final String PURCHASE_STATUS = "Status";
    public static final String PURCHASE_RATE = "Rate";
    private static final String CREATE_TABLE_PURCHASE = "CREATE TABLE "
            + TABLE_PURCHASE + "(" + PURCHASE_ID+ " INTEGER PRIMARY KEY, "
            + PURCHASE_NAME + " VARCHAR(50), "
            + PURCHASE_SPECIFICATION + "VARCHAR(50),"
            + PURCHASE_STOCK_ID + "INTEGER,"
            + PURCHASE_QUANTITY + "float,"
            + PURCHASE_STATUS + " BIT, "
            + PURCHASE_RATE  + "float,"
            + PURCHASE_DATE + "datetime,"
            + "FOREIGN KEY (" +PURCHASE_STOCK_ID + ") REFERENCES" + TABLE_STOCK +"("+STOCK_ID+")"+"ON DELETE CASCADE);";




    //Used Table
    public static final String TABLE_USED = "Used";
    public static final String USED_ID = "Id";
    public static final String USED_NAME = "Name";
    public static final String USED_SPECIFICATION="Specification";
    public static final String USED_STOCK_ID = "StockId";
    public static final String USED_STATUS = "Status";
    public static final String USED_QUANTITY = "Quantity";
    public static final String USED_DATE = "Date";
    private static final String CREATE_TABLE_USED = "CREATE TABLE "
            + TABLE_USED + "(" + USED_ID+ " INT PRIMARY KEY, "
            + USED_NAME + " VARCHAR(50), "
            + USED_SPECIFICATION + "VARCHAR(50),"
            + USED_STOCK_ID + "INTEGER,"
            + USED_QUANTITY + "float,"
            + USED_STATUS + " BIT, "
            + USED_DATE + "datetime,"
            + "FOREIGN KEY (" +USED_STOCK_ID + ") REFERENCES" + TABLE_STOCK +"("+STOCK_ID+")"+"ON DELETE CASCADE);";






    public SIdatabasehelper(Context context) {
        super(context, DATABASENAME, null, DATABASEVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE_STOCK);
        db.execSQL(CREATE_TABLE_PURCHASE);
        db.execSQL(CREATE_TABLE_USED);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        //Drop existing tables
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STOCK);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PURCHASE);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USED);
        onCreate(db);

    }
}
