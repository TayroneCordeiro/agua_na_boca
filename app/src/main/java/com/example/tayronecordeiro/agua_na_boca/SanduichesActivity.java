package com.example.tayronecordeiro.agua_na_boca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class SanduichesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanduiches);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void clik_premium (View view) {
        Intent clik_premium = new Intent(SanduichesActivity.this, PremiumActivity.class);
        startActivity(clik_premium);
    }

    public void click_hamburguer (View view) {
        Intent  click_hamburguer = new Intent(SanduichesActivity.this, HambuerguerActivity.class);
        startActivity(click_hamburguer);
    }

    public void click_frango (View view) {
        Intent  click_frango = new Intent(SanduichesActivity.this, FrangoActivity.class);
        startActivity(click_frango);
    }

    public void click_lombo (View view) {
        Intent  click_lombo = new Intent(SanduichesActivity.this, LomboActivity.class);
        startActivity(click_lombo);
    }

    public void click_outros (View view) {
        Intent  click_outros = new Intent(SanduichesActivity.this, OutosActivity.class);
        startActivity(click_outros);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                startActivity(new Intent(this, CardapioActivity.class));
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}