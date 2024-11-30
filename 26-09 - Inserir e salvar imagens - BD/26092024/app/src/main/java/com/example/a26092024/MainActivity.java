package com.example.a26092024;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.SQLException;

public class MainActivity extends AppCompatActivity {

    ImageView imV;
    TextView txtN, txtT;
    ClasseAcessa objA = new ClasseAcessa();
    Bitmap bitmap = null;
    byte[] imgBytes;
    Button btnInserir, btnPesquisar, btnAvancar, btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imV = findViewById(R.id.imV);
        txtN = findViewById(R.id.txtN);
        txtT = findViewById(R.id.txtT);
        btnInserir = findViewById(R.id.btnInserir);
        btnPesquisar = findViewById(R.id.btnPesquisar);
        btnAvancar = findViewById(R.id.btnAvancar);
        btnVoltar = findViewById(R.id.btnVoltar);
    }

    public void preencher(){
        if(bitmap != null){
            imV.setImageBitmap(bitmap);
        }else{
            imV.setImageResource(R.drawable.zebra);
        }
        try{
            txtN.setText("Nome: "+objA.RS.getString("nome_bd"));
            txtT.setText("Telefone: "+objA.RS.getString("telefone_bd"));
        }catch(SQLException e){}
    }

    public void entrar (View v){
        objA.entBanco(this);
        try{
            objA.RS = objA.stmt.executeQuery("SELECT*FROM imagens");
            if(objA.RS.next()){
                imgBytes = objA.RS.getBytes("imagem_bd");
                if(imgBytes != null){
                    bitmap = BitmapFactory.decodeByteArray(imgBytes, 0, imgBytes.length);
                }
                preencher();
            }
        }catch(Exception e){}
    }

    public void recuar(View v){
        try{
            if(objA.RS.previous()){
                imgBytes = objA.RS.getBytes("imagem_bd");
                if(imgBytes !=null){
                    bitmap = BitmapFactory.decodeByteArray(imgBytes, 0, imgBytes.length);
                }
                preencher();
            }
        }catch(SQLException throwables){

        }
    }

    public void avancar(View v){
        try{
            if(objA.RS.next()){
                imgBytes = objA.RS.getBytes("imagem_bd");
                if(imgBytes !=null){
                    bitmap = BitmapFactory.decodeByteArray(imgBytes, 0, imgBytes.length);
                }
                preencher();
            }
        }catch(SQLException throwables){

        }
    }

    public void irInserir(View v){
        Intent intent = new Intent(MainActivity.this, InserirImagem.class);
        startActivity(intent);
    }
}