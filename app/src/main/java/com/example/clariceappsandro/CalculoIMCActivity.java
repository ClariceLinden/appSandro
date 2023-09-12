package com.example.clariceappsandro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculoIMCActivity extends AppCompatActivity {

    EditText nomeEditText, idadeEditText, alturaEditText, pesoEditText;
    Button calcularButton;
    TextView resultadoTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_imcactivity);

        nomeEditText = findViewById(R.id.nomeEditText);
        idadeEditText = findViewById(R.id.idadeEditText);
        alturaEditText = findViewById(R.id.alturaEditText);
        pesoEditText = findViewById(R.id.pesoEditText);
        resultadoTextView = findViewById(R.id.resultadoTextView);
        calcularButton = findViewById(R.id.calcularButton);

        calcularButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = nomeEditText.getText().toString();
                int idade = Integer.parseInt(idadeEditText.getText().toString());
                double altura = Double.parseDouble(alturaEditText.getText().toString());
                double peso = Double.parseDouble(pesoEditText.getText().toString());

                // Calcular o IMC
                double imc = peso / (altura * altura);

                String classificacao;
                switch ((int) imc) {
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        classificacao = "Peso normal";
                        break;
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        classificacao = "Sobrepeso";
                        break;
                    default:
                        classificacao = "Obeso";
                        break;
                }

                // Exibir o resultado
                String resultado = nome + ", " + idade + " seu IMC é: " + imc + "\nE a classificação: " + classificacao;
                resultadoTextView.setText(resultado);
            }
        });
    }
}