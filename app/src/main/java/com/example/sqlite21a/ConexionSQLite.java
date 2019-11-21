package com.example.sqlite21a;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


    public class ConexionSQLite extends SQLiteOpenHelper {
        boolean estadoDelete;

        ArrayList<String> listaArticulos;
        ArrayList<Dto> articulosList;

        public ConexionSQLite(Context context) {

            super(context, "administracion.db", null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

            db.execSQL("create table articulos(codigo integer not null primary key, descripcion text, precio real)");

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int i, int i1) {

            db.execSQL("drop table if exists articulos");
            onCreate(db);
        }

        public SQLiteDatabase bd() {
            SQLiteDatabase bd = this.getWritableDatabase();
            return bd;
        }

        public boolean InserTradicional(Dto datos) {
            boolean estado = true;
            try {
                int codigo = datos.getCodigo();
                String descripcion = datos.getDescripcion();
                double precio = datos.getPrecio();

                Cursor fila = bd().rawQuery("select codigo from articulos where codigo='" + codigo + "'", null);
                if (fila.moveToFirst() == true) {
                    estado = false;
                } else {
                    String SQL = "INSERT INTO articulos \n" +
                            "(codigo, descripcion, precio)\n" +
                            "VALUES \n" +
                            "('" + String.valueOf(codigo) + "', '" + descripcion + "', '" + String.valueOf(precio) + "');";
                    bd().execSQL(SQL);
                    bd().close();
                    estado = true;
                }
            } catch (Exception e) {
                estado = true;
                Log.e("error.", e.toString());
            }
            return estado;

            }
        }