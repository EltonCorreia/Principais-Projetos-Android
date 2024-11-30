package com.example.a08082024;

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

    EditText txtUsuario,txtSenha,txtNovoUsuario,txtNovaSenha;
    TextView txtSaida;
    View Fundo;
    SQLiteDatabase BancoSQLite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = findViewById(R.id.txtUsuario);
        txtSenha = findViewById(R.id.txtSenha);
        txtSaida = findViewById(R.id.txtSaida);
        Fundo = findViewById(R.id.Fundo);
        txtNovoUsuario = findViewById(R.id.txtNovoUsuario);
        txtNovaSenha = findViewById(R.id.txtNovaSenha);

        setTitle("Login");
        BancoSQLite=openOrCreateDatabase("Aula BD", Context.MODE_PRIVATE,null);
        BancoSQLite.execSQL("CREATE TABLE IF NOT EXISTS tabUsuario"+
                            "(Id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                            "login VARCHAR, senha VARCHAR);");

    }

    public void acesso (View v){
        String entUsuario, entSenha;
        entUsuario = txtUsuario.getText().toString();
        entSenha = txtSenha.getText().toString();
        Cursor c2 = BancoSQLite.rawQuery("SELECT * FROM tabUsuario where login='"+entUsuario+"' and senha='"+entSenha+"'",null);

        if(c2.moveToNext()){
            Intent intensao = new Intent(MainActivity.this,T2.class);
            startActivity(intensao);
            finish();
            Toast.makeText(this,"Entrou!",Toast.LENGTH_SHORT).show();
        }
        else if(entUsuario.equalsIgnoreCase("admin")&&entSenha.equalsIgnoreCase("a1234")){
            Fundo.setVisibility(View.VISIBLE);
        }else{
          txtSaida.setText("Usuário ou senha errado");
        }
    }

    public void inserir(View v){
        if(txtNovoUsuario.getText().toString().isEmpty()||txtNovaSenha.getText().toString().isEmpty()){
            txtSaida.setText("Preencha os campos");
        }
        else{
            BancoSQLite.execSQL("INSERT INTO tabUsuario(login,senha)VALUES"
                                +"('"+txtNovoUsuario.getText()+"'),'"+txtNovaSenha.getText()+"');");

            Toast.makeText(this,"Dados salvos",Toast.LENGTH_SHORT).show();

            txtNovoUsuario.setText("");
            txtNovaSenha.setText("");
            txtUsuario.setText("");
            txtSenha.setText("");
        }
    }
}