package com.example.student.pdk_cau2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity{
    EditText edta,edtb,edtc;
    Button btnGiaiVaGui;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ptb2xml);

        edta= (EditText) findViewById(R.id.edta);
        edtb= (EditText) findViewById(R.id.edtb);
        edtc= (EditText) findViewById(R.id.edtc);

        btnGiaiVaGui = (Button) findViewById(R.id.btnGiaiVaGui);

        btnGiaiVaGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a= Float.parseFloat(edta.getText().toString());
                float b= Float.parseFloat(edtb.getText().toString());
                float c= Float.parseFloat(edtc.getText().toString());

                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
                intent.putExtra("kq",giaiPTB2(a,b,c));
                startActivity(intent);

            }
        });

    }

    public String giaiPTB2(float a,float b,float c){
        if(a==0){
            if(b==0){
                return "Phương trình vô nghiệm";
            }
            else{
                 return  "Phương trình có một nghiệm: "+ "x="+(-c/b);
            }

        }
        float denta= b*b - 4*a*c;
        float x1,x2;

        if(denta > 0){
            x1=(float)((-b+ Math.sqrt(denta))/(2*a));
            x2=(float)((-b- Math.sqrt(denta))/(2*a));
            return "Phương trình có 2 nghiệm : " +"x1="+x1+ ", x2 ="+x2;
        }
        else if(denta==0){
            x1=(-b/(2*a));
            return "Phương Trình có nghiệm kép : x1=x2="+x1;
        }
        else{
            return "Phương trình vô nghiệm";
        }

    }


}
