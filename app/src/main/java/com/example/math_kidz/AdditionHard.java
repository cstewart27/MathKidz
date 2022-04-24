package com.example.math_kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


import java.util.Random;

public class AdditionHard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_hard);

        Random rand = new Random(); //instance of random class
        int upperbound = 1000;
        //generate random values from 0-999
        int AddRand1 = rand.nextInt(upperbound);
        int AddRand2 = rand.nextInt(upperbound);

        TextView textView = (TextView) findViewById(R.id.AdditionHardTextView);
        textView.setText(AddRand1 + " + " + AddRand2);
    }
}