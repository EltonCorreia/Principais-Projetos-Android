package com.example.a30042024;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spn;
    TextView txtVisor;

    private static final String[] tabuada = {"Escolha um valor","Do 1","Do 2","Do 3","Do 4","Do 5","Do 6","Do 7","Do 8","Do 9","Do 10"};

    ArrayAdapter<String> tabuadaEscolhida;

    int aux = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn = findViewById(R.id.spn);
        txtVisor = findViewById(R.id.txtVisor);

        tabuadaEscolhida = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,tabuada);

        spn.setAdapter(tabuadaEscolhida);

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int itemPosicao, long l) {

                aux = itemPosicao;
                posicao();

            }

            public void onNothingSelected(AdapterView<?> adapterView){

            }

        });


    }

    public void posicao(){

        String resultado = "";

        for(int i=1; i <= 10; i++){
            resultado += aux + " x " + i + " = " + (i * aux) + "\n";
        }

        txtVisor.setText(resultado);

    }

}