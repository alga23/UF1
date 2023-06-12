package com.example.examen_uf1.DB

object Ciutats {
    val TABLE_NAME = "ciutat"
    val COLUMN_NAME_TITLE = "nomCiutats"
    val COLUMN_NAME_EDITORIAL = "nomCiutatsEditorial"

    val SQL_CREATE_ENTRIES =
        "CREATE TABLE ${TABLE_NAME} (" +
                "id INTEGER PRIMARY KEY," +
                "${COLUMN_NAME_TITLE} TEXT," +
                "${COLUMN_NAME_EDITORIAL} TEXT)"

    val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS ${TABLE_NAME}"
}

