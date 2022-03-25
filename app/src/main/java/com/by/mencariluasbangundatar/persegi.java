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

public class persegi extends AppCompatActivity {
    Button btn_hitung;
    ImageView back;
    TextView tv_hasil;
    EditText edt_sisi;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        btn_hitung = findViewById(R.id.btn_hitung);
        back = findViewById(R.id.back);
        edt_sisi = findViewById(R.id.edt_sisi_persegi);
        tv_hasil = findViewById(R.id.tv_hasil);

        btn_hitung.setOnClickListener(view -> {
            String sisi;

        sisi = edt_sisi.getText().toString();

        if (TextUtils.isEmpty(sisi)){
            edt_sisi.setError("Harap Isi Kolom ini");
            edt_sisi.requestFocus();
        }else{
            double s = Double.parseDouble(sisi);
            double hasil = s * s;

           tv_hasil.setText("Hasil Luas : "+hasil);
        }
        });
        back.setOnClickListener(view -> {
            Intent intent = new Intent(persegi.this, menu_aplikasi.class);
            startActivity(intent);
        });
    }
}