package com.math_kidz.math_kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.math_kidz.math_kidz.R;

public class SubjectDifficultyDivision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_difficulty_division);


        ImageButton divBackArrow = (ImageButton) findViewById(R.id.divBackArrow);
        divBackArrow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Menu.class);
                startActivity(i);


            }
        });
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
