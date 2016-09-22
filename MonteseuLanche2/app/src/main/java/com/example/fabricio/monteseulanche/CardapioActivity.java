package com.example.fabricio.monteseulanche;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CardapioActivity extends AppCompatActivity {

    private Button btVoltar;
    private ListView lvCardapio;


    ArrayList<String> lista = new ArrayList<String> ();
    ArrayList<String> valor = new ArrayList<String>();
    private ArrayAdapter <String> adpLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);

        lvCardapio = (ListView)findViewById(R.id.lvCardapio);

        adpLista = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 );
        lvCardapio.setAdapter(adpLista);

        adpLista.add("X-SALADA");
        adpLista.add("X-BACON");
        adpLista.add("X-EGG");
        adpLista.add("CACHORRO-QUENTE PRENSADO");
        adpLista.add("X-FRANGO");
        adpLista.add("BAURÚ");
        adpLista.add("X-BAGUNCINHA");
        adpLista.add("X-TUDO");
        adpLista.add("X-DEMOLIDOR");

        //int posicao = adpLista.getPosition();

        //Setando Ingredientes
        lista.add("Pão, Hamburg, Alface, Tomate, Maionese, Mussarela");
        lista.add("Pão, Hamburg, Bacon, Presunto, Alface, Tomate, Catypiry, Mussarela");
        lista.add("Pão, Hamburg, Ovo Frito, Alface, Tomate, Maionese, Mussarela");
        lista.add("Pão, Hamburg, Salsicha, Batata Palha Tomate, Maionese, Mussarela");
        lista.add("Pão, Frango, Milho Verde, Alface, Tomate, Maionese, Mussarela");
        lista.add("Pão Francês, Presunto , Alface, Tomate, Maionese, Mussarela");
        lista.add("Pão, Hamburg, Bacon, Alface, Milho, Ovo Frito, Tomate, Maionese, Presunto, Mussarela");
        lista.add("Pão, Hamburg, Frango, Batata Palha, Bacon, Alface, Milho, Ovo Frito, Tomate, Maionese, Presunto, Mussarela");
        lista.add("Pão, Hamburg, Frango, Picles, Batata Palha, Bacon, Salsicha, Cheddar, Alface, Milho, Ovo Frito, Tomate, Maionese, Presunto, Mussarela");

        valor.add("7,00");
        valor.add("8,50");
        valor.add("8,00");
        valor.add("8,00");
        valor.add("8,50");
        valor.add("6,00");
        valor.add("9,00");
        valor.add("10,00");
        valor.add("15,00");



        lvCardapio.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // selected item
                String product = ((TextView) view).getText().toString();


                Intent i = new Intent(getApplicationContext(), ingredientesActivity.class);

                i.putExtra("lanche", lista.get(position));
                i.putExtra("valor", valor.get(position));
                startActivity(i);

            }
        });

    }

    public void Voltar(View view) {

        Intent it = new Intent(this,MainActivity.class); // Passo a classe que desejo abrir como referencia
        startActivity(it);

    }
}
