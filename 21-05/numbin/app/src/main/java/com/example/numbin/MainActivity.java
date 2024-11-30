package com.example.numbin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtBin;

    Button btnBin;

    TextView txtSaida;

    int bin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtBin = findViewById(R.id.txtBin);
        btnBin = findViewById(R.id.btnBin);
        txtSaida = findViewById(R.id.txtSaida);

    }

    public void binar(View v){

        bin=Integer.parseInt(txtBin.getText().toString());

        txtSaida.setText("O resultado em binário é igual a: " + Integer.toBinaryString(bin));

    }
}