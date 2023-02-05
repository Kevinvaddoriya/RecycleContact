package com.example.recyclecontact;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyDateHelper extends SQLiteOpenHelper {
    Context context;
    static String Database_name = "Contact.db";
    static int Database_version = 1;
    static String Table_Name = "Contact_Table";
    static String Column_Phone = "Number";
    static String Column_Name = "Name";


    public MyDateHelper(@Nullable Context context) {
        super(context,Database_name,null,Database_version);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + Table_Name + " (" + Column_Phone + " INTEGER PRIMARY KEY ," +
                Column_Name + " TEXT );";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
//        db.execSQL("DROP TABLE IF EXISTS " + Table_Name);
//        onCreate(db);
    }

    void addContact(String number,String name){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(Column_Phone,number);
        cv.put(Column_Name,name);
        long result = db.insert(Table_Name,null, cv);
        if (result == -1){
            Toast.makeText(context, "Faild", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context,"Add Successfully ",Toast.LENGTH_SHORT).show();
        }

    }
    Cursor readAllData(){
        String query = "SELECT * FROM " + Table_Name;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = null;
        if (db != null){
            cursor = db.rawQuery(query,null);

        }
        return cursor;
    }

}
