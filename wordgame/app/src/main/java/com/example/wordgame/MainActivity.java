package com.example.wordgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textViewInfo, textViewWord, textViewScore;
    EditText editTextGuess;
    Button buttonCheck, buttonNew;
    Random r;
    String currentWord;
    String[] dictionary = {
            "apple",
            "pear",
            "tree",
            "car",
            "sand"
    };

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewInfo = findViewById(R.id.textViewInfo);
        textViewWord = findViewById(R.id.textViewWord);
        textViewScore = findViewById(R.id.textViewScore);
        editTextGuess = findViewById(R.id.editTextGuess);
        buttonCheck = findViewById(R.id.buttonCheck);
        buttonNew = findViewById(R.id.buttonNew);

        r = new Random();

        textViewScore.setText("SCORE: " + score);

        newGame();

        buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(editTextGuess.getText().toString().equalsIgnoreCase(currentWord)){
                textViewInfo.setText("Correct");
                score++;
                Integer add = score + 1;
                textViewScore.setText(add.toString());} else {
                textViewInfo.setText("Incorrect");
                score--;
                Integer add = score - 1;
                textViewScore.setText(add.toString());
            }


                buttonCheck.setEnabled(true);
                buttonNew.setEnabled(true);

                //


            }
        });

        buttonNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newGame();

            }
        });
    }

    private String shuffleW(String word) {
        List<String> letters = Arrays.asList(word.split(""));
        Collections.shuffle(letters);
        String shuffled = "";
        for (String letter : letters) {
            shuffled += letter;
        }
        return shuffled;
    }

    private void newGame(){
        currentWord = dictionary[r.nextInt(dictionary.length)];
        textViewWord.setText(shuffleW(currentWord));

        editTextGuess.setText("");

        buttonNew.setEnabled(false);
        buttonCheck.setEnabled(true);
    }
}