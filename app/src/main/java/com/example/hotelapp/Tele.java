package com.example.hotelapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tele extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tele);

    }

    public void clickweb(View view) {
        Intent web = new Intent(Intent.ACTION_VIEW);
        web.setData(Uri.parse("http://www.topchiangrai.com/phone/"));
        startActivity(web);
    }

    public void clickweb2(View view) {

        Intent web2 = new Intent(Intent.ACTION_VIEW);
        web2.setData(Uri.parse("http://www.topchiangmai.com"));
        startActivity(web2);

    }
}
