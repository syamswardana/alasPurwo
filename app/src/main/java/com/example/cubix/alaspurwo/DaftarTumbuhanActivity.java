package com.example.cubix.alaspurwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;
import java.util.List;

public class DaftarTumbuhanActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String namaTumbuhan[];
    List<RowItemTumbuhan> rowItems;
    ListView listTumbuhan;
    int baris;

    MaterialSearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_tumbuhan);

        TextView txt_title = (TextView) findViewById(R.id.txt_title);

        Toolbar ToolBarAtas2 = (Toolbar) findViewById(R.id.toolbar_satu);
        setSupportActionBar(ToolBarAtas2);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        searchView = (MaterialSearchView) findViewById(R.id.search_view);


        baris = getIntent().getIntExtra("baris", 0);
        rowItems = new ArrayList<RowItemTumbuhan>();
        if (baris == 0) {
            namaTumbuhan = getResources().getStringArray(R.array.hutanBambu);
            txt_title.setText("Daftar Tumbuhan Dalam Ekosistem Hutan Bambu");
        } else if (baris == 1) {
            namaTumbuhan = getResources().getStringArray(R.array.hutanDaratanRendah);
            txt_title.setText("Daftar Tumbuhan Dalam Ekosistem Hutan Daratan Rendah");
        } else if (baris == 2) {
            namaTumbuhan = getResources().getStringArray(R.array.hutanMangrove);
            txt_title.setText("Daftar Tumbuhan Dalam Ekosistem Hutan Mangrove");
        } else if (baris == 3) {
            namaTumbuhan = getResources().getStringArray(R.array.hutanPantai);
            txt_title.setText("Daftar Tumbuhan Dalam Ekosistem Hutan Pantai");
        } else if (baris == 4) {
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
        AdapterTumbuhanActivity adapter = new AdapterTumbuhanActivity(this, rowItems);
        listTumbuhan.setAdapter(adapter);

        listTumbuhan.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(DaftarTumbuhanActivity.this, TanamanActivity.class);
        intent.putExtra("namaTumbuhan", namaTumbuhan[position]);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);
        return true;
    }
}
