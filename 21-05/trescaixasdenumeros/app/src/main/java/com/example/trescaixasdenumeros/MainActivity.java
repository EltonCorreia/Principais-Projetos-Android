package com.example.trescaixasdenumeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtNum1, txtNum2, txtNum3;

    int num1, num2, num3;

    Button btnSair;

    TextView txtSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        txtNum3 = findViewById(R.id.txtNum3);

        btnSair = findViewById(R.id.btnSair);

        txtSair = findViewById(R.id.txtSair);

    }

    public void calcular(View v){

        num1=Integer.parseInt(txtNum1.getText().toString());
        num2=Integer.parseInt(txtNum2.getText().toString());
        num3=Integer.parseInt(txtNum3.getText().toString());

        int soma = (num1+num2+num3);

        int maior;

        if(num1 > num2 & num1 > num3) {
            maior = num1;
        }else if(num2 > num1 & num2 > num3){
            maior = num2;
        }else{
            maior = num3;
        }

        txtSair.setText("O maior número é " + maior +"\nA soma dos números é " +soma + "\nA soma em binário é " + Integer.toBinaryString(soma));

    }

}