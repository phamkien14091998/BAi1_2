package com.example.student.pdk_cau2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Bai1Activity extends AppCompatActivity {
    ListView lvBai1;
    ArrayList<Bai1> bai1s;
    Bai1_Adapter bai1_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);

        anhXa();

        bai1_adapter= new Bai1_Adapter(this,R.layout.bai1,bai1s);
        lvBai1.setAdapter(bai1_adapter);
    }
    private void anhXa(){
        lvBai1 = findViewById(R.id.lvbai1);
        bai1s= new ArrayList<>();

        bai1s.add(new Bai1("Abc","hcm",123));
        bai1s.add(new Bai1("Akkbc","HN",123));
        bai1s.add(new Bai1("Absdc","hcm",334));
        bai1s.add(new Bai1("Abgfc","hcm",5566));
        bai1s.add(new Bai1("Abcee","hcm",123));
    }
}
