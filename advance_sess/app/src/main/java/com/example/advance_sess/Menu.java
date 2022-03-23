package com.example.advance_sess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button quiz, dice, file, calBtn, bground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button quiz = findViewById(R.id.quizBtn);
        Button dice = findViewById(R.id.diceBtn);
        Button file = findViewById(R.id.fileBtn);
        Button cal = findViewById(R.id.calBtn);
        Button bground = findViewById(R.id.bgroundBtn);



        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(Menu.this, Dice.class)));

            }
        });

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(Menu.this, Calculator.class)));

            }
        });

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(Menu.this, Quiz.class)));

            }
        });

        file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(Menu.this, File.class)));

            }
        });

        bground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(Menu.this, Background.class)));

            }
        });
    }
}