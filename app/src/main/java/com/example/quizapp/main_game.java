package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class main_game extends AppCompatActivity {

    Button btneasy, btnaverage, btnhard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);

        btneasy = (Button) findViewById(R.id.btneasy);
        btnaverage = (Button) findViewById(R.id.btnaverage);
        btnhard = (Button) findViewById(R.id.btnhard);

        btneasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pass = new Intent(getApplicationContext(),easy.class);
                startActivity(pass);
            }
        });
        btnaverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pass = new Intent(getApplicationContext(),average.class);
                startActivity(pass);
            }
        });
        btnhard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pass = new Intent(getApplicationContext(),hard.class);
                startActivity(pass);
            }
        });
    }
}