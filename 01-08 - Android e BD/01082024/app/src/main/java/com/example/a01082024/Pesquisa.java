package com.example.a01082024;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Pesquisa extends AppCompatActivity {

    ArrayAdapter<String> ListaAgenda;
    String[] AgendaNome;

    TextView txtN, txtE, txtT;
    SQLiteDatabase BancoSQLite;
    Spinner spNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesquisa);

        BancoSQLite = openOrCreateDatabase("AulaBD", Context.MODE_PRIVATE, null);
        spNome = findViewById(R.id.spNome);

        txtN = findViewById(R.id.txtN);
        txtE = findViewById(R.id.txtE);
        txtT = findViewById(R.id.txtT);
        preencher();

        spNome.setOnItemSelectedListener
                (new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected
                            (AdapterView parent, View view, int pos, long id) {
                        String nomeL;
                        nomeL = parent.getItemAtPosition(pos).toString();
                        Cursor c2 = BancoSQLite.rawQuery("SELECT * FROM Aula where nome='"+nomeL+"'", null);
                        if (c2.moveToNext()) {
                            txtN.setText(c2.getString(1).toString());
                            txtE.setText(c2.getString(2).toString());
                            txtT.setText(c2.getString(3).toString());
                        }
                    }
                    public void onNothingSelected(AdapterView parent) {
                    }
                });
        }
        public void preencher(){

            Cursor c = BancoSQLite.rawQuery("SELECT * from Aula order by nome",null);
            AgendaNome = new String[c.getCount()];
            int i=0;

            while (c.moveToNext()){
            AgendaNome[i]=c.getString(1).toString();
            i++;
        }

        ListaAgenda = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,AgendaNome);
        spNome.setAdapter(ListaAgenda);
        }
    }