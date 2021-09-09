package com.example.a1911500518_firstapp_af2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;

import com.codesgood.views.JustifiedTextView;

public class Skripsi extends AppCompatActivity {

    //inisialisasi variabel
    JustifiedTextView justifiedTextView;

    String SkripsiText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skripsi);

        justifiedTextView = findViewById(R.id.judulskripsi);

        SkripsiText = getResources().getString(R.string.judul_skripsi);

        justifiedTextView.setText(Html.fromHtml(SkripsiText));
    }
}