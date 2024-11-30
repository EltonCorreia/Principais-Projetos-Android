package com.example.numfatorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtFat;

    Button btnFat;

    TextView txtSaida;

    int fat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFat = findViewById(R.id.txtFat);
        btnFat = findViewById(R.id.btnFat);
        txtSaida = findViewById(R.id.txtSaida);

    }

    public void fatorial(View v){

        fat=Integer.parseInt(txtFat.getText().toString());

            int fatorial = 1;
            for (int i = 1; i <= fat; i++) {
                fatorial *= i;
            }

        txtSaida.setText("O fatorial é igual a: " + fatorial);

        }

    }