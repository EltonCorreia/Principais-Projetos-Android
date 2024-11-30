package com.example.a09042024_ativ3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtResultado;
    EditText txtNota1;
    EditText txtNota2;
    Button btnCalc;

    Double nota1;
    Double nota2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = findViewById(R.id.txtResultado);
        txtNota1 = findViewById(R.id.txtNotas);
        txtNota2 = findViewById(R.id.txtNotas2);

        getSupportActionBar().hide();
    }

    public void calcular(View v){

        nota1=Double.parseDouble(txtNota1.getText().toString());
        nota2=Double.parseDouble(txtNota2.getText().toString());

        Double media = ((nota1 + nota2)/ 2);

        if (media >= 7){
            txtResultado.setText(media +  "Aluno aprovado!");
        }else if (media < 5){
            txtResultado.setText(media +  "Aluno reprovado!");
        }else{
            txtResultado.setText(media +  "Aluno em recuperação!");
        }

    }



}