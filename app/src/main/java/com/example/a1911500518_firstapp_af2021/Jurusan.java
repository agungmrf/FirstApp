package com.example.a1911500518_firstapp_af2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Jurusan extends AppCompatActivity {
    //ListView
    ListView listView;

    // Data pada ListView
    String[] data_jurusan = {
            "Teknik Informatika", "Sistem Informasi", "Sistem Komputer"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jurusan);

        listView = findViewById(R.id.listview);

        // Array Adapter
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, data_jurusan);

        listView.setAdapter(adapter);
    }
}