package com.example.tayronecordeiro.agua_na_boca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     public void click_sanduiches (View view) {
        Intent  click_sanduiches = new Intent(MainActivity.this, SanduichesActivity.class);
        startActivity(click_sanduiches);
    }

    public void click_bebidas (View view) {
        Intent  click_bebidas = new Intent(MainActivity.this, BebidasActivity.class);
        startActivity(click_bebidas);
    }

    public void click_acrescentar (View view) {
        Intent  click_acrescentar = new Intent(MainActivity.this, AcrescentarActivity.class);
        startActivity(click_acrescentar);
    }


}
