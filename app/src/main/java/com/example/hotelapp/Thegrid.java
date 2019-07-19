package com.example.hotelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Thegrid extends AppCompatActivity {

    private Button btnmnho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thegrid);

        btnmnho = findViewById(R.id.btnmnho);

        btnmnho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tm = new Intent(Thegrid.this , MainActivity.class);
                startActivity(tm);
            }
        });
    }


    public void clickback(View view) {
        finish();
    }

    public void clickfood1(View view) {
        Intent food1 = new Intent(Thegrid.this,Food.class);
        startActivity(food1);
    }
}
