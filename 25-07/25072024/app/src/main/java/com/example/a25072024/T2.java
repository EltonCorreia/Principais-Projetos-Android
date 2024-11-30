package com.example.a25072024;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class T2 extends AppCompatActivity {

    TextView txtNomeReceber;
    String NomeVariavel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t2);

        txtNomeReceber = findViewById(R.id.txtReceberNome);
        NomeVariavel = getIntent().getStringExtra("nome");
        txtNomeReceber.setText(NomeVariavel);
    }
}