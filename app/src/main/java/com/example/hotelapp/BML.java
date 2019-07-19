package com.example.hotelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BML extends AppCompatActivity {


    private Button btnbackhe;

    private TextView ResultTextView;
    private EditText number1;
    private EditText number2;
    private double Num1, Num2;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bml);

        number1 = (EditText) findViewById(R.id.editText5);
        number2 = (EditText) findViewById(R.id.editText6);
        ResultTextView = (TextView) findViewById(R.id.re);
        btnbackhe = (Button) findViewById(R.id.btnbackhe);
        button = (Button) findViewById(R.id.button4);


        btnbackhe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mneb1 = new Intent(BML.this, MainActivity.class);
                startActivity(mneb1);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Num1 = Integer.parseInt(number1.getText().toString().trim());
                Num2 = Integer.parseInt(number2.getText().toString().trim());

                double result = Num2 / (Num1 * Num1 / 10000);
                ResultTextView.setText(String.valueOf(result));

            }
        });
                }

    public void clickback(View view) {
        finish();
    }
}

