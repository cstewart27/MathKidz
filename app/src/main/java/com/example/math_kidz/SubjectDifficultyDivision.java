package com.example.math_kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubjectDifficultyDivision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_difficulty_division);

        Button DivEasy = (Button) findViewById(R.id.DivEasy);
        DivEasy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),DivisionEasy.class);
                startActivity(i);


            }
        });

        Button DivMedium = (Button) findViewById(R.id.DivMedium);
        DivMedium.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(),DivisionMedium.class);
                startActivity(ii);


            }
        });

        Button DivHard = (Button) findViewById(R.id.DivHard);
        DivHard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent iii = new Intent(getApplicationContext(),DivisionHard.class);
                startActivity(iii);


            }
        });


    }


}
