package com.snkcorp.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class persona extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persona);
    }
    public void onClick(View view) {
        if (view.getId() == R.id.Siguiente) {
            Intent elegirIntent = new Intent(persona.this, personaP2.class);
            startActivity(elegirIntent);


        } else if (view.getId() == R.id.inicio) {
            Intent elegirIntent = new Intent(persona.this, MainActivity.class);
            startActivity(elegirIntent);
        } else if (view.getId()  == R.id.Back) {
            Intent elegirIntent = new Intent(persona.this, Elegir.class);
            startActivity(elegirIntent);

        }
    }
}