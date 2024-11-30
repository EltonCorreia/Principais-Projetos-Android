package com.example.atraso;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton azul,amarelo,verme,verde;
    TextView txtE;
    RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        azul=findViewById(R.id.azul);
        amarelo=findViewById(R.id.amarelo);
        verme=findViewById(R.id.vermelho);
        verde=findViewById(R.id.verde);
        txtE=findViewById(R.id.result);
        group=findViewById(R.id.group);

    }

    public void amar(View v){

        //txtE.setTextColor(Color.YELLOW);

        txtE.setTextColor(Color.parseColor("#DCB422"));

    }

    public void az(View v){

        //txtE.setTextColor(Color.BLUE);

        txtE.setTextColor(Color.parseColor("#3F51B5"));

    }

    public void verm(View v){

        //txtE.setTextColor(Color.RED);

        txtE.setTextColor(Color.parseColor("#E91E5E"));

    }

    public void ver(View v){

        //txtE.setTextColor(Color.GREEN);

        txtE.setTextColor(Color.parseColor("#8BC34A"));
        
    }

}