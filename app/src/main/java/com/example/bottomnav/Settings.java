package com.example.bottomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Settings extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_settings );
        NavBar();



    }

    private void NavBar()
    {

        //initialisation de notre bande comprenant differents elements
        BottomNavigationView bottomNavigationView = findViewById ( R.id.bottom_navigation );
        // appel de notre fonction dinitialisation

        //cette fonction s'occupera de la fonctionnalite de notre bar de navigation

        // premiere etape sera de choisir le premier element de la navbar de sélectionné
        bottomNavigationView.setSelectedItemId ( R.id.settings );

        // nous allons a present ecouter ce que va faire l'utilisateur
        bottomNavigationView.setOnNavigationItemSelectedListener ( new BottomNavigationView.OnNavigationItemSelectedListener () {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId ()) {
                    case R.id.maison:
                        startActivity ( new Intent ( getApplicationContext (),MainActivity.class ) );
                        overridePendingTransition ( 0,0 );
                        return true;

                    case R.id.settings:
                        return true;

                    case R.id.sms:
                        startActivity ( new Intent ( getApplicationContext (),Sms.class ) );
                        overridePendingTransition ( 0,0 );
                        return true;
                }
                return false;
            }
        } );
    }
}
