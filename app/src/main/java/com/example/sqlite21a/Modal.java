package com.example.sqlite21a;

import android.app.AlertDialog;
import android.app.Dialog;
import android.database.sqlite.SQLiteDatabase;

public class Modal {

    Dialog myDialog;
    AlertDialog.Builder dialogo;
    boolean validaInput = false;

    String codigo;
    String descripcion="";
    String precio;

    SQLiteDatabase bd = null;
    Dto datos = new Dto();
    }



