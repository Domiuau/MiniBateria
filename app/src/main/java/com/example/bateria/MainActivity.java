package com.example.bateria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    AppCompatButton chimbal, caixa, tom, prato, bumbo, ligardesligar;
    MediaPlayer tom1, chimbal1, caixa1, prato1, bumbo1;
    LinearLayout tom2, chimbal2, caixa2, prato2, bumbo2;
    int a = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        tom1 = MediaPlayer.create(MainActivity.this, R.raw.tom1);
        chimbal1 = MediaPlayer.create(MainActivity.this, R.raw.chimbal);
        caixa1 = MediaPlayer.create(MainActivity.this, R.raw.caixa);
        prato1 = MediaPlayer.create(MainActivity.this, R.raw.prato);
        bumbo1 = MediaPlayer.create(MainActivity.this, R.raw.bumbo);

        chimbal = findViewById(R.id.chimbal);
        caixa = findViewById(R.id.caixa);
        tom = findViewById(R.id.tom1);
        prato = findViewById(R.id.prato);
        bumbo = findViewById(R.id.bumbo);
        ligardesligar = findViewById(R.id.ligardesligar);
        tom2 = findViewById(R.id.fundoazul);
        chimbal2 = findViewById(R.id.fundorosa);
        caixa2 = findViewById(R.id.fundoamarelo);
        prato2 = findViewById(R.id.fundolaranja);
        bumbo2 = findViewById(R.id.fundoverde);

        chimbal.setOnClickListener(this);
        caixa.setOnClickListener(this);
        tom.setOnClickListener(this);
        prato.setOnClickListener(this);
        bumbo.setOnClickListener(this);
        ligardesligar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a++;
                System.out.println(a);

                if (a % 2 == 0) {
                    ligardesligar.setBackgroundResource(R.drawable.botaoverde);
                    ligardesligar.setText("ligado");
                    ligar();
                } else {
                    ligardesligar.setBackgroundResource(R.drawable.botaovermelho);
                    ligardesligar.setText("Desligado");
                    tom2.setBackgroundResource(R.drawable.desligado);
                    chimbal2.setBackgroundResource(R.drawable.desligado);
                    caixa2.setBackgroundResource(R.drawable.desligado);
                    prato2.setBackgroundResource(R.drawable.desligado);
                    bumbo2.setBackgroundResource(R.drawable.desligado);

                }

            }
        });
    }

    void ligar() {
        tom2.setBackgroundResource(R.drawable.botaoazul);
        chimbal2.setBackgroundResource(R.drawable.botaorosa);
        caixa2.setBackgroundResource(R.drawable.botaoamarelo);
        prato2.setBackgroundResource(R.drawable.botaolaranja);
        bumbo2.setBackgroundResource(R.drawable.botaoverde);
    }


    @Override
    public void onClick(View v) {

        if (a % 2 == 0) {


            switch (v.getId()) {


                case R.id.chimbal:
                    chimbal1.start();
                    chimbal2.setBackgroundResource(R.drawable.botaobranco);
                    caixa2.setBackgroundResource(R.drawable.botaoamarelo);
                    prato2.setBackgroundResource(R.drawable.botaolaranja);
                    bumbo2.setBackgroundResource(R.drawable.botaoverde);
                    tom2.setBackgroundResource(R.drawable.botaoazul);

                    break;
                case R.id.caixa:
                    caixa1.start();
                    tom2.setBackgroundResource(R.drawable.botaoazul);
                    chimbal2.setBackgroundResource(R.drawable.botaorosa);
                    caixa2.setBackgroundResource(R.drawable.botaobranco);
                    prato2.setBackgroundResource(R.drawable.botaolaranja);
                    bumbo2.setBackgroundResource(R.drawable.botaoverde);
                    break;
                case R.id.tom1:
                    tom1.start();
                    tom2.setBackgroundResource(R.drawable.botaobranco);
                    chimbal2.setBackgroundResource(R.drawable.botaorosa);
                    caixa2.setBackgroundResource(R.drawable.botaoamarelo);
                    prato2.setBackgroundResource(R.drawable.botaolaranja);
                    bumbo2.setBackgroundResource(R.drawable.botaoverde);
                    break;
                case R.id.prato:
                    prato1.start();
                    tom2.setBackgroundResource(R.drawable.botaoazul);
                    chimbal2.setBackgroundResource(R.drawable.botaorosa);
                    caixa2.setBackgroundResource(R.drawable.botaoamarelo);
                    prato2.setBackgroundResource(R.drawable.botaobranco);
                    bumbo2.setBackgroundResource(R.drawable.botaoverde);
                    break;
                case R.id.bumbo:
                    bumbo1.start();
                    tom2.setBackgroundResource(R.drawable.botaoazul);
                    chimbal2.setBackgroundResource(R.drawable.botaorosa);
                    caixa2.setBackgroundResource(R.drawable.botaoamarelo);
                    prato2.setBackgroundResource(R.drawable.botaolaranja);
                    bumbo2.setBackgroundResource(R.drawable.botaobranco);
                    break;


            }


        }


    }
}