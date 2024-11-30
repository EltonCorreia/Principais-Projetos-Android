package com.example.a15082024;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.sql.SQLException;

public class MainActivity extends AppCompatActivity {

    Acessa objA = new Acessa();
    TextView txtMostrar1,txtMostrar2;

    String pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMostrar1 = findViewById(R.id.txtMostrar1);
        txtMostrar2 = findViewById(R.id.txtMostrar2);
    }

    public void conectar(View a){
        objA.entBanco(this);
        consultar();
        try{
            if(objA.RS.next()){
                preencher();
            }
        }catch (SQLException e){

        }
    }

    public void consultar(){
        try{
            objA.RS = objA.stmt.executeQuery("SELECT * FROM login ORDER BY usuario");
        }catch (SQLException ex){

        }
    }

    public void preencher(){
        try{
            txtMostrar1.setText(objA.RS.getString("usuario"));
            txtMostrar2.setText(objA.RS.getString("senha"));
        }catch(SQLException ex){

        }
    }

    public void avancar(View v){
        try{
            if(objA.RS.next()){
                preencher();
            }
        }catch(SQLException ex){

        }
    }

    public void voltar(View v){
        try{
            if(objA.RS.previous()){
                preencher();
            }
        }catch (SQLException ex){

        }
    }

    public void ultimo(View v){
        try{
            if(objA.RS.last()){
                preencher();
            }
        }catch(SQLException ex){

        }
    }

    public void primeiro(View v){
        try{
            if(objA.RS.first()){
                preencher();
            }
        }catch (SQLException ex){

        }
    }

}