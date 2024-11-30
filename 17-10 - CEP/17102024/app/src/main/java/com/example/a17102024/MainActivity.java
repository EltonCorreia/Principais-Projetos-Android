package com.example.a17102024;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    EditText editCEP;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editCEP = findViewById(R.id.editCEP);
        txtResultado = findViewById(R.id.txtResultado);

        TextWatcher criarMascara = AlciMask.aplicarMascara(editCEP, "#####-###");
        editCEP.addTextChangedListener(criarMascara);
        editCEP.setHint("12345-678");
    }

    public void busca(View v){
        try{
            AlciCEP retornaDados = new HTTPService(AlciMask.removerMascara(editCEP.getText().toString().trim())).execute().get();
            txtResultado.setText(retornaDados.toString().trim());
            Toast.makeText(this,""+retornaDados.getLogradouro().toString(),Toast.LENGTH_LONG).show();
        }
        catch (ExecutionException e){

        }
        catch (InterruptedException e){

        }
    }
}