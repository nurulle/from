package com.example.form;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {

    String get_nama, get_nim, get_passd;
    TextView nama, nim, password;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        nama = findViewById(R.id.tv_nama1);
        nim = findViewById(R.id.tv_nama2);
        password = findViewById(R.id.tv_nama3);

        Bundle b = getIntent().getExtras();
        get_nama = b.getString("NAMA");
        get_nim = b.getString("NIM");
        get_passd = b.getString("PASS");

        nama.setText("Nama : " + get_nama);
        nim.setText("Nim : " + get_nim);
        password.setText("Password : " + get_passd);


    }
}
