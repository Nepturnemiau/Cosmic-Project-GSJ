package com.example.usurio.cosmic;
/* Pacote da aplicação. */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.EditText;

/* Declaração- Classe Main Principal */
public class MainActivity extends AppCompatActivity  {

    /* Variável do edit nome na página activity_main.xml. */
    private EditText editNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Adição do suporte a action Bat superior */
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
       /* actionBar.setLogo(R.drawable.ic_launcher); */
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        editNome=(EditText)findViewById(R.id.editNome);

    }
    /* Método para refêrencia do menu setado no diretório menu do projeto. */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main_actions,menu);
        return super.onCreateOptionsMenu(menu);
    }

    /*Método para passagem das views com um efeito anim com a função overridePendingTransition com efeitos no diretório anim */
    public void goToSelectors(View view) {
        Intent intent = new Intent(this, Selectors.class);
        intent.putExtra("NOME", editNome.getText().toString());
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
    }

}
