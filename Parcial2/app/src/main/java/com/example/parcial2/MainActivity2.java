package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        int nombre = intent.getIntExtra("NOMBRE", 0);


        TextView textViewNombre = findViewById(R.id.nombre);
        textViewNombre.setText(String.valueOf(nombre));
    }
    public void regresar (View view) {

        finish();
    }

}