package com.example.usurio.cosmic;
/* Pacote da aplicação */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;

/* Declaração- Classe Selectors */
public class Selectors extends AppCompatActivity {

    private String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
       /* actionBar.setLogo(R.drawable.ic_launcher); */
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.containsKey("NOME")) {
            nome = bundle.getString("NOME");
        }
    }

    /* Método para refêrencia do menu setado no diretório menu do projeto. */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_selectors_action, menu);
        return super.onCreateOptionsMenu(menu);
    }
    /* Métodos com intent para transição entre as views com transição diferente especificado no diretório anim. */
    public void goToPlanets(View view) {
        Intent intent = new Intent(this, Planets.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
    }

    public void goToSat(View view) {
        Intent intent = new Intent(this, Satelite.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
    }

    public void goToMission(View view) {
        Intent intent = new Intent(this, Missoes.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
    }

    public void goToStar(View view) {
        Intent intent = new Intent(this, Estrelas.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
    }

    public void goToRel(View view) {
        Intent intent = new Intent(this, Relatos.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
    }
    public void goToImg(View view) {
        Intent intent = new Intent(this, Images.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
    }


}