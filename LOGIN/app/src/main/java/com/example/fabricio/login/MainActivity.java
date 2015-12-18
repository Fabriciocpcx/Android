package com.example.fabricio.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtNome;
    private EditText edtSenha;
    private TextView tvInfo;
    private Button bLogar;
    private Button bCriar;
    private Button bExcluir;
   static  ArrayList<String> usuarios = new ArrayList<String>();
    static ArrayList<String> senhas = new ArrayList<String>();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText) findViewById(R.id.edtNome);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
        bCriar = (Button) findViewById(R.id.bCriar);
        bExcluir = (Button) findViewById(R.id.bExcluir);
        bLogar = (Button) findViewById(R.id.bLogar);
        tvInfo = (TextView) findViewById(R.id.tvInfo);


    }


    public boolean Busca(String nome, String senha) {

        for (int i = 0; i < usuarios.size(); i++) {

            if (nome.equals(usuarios.get(i).toString())) {

                if (senha.equals(senhas.get(i).toString())) {

                    return true;


                }


            }

        }

        tvInfo.setText("Nome ou Senha de usuario Incorreto! ");
        return false;
    }

    public void CriarUsuario(View v) {

        String texto = edtNome.getText().toString();
        String senha = edtSenha.getText().toString();

        if (texto != "" && senha != "") {


            Intent it = new Intent(this, activitySegundaTela.class); // Passo a classe que desejo abrir como referencia
            it.putExtra("texto", texto);
            usuarios.add(texto);
            senhas.add(senha);
            startActivity(it);
        }


    }

    public void LogarUsuario(View v) {

        String nome = edtNome.getText().toString();
        String senha = edtSenha.getText().toString();

        boolean aux =Busca(nome,senha);

        if(aux != false){

            Intent it = new Intent(this, activitySegundaTela.class); // Passo a classe que desejo abrir como referencia
            it.putExtra("texto", nome);
            startActivity(it);

        }

    }

    public void ExcluirUsuario(View v) {


        String nome = edtNome.getText().toString();
        String senha = edtSenha.getText().toString();

        for (int i = 0; i < usuarios.size(); i++) {

            if (nome.equals(usuarios.get(i).toString())) {

                if (senha.equals(senhas.get(i).toString())) {

                    if (nome != "" && senha != "") {
                        usuarios.remove(i);
                        senhas.remove(i);
                        tvInfo.setText("Usuario Excluido!");
                    }
                } else {
                    tvInfo.setText("Senha ou Usuario não confere!");
                }


            } else {

                tvInfo.setText("Senha ou Usuario não confere!");

            }
        }

    }


}
