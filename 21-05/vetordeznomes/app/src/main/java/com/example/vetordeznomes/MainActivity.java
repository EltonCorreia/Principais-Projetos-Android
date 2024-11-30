package com.example.vetordeznomes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtvisor;

    Button btnOK;

    Random aleatorio;

    private static final String[] nomes = {"Arthur","Luísa","Eduardo","Jennifer","Luiz","Vitor","Ana","Matheus","Marina","Beatriz"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtvisor = findViewById(R.id.txtVisor);

        btnOK = findViewById(R.id.btnOK);

    }

    public void nomealeatorio(View v){

       aleatorio = new Random();
       txtvisor.setText(nomes[aleatorio.nextInt(10)]);

    }

}