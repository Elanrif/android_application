package com.example.myfirstapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private ImageView play ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);/* on démarre par défaut le layout.activity_main2*/

        this.play = (ImageView) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*on va démarrer une nouvelle activité avec Intent*/
                Intent otherActivity = new Intent(getApplicationContext(),CookieActivity.class);
                startActivity(otherActivity);/* on lance l'activité*/
                finish();/* on doit arreté celui-ci en cours.*/
            }
        });
    }
}