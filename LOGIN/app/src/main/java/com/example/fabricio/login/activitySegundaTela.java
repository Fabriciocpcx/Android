package com.example.fabricio.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activitySegundaTela extends AppCompatActivity {


    private Button bVoltar;
    private TextView tvTexto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_segunda_tela);

        bVoltar = (Button) findViewById(R.id.bVoltar);
        tvTexto = (TextView)findViewById(R.id.tvTexto);

        Intent i = getIntent();

        String texto = i.getStringExtra("texto");

        texto = "Bem Vindo " + texto + " !";
        tvTexto.setText(texto);


    }


    public void voltar(View v) {

        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }

}
