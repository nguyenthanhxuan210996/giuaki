package com.example.nguyenthanhxuan.thigiuakinguyenthanhxuann14dcpt205;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Nguyen Thanh Xuan on 4/2/2018.
 */

public class DBHepler extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "MN.db";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_MONEY = "TABLE_MONEY";
    public static final String NOIDUNG = "NOIDUNG";
    public static final String SOTIEN = "SOTIEN";
    public static final String HINHTHUC = "HINHTHUC";
    //public static final String INHT = "INHT";

    public static final String CREATE_TABLE_MONEY = "CREATE TABLE "+TABLE_MONEY+"(\n" +
            NOIDUNG+" TEXT NOT NULL,\n" +
            SOTIEN+" TEXT NOT NULL,\n" +
            HINHTHUC+" INTEGER NOT NULL) ;" ;

    public DBHepler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_MONEY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    public SQLiteDatabase OpenDatabase(){
        return getWritableDatabase();
    }
    public void CloseDatabase(){
        close();
    }
}
