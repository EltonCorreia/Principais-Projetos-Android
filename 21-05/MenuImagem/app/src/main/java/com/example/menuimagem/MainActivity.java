package com.example.menuimagem;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgView;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_animal,menu);
               return true;
                 }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id ==R.id.bic){
            imgView.setBackgroundResource(R.drawable.bichos);
        }else if (id==R.id.cat){
            imgView.setBackgroundResource(R.drawable.gatinho);
        }else if(id==R.id.dog){
            imgView.setBackgroundResource(R.drawable.cachorro);
        }else if(id==R.id.elefan){
            imgView.setBackgroundResource(R.drawable.fante);
        }else if(id==R.id.lion){
            imgView.setBackgroundResource(R.drawable.leao);
        }



        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView = findViewById(R.id.imageView2);

    }
}