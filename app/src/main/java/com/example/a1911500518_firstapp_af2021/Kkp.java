package com.example.a1911500518_firstapp_af2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;

import com.codesgood.views.JustifiedTextView;

public class Kkp extends AppCompatActivity {

    //inisialisasi variabel
    JustifiedTextView justifiedTextView;

    String KKPText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kkp);

        justifiedTextView = findViewById(R.id.judulkkp);

        KKPText = getResources().getString(R.string.judul_kkp);

        justifiedTextView.setText(Html.fromHtml(KKPText));
    }
}