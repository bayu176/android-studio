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

public class persegi_panjang extends AppCompatActivity {
    Button btn_hitung;
    ImageView back;
    TextView tv_hasil;
    EditText edt_panjang, edt_lebar;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        btn_hitung = findViewById(R.id.btn_hitung_persegi_panjang);
        back = findViewById(R.id.back_persegi_panjang);
        edt_panjang = findViewById(R.id.edt_panjang);
        edt_lebar = findViewById(R.id.edt_lebar);
        tv_hasil = findViewById(R.id.tv_hasil_persegi_panjang);

        btn_hitung.setOnClickListener(view -> {
            String panjang, lebar;
            panjang = edt_panjang.getText().toString();
            lebar = edt_lebar.getText().toString();
            if(TextUtils.isEmpty(panjang)){
                edt_panjang.setError("Harap Isi Kolom ini");
                edt_panjang.requestFocus();
            }else if(TextUtils.isEmpty(lebar)){
                edt_lebar.setError("Harap Isi Kolom ini");
                edt_lebar.requestFocus();
            }else{
                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);
                double hasil = p * l;

                tv_hasil.setText("Hasil Luas : "+hasil);
            }

        });
        back.setOnClickListener(view -> {
            Intent intent = new Intent(persegi_panjang.this, menu_aplikasi.class);
            startActivity(intent);
        });
    }
}