package com.example.uts_muhammadarifaditya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Kalkulator extends AppCompatActivity {

    Button btnSegitiga;
    Button btnLingkaran;
    Button btnPersegi;
    Button btnPersegiPanjang;
    Button btnTrapesium;
    Button btnLayang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulator);

        btnSegitiga =  findViewById(R.id.segitiga);
        btnLingkaran =  findViewById(R.id.lingkaran);
        btnPersegi =  findViewById(R.id.persegi);
        btnPersegiPanjang =  findViewById(R.id.persegiPanjang);
        btnTrapesium =  findViewById(R.id.trapesium);
        btnLayang =  findViewById(R.id.layangLayang);



        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Kalkulator.this, HitungSegitigaActivity.class);
                startActivity(i);
            }
        });

        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Kalkulator.this, HitungLingkaranActivity.class);
                startActivity(i);
            }
        });


        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Kalkulator.this, HitungPersegiActivity.class);
                startActivity(i);
            }
        });

        btnPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Kalkulator.this, HitungPersegiPanjangActivity.class);
                startActivity(i);
            }
        });

        btnTrapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Kalkulator.this, HitungTrapesiumActivity.class);
                startActivity(i);
            }
        });

        btnLayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Kalkulator.this, HitungLayangLayangActivity.class);
                startActivity(i);
            }
        });
    }
}