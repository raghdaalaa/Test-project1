package com.example.mytask1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et_num1 ,et_num2;
    Button btn_sum,btn_sub,btn_multi,btn_div,btn_clear;
    TextView tv_result ,tv_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_num1=(EditText) findViewById(R.id.et_num1);
        et_num2=(EditText) findViewById(R.id.et_num2);

        btn_sum =(Button) findViewById(R.id.btn_sum);
        btn_sub =(Button) findViewById(R.id.btn_sub);
        btn_multi =(Button) findViewById(R.id.btn_multi);
        btn_div  =(Button) findViewById(R.id.btn_div);
        btn_clear =(Button) findViewById(R.id.btn_clear);

        tv_result=(TextView) findViewById(R.id.tv_result);
        tv_display =(TextView) findViewById(R.id.tv_display);



    }

    public void sum(View view){

        Double num1 =Double.parseDouble(et_num1.getText().toString()) ;
        Double num2 =Double.parseDouble(et_num2.getText().toString())  ;
        Double res=num1+num2;
        tv_result.setText(res.toString());

    }
    public void sub(View view){

        Double num1 =Double.parseDouble(et_num1.getText().toString()) ;
        Double num2 =Double.parseDouble(et_num2.getText().toString())  ;
        Double res=num1-num2;
        tv_result.setText(res.toString());

    }
    public void multi(View view){

        Double num1 =Double.parseDouble(et_num1.getText().toString()) ;
        Double num2 =Double.parseDouble(et_num2.getText().toString())  ;
        Double res=num1*num2;
        tv_result.setText(res.toString());

    }
    public void div(View view){

        Double num1 =Double.parseDouble(et_num1.getText().toString()) ;
        Double num2 =Double.parseDouble(et_num2.getText().toString())  ;
        Double res=num1/num2;
        tv_result.setText(res.toString());

    }
    public void clear(View view){

        tv_display.setText(" ");
        tv_result.setText(" ");
        et_num1.setText(" ");
        et_num2.setText(" ");


    }
}
