package com.example.fabricio.monteseulanche;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ingredientesActivity extends AppCompatActivity {

    private TextView tvIngredientes;
    private TextView tvValor;
    private Button btVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredientes);

        tvIngredientes = (TextView) findViewById(R.id.tvIngredientes);
        tvValor = (TextView) findViewById(R.id.tvValor);

        Intent i = getIntent();
        // getting attached intent data
        String lanche = i.getStringExtra("lanche");
        String valor = i.getStringExtra("valor");

        // displaying selected product name
        tvIngredientes.setText(lanche);
        tvValor.setText(valor);

    }

    public void Voltar(View view) {

        Intent it = new Intent(this, CardapioActivity.class); // Passo a classe que desejo abrir como referencia
        startActivity(it);
    }
}
