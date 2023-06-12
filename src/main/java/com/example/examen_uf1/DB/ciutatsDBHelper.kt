package com.example.examen_uf1.DB

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.examen_uf1.DB.Ciutats.COLUMN_NAME_EDITORIAL
import com.example.examen_uf1.DB.Ciutats.COLUMN_NAME_TITLE
import com.example.examen_uf1.DB.Ciutats.SQL_CREATE_ENTRIES
import com.example.examen_uf1.DB.Ciutats.SQL_DELETE_ENTRIES
import com.example.examen_uf1.DB.Ciutats.TABLE_NAME

class ciutatsDBHelper (context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    override fun onCreate(db: SQLiteDatabase?) {
        if (db != null) {
            db.execSQL(SQL_CREATE_ENTRIES)
        }
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        if (db != null) {
            db.execSQL(SQL_DELETE_ENTRIES)
        }
        onCreate(db)

    }
    companion object {
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "ciutats.db"
    }





    }
//fun insertCiutats(l: Ciutats) {
    val values = ContentValues()
    //values.put(Ciutats.COLUMN_NAME_TITLE, l.nomCiutatText)


   /* val db = ciutatsDBHelper.writableDatabase
    db.insert(Ciutats.TABLE_NAME, null, values)
//


*/