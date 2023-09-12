package com.example.clariceappsandro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculoSimplesActivity extends AppCompatActivity {

    Button botaoSomar;
    EditText numero1;
    EditText numero2;
    EditText numero3;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_simples);

        botaoSomar = findViewById(R.id.botaoSomar);
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        numero3 = findViewById(R.id.numero3);
        resultado = findViewById(R.id.resultado);

        botaoSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                int n3 = Integer.parseInt(numero3.getText().toString());
                int res = n1 + n2 + n3;
                resultado.setText("Resultado: " + res);
            }
        });
    }
}