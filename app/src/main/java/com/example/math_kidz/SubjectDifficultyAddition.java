package com.example.math_kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;


public class SubjectDifficultyAddition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_difficulty_addition);

        ImageButton addBackArrow = (ImageButton) findViewById(R.id.addBackArrow);
        addBackArrow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Menu.class);
                startActivity(i);


            }
        });

        Button AddEasy = (Button) findViewById(R.id.AddEasy);
        AddEasy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),AdditionEasy.class);
                startActivity(i);


            }
        });

        Button AddMedium = (Button) findViewById(R.id.AddMedium);
        AddMedium.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(),AdditionMedium.class);
                startActivity(ii);


            }
        });

        Button AddHard = (Button) findViewById(R.id.AddHard);
        AddHard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent iii = new Intent(getApplicationContext(),AdditionHard.class);
                startActivity(iii);


            }
        });


    }


}
