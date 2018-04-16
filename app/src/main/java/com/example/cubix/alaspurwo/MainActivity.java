package com.example.cubix.alaspurwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_menuUtama = (Button) findViewById(R.id.btn_menuutama);
        Button btn_profil = (Button) findViewById(R.id.btn_profil);
        Button btn_bantuan = (Button) findViewById(R.id.btn_bantuan);
        Button btn_tentang = (Button) findViewById(R.id.btn_tentang);
        Button btn_keluar = (Button) findViewById(R.id.btn_keluar);

        btn_menuUtama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,MenuUtamaActivity.class));
            }
        });

        btn_keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
