package com.example.blajaractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private final String EXTRA_NAMA = "EXTRA_NAMA";
    private TextView edt_nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        edt_nama = findViewById(R.id.edt_nama);
        edt_nama.setText(nama);
    }
}