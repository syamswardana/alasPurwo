package com.example.cubix.alaspurwo;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class AdapterTumbuhanActivity extends BaseAdapter {

    Context context;
    List<RowItemTumbuhan> rowItems;
    private RowItemTumbuhan row_pos;

    public AdapterTumbuhanActivity(Context contetxt, List<RowItemTumbuhan> rowItems) {
        this.context = contetxt;
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
        return rowItems.indexOf(rowItems.get(position));
    }

    private class viewHolder{
        TextView text;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder holder;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.activity_adapter_tumbuhan,null);
            holder = new viewHolder();
            holder.text = convertView.findViewById(R.id.txt_namaTumbuhan);
            RowItemTumbuhan row_pos = rowItems.get(position);

            holder.text.setText(row_pos.getNamaTumbuhan());
        }
        return convertView;
    }
}
