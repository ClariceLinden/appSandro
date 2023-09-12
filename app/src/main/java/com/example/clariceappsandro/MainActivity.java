package com.example.clariceappsandro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Botões
    Button botaoCalculo;
    Button botaoImc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Encontrar botões
        botaoCalculo = findViewById(R.id.botaoCalculo);
        botaoImc = findViewById(R.id.botaoImc);

        botaoCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ir para a tela
                Intent telaCalculo = new Intent(MainActivity.this, CalculoSimplesActivity.class);
                startActivity(telaCalculo);
            }
        });
        botaoImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaImc = new Intent(MainActivity.this, CalculoIMCActivity.class);
                startActivity(telaImc);
            }
        });
    }
}