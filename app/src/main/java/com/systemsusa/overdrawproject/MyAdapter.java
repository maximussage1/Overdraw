package com.systemsusa.overdrawproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by renesignoret on 4/26/15.
 */
public class MyAdapter extends BaseAdapter {
    Context context;
    public MyAdapter(Context context){
        this.context = context;
    }
    final String[] array = {"Raul","Jorge","Pepe","Mauricio","Roberto","Laura","Patricia","Topanga","Rosalba","Roberta"};
    @Override
    public int getCount() {
        return array.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflate = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rootView = inflate.inflate(R.layout.layout, null);
        ((TextView)rootView.findViewById(R.id.textView)).setText(array[position]);
        ((TextView)rootView.findViewById(R.id.textView3)).setText("Cuarto Grado");
        return rootView;
    }
}
