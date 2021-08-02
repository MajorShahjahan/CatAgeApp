package com.example.catageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public Button button;
    public TextView textView;
    public EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = findViewById(R.id.editText);

                int petAge = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(editText.getText().toString());
                textView = findViewById(R.id.textView);

                textView.setText (petAge + "");






            }
        });
    }
}