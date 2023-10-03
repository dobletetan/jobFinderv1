package com.snkcorp.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class empresaP2 extends AppCompatActivity {
    private Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa_p2);
        spin = findViewById(R.id.spinnerSector);
        String [] options = {"Sector Dirigido","Informatica", "Educacion","Salud"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,options);
        spin.setAdapter(adapter);
    }
    public void onClick(View view) {
        if (view.getId() == R.id.Crear) {
            Intent elegirIntent = new Intent(empresaP2.this, empresaP2.class);
            startActivity(elegirIntent);



        } else if (view.getId() == R.id.inicio) {
            Intent elegirIntent = new Intent(empresaP2.this, MainActivity.class);
            startActivity(elegirIntent);
        } else if (view.getId() == R.id.Back) {
            Intent elegirIntent = new Intent(empresaP2.this, empresa.class);
            startActivity(elegirIntent);

        }
    }
}