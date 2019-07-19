package com.example.hotelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Health extends AppCompatActivity {

    private Button btnex;
    private Button btnmenuwork;
    private Button btnmenu2;
    private Button btnbk2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        btnex = (Button)findViewById(R.id.btnex);
        btnmenuwork = (Button)findViewById(R.id.btnmenuwork);
        btnmenu2 = (Button)findViewById(R.id.btnmenu2);
        btnbk2 = (Button)findViewById(R.id.btnbk2);


        btnex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nex = new Intent(Health.this ,exercise.class);
                startActivity(nex);
            }
        });

        btnmenuwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exe = new Intent(Health.this ,Disease.class);
                startActivity(exe);
            }
        });

        btnmenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Health.this.finish();
            }
        });

        btnbk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Health.this.finish();
            }
        });



    }

    public void clickBack(View view) {
        finish();
    }
}
