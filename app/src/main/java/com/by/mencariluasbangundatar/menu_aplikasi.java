package com.by.mencariluasbangundatar;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class menu_aplikasi extends AppCompatActivity {
    Button button1, button2, button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_aplikasi);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);


        button1.setOnClickListener(view -> {
            Intent intent = new Intent(menu_aplikasi.this, persegi.class);
            startActivity(intent);
        });

        button2.setOnClickListener(view -> {
            Intent intent = new Intent(menu_aplikasi.this, persegi_panjang.class);
            startActivity(intent);
        });
        button3.setOnClickListener(view -> {
            Intent intent = new Intent(menu_aplikasi.this, jajar_genjang.class);
            startActivity(intent);
        });

    }
}
