package com.example.hotelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class exercise extends AppCompatActivity {

    private Button btnb1;
    private Button btnm1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        btnb1 = (Button)findViewById(R.id.btnb1);
        btnm1 = (Button)findViewById(R.id.btnm1);

        btnb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b1 = new Intent(exercise.this , Health.class);
                startActivity(b1);
            }
        });

        btnm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m1 = new Intent(exercise.this , MainActivity.class);
                startActivity(m1);
            }
        });

    }
}
