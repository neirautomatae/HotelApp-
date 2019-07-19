package com.example.hotelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;


public class Disease extends AppCompatActivity {

    private Button backmenuho;
    private Button backhel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease);

         backmenuho = (Button)findViewById(R.id.btndis);
         backhel = (Button)findViewById(R.id.btnbackhel);



        backmenuho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backho = new Intent(Disease.this ,Health.class);
                startActivity(backho);

            }
        });

        backhel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hel = new Intent(Disease.this ,MainActivity.class);
                startActivity(hel);

            }
        });

    }
}
