package com.example.hotelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper v_filpper;

    private Button btnNutrition;
    private Button btnHealth;
    private Button btnWork;
    private Button btnTips ;
    private Button btnTele;
    private Button btnApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v_filpper = findViewById(R.id.v_flipper);

        btnNutrition = (Button)findViewById(R.id.btnNutrition);
        btnHealth = (Button)findViewById(R.id.btnHealth);
        btnWork = (Button)findViewById(R.id.btnWork);
        btnTips = (Button)findViewById(R.id.btnTips);
        btnTele = (Button)findViewById(R.id.btnTele);
        btnApp = (Button)findViewById(R.id.btnApp);

        int images[] = {R.drawable.bghome1, R.drawable.bghome2,R.drawable.bghome3};

        // for loop
        /*for (int i = 0; i < images.length; i++){
             flipperImages(images[i]);
        }*/
    //but I prefer foreach

        for (int image : images){
            flipperImages(image);
        }

        btnNutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(MainActivity.this , Nutrition.class);
                startActivity(n);
            }
        });

        btnHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h = new Intent(MainActivity.this, Health.class);
                startActivity(h);
            }
        });

        btnWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w = new Intent(MainActivity.this , Work.class);
                startActivity(w);

            }
        });

        btnTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t = new Intent(MainActivity.this , Tips.class);
                startActivity(t);
            }
        });

        btnTele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tl = new Intent(MainActivity.this , Tele.class);
                startActivity(tl);
            }
        });

        btnApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent A = new Intent(MainActivity.this , App.class);
                startActivity(A);
            }
        });
    }
    public void  flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_filpper.addView(imageView);
        v_filpper.setFlipInterval(4000); //8 sec
        v_filpper.setAutoStart(true);

        //animation
        v_filpper.setInAnimation(this,android.R.anim.slide_in_left);
        v_filpper.setOutAnimation(this,android.R.anim.slide_out_right);
    }


}
