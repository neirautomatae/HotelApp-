package com.example.hotelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nutrition extends AppCompatActivity {

    private Button btncal;
    private Button btngrid;
    private Button btnback1;
    private Button btnbmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);

        btncal = (Button)findViewById(R.id.btncal);
        btngrid = (Button)findViewById(R.id.btngrid);
        btnback1 = (Button)findViewById(R.id.btnback1);
        btnbmi = (Button)findViewById(R.id.btnbmi) ;

        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(Nutrition.this , Cal.class);
                startActivity(c);
            }
        });

        btngrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g = new Intent(Nutrition.this , Thegrid.class);
                startActivity(g);
            }
        });


        btnback1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nm1 = new Intent(Nutrition.this , MainActivity.class);
                startActivity(nm1);
            }
        });

        btnbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbmi = new Intent(Nutrition.this , BML.class);
                startActivity(btnbmi);
            }
        });
        }

    public void clickback(View view) {
        finish();
    }
}
