package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultado;
    int numero1 = 0;
    int numero2 = 0;
    String operador="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.resultado);

    }

    public void Escribir1(View view) {
        if(resultado.getText().toString().equals("0")){
            resultado.setText("1");
        }
        else {
            resultado.setText(resultado.getText()+"1");
        }
    }

    public void Escribir2(View view) {
        if(resultado.getText().toString().equals("0")){
            resultado.setText("2");
        }
        else {
            resultado.setText(resultado.getText()+"2");
        }
    }

    public void Escribir3(View view) {
        if(resultado.getText().toString().equals("0")){
            resultado.setText("3");
    }
    else {
        resultado.setText(resultado.getText()+"3");
    }
    }

    public void Escribir4(View view) {
        if(resultado.getText().toString().equals("0")){
            resultado.setText("4");
        }
        else {
            resultado.setText(resultado.getText()+"4");
        }
    }

    public void Escribir5(View view) {
        if(resultado.getText().toString().equals("0")){
            resultado.setText("5");
        }
        else {
            resultado.setText(resultado.getText()+"5");
        }
    }
    public void Escribir6(View view) {
        if(resultado.getText().toString().equals("0")){
            resultado.setText("6");
        }
        else {
            resultado.setText(resultado.getText()+"6");
        }
    }
    public void Escribir7(View view) {
        if(resultado.getText().toString().equals("0")){
            resultado.setText("7");
        }
        else {
            resultado.setText(resultado.getText()+"7");
        }
    }
    public void Escribir8(View view) {
        if(resultado.getText().toString().equals("0")){
            resultado.setText("8");
        }
        else {
            resultado.setText(resultado.getText()+"5");
        }
    }
    public void Escribir9(View view) {
        if(resultado.getText().toString().equals("0")){
            resultado.setText("9");
        }
        else {
            resultado.setText(resultado.getText()+"9");
        }
    }
    public void Escribir0(View view) {
        if(resultado.getText().toString().equals("0")){
            resultado.setText("0");
        }
        else {
            resultado.setText(resultado.getText()+"0");
        }
    }

    public void EscribirSuma(View view) {
        resultado.setText(resultado.getText()+"+");
    }

    public void Clear(View view) {
        resultado.setText("0");
        numero1=0;
        numero2=0;
        operador="";
    }
}