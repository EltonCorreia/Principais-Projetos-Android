package com.example.spinnerbinario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spn;
    TextView txtBin;

    int aux = 0;

    String[] bin;

    ArrayAdapter<String> numescolhido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn = findViewById(R.id.spn);
        txtBin = findViewById(R.id.txtBin);

        binar();

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int posicao, long l) {

                aux = posicao;

                txtBin.setText(Integer.toBinaryString(posicao));

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void binar(){

        bin = new String [256];

        for (int i=0; i<256; i++){
        bin[i] = i+"";

        }

        numescolhido = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,bin);

        spn.setAdapter(numescolhido);

    }

}