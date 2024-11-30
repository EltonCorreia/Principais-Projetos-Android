package com.example.a25072024;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtConta;
    EditText txtResultado, txtNome;
    Random rand;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtConta = findViewById(R.id.txtConta);
        txtNome = findViewById(R.id.txtNome);
        txtResultado = findViewById(R.id.txtResultado);
        sorteio();
    }

    public void sorteio(){

        rand = new Random();
        num1 = rand.nextInt(100);
        num2 = rand.nextInt(100);
        txtConta.setText(num1+ " + " +num2);
    }

    public void evento(View V){

        if(Integer.parseInt(txtResultado.getText().toString())==(num1+num2)){

            Intent muda = new Intent(MainActivity.this, T2.class);
            muda.putExtra("nome", txtNome.getText().toString());
            startActivity(muda);
            finish();
        }
        else{
            Intent muda2 = new Intent(MainActivity.this, T3.class);
            muda2.putExtra("nome", txtNome.getText().toString());
            startActivity(muda2);
            finish();
        }
    }
}