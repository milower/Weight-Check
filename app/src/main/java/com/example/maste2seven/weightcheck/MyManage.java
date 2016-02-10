package com.example.maste2seven.weightcheck;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Maste2seven on 3/2/2559.
 */
public class MyManage {

    //explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase; //คำสั่งให้เขียนและอ่าน

    private static final String table_user = "userTABLE";
    private static final String table_weight = "weightTable";
    private static final String column_id = "id";
    private static final String column_user = "User";
    private static final String column_pass = "Password";
    private static final String column_name = "Name";
    private static final String column_date = "date";
    private static final String column_weight = "Weight";

    public MyManage(Context context) {

        //create & connected
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();
        
    }//construtoc

        public long addUserTable(String strUser,String strPass,String strName) {
            ContentValues objContentValues = new ContentValues();
            objContentValues.put(column_user,strUser);
            objContentValues.put(column_pass,strPass);
            objContentValues.put(column_name,strName);
            return writeSqLiteDatabase.insert(table_user,null,objContentValues);
        }

}//main class

