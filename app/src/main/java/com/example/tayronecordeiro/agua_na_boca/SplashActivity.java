package com.example.tayronecordeiro.agua_na_boca;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class SplashActivity extends Activity implements  Runnable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler SpleshScreen = new Handler();
        SpleshScreen.postDelayed(SplashActivity.this, 2000);


    }

    public void run (){
        startActivity(new Intent(SplashActivity.this, InicioActivity.class));
        finish();
    }

}
