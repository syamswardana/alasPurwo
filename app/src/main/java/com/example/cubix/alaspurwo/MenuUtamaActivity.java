package com.example.cubix.alaspurwo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MenuUtamaActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] text;
    TypedArray imagehutan;
    List<RowItem> rowItems;
    GridView grid_hutan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        TextView txt_title = (TextView) findViewById(R.id.txt_title);

        Toolbar ToolBarAtas2 = (Toolbar)findViewById(R.id.toolbar_satu);
        setSupportActionBar(ToolBarAtas2);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rowItems = new ArrayList<RowItem>();
        text = getResources().getStringArray(R.array.hutan);
        imagehutan = getResources().obtainTypedArray(R.array.imageHutan);

        for (int i = 0; i < text.length; i++) {
            RowItem item = new RowItem(text[i], imagehutan.getResourceId(i, -1));
            rowItems.add(item);
//            txt_title.append(text[i]+", ");
        }
        grid_hutan = (GridView) findViewById(R.id.grid_hutan);
        AdapterHutanActivity adapter = new AdapterHutanActivity(this, rowItems);
        grid_hutan.setAdapter(adapter);

        grid_hutan.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        int baris = position;
        Intent intent = new Intent(MenuUtamaActivity.this, DeskripsiActivity.class);
        intent.putExtra("baris", baris);
        startActivity(intent);
    }
}
