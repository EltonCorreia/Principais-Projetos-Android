package com.example.spinner;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spn1;
    Spinner spn2;
    Spinner spn3;
    TextView txtcorFundo;
    int Red=0, G=0, B=0;

    ArrayAdapter<String> adapter;
    String[] values;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtcorFundo = findViewById(R.id.txtcorFundo);
        spn1 = findViewById(R.id.spn1);
        spn2 = findViewById(R.id.spn2);
        spn3 = findViewById(R.id.spn3);

        preencher();

        txtcorFundo.setBackgroundColor(Color.rgb(Red,G,B));

        spn1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Red=i;
                updateColor();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spn2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                G=i;
                updateColor();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spn3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                B=i;
                updateColor();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void preencher() {
        values = new String[256];
        for (int i = 0; i < 256; i++) {
            values[i] = String.valueOf(i);
        }

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, values);
        spn1.setAdapter(adapter);
        spn2.setAdapter(adapter);
        spn3.setAdapter(adapter);
    }

    public void updateColor() {
        txtcorFundo.setBackgroundColor(Color.rgb(Red,G,B));
    }
}


