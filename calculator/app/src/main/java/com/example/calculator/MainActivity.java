package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText n1;
EditText n2;
TextView tv;
Button ad, mul, sub, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText n1 = findViewById(R.id.editTextTextPersonName);
        EditText n2 = findViewById(R.id.editTextTextPersonName2);
        TextView tv = findViewById(R.id.textView);
        Button ad = findViewById(R.id.button);
        Button sub = findViewById(R.id.button2);
        Button mul = findViewById(R.id.button3);
        Button div = findViewById(R.id.button4);

        // Button click then

        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer no1 = Integer.parseInt(n1.getText().toString());
                Integer no2 = Integer.parseInt(n2.getText().toString());

                Integer add = no1+no2;
                tv.setText(add.toString());

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer no1 = Integer.parseInt(n1.getText().toString());
                Integer no2 = Integer.parseInt(n2.getText().toString());

                Integer add = no1-no2;
                tv.setText(add.toString());

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer no1 = Integer.parseInt(n1.getText().toString());
                Integer no2 = Integer.parseInt(n2.getText().toString());

                Integer add = no1*no2;
                tv.setText(add.toString());

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer no1 = Integer.parseInt(n1.getText().toString());
                Integer no2 = Integer.parseInt(n2.getText().toString());

                Integer add = no1/no2;
                tv.setText(add.toString());

            }
        });

    }
}