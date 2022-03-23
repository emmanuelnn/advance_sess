package com.example.advance_sess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File extends AppCompatActivity {

    String fileName = "data.txt";
    EditText txtNotes;
    String Tag = "LifeCycle";
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file);

        txtNotes = findViewById(R.id.txtNotes);
        Button back = findViewById(R.id.backBtn);


    }


    public void fileSave() throws IOException {

        String txtNote = txtNotes.getText().toString();
        FileOutputStream write = null;

        if(!txtNote.isEmpty()){

            try {

                write = openFileOutput(fileName, MODE_PRIVATE);
                write.write(txtNote.getBytes());

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                write.close();
            }

        }


    }




    public void onStart() {

        super.onStart();
        Log.d(Tag, "On Start Have Started");
    }

    public void onPause(){
        super.onPause();
        Log.d(Tag, "On pause started");
    }


    public void saveToFile (View v){
        String getText = txtNotes.getText().toString();
        FileOutputStream write = null;

        if(!getText.isEmpty()){
            try {
                write = openFileOutput(fileName, MODE_PRIVATE);
                write.write(getText.getBytes());
                Toast.makeText(File.this, "File is stored at " + getFilesDir() + "/" + fileName, Toast.LENGTH_LONG).show();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(File.this, Menu.class)));

            }
        });

    }
}