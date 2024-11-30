package com.example.aulaliba2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView corFundo;

    SeekBar sb1;
    SeekBar sb2;
    SeekBar sb3;

    TextView r;
    TextView g;
    TextView b;

    int vermelho=0, verde=0, azul=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        corFundo = findViewById(R.id.textCor);

        sb1 = findViewById(R.id.sb1);
        sb2 = findViewById(R.id.sb2);
        sb3 = findViewById(R.id.sb3);

        r = findViewById(R.id.r);
        g = findViewById(R.id.g);
        b = findViewById(R.id.b);

        corFundo.setBackgroundColor(Color.rgb(vermelho,verde,azul));

        sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int posicao, boolean b)
            {
                vermelho = posicao;
                r.setText("R=" + posicao);
                mudancaCor();
            }

            @Override//não
            public void onStartTrackingTouch(SeekBar seekBar) { }
            @Override//não
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });

        sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int posicao, boolean b)
            {
                verde = posicao;
                g.setText("G=" + posicao);
                mudancaCor();
            }

            @Override//não
            public void onStartTrackingTouch(SeekBar seekBar) { }
            @Override//não
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });

        sb3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int posicao, boolean x)
            {
                azul = posicao;
                b.setText("B=" + posicao);
                mudancaCor();
            }

            @Override//não
            public void onStartTrackingTouch(SeekBar seekBar) { }
            @Override//não
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });

    }

    public void mudancaCor(){

        corFundo.setBackgroundColor(Color.rgb(vermelho,verde,azul));

    }

    public void fechar(View v){

        finish();

    }

}