package com.example.girar;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    Spinner spnsal;
    EditText salario;
    TextView resposta;

    private static final String[] percentual = {"Escolha um item","20%","40%","45%","50%","70%","80%"};

    ArrayAdapter<String>percentualAdaptado;

    int aux = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnsal = findViewById(R.id.spn);
        salario = findViewById(R.id.EntSalario);
        resposta = findViewById(R.id.txtResposta);

        setTitle("Calcular aumento");

        percentualAdaptado = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,percentual);

        spnsal.setAdapter(percentualAdaptado);

        spnsal.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int ItemPosicao, long l) {
                aux = ItemPosicao;
                posicao();
                if (aux !=0){
                    alerta(spnsal.getSelectedItem().toString());
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


    }

    public void posicao(){

        String txtSalario = salario.getText().toString();
        double total=0;

        try{
            total=Double.parseDouble(txtSalario);
        }catch(Exception e){
            total=1;
        }

        switch(aux){

            case 1: resposta.setText(String.format("%.2f" ,total * 1.20));
            break;
            case 2: resposta.setText(String.format("%.2f" ,total * 1.40));
            break;
            case 3: resposta.setText(String.format("%.2f" , total * 1.45));
            break;
            case 4: resposta.setText(String.format("%.2f" ,total * 1.50));
            break;
            case 5: resposta.setText(String.format("%.2f" ,total * 1.70));
            break;
            case 6: resposta.setText(String.format("%.2f" ,total * 1.80));
            break;

        }

    }

    public void alerta(String texto){

        AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);

        dialogo.setTitle("Caixa de opção");
        dialogo.setMessage("Aumento foi de " +texto);
        dialogo.setNeutralButton("OK", null);
        dialogo.show();

    }

}