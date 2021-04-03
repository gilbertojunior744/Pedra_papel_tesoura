package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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
    public void opcaoSelecionada(String opcaoUsuario){
        ImageView imageResultado = findViewById(R.id.imageResultado);
        TextView textResultado = findViewById(R.id.textResultado);




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
        if(
                (opcaoApp == "tesoura" && opcaoUsuario == "papel") ||
                (opcaoApp == "pedra" && opcaoUsuario =="tesoura") ||
                        (opcaoApp == "papel" && opcaoUsuario =="pedra"))

        {//Quando o App for ganhador
            textResultado.setText("Você Perdeu");

        }else if(
                (opcaoUsuario == "tesoura" && opcaoApp == "papel") ||
                        (opcaoUsuario == "pedra" && opcaoApp =="tesoura") ||
                        (opcaoUsuario == "papel" && opcaoApp =="pedra"))
        {//Quando o usuario for ganhador
            textResultado.setText("Você Venceu");
        }else{//Empate
            textResultado.setText("Empate");
        }

        System.out.println("item clicado:" +numero);

    }
}