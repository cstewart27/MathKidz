package com.example.math_kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SubjectDifficultyMultiplication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_difficulty_multiplication);


        ImageButton multBackArrow = (ImageButton) findViewById(R.id.multBackArrow);
        multBackArrow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Menu.class);
                startActivity(i);


            }
        });
        Button MultEasy = (Button) findViewById(R.id.MultEasy);
        MultEasy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MultiplicationEasy.class);
                startActivity(i);


            }
        });

        Button MultMedium = (Button) findViewById(R.id.MultMedium);
        MultMedium.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(),MultiplicationMedium.class);
                startActivity(ii);


            }
        });

        Button MultHard = (Button) findViewById(R.id.MultHard);
        MultHard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent iii = new Intent(getApplicationContext(),MultiplicationHard.class);
                startActivity(iii);


            }
        });


    }


}