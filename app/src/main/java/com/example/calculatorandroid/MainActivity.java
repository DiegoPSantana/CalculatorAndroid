package com.example.calculatorandroid;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button numeroZero, numeroUm, numeroDois, numeroTres, numeroQuatro,
    numeroCinco, numeroSeis, numeroSete, numeroOito, numeroNove ,ponto, soma, subtracao,
    multiplicacao, divisao, igual, botao_Limpar;

    private TextView txtExpresao, txtResultado;
    private ImageView backspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IniciarComponentes();

        getSupportActionBar().hide);
    }

    private void IniciarComponentes(){
        numeroZero = findViewById(R.id.numero_0);
        numeroUm = findViewById(R.id.numero_um);
        numeroDois = findViewById(R.id.numero_dois);
        numeroTres = findViewById(R.id.numero_tres);
        numeroQuatro = findViewById(R.id.numero_quatro);
        numeroCinco = findViewById(R.id.numero_cinco);
        numeroSeis = findViewById(R.id.numero_seis);
        numeroSete = findViewById(R.id.numero_sete);
        numeroOito = findViewById(R.id.numero_oito);
        numeroNove = findViewById(R.id.numero_9);
        ponto = findViewById(R.id.ponto);
        soma = findViewById(R.id.soma);
        subtracao = findViewById(R.id.subtracao);
        multiplicacao = findViewById(R.id.multiplicacao);
        divisao = findViewById(R.id.bt_divisao);
        igual = findViewById(R.id.igual);
        botao_Limpar = findViewById(R.id.bt_limpar);
        txtExpresao = findViewById(R.id.txt_expressao);
        txtResultado = findViewById(R.id.txt_resultado);
        backspace = findViewById(R.id.backspace);
    }
}