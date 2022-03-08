package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KeduaActivity extends AppCompatActivity {

    private Button btnKembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        //memberikan sebuah identitas pada sebuah widget dengan id
        btnKembali = findViewById(R.id.btn_kembali);

        //memberikan sebuah aksi pada widget button untuk melakukan sebuah perintah
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // fungsi untuk kembali ke halaman sebelumnya
                Intent back = new Intent(KeduaActivity.this, MainActivity.class);
                startActivity(back);
            }
        });
    }
}