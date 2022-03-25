package com.by.mencariluasbangundatar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_login;
    EditText user, pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = findViewById(R.id.btn_login);
        user = findViewById(R.id.edt_username);
        pass = findViewById(R.id.edt_pasword);

        btn_login.setOnClickListener(view -> {
            String UsernameKey = user.getText().toString();
            String PasswordKey = pass.getText().toString();

            if(TextUtils.isEmpty(UsernameKey)){
                user.setError("Harap Isi Kolom ini");
                user.requestFocus();
            }else if(TextUtils.isEmpty(PasswordKey)){
                pass.setError("Harap Isi Kolom ini");
                pass.requestFocus();
            }
            if(UsernameKey.equals("admin") && PasswordKey.equals("admin")){
                Toast.makeText(getApplicationContext(),"Login Berhasil",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, menu_aplikasi.class);
                MainActivity.this.startActivity(intent);
                finish();
            }else{
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Username atau Password Salah").setNegativeButton("Retry",null).create().show();
            }
        });
        }
    }



