package com.example.a21052024;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgV;

    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menuimagens,menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int img = item.getItemId();

        if(img==R.id.rato){

            imgV.setImageResource(R.drawable.rato);

        }else if(img==R.id.gato){

            imgV.setImageResource(R.drawable.gato);

        }else if(img==R.id.elefante){

            imgV.setImageResource(R.drawable.elefante);

        }else if(img==R.id.pinguim){

            imgV.setImageResource(R.drawable.pinguim);

        }else if(img==R.id.cachorro){

            imgV.setImageResource(R.drawable.cachorro);

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgV = findViewById(R.id.imgV);

    }
}