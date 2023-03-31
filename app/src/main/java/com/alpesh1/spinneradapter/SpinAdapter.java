package com.alpesh1.spinneradapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class SpinAdapter extends BaseAdapter {

    String name[];
    public SpinAdapter(String[] first) {
        this.name = first;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(viewGroup.getContext()).inflate(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,viewGroup,false);

        TextView txtview = view.findViewById(R.id.txtview);
        txtview.setText(name[i]);

        return view;
    }
}
