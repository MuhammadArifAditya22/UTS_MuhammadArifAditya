package com.example.uts_muhammadarifaditya;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.uts_muhammadarifaditya.BangunDatar.PersegiPanjang;
public class HitungPersegiPanjangActivity extends AppCompatActivity {
    EditText edtPanjang, edtLebar;
    TextView txtLuas;
    Double panjang, lebar;

    private String KEY_JUDUL = "JUDUL";
    private String KEY_HASIL = "HASIL";
    private String KEY_FOTO = "FOTO";
    private String TAB = "PERSEGI PANJANG";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_persegi_panjang);

        initial();

    }

    private void initial() {
        edtPanjang = (EditText) findViewById(R.id.edt_panjang);
        edtLebar = (EditText) findViewById(R.id.edt_lebar);
//        txtLuas = (TextView) findViewById(R.id.txt_luas);

//        getSupportActionBar().setTitle("Persegi Panjang");
    }

    public void hitung_luas(View view) {
        try {
            panjang = Double.parseDouble(edtPanjang.getText().toString());
            lebar = Double.parseDouble(edtLebar.getText().toString());
            PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
//            txtLuas.setText(String.valueOf("Hasil :\nLuas = " + persegiPanjang.hitung_luas()));

            Intent i = new Intent(HitungPersegiPanjangActivity.this, HasilActivity.class);
            i.putExtra(KEY_JUDUL, ("LUAS "+TAB));
            i.putExtra(KEY_HASIL, (String.valueOf(persegiPanjang.hitung_luas())));
            i.putExtra(KEY_FOTO, ("@drawable/persegi_panjang"));
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
            panjang = Double.parseDouble(edtPanjang.getText().toString());
            lebar = Double.parseDouble(edtLebar.getText().toString());
            PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
//            txtLuas.setText(String.valueOf("Hasil :\nKeliling = " + persegiPanjang.hitung_keliling()));

            Intent i = new Intent(HitungPersegiPanjangActivity.this, HasilActivity.class);
            i.putExtra(KEY_JUDUL, ("KELILING "+TAB));
            i.putExtra(KEY_HASIL, (String.valueOf(persegiPanjang.hitung_keliling())));
            i.putExtra(KEY_FOTO, ("@drawable/persegi_panjang"));
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
