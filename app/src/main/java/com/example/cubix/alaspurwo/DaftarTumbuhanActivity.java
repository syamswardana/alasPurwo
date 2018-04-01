package com.example.cubix.alaspurwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DaftarTumbuhanActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String namaTumbuhan[];
    List<RowItemTumbuhan> rowItems;
    ListView listTumbuhan;
    int baris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_tumbuhan);

        TextView txt_title = (TextView) findViewById(R.id.txt_title);

        baris = getIntent().getIntExtra("baris",0);
        rowItems = new ArrayList<RowItemTumbuhan>();
        if (baris == 0) {
            namaTumbuhan = getResources().getStringArray(R.array.hutanBambu);
            txt_title.setText("Daftar Tumbuhan Dalam Ekosistem Hutan Bambu");
        } else if (baris ==1) {
            namaTumbuhan = getResources().getStringArray(R.array.hutanDaratanRendah);
            txt_title.setText("Daftar Tumbuhan Dalam Ekosistem Hutan Daratan Rendah");
        } else if (baris==2) {
            namaTumbuhan = getResources().getStringArray(R.array.hutanMangrove);
            txt_title.setText("Daftar Tumbuhan Dalam Ekosistem Hutan Mangrove");
        } else if (baris==3) {
            namaTumbuhan = getResources().getStringArray(R.array.hutanPantai);
            txt_title.setText("Daftar Tumbuhan Dalam Ekosistem Hutan Pantai");
        } else if (baris==4) {
            namaTumbuhan = getResources().getStringArray(R.array.hutanTanaman);
            txt_title.setText("Daftar Tumbuhan Dalam Ekosistem Hutan Tanaman");
        } else {
            namaTumbuhan = getResources().getStringArray(R.array.savana);
            txt_title.setText("Daftar Tumbuhan Dalam Ekosistem Savana");
        }

        for (int i = 0; i < namaTumbuhan.length; i++) {
            RowItemTumbuhan item = new RowItemTumbuhan(namaTumbuhan[i]);
            rowItems.add(item);
        }
        listTumbuhan = (ListView) findViewById(R.id.list_tumbuhan);
        AdapterTumbuhanActivity adapter = new AdapterTumbuhanActivity(this,rowItems);
        listTumbuhan.setAdapter(adapter);

        listTumbuhan.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(DaftarTumbuhanActivity.this,TanamanActivity.class);
        intent.putExtra("namaTumbuhan",namaTumbuhan[position]);
        startActivity(intent);
    }
}
