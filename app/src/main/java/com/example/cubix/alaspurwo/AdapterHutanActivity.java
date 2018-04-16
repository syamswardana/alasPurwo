package com.example.cubix.alaspurwo;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterHutanActivity extends BaseAdapter {

    Context context;
    List<RowItem> rowItems;
    private RowItem row_pos;

    public AdapterHutanActivity(Context context, List<RowItem> rowItems) {
        this.context = context;
        this.rowItems = rowItems;
    }

    @Override
    public int getCount() {
        return rowItems.size();
    }

    @Override
    public Object getItem(int position) {
        return rowItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return rowItems.indexOf(getItem(position));
    }

    private class viewHolder{
        ImageView gambar;
        TextView text;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder holder;
        LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView==null){
            convertView = mInflater.inflate(R.layout.activity_adapter_hutan,null);
            holder = new viewHolder();
            holder.gambar = convertView.findViewById(R.id.imageHutan);
            holder.text = convertView.findViewById(R.id.textHutan);

            RowItem row_pos = rowItems.get(position);

            holder.gambar.setImageResource(row_pos.getImageHutan());
            holder.text.setText(row_pos.getText());
        }
        return convertView;
    }
}
