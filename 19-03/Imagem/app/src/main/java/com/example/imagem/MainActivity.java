package com.example.imagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagem = findViewById(R.id.imV);

    }

    public void trocar1(View V){

        imagem.setImageResource(R.drawable.slowdive);

    }

    public void trocar2(View V){

        imagem.setImageResource(R.drawable.menitrust);

    }

    public void trocar3(View V){

        imagem.setImageResource(R.drawable.naruto);

    }

    public void trocar4(View V){

        imagem.setImageResource(R.drawable.rosto);

    }

}