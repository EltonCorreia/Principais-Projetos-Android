package com.example.a09042024;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Button btn;
    Random rand;

    int aviso = 0;
    int num;
    int vet[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imgV);
        img.setImageResource(R.drawable.dado_semvalor);

        btn = findViewById(R.id.btnSortear);

        vet = new int[]{

                R.drawable.dado_semvalor,
                R.drawable.dado_1,
                R.drawable.dado_2,
                R.drawable.dado_3,
                R.drawable.dado_4,
                R.drawable.dado_5,
                R.drawable.dado_6,

        };

        getSupportActionBar().hide();

    }

    public void sortear(View v){

        rand = new Random();
        num = rand.nextInt(7);
        img.setImageResource(vet[num]);

        aviso = aviso+num;

        if (aviso >= 50){

            Toast.makeText(this, "Ultrapassou o limite", Toast.LENGTH_LONG).show();

            aviso = 0;

        }

    }

}