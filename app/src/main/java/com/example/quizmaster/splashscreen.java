package com.example.quizmaster;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class splashscreen extends AppCompatActivity {
         TextView textapp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent nextscreen=new Intent(splashscreen.this,MainActivity.class);
                startActivity(nextscreen);
                finish();

            }
        },3000);
       textapp=findViewById(R.id.textapp);
       textapp.animate().scaleXBy(0.2f).setDuration(1000);
    }
}
