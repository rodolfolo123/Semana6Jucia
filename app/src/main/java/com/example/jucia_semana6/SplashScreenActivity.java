package com.example.jucia_semana6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent o = new Intent(this,AuthActivity.class);
        startActivity(o);
        finish();


        //setContentView(R.layout.activity_splash_screen);
    }
}
