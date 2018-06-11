package com.example.ichanghyeon.application02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ichanghyeon on 2018. 6. 11..
 */

public class CustomAdapter extends BaseAdapter {
    ArrayList<String> items = new ArrayList<>();

    public CustomAdapter(ArrayList<String> items) {
        this.items = items;
    }



    @Override
    public int getCount() {
        return items.size();
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
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.list_main, parent, false);

        TextView title = convertView.findViewById(R.id.title);

        String data = items.get(position);

        title.setText(data);

        return convertView;
    }
}
