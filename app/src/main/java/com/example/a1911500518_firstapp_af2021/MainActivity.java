package com.example.a1911500518_firstapp_af2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // mendeklarasikan variabel
    private CardView datamhs, jurusan, datamtk, nilai, kkp, skripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // mendefinisikan cardview
        datamhs = (CardView) findViewById(R.id.datamhs_card);
        jurusan = (CardView) findViewById(R.id.jurusan_card);
        datamtk = (CardView) findViewById(R.id.datamtk_card);
        nilai = (CardView) findViewById(R.id.nilai_card);
        kkp = (CardView) findViewById(R.id.kkp_card);
        skripsi = (CardView) findViewById(R.id.skripsi_card);

        // menambahkan click listener pada cardview
        datamhs.setOnClickListener(this);
        jurusan.setOnClickListener(this);
        datamtk.setOnClickListener(this);
        nilai.setOnClickListener(this);
        kkp.setOnClickListener(this);
        skripsi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.datamhs_card:
                i = new Intent(this, Datamhs.class);
                startActivity(i);
                break;
            case R.id.jurusan_card:
                i = new Intent(this, Jurusan.class);
                startActivity(i);
                break;
            case R.id.datamtk_card:
                i = new Intent(this, Datamtk.class);
                startActivity(i);
                break;
            case R.id.nilai_card:
                i = new Intent(this, Nilai.class);
                startActivity(i);
                break;
            case R.id.kkp_card:
                i = new Intent(this, Kkp.class);
                startActivity(i);
                break;
            case R.id.skripsi_card:
                i = new Intent(this, Skripsi.class);
                startActivity(i);
                break;
            default:
                break;
        }

    }
}