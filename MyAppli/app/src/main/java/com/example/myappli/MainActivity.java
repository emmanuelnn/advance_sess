package com.example.myappli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editUsername;
    EditText editPassword;
    TextView txtDisplay;
    Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editUsername = findViewById(R.id.editTextUsername);
        EditText editPassword = findViewById(R.id.editTextPassword);
        Button btnSignIn = findViewById(R.id.btnView);
        TextView txtDisplay = findViewById(R.id.txtDisplay);

        String fixedUsername = "emmanuel";
        String fixedPassword = "nwokoro";


        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String usernameEntered = editUsername.getText().toString();
                String passwordEntered = editPassword.getText().toString();

                if(fixedUsername.equals(usernameEntered)){
                    if(fixedPassword.equals(passwordEntered)){
                        txtDisplay.setText("");

                    }else{
                        txtDisplay.setText("password incorrect");
                    }
                }

                if(fixedPassword.equals(passwordEntered) ){
                    if(fixedUsername.equals(usernameEntered)){
                        txtDisplay.setText("");

                    }else{
                        txtDisplay.setText("username incorrect");
                    }
                }

                if(fixedPassword.equals(passwordEntered) && (fixedUsername.equals(usernameEntered))){
                        txtDisplay.setText("correct. Welcome!!!");

                    }
                }

        });

    }
}