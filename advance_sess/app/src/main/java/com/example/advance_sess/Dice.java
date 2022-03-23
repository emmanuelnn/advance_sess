package com.example.advance_sess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Dice extends AppCompatActivity {
    Button roll, back;
    TextView txtDisplay;
    ImageView dImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);


        ImageView dImage = findViewById(R.id.diceImage);
        Button roll = findViewById(R.id.btnRoll);
        Button back = findViewById(R.id.backBtn);
        TextView txtDisplay = findViewById(R.id.textView);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int max = 6;
                int min = 1;
                int val = random.nextInt(max - min + 1) + min;
                txtDisplay.setText(Integer.toString(val));

                if ( val == 1){
                    dImage.setImageResource(R.drawable.dice1);
                }else if ( val == 2){
                    dImage.setImageResource(R.drawable.dice2);
                }else if (val == 3 ){
                    dImage.setImageResource(R.drawable.dice3);
                }else if (val == 4 ){
                    dImage.setImageResource(R.drawable.dice4);
                }else if (val == 5 ){
                    dImage.setImageResource(R.drawable.dice5);
                }else if(val == 6 ){
                    dImage.setImageResource(R.drawable.dice6);
                }

            }

        });
        // for the image do     setImageResource(R.drawable);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(Dice.this, Menu.class)));

            }
        });
    }
}