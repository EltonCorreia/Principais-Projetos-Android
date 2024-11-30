package com.example.a08082024;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tsplash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intensao = new Intent(TSplash.this,MainActivity.class);
                startActivity(intensao);
                finish();
            }
        },3000);
    }
}