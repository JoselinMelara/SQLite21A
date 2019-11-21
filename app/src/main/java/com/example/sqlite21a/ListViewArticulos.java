package com.example.sqlite21a;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListViewArticulos extends AppCompatActivity {

    ListView listViewPersonas;
    ArrayAdapter adaptador;
    SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter adapter;
    String[] version = {"Aestro","Blender","CupCake","Donut","Eclair","Froyo","GingerBread","HoneyComb","IceCream Sandwich", "Jelly Bean","Kitkat","Lolipop","Marshmallow","Nought","Oreo"};
    ConexionSQLite conexion = new ConexionSQLite(this); Dto datos = new Dto();



        }


