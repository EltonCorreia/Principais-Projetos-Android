package com.example.coresmenus;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtVisor;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menucor,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int cor = item.getItemId();

        if(cor==R.id.amarelo){

            txtVisor.setBackgroundColor(Color.rgb(255,240,0));

        }else if(cor==R.id.azul){

            txtVisor.setBackgroundColor(Color.rgb(65,105,225));

        }else if(cor==R.id.verde){

            txtVisor.setBackgroundColor(Color.rgb(46,139,87));

        }else if(cor==R.id.vermelho){

            txtVisor.setBackgroundColor(Color.rgb(204,0,0));

        }else if(cor==R.id.rosa){

            txtVisor.setBackgroundColor(Color.rgb(255,182,193));

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtVisor = findViewById(R.id.txtVisor);

    }
}