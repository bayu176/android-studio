package com.by.mencariluasbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class jajar_genjang extends AppCompatActivity {
    Button btn_hitung;
    ImageView back;
    TextView tv_hasil;
    EditText edt_alas, edt_tinggi;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajar_genjang);

        btn_hitung = findViewById(R.id.btn_hitung_jajar_genjang);
        back = findViewById(R.id.back_jajar_genjang);
        tv_hasil = findViewById(R.id.tv_hasil_jajar_genjang);
        edt_alas = findViewById(R.id.edt_alas);
        edt_tinggi = findViewById(R.id.edt_tinggi);

        btn_hitung.setOnClickListener(view -> {
            String alas, tinggi;

            alas = edt_alas.getText().toString();
            tinggi = edt_tinggi.getText().toString();

            if(TextUtils.isEmpty(alas)){
                edt_alas.setError("Harap Isi Kolom ini");
                edt_alas.requestFocus();
            }else if(TextUtils.isEmpty(tinggi)){
                edt_tinggi.setError("Harap Isi Kolom ini");
                edt_tinggi.requestFocus();
            }else {
                double a = Double.parseDouble(alas);
                double t = Double.parseDouble(tinggi);
                double hasil = a * t;

                tv_hasil.setText("Hasil Luas : "+hasil);
            }
        });
        back.setOnClickListener(view -> {
            Intent intent = new Intent(jajar_genjang.this, menu_aplikasi.class);
            startActivity(intent);
        });
    }
}