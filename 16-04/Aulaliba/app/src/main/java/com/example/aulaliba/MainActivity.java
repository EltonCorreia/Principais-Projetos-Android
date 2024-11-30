package com.example.aulaliba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar sb;
    TextView txtResultado;

    SeekBar sb2;
    TextView txtResu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sb = findViewById(R.id.sb);
        txtResultado = findViewById(R.id.txtResultado);

        sb2 = findViewById(R.id.sb2);
        txtResu = findViewById(R.id.txtResu);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int posicao, boolean b)
            {
                String resultado = "";

                for(int i=1; i <= 10; i++){
                    resultado += posicao + " x " + i + " = " + (i * posicao) + "\n";
                }

                txtResultado.setText(resultado);
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

                txtResu.setText(" Velozes e Furiosos "  + posicao);

            }

            @Override//não
            public void onStartTrackingTouch(SeekBar seekBar) { }
            @Override//não
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });

    }



}