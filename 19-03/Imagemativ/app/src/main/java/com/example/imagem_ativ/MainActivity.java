package com.example.imagem_ativ;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imagem;
    EditText estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagem = findViewById(R.id.imV);
        estado = findViewById(R.id.txtnum);

    }

    public void img(View V){

        double v1;
        v1 = Double.parseDouble(estado.getText().toString());

        if(v1 > 0){

            imagem.setImageResource(R.drawable.positivo);

        }
        else if(v1 < 0){

            imagem.setImageResource(R.drawable.negativo);

        }
        else{

            imagem.setImageResource(R.drawable.neutro);

        }

    }

}