package com.example.uts_muhammadarifaditya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class rumus extends AppCompatActivity {

    RecyclerView recycle;
    List<rumus2>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumus);
        inidatadummy();
        recycle = findViewById(R.id.recyjm);
        Adapterrumus adapterj = new Adapterrumus(this,list);
        recycle.setAdapter(adapterj);
        recycle.setLayoutManager(new LinearLayoutManager(this));
    }

    private void inidatadummy() {
        list = new ArrayList<>();
        list.add(new rumus2("1. Segitiga :","Luas = 1/2 x a x t ","Keliling = (sisi a + sisi b + sisi c)","Luas segitiga dapat dihitung dengan menggunakan rumus luas segitiga yaitu 1/2 x alas x tinggi (L = 1/2 x a x t), di mana a adalah panjang alas dan t adalah tinggi segitiga",R.drawable.dsegi));
        list.add(new rumus2("2. Persegi","Luas = S X S, ","Keliling = 4 X S","Luas: Luas persegi dapat dihitung dengan mengkuadratkan panjang salah satu sisinya (L = s^2), di mana s adalah panjang sisi persegi. Keliling: Keliling persegi dapat dihitung dengan mengalikan panjang salah satu sisinya dengan 4 (K = 4s), di mana s adalah panjang sisi persegi.",R.drawable.dpersegi));
        list.add(new rumus2("3. Persegi Panjang","Luas = P X L ","Keliling = 2 X (P + L)","Luas: Luas persegi panjang dapat dihitung dengan mengalikan panjang dengan lebar (L = p x l), di mana p adalah panjang persegi panjang dan l adalah lebarnya. Keliling: Keliling persegi panjang dapat dihitung dengan menjumlahkan kedua panjang sisi dan kedua sisi lebarnya (K = 2p + 2l), di mana p adalah panjang persegi panjang dan l adalah lebarnya.",R.drawable.dpp));
        list.add(new rumus2("4. Trapesium","Luas = 1/2 x (a + b) x t ","Keliling = sisi a + sisi b + sisi c + sisi d","Luas: Luas trapesium dapat dihitung dengan mengalikan setengah jumlah panjang sisi sejajar (a dan b) dengan tinggi trapesium (L = 1/2 x (a + b) x t), di mana a dan b adalah panjang sisi sejajar dan t adalah tinggi trapesium. Keliling: Keliling trapesium dapat dihitung dengan menjumlahkan panjang keempat sisinya (K = sisi a + sisi b + sisi c + sisi d), di mana a, b, c, dan d adalah panjang sisi-sisi trapesium.",R.drawable.dtrap));
        list.add(new rumus2("5. Layang-Layang","Luas = 1/2 x d1 x d2 ","Keliling = 2 X (a+c)","Luas: Luas layang-layang dapat dihitung dengan mengalikan setengah dari hasil perkalian panjang diagonal yang saling berpotongan (d1 dan d2) (L = 1/2 x d1 x d2), di mana d1 dan d2 adalah panjang diagonal yang saling berpotongan. Keliling: Keliling layang-layang dapat dihitung dengan menjumlahkan panjang keempat sisinya (K = sisi a + sisi b + sisi c + sisi d), di mana a, b, c, dan d adalah panjang sisi-sisi layang-layang.",R.drawable.dlayang));
    }

}