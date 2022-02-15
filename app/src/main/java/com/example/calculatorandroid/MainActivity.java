package com.example.calculatorandroid;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

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

        getSupportActionBar().hide();

        numeroZero.setOnClickListener(this);
        numeroUm.setOnClickListener(this);
        numeroDois.setOnClickListener(this);
        numeroTres.setOnClickListener(this);
        numeroQuatro.setOnClickListener(this);
        numeroCinco.setOnClickListener(this);
        numeroSeis.setOnClickListener(this);
        numeroSete.setOnClickListener(this);
        numeroOito.setOnClickListener(this);
        numeroNove.setOnClickListener(this);
        ponto.setOnClickListener(this);
        soma.setOnClickListener(this);
        subtracao.setOnClickListener(this);
        multiplicacao.setOnClickListener(this);
        divisao.setOnClickListener(this);

        botao_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpresao.setText("");
                txtResultado.setText("");
            }
        });
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

    public void AcrescetarUmaExpressao(String string, boolean limpar_dados){
        if(txtResultado.getText().equals("")){
            txtExpresao.setText("");
        }

        if(limpar_dados){
            txtResultado.setText("");
            txtExpresao.append(string);
        } else {
            txtExpresao.append(txtResultado.getText());
            txtExpresao.append(string);
            txtResultado.setText("");
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.numero_0:
                AcrescetarUmaExpressao("0", true);
                break;
            case R.id.numero_um:
                AcrescetarUmaExpressao("1", true);
                break;
            case R.id.numero_dois:
                AcrescetarUmaExpressao("2", true);
                break;
            case R.id.numero_tres:
                AcrescetarUmaExpressao("3", true);
                break;
            case R.id.numero_quatro:
                AcrescetarUmaExpressao("4", true);
                break;
            case R.id.numero_cinco:
                AcrescetarUmaExpressao("5", true);
                break;
            case R.id.numero_seis:
                AcrescetarUmaExpressao("6", true);
                break;
            case R.id.numero_sete:
                AcrescetarUmaExpressao("7", true);
                break;
            case R.id.numero_oito:
                AcrescetarUmaExpressao("8", true);
            case R.id.numero_9:
                AcrescetarUmaExpressao("9", true);
            case R.id.ponto:
                AcrescetarUmaExpressao(".", true);
                break;
            case R.id.soma:
                AcrescetarUmaExpressao("+", false);
                break;
            case R.id.subtracao:
                AcrescetarUmaExpressao("-", false);
                break;
            case R.id.multiplicacao:
                AcrescetarUmaExpressao("*", false);
                break;
            case R.id.bt_divisao:
                AcrescetarUmaExpressao("/", false);

        }
    }
}