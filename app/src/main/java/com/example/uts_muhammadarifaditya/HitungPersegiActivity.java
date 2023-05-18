package com.example.uts_muhammadarifaditya;


import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.example.uts_muhammadarifaditya.BangunDatar.Persegi;

public class HitungPersegiActivity extends AppCompatActivity {

    EditText edtSisi;
    TextView txtHasil;
    Double sisi;

    private String KEY_JUDUL = "JUDUL";
    private String KEY_HASIL = "HASIL";
    private String KEY_FOTO = "FOTO";
    private String TAB = "PERSEGI";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_persegi);

        initial();

    }

    private void initial() {
        edtSisi = (EditText) findViewById(R.id.edt_sisi_persegi);
//        txtHasil = (TextView) findViewById(R.id.txt_hasil_persegi);

//        getSupportActionBar().setTitle("Persegi");/

    }

    public void hitung_luas(View view) {
        try {
            sisi = Double.parseDouble(edtSisi.getText().toString());
            Persegi persegi = new Persegi(sisi);
//            txtHasil.setText(String.valueOf("Hasil :\nLuas = " + persegi.hitung_luas()));

            Intent i = new Intent(HitungPersegiActivity.this, HasilActivity.class);
            i.putExtra(KEY_JUDUL, ("LUAS "+TAB));
            i.putExtra(KEY_HASIL, (String.valueOf(persegi.hitung_luas())));
            i.putExtra(KEY_FOTO, ("@drawable/persegi"));
            startActivity(i);


            //panjang = Double.parseDouble(edtPanjang.getText().toString());
            //lebar = Double.parseDouble(edtLebar.getText().toString());
            //luas = panjang * lebar;
            //txtLuas.setText(String.valueOf("Luas = " + luas));

        } catch (Exception e) {
            //jika salah satu kolom tidak diisi
            Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();

        }
    }

    public void hitung_keliling(View view) {
        try {
            sisi = Double.parseDouble(edtSisi.getText().toString());
            Persegi persegi = new Persegi(sisi);
//            txtHasil.setText(String.valueOf("Hasil :\nKeliling = " + persegi.hitung_keliling()));

            Intent i = new Intent(HitungPersegiActivity.this, HasilActivity.class);
            i.putExtra(KEY_JUDUL, ("KELILING "+TAB));
            i.putExtra(KEY_HASIL, (String.valueOf(persegi.hitung_keliling())));
            i.putExtra(KEY_FOTO, ("@drawable/persegi"));
            startActivity(i);


            //panjang = Double.parseDouble(edtPanjang.getText().toString());
            //lebar = Double.parseDouble(edtLebar.getText().toString());
            //luas = panjang * lebar;
            //txtLuas.setText(String.valueOf("Luas = " + luas));

        } catch (Exception e) {
            //jika salah satu kolom tidak diisi
            Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();

        }
    }
}

