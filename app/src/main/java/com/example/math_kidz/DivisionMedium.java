package com.example.math_kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class DivisionMedium extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division_medium);

        Random rand = new Random(); //instance of random class
        int upperbound = 100;
        int upperbound2=10;
        //generate random values from 0-9
        int AddRand1 = rand.nextInt(upperbound);
        int AddRand2 = AddRand1 *(rand.nextInt(upperbound2));

        TextView textView = (TextView) findViewById(R.id.DivisionMediumTextView);

        textView.setText(AddRand2 + " / " + AddRand1);
    }
}