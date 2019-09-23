package com.example.student.pdk_cau2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  EditText edtKQ;
  Button btnChuyenQua,btnChuyenBia1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtKQ= findViewById(R.id.edtKQ);
        btnChuyenQua=  findViewById(R.id.btnChuyen);
        btnChuyenBia1 = findViewById(R.id.btnChuyenBai1);

        Intent intent= getIntent();
        String kq=intent.getStringExtra("kq");
        edtKQ.setText(kq);

        btnChuyenQua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);


            }
        });

        btnChuyenBia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,Bai1Activity.class);
                startActivity(intent);


            }
        });

    }
}
