package com.example.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText usr, nim, passd;
    Button login;
    String var_nama, var_nim, var_passd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usr = findViewById(R.id.ETname);
        nim = findViewById(R.id.ETnim);
        passd = findViewById(R.id.ETpassword);

        login = findViewById(R.id.btnmasuk);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        if (usr.getText().toString().length()== 0) {
                            usr.setError("Masukan Username");
                        } else if (nim.getText().toString().length()== 0) {
                            nim.setError("Masukan Nim");
                        } else if (passd.getText().toString().length()== 0) {
                            passd.setError("Masukan Password");
                        } else {


                            var_nama = usr.getText().toString();
                            var_nim = nim.getText().toString();
                            var_passd = passd.getText().toString();


                            Intent intent = new Intent(MainActivity.this, second.class);
                            Bundle b = new Bundle();
                            b.putString("NAMA", var_nama);
                            b.putString("NIM", var_nim);
                            b.putString("PASS", var_passd);
                            intent.putExtras(b);
                            startActivity(intent);
                        }
                    }
                });
            }
        }


