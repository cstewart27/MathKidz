package com.example.math_kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class AdditionEasy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_easy);

        Random rand = new Random(); //instance of random class
        int upperbound = 10;
        //generate random values from 0-9
        int AddRand1 = rand.nextInt(upperbound);
        int AddRand2 = rand.nextInt(upperbound);
        int Answer= AddRand1+AddRand2;
        String CheckAnswer= String.valueOf(Answer);
        TextView textView = (TextView) findViewById(R.id.AdditionTextView);
        textView.setText(AddRand1 + " + " + AddRand2);


        EditText UserInput   = (EditText)findViewById(R.id.AddEasyInput);
//if (UserInput.getText().toString().equals(Answer)) ---

        Button AnswerChecker = (Button) findViewById(R.id.CheckButton);
        AnswerChecker.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
               // EditText UserInput = (EditText) findViewById(R.id.AddEasyInput);

                if (UserInput.getText().toString().equals(CheckAnswer)){
                    textView.setText("NICE!");
                }
            }
        });



        //if (mEdit.getText().toString().equals(Answer)) {
         //   textView.setText("NICE!");
        }
    }

//}