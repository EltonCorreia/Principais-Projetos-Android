package com.example.a24102024;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer som;
    int vetSom[]={
            R.raw.bomba,
            R.raw.train
    };
    int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //som = MediaPlayer.create(this, R.raw.bomba); - Formato direto
        som = MediaPlayer.create(this, vetSom[x]);
    }

    public void ligarSom(View v){
        if(som != null && !som.isPlaying()){
            som.start();
        }
    }

    public void pausarSom(View v){
        if(som != null && som.isPlaying()){
            som.pause();
        }
    }

    public void pararSom(View v){
        if(som != null && som.isPlaying()){
            som.stop();
        }
    }

    public void avancarSom(View v){
        som.stop();
        som = MediaPlayer.create(this, vetSom[x]);
        if(som != null && !som.isPlaying()){
            som.start();
        }
        if(x < vetSom.length-1){
            x++;
        }else{
            x=0;
        }
    }

    public void LiberarRecursos(){
        if(som != null){
            som.release();
            som = null;
        }
        super.onDestroy();
    }
}