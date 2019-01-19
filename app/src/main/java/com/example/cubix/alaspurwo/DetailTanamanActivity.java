package com.example.cubix.alaspurwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.widget.TextView;

public class DetailTanamanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tanaman);
        Toolbar ToolBarAtas2 = (Toolbar)findViewById(R.id.toolbar_satu);
        setSupportActionBar(ToolBarAtas2);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView txt_deskripsi = findViewById(R.id.txt_deskripsi);
        TextView txt_manfaat = findViewById(R.id.txt_manfaat);
        TextView txt_referensi = findViewById(R.id.txt_referensi);
        TextView txt_namaTanaman = findViewById(R.id.txt_tanaman);

        txt_namaTanaman.setText(Html.fromHtml(getIntent().getStringExtra("Tanaman")));
        txt_deskripsi.append(Html.fromHtml("<br/>"+getIntent().getStringExtra("Deskripsi")));
        txt_manfaat.append(Html.fromHtml("<br>"+getIntent().getStringExtra("Manfaat")));
        txt_referensi.append(Html.fromHtml("<br>"+getIntent().getStringExtra("Referensi")));
    }
}
