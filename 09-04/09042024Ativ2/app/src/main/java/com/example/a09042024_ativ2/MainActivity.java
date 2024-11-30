package com.example.a09042024_ativ2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView img1;
    ImageView img2;

    Button btn;
    Random rand;

    int num;
    int vet[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.imgV);
        img2 = findViewById(R.id.imgV2);

        img1.setImageResource(R.drawable.dado_semvalor);
        img2.setImageResource(R.drawable.dado_semvalor);

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

    public void randomico(){

        rand = new Random();
        num = rand.nextInt(7);

    }

    public void sortear(View v){

        randomico();

        img1.setImageResource(vet[num]);

        randomico();

        img2.setImageResource(vet[num]);

    }

}