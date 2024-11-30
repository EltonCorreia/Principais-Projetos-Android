package com.example.juroscompostos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtResultado;
    EditText editValorInicial, editAplicacaoMensal, editTempoAplicacao, editTaxa;

    double C, P, i, n, montante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = findViewById(R.id.txtResultado);
        editValorInicial = findViewById(R.id.editValorInicial);
        editAplicacaoMensal = findViewById(R.id.editAplicacaoMensal);
        editTempoAplicacao = findViewById(R.id.editTempoAplicacao);
        editTaxa = findViewById(R.id.editTaxa);
    }

    public void solucionar(View V)
    {
        C=Double.parseDouble(editValorInicial.getText().toString());
        P=Double.parseDouble(editAplicacaoMensal.getText().toString());
        i=Double.parseDouble(editTaxa.getText().toString());
        n=Double.parseDouble(editTempoAplicacao.getText().toString());

        if(C!=0)
        {
            montante = C*Math.pow(1+i, n) + P*((Math.pow(1+i, n)-1)/i) * (1+i);
            txtResultado.setText("O montante é igual: R$ " + String.format("%.4f",montante));
        }
    }
}