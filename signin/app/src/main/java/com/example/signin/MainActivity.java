package com.example.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtFname = findViewById(R.id.edtFullname);
        EditText edtAddress = findViewById(R.id.edtAddress);
        EditText edtPassword = findViewById(R.id.edtPassword);
        EditText edtEmail = findViewById(R.id.edtEmail);
        Button btnRegister = findViewById(R.id.btnRegister);



        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Fname = edtFname.getText().toString();
                String address = edtAddress.getText().toString();
                String password = edtPassword.getText().toString();
                String emailaddress = edtEmail.getText().toString();


                if (Fname.isEmpty() && address.isEmpty() && password.isEmpty() && emailaddress.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Captured", Toast.LENGTH_SHORT).show();
                    return;
                }

                User u1 = new User();
                User u2 = new User(Fname, address, password, emailaddress);
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();

            }
        });


    }

}



