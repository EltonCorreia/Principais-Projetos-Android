package com.example.jogoveia;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String x="X";
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button padrao;
    int cont=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);

    }

    public void liberar(View v){

        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        cont=0;

    }

    public void alerta(String texto){

        AlertDialog.Builder dialogo=new AlertDialog.Builder(MainActivity.this);

        dialogo.setTitle("Jogo da Velha");
        dialogo.setMessage(texto);
        dialogo.setNeutralButton("OK", null);
        dialogo.show();

    }

    public void verif(){

        if
        (btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X")
                || btn4.getText().equals("X")&&btn5.getText().equals("X")&&btn6.getText().equals("X")
                || btn7.getText().equals("X")&&btn8.getText().equals("X")&&btn9.getText().equals("X")
                || btn1.getText().equals("X")&&btn5.getText().equals("X")&&btn9.getText().equals("X")
                || btn3.getText().equals("X")&&btn5.getText().equals("X")&&btn7.getText().equals("X")
                || btn1.getText().equals("X")&&btn4.getText().equals("X")&&btn7.getText().equals("X")
                || btn2.getText().equals("X")&&btn5.getText().equals("X")&&btn8.getText().equals("X")
                || btn3.getText().equals("X")&&btn6.getText().equals("X")&&btn9.getText().equals("X"))
        {
            alerta("X venceu!");
            cont=0;
        }

        else if (
                btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O")
                        || btn4.getText().equals("O")&&btn5.getText().equals("O")&&btn6.getText().equals("O")
                        || btn7.getText().equals("O")&&btn8.getText().equals("O")&&btn9.getText().equals("O")
                        || btn1.getText().equals("O")&&btn5.getText().equals("O")&&btn9.getText().equals("O")
                        || btn3.getText().equals("O")&&btn5.getText().equals("O")&&btn7.getText().equals("O")
                        || btn1.getText().equals("O")&&btn4.getText().equals("O")&&btn7.getText().equals("O")
                        || btn2.getText().equals("O")&&btn5.getText().equals("O")&&btn8.getText().equals("O")
                        || btn3.getText().equals("O")&&btn6.getText().equals("O")&&btn9.getText().equals("O")
        )
        {
            alerta("O venceu!");
            cont=0;
        }

        cont++;

        if(cont ==9){
            alerta("Deu velha!");
        }


    }

    public void trocar(){

        if (x.equals("X")){

            padrao.setText("O");
            x="O";
            padrao.setEnabled(false);
            verif();

        }else{

            padrao.setText("X");
            x="X";
            padrao.setEnabled(false);
            verif();

        }

    }

    public void onClick(View v){

        if((Button)v==btn1){
            padrao=findViewById(R.id.btn1);
            trocar();

        }
        else if((Button)v==btn2){
            padrao=findViewById(R.id.btn2);
            trocar();

        }
        else if((Button)v==btn3){
            padrao=findViewById(R.id.btn3);
            trocar();

        }
        else if((Button)v==btn4){
            padrao=findViewById(R.id.btn4);
            trocar();

        }
        else if((Button)v==btn5){
            padrao=findViewById(R.id.btn5);
            trocar();

        }
        else if((Button)v==btn6){
            padrao=findViewById(R.id.btn6);
            trocar();

        }
        else if((Button)v==btn7){
            padrao=findViewById(R.id.btn7);
            trocar();

        }
        else if((Button)v==btn8){
            padrao=findViewById(R.id.btn8);
            trocar();

        }
        else if((Button)v==btn9){
            padrao=findViewById(R.id.btn9);
            trocar();

        }

    }

}