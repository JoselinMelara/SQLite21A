package com.example.sqlite21a;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConsultaSpinner extends AppCompatActivity {

    private Spinner sp_options;
    private TextView tv_cod, tv_descripcion, tv_codigo, tv_precio;

    ConexionSQLite conexion = new ConexionSQLite(this);
    Dto datos = new Dto();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_spinner);

        }
    }



