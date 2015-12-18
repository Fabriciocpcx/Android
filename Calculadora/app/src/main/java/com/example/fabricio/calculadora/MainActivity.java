package com.example.fabricio.calculadora;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText num1, num2;
    TextView tvInfo;
    Button btDividir, btMultiplicar, btSubtrair, btSomar;

    Double n1, n2, resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Pegando os valores inseridos
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);


        btMultiplicar = (Button) findViewById(R.id.btMultiplicar);

        btSubtrair = (Button) findViewById(R.id.btSubtrair);

        btDividir = (Button) findViewById(R.id.btDividir);


        btSomar = (Button) findViewById(R.id.btSomar);


    }


    //Botão Somar
    public void soma(View v) {

        //Passando os valores inseridos para as variaveis
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());

        resultado = n1 + n2;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("O Resultado da Soma é :" + resultado);
        dlg.setNeutralButton("OK", null);
        dlg.show();

    }

    //Botão subtrair
    public void subtrair(View v) {

        //Passando os valores inseridos para as variaveis
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());

        resultado = n1 - n2;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("O Resultado da subtração é :" + resultado);
        dlg.setNeutralButton("OK", null);
        dlg.show();

    }

    //Botão dividir
    public void dividir(View v) {

        //Passando os valores inseridos para as variaveis
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());

        resultado = n1 / n2;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("O Resultado da Divisão é :" + resultado);
        dlg.setNeutralButton("OK", null);
        dlg.show();

    }

    //Botão multiplicar
    public void multiplicar(View v) {

        //Passando os valores inseridos para as variaveis
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());

        resultado = n1 * n2;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("O Resultado da Multipli é :" + resultado);
        dlg.setNeutralButton("OK", null);
        dlg.show();

    }


}
