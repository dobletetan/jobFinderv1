package com.snkcorp.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class empresa extends AppCompatActivity {
    private Spinner spinComuna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa);
        spinComuna = findViewById(R.id.spinner);
        String[] options = {"Comuna","Pudahuel","Providencia"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,options);
        spinComuna.setAdapter(adapter);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.Siguiente) {
            Intent elegirIntent = new Intent(empresa.this, empresaP2.class);
            startActivity(elegirIntent);


        } else if (view.getId() == R.id.inicio) {
            Intent elegirIntent = new Intent(empresa.this, MainActivity.class);
            startActivity(elegirIntent);
        } else if (view.getId()  == R.id.Back) {
            Intent elegirIntent = new Intent(empresa.this, Elegir.class);
            startActivity(elegirIntent);

        }
    }
}