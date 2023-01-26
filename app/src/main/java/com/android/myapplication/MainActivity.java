package com.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnluminosidad,btnproximidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnluminosidad=(Button) findViewById(R.id.btnLuminosidad);
        btnproximidad=(Button)findViewById(R.id.btnProximidad);

        btnproximidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ActivityProximidad.class);
                startActivity(i);
            }
        });

        btnluminosidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ActivityLuminosidad.class);
                startActivity(i);
            }
        });
    }
}