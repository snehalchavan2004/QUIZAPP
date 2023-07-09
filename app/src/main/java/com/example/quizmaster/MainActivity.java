package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void c_act(View view)
    {
        Intent intent=new Intent(MainActivity.this,C_language.class);
         startActivity(intent);
    }


    public void cplus_act(View view)
    {
        Intent intent=new Intent(MainActivity.this,cplus.class);
        startActivity(intent);
    }
    public void java_act(View view)
    {
        Intent intent=new Intent(MainActivity.this,java.class);
        startActivity(intent);
    }

















}