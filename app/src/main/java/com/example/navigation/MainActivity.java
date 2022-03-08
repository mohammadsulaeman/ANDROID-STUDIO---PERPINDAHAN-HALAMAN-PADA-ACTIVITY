package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnPindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //memberikan inisial berupa id pada widget
        btnPindah = findViewById(R.id.btn_pindah_halaman);
        //memberikan aksi pada widget button untuk melakukan sebuah perintah
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // fungsi untuk melakukan pindah ke halaman berikutnya
                Intent kedua = new Intent(MainActivity.this,KeduaActivity.class);
                startActivity(kedua);
            }
        });
    }
}