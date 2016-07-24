package com.example.tayronecordeiro.agua_na_boca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }
    public void click_cardapio (View view) {
        Intent click_cardapio = new Intent(InicioActivity.this, CardapioActivity.class);
        startActivity(click_cardapio);
    }

}
