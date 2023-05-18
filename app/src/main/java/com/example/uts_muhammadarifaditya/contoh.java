package com.example.uts_muhammadarifaditya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class contoh extends AppCompatActivity {

    RecyclerView recyclep;

    List<contoh2>listper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh);
        inidummyp();
        recyclep = findViewById(R.id.recyp);
        Adaptercontoh adapterpe = new Adaptercontoh(this,listper);
        recyclep.setAdapter(adapterpe);
        recyclep.setLayoutManager(new LinearLayoutManager(this));
    }

    private void inidummyp() {
        listper = new ArrayList<>();
        listper.add(new contoh2("Segitiga","Tanda Lalu lintas: Banyak tanda lalu lintas memiliki bentuk segitiga dengan ujung yang tumpul. Misalnya, tanda peringatan bahaya atau tanda larangan, seperti tanda larangan parkir atau tanda hati hati.",R.drawable.segitiga));
        listper.add(new contoh2("Lingkaran","roda: Roda pada kendaraan seperti mobil, sepeda, atau sepeda motor memiliki bentuk lingkaran. Lingkaran memungkinkan roda berputar dengan lancar dan memastikan pergerakan yang efisien.",R.drawable.lingkaran));
        listper.add(new contoh2("Persegi","Layar televisi atau monitor: Banyak televisi atau monitor komputer memiliki bentuk persegi atau persegi panjang. Layar persegi ini digunakan untuk menampilkan gambar atau video.",R.drawable.persegi));
        listper.add(new contoh2("Persegi Panjang","Papan tulis: Papan tulis biasanya memiliki bentuk persegi panjang. Papan tulis persegi panjang ini digunakan di sekolah, kantor, atau tempat lainnya sebagai media untuk menulis atau menggambar.",R.drawable.persegi_pjg));
        listper.add(new contoh2("Trapesium","Pintu masuk gedung: Beberapa pintu masuk gedung atau bangunan memiliki bentuk trapesium. Pintu masuk trapesium memberikan tampilan yang unik dan mencolok.",R.drawable.trapesium));
        listper.add(new contoh2("Layang-Layang","Tentu saja, salah satu contoh paling langsung adalah layang-layang itu sendiri. Layang-layang adalah mainan yang terbang di udara dan memiliki bentuk layang-layang, dengan dua pasang sisi yang berbentuk segitiga dan kedua pasang sisi tersebut bertemu di sudut.",R.drawable.layang));
    }
}