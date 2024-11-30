package com.example.a01082024;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtNome,txtEndereco,txtTelefone;
    Button btnSalvar,btnConsultar,btnConsultaPersonalizada;
    SQLiteDatabase BancoSQLite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = findViewById(R.id.txtNome);
        txtEndereco = findViewById(R.id.txtEndereco);
        txtTelefone = findViewById(R.id.txtTelefone);

        btnSalvar = findViewById(R.id.btnSalvar);
        btnConsultar = findViewById(R.id.btnConsultar);
        btnConsultaPersonalizada = findViewById(R.id.btnConsultaPersonalizada);

        setTitle("Cadastro");

        BancoSQLite = openOrCreateDatabase("AulaBD", Context.MODE_PRIVATE,null);
        BancoSQLite.execSQL("CREATE TABLE IF NOT EXISTS Aula (Id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "Nome VARCHAR," +
                "Endereco VARCHAR," +
                "Telefone VARCHAR);");
    }

    public void mensagem(String str){
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }

    public void Clicar(View v){

        if(v.getId()==R.id.btnSalvar){
            if (txtNome.getText().toString().isEmpty()
                    || txtEndereco.getText().toString().isEmpty()
                    || txtTelefone.getText().toString().isEmpty()){
                mensagem("Preencha os campos");
            }else{
                BancoSQLite.execSQL("INSERT INTO Aula(Nome,Endereco,Telefone)VALUES('"+ txtNome.getText()+"','"+ txtEndereco.getText()+"','"+ txtTelefone.getText()+"');");

                mensagem("Dados salvos!");

                txtNome.setText("");
                txtEndereco.setText("");
                txtTelefone.setText("");
                txtNome.requestFocus();
            }
        }else if (v.getId()==R.id.btnConsultar){
            Cursor c = BancoSQLite.rawQuery("SELECT * FROM Aula",null);

            if(c.getCount()==0){
                mensagem("Arquivo não encontrado");
            }else{
                StringBuffer buffer = new StringBuffer();
                while(c.moveToNext()){
                    buffer.append("Nome: "+c.getString(1)+"\n");
                    buffer.append("\n"+"Endereço: "+c.getString(2)+"\n");
                    buffer.append("\n"+"Telefone: "+c.getString(3)+"\n\n------------------------------------------------------------\n\n");
                }
                mensagem(buffer.toString());
            }

        }

    }

    public void pesquisa(View v){
        Intent troca = new Intent(MainActivity.this, Pesquisa.class);
        startActivity(troca);
        finish();
    }

}