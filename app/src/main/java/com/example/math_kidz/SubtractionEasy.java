package com.example.math_kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SubtractionEasy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtraction_easy);

        Random rand = new Random(); //instance of random class
        int upperbound = 10;
        //generate random values from 0-9
        int AddRand1 = rand.nextInt(upperbound);
        int AddRand2 = rand.nextInt(upperbound);

        if (AddRand1>= AddRand2){
            TextView textView = (TextView) findViewById(R.id.SubtractionTextView);
            textView.setText(AddRand1 + " - " + AddRand2);

        }
        else {
            TextView textView = (TextView) findViewById(R.id.SubtractionTextView);
            textView.setText(AddRand2 + " - " + AddRand1);

        }

    }
}