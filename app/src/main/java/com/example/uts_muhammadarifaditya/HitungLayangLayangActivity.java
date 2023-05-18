package com.example.uts_muhammadarifaditya;


import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.uts_muhammadarifaditya.BangunDatar.LayangLayang.KelilingLayangLayang;
import com.example.uts_muhammadarifaditya.BangunDatar.LayangLayang.LuasLayangLayang;

public class HitungLayangLayangActivity extends AppCompatActivity {

    EditText edtText1, edtText2;
    TextView txtHasil, txtView1, txtView2;
    Button btnHitung;
    Double d1, d2, s1, s2;

    private String KEY_JUDUL = "JUDUL";
    private String KEY_HASIL = "HASIL";
    private String KEY_FOTO = "FOTO";
    private String TAB = "LAYANG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_layang_layang);
        initial();
    }

    private void initial() {
        edtText1 = (EditText) findViewById(R.id.edt_text_view_1);
        edtText2 = (EditText) findViewById(R.id.edt_text_view_2);
        txtView1 = (TextView) findViewById(R.id.text_view_1);
        txtView2 = (TextView) findViewById(R.id.text_view_2);
//        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        btnHitung = (Button) findViewById(R.id.btn_hitung);


        edtText1.setVisibility(View.INVISIBLE);
        edtText2.setVisibility(View.INVISIBLE);
        btnHitung.setVisibility(View.INVISIBLE);
//        txtHasil.setVisibility(View.INVISIBLE);

//        getSupportActionBar().setTitle("Layang Layang");
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_hitung_luas:
                if (checked) {
                    txtView1.setText(getString(R.string.diagonal_horizontal) + " (d1)");
                    txtView2.setText(getString(R.string.diagonal_vertical) + " (d2)");
                    edtText1.setText("");
                    edtText2.setText("");
                    btnHitung.setText(getString(R.string.hitung_luas));

                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
//                    txtHasil.setVisibility(View.VISIBLE);
//                    txtHasil.setText(getString(R.string.hasil));
                    break;
                }
            case R.id.radio_hitung_keliling:
                if (checked) {
                    txtView1.setText(getString(R.string.sisi_satu) + " (s1)");
                    txtView2.setText(getString(R.string.sisi_dua) + " (s2)");
                    edtText1.setText("");
                    edtText2.setText("");
                    btnHitung.setText(getString(R.string.hitung_keliling));

                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
//                    txtHasil.setVisibility(View.VISIBLE);
//                    txtHasil.setText(getString(R.string.hasil));
                    break;
                }
        }
    }


    public void hitung(View view) {

        String buttonText = btnHitung.getText().toString();
        if (buttonText == getString(R.string.hitung_luas)) {
            try {
                d1 = Double.parseDouble(edtText1.getText().toString());
                d2 = Double.parseDouble(edtText2.getText().toString());
                LuasLayangLayang luasLayangLayang = new LuasLayangLayang(d1, d2);
//                txtHasil.setText(String.valueOf("Hasil :\nLuas = " + luasLayangLayang.hitung_luas()));

                Intent i = new Intent(HitungLayangLayangActivity.this, HasilActivity.class);
                i.putExtra(KEY_JUDUL, ("KELILING "+TAB));
                i.putExtra(KEY_HASIL, (String.valueOf(luasLayangLayang.hitung_luas())));
                i.putExtra(KEY_FOTO, ("@drawable/layang_layang"));
                startActivity(i);

            } catch (Exception e) {
                //jika salah satu kolom tidak diisi
                Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
                TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
                if (t != null) t.setGravity(Gravity.CENTER);
                toast.show();

            }
        } else {
            try {
                s1 = Double.parseDouble(edtText1.getText().toString());
                s2 = Double.parseDouble(edtText2.getText().toString());
                KelilingLayangLayang kelilingLayangLayang = new KelilingLayangLayang(s1,s2);
//                txtHasil.setText(String.valueOf("Hasil :\nKeliling = " + kelilingLayangLayang.hitung_keliling()));


            } catch (Exception e) {
                //jika salah satu kolom tidak diisi
                Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
                TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
                if (t != null) t.setGravity(Gravity.CENTER);
                toast.show();

            }
        }
    }
}
