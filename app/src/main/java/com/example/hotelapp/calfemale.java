package com.example.hotelapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calfemale extends AppCompatActivity {
    private Button button;
    private EditText number1;
    private EditText number2;
    private EditText number3;
    private TextView ResultTextView;
    private int Num1,Num2,Num3,result1,result2,result3,result4,result5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calfemale);

            button = (Button) findViewById(R.id.button);
            number1 = (EditText) findViewById(R.id.txt3);
            number2 = (EditText) findViewById(R.id.txt2);
            number3 = (EditText) findViewById(R.id.txt1);
            ResultTextView = (TextView) findViewById(R.id.View);
            button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(android.view.View view) {
                    Num1 = Integer.parseInt(number1.getText().toString().trim());
                    Num2 = Integer.parseInt(number2.getText().toString().trim());
                    Num3 = Integer.parseInt(number3.getText().toString().trim());

                    result1 = (int) (665+(9.6 *Num3+1.8 *Num2-4.7*Num1)* 1.2);

                    ResultTextView.setText(result1 + "");


                }
            });

        }



    public void clickcalfday(View view) {

        Num1  = Integer.parseInt(number1.getText().toString().trim());
        Num2  = Integer.parseInt(number2.getText().toString().trim());
        Num3  = Integer.parseInt(number3.getText().toString().trim());
        result3 = (int) (665+(9.6 *Num3+1.8 *Num2-4.7*Num1)*1.55);
        ResultTextView.setText(result3+"");
    }

    public void clickcalnoday(View view) {

        Num1  = Integer.parseInt(number1.getText().toString().trim());
        Num2  = Integer.parseInt(number2.getText().toString().trim());
        Num3  = Integer.parseInt(number3.getText().toString().trim());
        result2 = (int) (665+(9.6 *Num3+1.8 *Num2-4.7*Num1)*1.375);
        ResultTextView.setText(result2+"");
    }

    public void clickback(View view) {
        Intent bacnk = new Intent(calfemale.this , Nutrition.class);
        startActivity(bacnk);
    }

    public void clickboy(View view) {
        finish();
    }

    public void clickcaleday(View view) {
        Num1  = Integer.parseInt(number1.getText().toString().trim());
        Num2  = Integer.parseInt(number2.getText().toString().trim());
        Num3  = Integer.parseInt(number3.getText().toString().trim());
        result4 = (int) (665+(9.6 *Num3+1.8 *Num2-4.7*Num1)*1.725);
        ResultTextView.setText(result4+"");
    }


    public void clickcalallday(View view) {

        Num1  = Integer.parseInt(number1.getText().toString().trim());
        Num2  = Integer.parseInt(number2.getText().toString().trim());
        Num3  = Integer.parseInt(number3.getText().toString().trim());
        result5 = (int) (665+(9.6 *Num3+1.8 *Num2-4.7*Num1)*1.9);
        ResultTextView.setText(result5+"");
    }

    public void clickfemr(View view) {
        recreate();

    }
    public void clickba(View view) {
        Intent clic = new Intent(calfemale.this ,MainActivity.class);
        startActivity(clic);
    }
}


