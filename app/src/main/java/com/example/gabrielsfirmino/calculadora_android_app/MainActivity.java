package com.example.gabrielsfirmino.calculadora_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

//1 = Somar
//2 = Subtrair
//3 = Dividir
//4 = Multiplicar

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void soma(View v){
        EditText opd1 = (EditText) findViewById(R.id.op1);
        int op1 = Integer.parseInt(opd1.getText().toString());

        EditText opd2 = (EditText) findViewById(R.id.op2);
        int op2 = Integer.parseInt(opd2.getText().toString());

        int rs = op1 + op2;

        TextView rtd = (TextView) findViewById(R.id.tv_resultado);
        rtd.setText(Integer.toString(rs));

    }
    public void subtracao(View v){
        EditText opd1 = (EditText) findViewById(R.id.op1);
        int op1 = Integer.parseInt(opd1.getText().toString());

        EditText opd2 = (EditText) findViewById(R.id.op2);
        int op2 = Integer.parseInt(opd2.getText().toString());

        int rs = op1 - op2;

        TextView rtd = (TextView) findViewById(R.id.tv_resultado);
        rtd.setText(Integer.toString(rs));
    }
    public void divisao(View v){
        EditText opd1 = (EditText) findViewById(R.id.op1);
        int op1 = Integer.parseInt(opd1.getText().toString());

        EditText opd2 = (EditText) findViewById(R.id.op2);
        int op2 = Integer.parseInt(opd2.getText().toString());

        int rs = op1 / op2;

        TextView rtd = (TextView) findViewById(R.id.tv_resultado);
        rtd.setText(Integer.toString(rs));
    }
    public void multiplicacao(View v){
        EditText opd1 = (EditText) findViewById(R.id.op1);
        int op1 = Integer.parseInt(opd1.getText().toString());

        EditText opd2 = (EditText) findViewById(R.id.op2);
        int op2 = Integer.parseInt(opd2.getText().toString());

        int rs = op1 * op2;

        TextView rtd = (TextView) findViewById(R.id.tv_resultado);
        rtd.setText(Integer.toString(rs));
    }
}
