package com.example.a03102024;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imagemFormatada;
    EditText editData, editRG, editCPF;
    Button btn;
    TextView txtS, txtC;
    AlciMask objM;
    Acessa objA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editData = findViewById(R.id.editData);
        editRG = findViewById(R.id.editRG);
        editCPF = findViewById(R.id.editCPF);
        btn = findViewById(R.id.btn);
        txtS = findViewById(R.id.txtS);
        txtC = findViewById(R.id.txtC);
        imagemFormatada = findViewById(R.id.imV);

        Bitmap imgBit = BitmapFactory.decodeResource(getResources(), R.drawable.rosto1);
        RoundedBitmapDrawable modificarImg = RoundedBitmapDrawableFactory.create(getResources(),imgBit);
        modificarImg.setCircular(true);

        //modificarImg.setCornerRadius(100.0f);
        //Bordas arredondadas

        //modificarImg.setAlpha(50);
        //Transparência

        imagemFormatada.setImageDrawable(modificarImg);

        TextWatcher criarMascara = AlciMask.aplicarMascara(editData, "##/##/####");
        editData.addTextChangedListener(criarMascara);
        editData.setHint("00/00/0000");

        criarMascara = AlciMask.aplicarMascara(editCPF, "###.###.###-##");
        editCPF.addTextChangedListener(criarMascara);
        editCPF.setHint("123.456.789-00");

        criarMascara = AlciMask.aplicarMascara(editRG, "##.###.###-#");
        editRG.addTextChangedListener(criarMascara);
        editRG.setHint("12.345.678-9");


    }

    public void mensagem(View v){
        txtC.setText("Data: "+editData.getText().toString()+"\nCPF: "+editCPF.getText().toString());
        txtS.setText("Data: "+AlciMask.removerMascara(editData.getText().toString())+"\nCPF: "+AlciMask.removerMascara(editCPF.getText().toString()));
    }
}