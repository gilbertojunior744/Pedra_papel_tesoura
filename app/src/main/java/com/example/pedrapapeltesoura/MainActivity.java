package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

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
    //Opção do App
    public void opcaoSelecionada(String opcaoSelecionada){
        ImageView imageResultado = findViewById(R.id.imageResultado);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra","papel","tesoura"};
        String opcaoApp = opcoes[numero];

        switch (opcaoApp){
            case "pedra" :
                imageResultado.setImageResource(R.drawable.pedra);

                break;

            case "papel" :
                imageResultado.setImageResource(R.drawable.papel);

                break;

            case "tesoura" :
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        System.out.println("item clicado:" +numero);

    }
}