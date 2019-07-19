package com.example.hotelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Work extends AppCompatActivity {

    private Button btnSafety,maid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

         btnSafety = (Button)findViewById(R.id.btnSafety);
         maid= (Button)findViewById(R.id.btn7);

        btnSafety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnSafety = new Intent(Work.this ,Safety.class);
                startActivity(btnSafety);

            }
        });

        maid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnSafety = new Intent(Work.this ,mind.class);
                startActivity(btnSafety);

            }
        });
    }

    public void Clickback(View view) {
        finish();
    }
}
