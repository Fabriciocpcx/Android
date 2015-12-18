package com.example.fabricio.monteseulanche;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvCardapio;
    private TextView tvMontar;
    private TextView tvLocalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Cardapio(View view) {

        Intent it = new Intent(this, CardapioActivity.class); // Passo a classe que desejo abrir como referencia
        startActivity(it);

    }

    public void Localizar(View view) {


    }

    public void Montar(View view) {

      
    }
}
