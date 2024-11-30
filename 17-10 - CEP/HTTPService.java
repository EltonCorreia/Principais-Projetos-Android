package com.example.testecep;

import android.os.AsyncTask;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class HTTPService extends AsyncTask<Void, Void, AlciCEP> {

    private final String cepInserido;

    public HTTPService(String cep) {
        this.cepInserido = cep;
    }

    protected AlciCEP doInBackground(Void... voids){

        StringBuilder resposta = new StringBuilder();

        if (this.cepInserido != null && this.cepInserido.length() == 8){
            try{
                URL url = new URL ("https://viacep.com.br/ws/" + this.cepInserido + "/json/");
                HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
                conexao.setRequestMethod("GET");
                conexao.setRequestProperty("Content-type", "application/json");
                conexao.setRequestProperty("Accept", "application/json");
                conexao.setDoOutput(true);
                conexao.setConnectTimeout(5000);
                conexao.connect();

                Scanner sc = new Scanner(url.openStream());
                if (sc == null){
                    resposta.append("CEP");
                }
                while (sc.hasNext()){
                       resposta.append(sc.next()+" ");
                }


            }catch (MalformedURLException e){

            }catch (IOException e){

            }
        }//fim do if

        return  new Gson().fromJson(resposta.toString(), AlciCEP.class);
    }
}
