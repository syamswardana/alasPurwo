package com.example.cubix.alaspurwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DeskripsiActivity extends AppCompatActivity {
    int baris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        Toolbar ToolBarAtas2 = (Toolbar)findViewById(R.id.toolbar_satu);
        setSupportActionBar(ToolBarAtas2);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btn_deskripsi = (Button) findViewById(R.id.btn_deskripsi);
        Button btn_daftarTanaman = (Button) findViewById(R.id.btn_daftarTanaman);
        TextView txt_title = (TextView) findViewById(R.id.txt_tanaman);
        baris = getIntent().getIntExtra("baris",0);
        if (baris == 0) {
            txt_title.setText("Hutan Bambu");
        } else if (baris == 1) {
            txt_title.setText("Hutan Daratan Rendah");
        } else if (baris == 2) {
            txt_title.setText("Hutan Mangrove");
        } else if (baris == 3) {
            txt_title.setText("Hutan Pantai");
        } else if (baris == 4) {
            txt_title.setText("Hutan Produksi");
        } else {
            txt_title.setText("Savana");
        }

        btn_deskripsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DeskripsiActivity.this,IsiDeskripsiActivity.class);
                i.putExtra("baris",baris);
                startActivity(i);
            }
        });

        btn_daftarTanaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DeskripsiActivity.this,DaftarTumbuhanActivity.class);
                i.putExtra("baris",baris);
                startActivity(i);
            }
        });

    }
}
