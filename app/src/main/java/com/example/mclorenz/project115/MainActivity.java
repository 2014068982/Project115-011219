package com.example.mclorenz.project115;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static int time = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo_screen);
        new Handler().postDelayed(new Runnable() {
           @Override
            public void run () {
               Intent homeIntent = new Intent(MainActivity.this,WelcomeScreen.class);
               startActivity(homeIntent);
               overridePendingTransition(R.anim.fadein,R.anim.fadeout);
               finish();
           }
           },time);
    }
}