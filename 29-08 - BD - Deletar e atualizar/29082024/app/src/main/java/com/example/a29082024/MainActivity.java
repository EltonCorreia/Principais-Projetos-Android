package com.example.a29082024;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.SQLException;

public class MainActivity extends AppCompatActivity {

    EditText txtUsuario, txtSenha;
    Acessa objA = new Acessa();
    String loginAntigo, senhaAntiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = findViewById(R.id.txtUsuario);
        txtSenha = findViewById(R.id.txtSenha);
        objA.entBanco(this);
        consultar();
    }

    public void consultar(){
        try{
        objA.RS = objA.stmt.executeQuery("SELECT * FROM login ORDER BY usuario");
        objA.RS.next();
        preencher();
        }catch(SQLException ex){

        }
    }

    public void preencher(){
        try{
            txtUsuario.setText(objA.RS.getString("usuario"));
            txtSenha.setText(objA.RS.getString("senha"));

            loginAntigo = objA.RS.getString("usuario");
            senhaAntiga = objA.RS.getString("senha");
        }catch(SQLException ex){

        }
    }

    public void avancar (View v){
        try{
            if(objA.RS.next()){
                preencher();
            }
        }catch (SQLException ex){

        }
    }

    public void voltar (View v){
        try{
            if(objA.RS.previous()){
                preencher();
            }
        }catch (SQLException ex){

        }
    }

    public void alterar (View v){
        String loginNovo, senhaNova;
        loginNovo = txtUsuario.getText().toString();
        senhaNova = txtSenha.getText().toString();

        try{
            int result = objA.stmt.executeUpdate("UPDATE login SET usuario='"+loginNovo+"',senha='"+senhaNova+"' WHERE usuario='"+loginAntigo+"'AND senha='"+senhaAntiga+"'");
            if(result > 0){
                Toast.makeText(getApplicationContext(), "Dados alterados com sucesso!", Toast.LENGTH_SHORT).show();
                consultar();
            }else{}
        }catch(SQLException ex){}
    }

    public void deletar (View v){
        try{
            int result = objA.stmt.executeUpdate("DELETE FROM login WHERE usuario='"+loginAntigo+"'AND senha='"+senhaAntiga+"'");
            if(result > 0){
                Toast.makeText(getApplicationContext(), "Dados apagados com sucesso!", Toast.LENGTH_SHORT).show();
                consultar();
            }else{}
        }catch(SQLException ex){}
    }
}