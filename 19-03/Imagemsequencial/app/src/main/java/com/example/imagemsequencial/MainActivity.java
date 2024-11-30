package com.example.imagemsequencial;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imagem;
    int [] imagens={

        R.drawable.homemaranha,R.drawable.fotocacho,R.drawable.naruto,R.drawable.negativo,R.drawable.positivo,R.drawable.neutro,R.drawable.rosto

    };

    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagem = findViewById(R.id.imgV);

    }

    public void avanca (View v){

        imagem.setImageDrawable(getDrawable(imagens[i]));
        i++;
        if(i>6){

            i=0;

        }

    }

    public void voltar (View v){

        imagem.setImageDrawable(getDrawable(imagens[i]));
        i--;
        if (i<0){

            i=6;

        }

    }

}