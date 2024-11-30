package com.example.bichinhos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Spinner spn;
    ImageView imgBichos;
    TextView txtDescricao;

    private static final String[] bichos = {"Selecione um pet","Cachorro","Gato","Elefante","Leão"};

    ArrayAdapter<String> bichoEscolhido;

    int vetImagem[];

    int aux = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn = findViewById(R.id.spn);
        imgBichos = findViewById(R.id.imgBichos);
        txtDescricao = findViewById(R.id.txtDescricao);

        bichoEscolhido = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,bichos);

        spn.setAdapter(bichoEscolhido);

        imgBichos.setImageResource(R.drawable.bichos);

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int itemPosicao, long l) {

                aux = itemPosicao;
                posicao();

            }

            public void onNothingSelected(AdapterView<?> adapterView){

            }

        });

        vetImagem = new int[]{

                R.drawable.bichos,
                R.drawable.cachorro,
                R.drawable.fante,
                R.drawable.gatinho,
                R.drawable.leao,

        };

    }

    public void posicao(){

        switch(aux){

            case 1:
                imgBichos.setImageResource(R.drawable.cachorro);
            txtDescricao.setText("Nome: Al Pacino \n Raça: Vira-lata \n Idade: 10 anos \n Endereço: Rua dos Bobos");
            break;
            case 2:
                imgBichos.setImageResource(R.drawable.gatinho);
                txtDescricao.setText("Nome: Margaret Thatcher \n Raça: Inglesa \n Idade: 5 anos \n Endereço: Rua dos Colonizadores");
                break;
            case 3:
                imgBichos.setImageResource(R.drawable.fante);
                txtDescricao.setText("Nome: Gus Van Sant \n Raça: Cineasta \n Idade: 50 anos \n Endereço: Mulholland D.");
                break;
            case 4:
                imgBichos.setImageResource(R.drawable.leao);
                txtDescricao.setText("Nome: Ana \n Raça: Me chame de gata que sou sua \n Idade: 36 anos \n Endereço: Rua da Boa música");
                break;
        }

    }

}