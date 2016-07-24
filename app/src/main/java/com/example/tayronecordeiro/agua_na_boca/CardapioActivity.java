package com.example.tayronecordeiro.agua_na_boca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class CardapioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

     public void click_sanduiches (View view) {
        Intent  click_sanduiches = new Intent(CardapioActivity.this, SanduichesActivity.class);
        startActivity(click_sanduiches);
    }

    public void click_bebidas (View view) {
        Intent  click_bebidas = new Intent(CardapioActivity.this, BebidasActivity.class);
        startActivity(click_bebidas);
    }

    public void click_acrescentar (View view) {
        Intent  click_acrescentar = new Intent(CardapioActivity.this, AcrescentarActivity.class);
        startActivity(click_acrescentar);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                startActivity(new Intent(this, InicioActivity.class));
                finish();
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
