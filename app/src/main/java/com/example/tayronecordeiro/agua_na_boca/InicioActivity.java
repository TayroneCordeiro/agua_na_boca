package com.example.tayronecordeiro.agua_na_boca;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        this.findViewById(R.id.button_facebook).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String facebookUrl = "https://www.facebook.com/lanchonete.agua.na.boca.bzb";
                try {
                    int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                    if (versionCode >= 3002850) {
                        Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));;
                    } else {
                        // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/740560892751167")));
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    // Facebook is not installed. Open the browser
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                }
            }
        });
    }


    public void click_cardapio (View view) {
        Intent click_cardapio = new Intent(InicioActivity.this, CardapioActivity.class);
        startActivity(click_cardapio);
    }

    public void click_telefones (View view) {
        Intent click_telefones = new Intent(InicioActivity.this, TelefoneActivity.class);
        startActivity(click_telefones);
    }


}
