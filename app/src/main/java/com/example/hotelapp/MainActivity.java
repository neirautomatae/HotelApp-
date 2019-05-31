package com.example.hotelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = (Button)findViewById(R.id.btnNutrition);
        Button next2 = (Button)findViewById(R.id.btnHealth);
        Button next3 = (Button)findViewById(R.id.btnWork);
        Button next4 = (Button)findViewById(R.id.btnTips);
        Button next5 = (Button)findViewById(R.id.btnTele);
        Button next6 = (Button)findViewById(R.id.btnApp);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent N = new Intent(MainActivity.this ,Nutrition.class);
           startActivity(N);

            }
        });

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent H = new Intent(MainActivity.this ,Health.class);
                startActivity(H);

            }
        });

        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w = new Intent(MainActivity.this ,Work.class);
                startActivity(w);

            }
        });

        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent T = new Intent(MainActivity.this ,Tips.class);
                startActivity(T);

            }
        });
        next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Te = new Intent(MainActivity.this ,Tele.class);
                startActivity(Te);

            }
        });

        next6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A = new Intent(MainActivity.this ,App.class);
                startActivity(A);

            }
        });


    }



}
