package com.example.uts_muhammadarifaditya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView Quiz;
    CardView Rumus;
    CardView Contoh;
    CardView Definisi;
    CardView Kalkulator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Quiz = findViewById(R.id.Quiz);
        Rumus = findViewById(R.id.Rumus);
        Kalkulator = findViewById(R.id.Kalkulator);
        Contoh = findViewById(R.id.Contoh);
        Definisi = findViewById(R.id.Definisi);


        Quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this,StartGame.class));
            }
        });

        Rumus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, rumus.class));
            }
        });
        Kalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Kalkulator.class));
            }
        });

        Definisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, defenisi.class));
            }
        });
        Contoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, contoh.class));
            }
        });



    }
}