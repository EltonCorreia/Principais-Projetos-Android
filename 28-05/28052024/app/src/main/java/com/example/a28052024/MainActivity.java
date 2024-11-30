package com.example.a28052024;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTitulo;

    EditText txtA;
    EditText txtB;
    EditText txtC;

    Button btnSolucao;

    TextView txtX1;
    TextView txtX2;
    TextView txtDelta;

    double a,b,c;

    double delta,raizdelta,x1,x2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitulo = findViewById(R.id.txtTitulo);

        txtA = findViewById(R.id.txtA);
        txtB = findViewById(R.id.txtB);
        txtC = findViewById(R.id.txtC);

        btnSolucao = findViewById(R.id.btnSolucao);

        txtX1 = findViewById(R.id.txtX1);
        txtX2 = findViewById(R.id.txtX2);
        txtDelta = findViewById(R.id.txtDelta);

    }

    public void solucao(View v){

        a=Double.parseDouble(txtA.getText().toString());
        b=Double.parseDouble(txtB.getText().toString());
        c=Double.parseDouble(txtC.getText().toString());

        //Delta
        if(a!=0){
            delta = (b*b) - (4*a*c);
            raizdelta=(int) Math.sqrt(delta);

            txtDelta.setText("● O delta é: "+delta+"");
        }

        //Raizes
        if(delta>=0){
            txtX1.setText("● A raiz de X1 é: "+(-b + Math.sqrt(delta))/(2*a)+"");
            txtX2.setText("● A raiz de X2 é: "+(-b - Math.sqrt(delta))/(2*a)+"");
        }

        else{

        txtDelta.setText("● O Delta é negativo");

        }

    }

}