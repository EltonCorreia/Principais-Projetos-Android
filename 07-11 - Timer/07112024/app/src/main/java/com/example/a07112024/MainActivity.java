package com.example.a07112024;

import android.os.SystemClock;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Chronometer crm;
    long pause;
    boolean correndo;
    ImageView imV;
    int [] imagens={R.drawable.cachorro,R.drawable.jacare,R.drawable.gatinho,R.drawable.girafa,R.drawable.javali,R.drawable.zebra2};
    int i = 0;
    int conte = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Meu cronometro");
        crm = findViewById(R.id.cronometro);
        imV = findViewById(R.id.imV);

        crm.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            public void onChronometerTick(Chronometer chronometer) {
                if((SystemClock.elapsedRealtime()-crm.getBase())>5000){
                    if(conte%5==0){
                        imV.setImageDrawable(getDrawable(imagens[i]));
                        i++;
                    }
                    if(i==6){
                        i=0;
                    }
                    conte++;
                }
            }
        });
    }

    public void iniciar(View v){
        if(!correndo){
            crm.setBase(SystemClock.elapsedRealtime()-pause);
            crm.start();
            correndo=true;
        }
    }

    public void pausar(View v)
    {
        if(correndo){
            crm.stop();
            pause=SystemClock.elapsedRealtime()-crm.getBase();
            correndo=false;
        }
    }

    public void parar(View v){
        crm.setBase(SystemClock.elapsedRealtime());
        crm.stop();
        pause=0;
        correndo=false;
    }
}