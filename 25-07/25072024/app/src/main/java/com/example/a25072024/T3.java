package com.example.a25072024;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class T3 extends AppCompatActivity {

    TextView txtNomeReceber2;
    String NomeVariavel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t3);

        txtNomeReceber2 = findViewById(R.id.txtReceberNome2);
        NomeVariavel = getIntent().getStringExtra("nome");
        txtNomeReceber2.setText(NomeVariavel);

    }
}