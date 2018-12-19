package com.example.cubix.alaspurwo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.lang.reflect.Array;

public class IsiDeskripsiActivity extends AppCompatActivity {

    Intent i;
    CarouselView carouselView;

    int[] sampleImages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_deskripsi);



        Toolbar ToolBarAtas2 = (Toolbar)findViewById(R.id.toolbar_satu);
        setSupportActionBar(ToolBarAtas2);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView txt_title = (TextView) findViewById(R.id.txt_title);
        TextView txt_deskripsi = (TextView) findViewById(R.id.txt_deskripsi);
        Button btn_youtube = (Button) findViewById(R.id.btn_youtube);

        carouselView = (CarouselView) findViewById(R.id.carouselView);


        int baris = getIntent().getIntExtra("baris",0);
        String[] deskripsi = getResources().getStringArray(R.array.deskripsiHutan);
        String[] youtube = getResources().getStringArray(R.array.youtube);

        if (baris == 0) {
            txt_title.setText("Deskripsi Hutan Bambu");
            txt_deskripsi.setText(Html.fromHtml(deskripsi[0]));
            sampleImages = new int[]{R.drawable.hutanbambu1, R.drawable.hutanbambu2, R.drawable.hutanbambu3, R.drawable.hutanbambu4, R.drawable.hutanbambu5};
            i = new Intent(Intent.ACTION_VIEW, Uri.parse(youtube[0]));
        } else if (baris == 1) {
            txt_title.setText("Deskripsi Daratan Rendah");
            txt_deskripsi.setText(Html.fromHtml(deskripsi[1]));
            sampleImages = new int[]{R.drawable.hutandaratanrendah1, R.drawable.hutandaratanrendah2, R.drawable.hutandaratanrendah3, R.drawable.hutandaratanrendah4, R.drawable.hutandaratanrendah5, R.drawable.hutandaratanrendah6};
            i = new Intent(Intent.ACTION_VIEW, Uri.parse(youtube[1]));
        } else if (baris == 2) {
            txt_title.setText("Deskripsi Hutan Mangrove");
            txt_deskripsi.setText(Html.fromHtml(deskripsi[2]));
            sampleImages = new int[]{R.drawable.hutanmangrove1, R.drawable.hutanmangrove2, R.drawable.hutanmangrove3, R.drawable.hutanmangrove4, R.drawable.hutanmangrove5};
            i = new Intent(Intent.ACTION_VIEW, Uri.parse(youtube[2]));
        } else if (baris == 3) {
            txt_title.setText("Deskripsi Hutan Pantai");
            txt_deskripsi.setText(Html.fromHtml(deskripsi[3]));
            sampleImages = new int[]{R.drawable.hutanpantai1, R.drawable.hutanpantai2, R.drawable.hutanpantai3};
            i = new Intent(Intent.ACTION_VIEW, Uri.parse(youtube[3]));
        } else if (baris == 4) {
            txt_title.setText("Deskripsi Hutan Tanaman");
            txt_deskripsi.setText(Html.fromHtml(deskripsi[4]));
            sampleImages = new int[]{R.drawable.hutantanaman2, R.drawable.hutantanaman3, R.drawable.hutantanaman4, R.drawable.hutantanaman5, R.drawable.hutantanaman6};
            i = new Intent(Intent.ACTION_VIEW, Uri.parse(youtube[4]));
        } else {
            txt_title.setText("Savana");
            txt_deskripsi.setText(Html.fromHtml(deskripsi[5]));
            sampleImages = new int[]{R.drawable.savana, R.drawable.savana2, R.drawable.savana3, R.drawable.savana4, R.drawable.savana5};
            i = new Intent(Intent.ACTION_VIEW, Uri.parse(youtube[5]));
        }

        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);
        btn_youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };
}
