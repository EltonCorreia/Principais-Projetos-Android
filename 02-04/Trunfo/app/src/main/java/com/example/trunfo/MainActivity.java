package com.example.trunfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imagem;
    Random rand;

    int num;
    int vetImagem[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagem = findViewById(R.id.imV);
        imagem.setImageResource(R.drawable.trunfo);

        vetImagem = new int[]{

           R.drawable.cilindro,
           R.drawable.cubo,
           R.drawable.dodeca,
           R.drawable.esfera,
           R.drawable.icosa,
           R.drawable.icosaed,
           R.drawable.parale,
           R.drawable.piram,
           R.drawable.prisma,

        };

        imagem.setImageResource(R.drawable.trunfo);

    }

        public void sortear(){

            rand = new Random();
            num = rand.nextInt(8);

        }

        public void mudar(View v){

            sortear();
            imagem.setImageResource(vetImagem[num]);

            getSupportActionBar().hide();

        }

}