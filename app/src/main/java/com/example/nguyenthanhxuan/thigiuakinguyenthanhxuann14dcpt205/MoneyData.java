package com.example.nguyenthanhxuan.thigiuakinguyenthanhxuann14dcpt205;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by Nguyen Thanh Xuan on 4/2/2018.
 */

public class MoneyData {
    Context context;
    DBHepler dbHepler;
    public MoneyData(Context context) {
        this.context = context;
        dbHepler = new DBHepler(context,DBHepler.DATABASE_NAME,null,DBHepler.DATABASE_VERSION);
    }
    public void ThemHocVien(Money money){
        ContentValues content = new ContentValues();
        content.put(DBHepler.NOIDUNG,money.getNd());
        content.put(DBHepler.SOTIEN,money.getSotien());
        content.put(DBHepler.HINHTHUC,money.getHinhthuc());
        //content.put(DBHepler.INHT,money.getInhinhthuc());
        SQLiteDatabase db = dbHepler.OpenDatabase();
        db.insert(DBHepler.TABLE_MONEY,null,content);
    }
    public ArrayList<Money> LietKeHV(){
        ArrayList<Money> listHocVien = new ArrayList<Money>();
        SQLiteDatabase db = dbHepler.OpenDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + DBHepler.TABLE_MONEY,null);
        c.moveToFirst();
        if (c.getCount()>0){
            while (!c.isAfterLast()){
                listHocVien.add(new Money(c.getString(1),c.getString(2),c.getInt(3),c.getString(4)));
                c.moveToNext();
            }
        }
        dbHepler.CloseDatabase();
        return listHocVien;
    }
}

