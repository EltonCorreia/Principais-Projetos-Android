package com.example.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText peso;

    EditText altura;

    Double num1, num2;

    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peso = findViewById(R.id.txtPeso);
        altura = findViewById(R.id.txtAltura);
        resultado = findViewById(R.id.txtResult);

    }

    public void calcular(View v){

        num2=Double.parseDouble(peso.getText().toString());
        num1=Double.parseDouble(altura.getText().toString());


        Double imc =  (num2 / Math.pow(num1,2));

        imc=Double.parseDouble(String.format("%.2f", imc));

        if (imc < 19){
            resultado.setText(imc+" Abaixo do Peso");
        }else if (imc < 24){
            resultado.setText(imc+" Peso Ideal");
        }else if (imc < 29){
            resultado.setText(imc+" SobrePeso");
        }else if (imc < 34){
            resultado.setText(imc+" Obesidade I");
        }else if (imc < 39){
            resultado.setText(imc+" Obesidade II");
        }else {
            resultado.setText(imc + " Obesidade III");
        }

        getSupportActionBar().hide();

        }

}