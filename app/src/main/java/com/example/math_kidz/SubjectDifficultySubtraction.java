package com.example.math_kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubjectDifficultySubtraction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_difficulty_subtraction);

        Button SubEasy = (Button) findViewById(R.id.SubEasy);
        SubEasy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),SubtractionEasy.class);
                startActivity(i);


            }
        });

        Button SubMedium = (Button) findViewById(R.id.SubMedium);
        SubMedium.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(),SubtractionMedium.class);
                startActivity(ii);


            }
        });

        Button SubHard = (Button) findViewById(R.id.SubHard);
        SubHard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent iii = new Intent(getApplicationContext(),SubtractionHard.class);
                startActivity(iii);


            }
        });


    }


}