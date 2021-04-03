package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void selecionadoPedra(View view){
        System.out.println("Selecionado Pedra");
        this.opcaoSelecionada("pedra");

    }

    public void selecionadoPapel(View view){
        System.out.println("Selecionado Papel");
        this.opcaoSelecionada("papel");

    }


    public void selecionadoTesoura(View view){
        System.out.println("Selecionado Tesoura");
        this.opcaoSelecionada("tesoura");

    }
    public void opcaoSelecionada(String opcaoSelecionada){
        System.out.println("item clicado:" +opcaoSelecionada);
    }
}