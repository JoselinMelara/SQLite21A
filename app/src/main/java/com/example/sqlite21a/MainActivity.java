package com.example.sqlite21a;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnGuardar, btnConsultar, btnConsultar1, btnModificar, btnEliminar;
    private EditText etcodigo, etprecio, etdescripcion;

    boolean estadoCodigo = false;
    boolean estadoDescripcion = false;
    boolean estadoPrecio = false;
    int estadoInsert = 0;
    final Context context = this;

    Modal ventanas = new Modal();

    ConexionSQLite conexion = new ConexionSQLite(this);
    Dto datos = new Dto();
    AlertDialog.Builder dialogo;

    public void limpiarD(View view) {
        etcodigo.setText(null);
        etdescripcion.setText(null);
        etprecio.setText(null);
    }


    }

