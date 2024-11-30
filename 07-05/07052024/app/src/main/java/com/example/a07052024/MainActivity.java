package com.example.a07052024;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.laranja){

            Toast.makeText(this,"Laranja", Toast.LENGTH_SHORT).show();

        }else if(id==R.id.abacaxi){

            Toast.makeText(this,"Abacaxi", Toast.LENGTH_SHORT).show();

        }else if(id==R.id.banana){

            Toast.makeText(this,"Banana", Toast.LENGTH_SHORT).show();

        }else if(id==R.id.goiaba){

            Toast.makeText(this,"Goiaba", Toast.LENGTH_SHORT).show();

        }else if(id==R.id.uva){

            Toast.makeText(this,"Uva", Toast.LENGTH_SHORT).show();

        }else if(id==R.id.melancia){

            Toast.makeText(this,"Melancia", Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}