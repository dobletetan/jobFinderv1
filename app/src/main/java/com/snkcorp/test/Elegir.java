package com.snkcorp.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Elegir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir);
    }
    public void onClick(View view) {
        if (view.getId() == R.id.empresa_button) {
            Intent elegirIntent = new Intent(Elegir.this,empresa.class);
            startActivity(elegirIntent);



        } else if (view.getId() == R.id.Persona_button) {
            //
        } else if (view.getId() == R.id.Back) {
            Intent elegirIntent = new Intent(Elegir.this,MainActivity.class);
            startActivity(elegirIntent);

        }
    }
}