package com.example.uts_muhammadarifaditya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class defenisi extends AppCompatActivity {
    RecyclerView recyclepl;
    List<defenisi2>lispl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defenisi);
        inidummypl();
        recyclepl = findViewById(R.id.recypl);
        Adapterdefenisi adapterln = new Adapterdefenisi(this,lispl);
        recyclepl.setAdapter(adapterln);
        recyclepl.setLayoutManager(new LinearLayoutManager(this));
    }

    private void inidummypl() {
        lispl = new ArrayList<>();
        lispl.add(new defenisi2("Segitiga","Ciri","Tiga sisi, tiga sudut, jumlah total sudut dalam segitiga adalah 180 derajat.","Sifat","Segitiga memiliki panjang sisi-sisi yang dapat berbeda-beda, namun jumlah panjang sisi-sisi pada segitiga sama dengan atau lebih kecil dari jumlah panjang dua sisi lainnya. Sudut dalam segitiga dapat berbeda-beda, termasuk segitiga siku-siku yang memiliki satu sudut siku-siku (90 derajat)."));
        lispl.add(new defenisi2("Persegi","Ciri","Empat sisi yang sama panjang, empat sudut yang sama besar (90 derajat), jumlah total sudut dalam persegi adalah 360 derajat.","Sifat","Persegi adalah bentuk khusus dari persegi panjang yang memiliki panjang sisi-sisi yang sama. Sudut-sudutnya adalah sudut siku-siku (90 derajat), dan panjang diagonalnya sama."));
        lispl.add(new defenisi2("Persegi Panjang","Ciri","Empat sudut siku-siku (90 derajat), panjang dua pasang sisi sejajar sama, panjang dua pasang sisi lainnya sejajar sama, jumlah total sudut dalam persegi panjang adalah 360 derajat.","Sifat","Persegi panjang memiliki panjang sisi yang berbeda-beda dan sudut-sudut yang siku-siku (90 derajat). Panjang diagonalnya dapat berbeda."));
        lispl.add(new defenisi2("Lingkaran","Ciri","Tidak memiliki sisi, terdiri dari satu kurva tertutup, memiliki jari-jari (radius) dan diameter.","Sifat","Setiap titik pada lingkaran memiliki jarak yang sama dari pusat lingkaran. Jari-jari adalah jarak antara pusat lingkaran dan tepi lingkaran, sedangkan diameter adalah dua kali panjang jari-jari. Keliling lingkaran adalah 2πr (dengan r sebagai jari-jari) dan luasnya adalah πr²."));
        lispl.add(new defenisi2("Trapesium","Ciri","Empat sisi dengan dua sisi paralel dan dua sisi tidak paralel.","Sifat","Trapesium tidak memiliki sisi atau sudut yang tetap. Sudut di seberang sisi paralel yang sama besarnya. Jumlah total sudut dalam trapesium adalah 360 derajat."));
    }
}