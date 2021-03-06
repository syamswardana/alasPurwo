package com.example.cubix.alaspurwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DaftarTumbuhanActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String namaTumbuhan[];
    String namaLatin[];
    List<RowItemTumbuhan> rowItems;
    List<RowItemLatin> latin;
    ListView listTumbuhan;
    int baris;

    MaterialSearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_tumbuhan);

        TextView txt_title = (TextView) findViewById(R.id.txt_tanaman);

        Toolbar ToolBarAtas2 = (Toolbar) findViewById(R.id.toolbar_satu);
        setSupportActionBar(ToolBarAtas2);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        searchView = (MaterialSearchView) findViewById(R.id.search_view);

        baris = getIntent().getIntExtra("baris", 0);
        rowItems = new ArrayList<RowItemTumbuhan>();
        latin = new ArrayList<RowItemLatin>();
        if (baris == 0) {
            namaTumbuhan = getResources().getStringArray(R.array.hutanBambu);
            txt_title.setText("Daftar Vegetasi Utama Dalam Ekosistem Hutan Bambu");
        } else if (baris == 1) {
            namaTumbuhan = getResources().getStringArray(R.array.hutanDaratanRendah);
            txt_title.setText("Daftar Vegetasi Utama Dalam Ekosistem Hutan Daratan Rendah");
        } else if (baris == 2) {
            namaTumbuhan = getResources().getStringArray(R.array.hutanMangrove);
            txt_title.setText("Daftar Vegetasi Utama Dalam Ekosistem Hutan Mangrove");
        } else if (baris == 3) {
            namaTumbuhan = getResources().getStringArray(R.array.hutanPantai);
            txt_title.setText("Daftar Vegetasi Utama Dalam Ekosistem Hutan Pantai");
        } else if (baris == 4) {
            namaTumbuhan = getResources().getStringArray(R.array.hutanProduksi);
            txt_title.setText("Daftar Vegetasi Utama Dalam Ekosistem Hutan Produksi");
        } else {
            namaTumbuhan = getResources().getStringArray(R.array.savana);
            txt_title.setText("Daftar Vegetasi Utama Dalam Ekosistem Savana");
        }

        Arrays.sort(namaTumbuhan);
        namaLatin = new String[namaTumbuhan.length];
        for (int i=0;i < namaTumbuhan.length;i++){
            String tanaman = namaTumbuhan[i];
            tanaman = tanaman.toLowerCase();
            tanaman = tanaman.replaceAll("\\s","");
            tanaman = tanaman.replaceAll("-","");
            Log.d("Tanaman: ", tanaman);
            String resTanaman[] = getResources().getStringArray(getResources().getIdentifier(tanaman,"array",getPackageName()));
            namaLatin[i] = resTanaman[1];
            RowItemLatin item = new RowItemLatin(resTanaman[1]);
            latin.add(item);
        }
        for (int i = 0; i < namaTumbuhan.length; i++) {
            RowItemTumbuhan item = new RowItemTumbuhan(namaTumbuhan[i]);
            rowItems.add(item);
        }
        listTumbuhan = (ListView) findViewById(R.id.list_tumbuhan);
        AdapterTumbuhanActivity adapter = new AdapterTumbuhanActivity(this, rowItems,latin);
        listTumbuhan.setAdapter(adapter);

        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {

            }

            @Override
            public void onSearchViewClosed() {
                listTumbuhan = (ListView) findViewById(R.id.list_tumbuhan);
                AdapterTumbuhanActivity adapter = new AdapterTumbuhanActivity(DaftarTumbuhanActivity.this, rowItems,latin);
                listTumbuhan.setAdapter(adapter);
            }
        });

        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (newText != null && !newText.isEmpty()){
                    List<RowItemTumbuhan> hasil = new ArrayList<RowItemTumbuhan>();
                    List<RowItemLatin> hasil2 = new ArrayList<RowItemLatin>();
                    for (int i = 0; i < namaTumbuhan.length; i++) {
                        if (namaTumbuhan[i].toLowerCase().contains(newText.toLowerCase())){
                            RowItemTumbuhan item = new RowItemTumbuhan(namaTumbuhan[i]);
                            RowItemLatin item2 = new RowItemLatin(namaLatin[i]);
                            hasil.add(item);
                            hasil2.add(item2);
                        }
                        if (namaLatin[i].toLowerCase().contains(newText.toLowerCase())){
                            RowItemTumbuhan item = new RowItemTumbuhan(namaTumbuhan[i]);
                            RowItemLatin item2 = new RowItemLatin(namaLatin[i]);
                            hasil.add(item);
                            hasil2.add(item2);
                        }
                    }
                    AdapterTumbuhanActivity adapter = new AdapterTumbuhanActivity(DaftarTumbuhanActivity.this, hasil,hasil2);
                    listTumbuhan.setAdapter(adapter);
                } else {
                    listTumbuhan = (ListView) findViewById(R.id.list_tumbuhan);
                    AdapterTumbuhanActivity adapter = new AdapterTumbuhanActivity(DaftarTumbuhanActivity.this, rowItems,latin);
                    listTumbuhan.setAdapter(adapter);
                }

                return true;
            }
        });

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
