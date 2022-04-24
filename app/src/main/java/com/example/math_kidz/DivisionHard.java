package com.example.math_kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class DivisionHard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division_hard);

        Random rand = new Random(); //instance of random class
        int upperbound = 100;
        //generate random values from 0-99
        int AddRand1 = rand.nextInt(upperbound);
        int AddRand2 = AddRand1 *(rand.nextInt(upperbound));

        TextView textView = (TextView) findViewById(R.id.DivisionHardTextView);
        textView.setText(AddRand2 + " / " + AddRand1);
    }
}