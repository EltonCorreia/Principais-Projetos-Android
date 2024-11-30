package com.example.a12092024;

import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtMarquee;
    View fundo;
    Random rand;
    CountDownTimer tempo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMarquee = findViewById(R.id.txtMarquee);
        fundo = findViewById(R.id.fundo);
    }

    public void iniciarContagem(){
        rand = new Random();
        tempo = new CountDownTimer(12000,5){
            int red = rand.nextInt(255);
            int green = rand.nextInt(255);
            int blue = rand.nextInt(255);

            public void onTick(long milisegundos){
                int red = rand.nextInt(255);
                int green = rand.nextInt(255);
                int blue = rand.nextInt(255);
                fundo.setBackgroundColor(Color.rgb(red,green,blue));
            }

            public void onFinish(){
                Toast.makeText(getBaseContext(), "Fim", Toast.LENGTH_SHORT).show();
            }

        }.start();
    }

    public void comecar(View v){
        iniciarContagem();
    }

    public void parar(View v){
        tempo.cancel();
    }

    public void ligar(View v){
        tempo.start();
    }
}