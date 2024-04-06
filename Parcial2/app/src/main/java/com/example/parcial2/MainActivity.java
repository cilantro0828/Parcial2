package com.example.parcial2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;
    private int edad;
    private int ID;
    private EditText forma_pago ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.nombre);
        edad = findViewById(R.id.edad);
        ID = findViewById(R.id.ID);
        forma_pago = findViewById(R.id.pago);
    }

    private void nombre (int nombre) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("NOMBRE", nombre);
        startActivity(intent);
    }
    public void nombre (View view){
        nombre.setText(String.valueOf(nombre));
        nombre(nombre);
    }

}