package com.example.a26092024;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.sql.SQLException;

public class InserirImagem extends AppCompatActivity {

    EditText editNome, editTelefone, editImagem;
    ClasseAcessa objA = new ClasseAcessa();
    String extensao = ".jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserir_imagem);

        editNome = findViewById(R.id.editNome);
        editTelefone = findViewById(R.id.editTelefone);
        editImagem = findViewById(R.id.editImagem);
    }

    public void jpg(View v){
        extensao = ".jpg";
    }

    public void png(View v){
        extensao = ".png";
    }

    public void salvar(View v){
        objA.entBanco(this);
        String nome_imagem = editImagem.getText().toString();
        String local = "C://imagem//"+ nome_imagem + extensao;
        String nomeIn = editNome.getText().toString();
        String telefoneIn = editTelefone.getText().toString();
        int x;
        try{
            x=objA.stmt.executeUpdate("INSERT INTO imagens(nome_bd, telefone_bd,imagem_bd)SELECT '"+nomeIn+"','"+telefoneIn+"',* FROM openrowset(bulk'"+local+"',single_blob)Alcimagem");
        }catch (SQLException throwables){
            x=0;
        }
        if(x >= 1){
            Toast.makeText(this, "Imagem salva", 2).show();
        }
    }
}