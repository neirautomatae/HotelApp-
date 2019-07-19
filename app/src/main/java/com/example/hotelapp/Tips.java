package com.example.hotelapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;




public class Tips extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);




        }


    public void clickinforaphics(View view) {

        Intent inforaphics = new Intent(Intent.ACTION_VIEW);
        inforaphics.setData(Uri.parse("https://med.mahidol.ac.th/infographics"));
        startActivity(inforaphics);

    }

    public void clickbackh(View view) {

            finish();

    }
}