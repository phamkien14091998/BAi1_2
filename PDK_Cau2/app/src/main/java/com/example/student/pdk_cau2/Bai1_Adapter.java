package com.example.student.pdk_cau2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Bai1_Adapter extends BaseAdapter {
    private Context ctx;
    private int layout;
    private List<Bai1> bai1List;

    public Bai1_Adapter(Context ctx, int layout, List<Bai1> bai1List) {
        this.ctx = ctx;
        this.layout = layout;
        this.bai1List = bai1List;
    }

    @Override
    public int getCount() {
        return bai1List.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        TextView txtTen= view.findViewById(R.id.txtTen);
        TextView txtCity= view.findViewById(R.id.txtCity);
        TextView txtSo= view.findViewById(R.id.txtSo);

        Bai1 bai1= bai1List.get(i);
        txtTen.setText(bai1.getTen());
        txtCity.setText(bai1.getCity());
        txtSo.setText(bai1.getSoluong());

        return view;
    }
}
