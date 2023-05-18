package com.example.uts_muhammadarifaditya;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView txtJudl;
    TextView txtHasil;
    ImageView urlFoto;

    private String judul;
    private String KEY_JUDUL = "JUDUL";
    private String hasil;
    private String KEY_HASIL = "HASIL";
    private String foto;
    private String KEY_FOTO = "FOTO";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil2);

        txtJudl = (TextView) findViewById(R.id.judul);
        txtHasil = (TextView) findViewById(R.id.hasil);
        urlFoto = findViewById(R.id.urlgambar);

        //get data from intent
        Bundle extras = getIntent().getExtras();
        judul = extras.getString(KEY_JUDUL);
        txtJudl.setText( judul);

        hasil = extras.getString(KEY_HASIL);
        txtHasil.setText(hasil);

        foto = extras.getString(KEY_FOTO);


        String uri = "@drawable/myresource";

        //set gambar form  antoher activity
        int imageResource = getResources().getIdentifier(foto, null, getPackageName());
        Drawable res = getResources().getDrawable(imageResource);
        urlFoto.setImageDrawable(res);




    }
}