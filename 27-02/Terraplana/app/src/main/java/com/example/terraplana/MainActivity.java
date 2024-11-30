package com.example.terraplana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView n1, n2;
    double num1, num2;
    View fundo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=findViewById(R.id.num1);
        n2=findViewById(R.id.num2);
        fundo=findViewById(R.id.desktop);

    }

    public void carregar(){

        try{

            num1=Double.parseDouble(n1.getText().toString());
            num2=Double.parseDouble(n2.getText().toString());

        }catch (Exception ex){

            num1=1;
            num2=0;

        }

    }

    public void mensagem (double resultado, String calculo){

        Toast.makeText(this, " A " +calculo+ " é "+ (resultado),Toast.LENGTH_SHORT).show();

    }

    public void soma(View v){

     carregar();

     fundo.setBackgroundResource(R.color.corsoma);

     double limite=Double.parseDouble(String.format("%.3f", (num1+num2)).toString());

     mensagem(limite, "soma");

    }

    public void subtrair(View v){

        carregar();

        fundo.setBackgroundResource(R.color.corsub);

        double limite=Double.parseDouble(String.format("%.3f", (num1-num2)).toString());

        mensagem(limite, "subtração");

    }

    public void dividir(View v){

        carregar();

        fundo.setBackgroundResource(R.color.cordiv);

        double limite=Double.parseDouble(String.format("%.3f", (num1/num2)).toString());

        mensagem(limite, "divisão");

    }

    public void multiplicar(View v){

        carregar();

        fundo.setBackgroundResource(R.color.cormult);

        double limite=Double.parseDouble(String.format("%.3f", (num1*num2)).toString());

        mensagem(limite, "multiplicação");

    }

}