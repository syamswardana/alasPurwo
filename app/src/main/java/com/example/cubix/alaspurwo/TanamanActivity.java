package com.example.cubix.alaspurwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class TanamanActivity extends AppCompatActivity {
    String Tanaman[];
    String namaTanaman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanaman);

        TextView txt_namaTanaman = findViewById(R.id.txt_namaTumbuhan);
        ImageView img_tanaman = findViewById(R.id.img_tanaman);
        TextView txt_klasifikasi = findViewById(R.id.txt_klasifikasi);
        TextView txt_deskripsi = findViewById(R.id.txt_deskripsi);
        TextView txt_manfaat = findViewById(R.id.txt_manfaat);
        TextView txt_referensi = findViewById(R.id.txt_referensi);

        Toolbar ToolBarAtas2 = (Toolbar)findViewById(R.id.toolbar_satu);
        setSupportActionBar(ToolBarAtas2);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        namaTanaman = getIntent().getStringExtra("namaTumbuhan");
        namaTanaman = namaTanaman.replaceAll("\\s","");
        namaTanaman = namaTanaman.replaceAll("-","");
        namaTanaman = namaTanaman.toLowerCase();
        Tanaman = getResources().getStringArray(getResources().getIdentifier(namaTanaman,"array",getPackageName()));
        img_tanaman.setImageResource(getResources().getIdentifier(namaTanaman,"drawable",getPackageName()));
//
        txt_namaTanaman.setText(Html.fromHtml(Tanaman[0]+" <i>"+Tanaman[1]+"</i>"));
        for (int i=2;i<11;i++){
            txt_klasifikasi.append(Html.fromHtml("<br/>"+Tanaman[i]));
        }
        txt_deskripsi.append(Html.fromHtml("<br/>"+Tanaman[11]));
        txt_manfaat.append(Html.fromHtml("<br>"+Tanaman[12]));
        txt_referensi.append(Html.fromHtml("<br>"+Tanaman[13]));

    }
}
