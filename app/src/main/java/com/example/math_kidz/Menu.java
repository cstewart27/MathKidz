package com.example.math_kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button AddHome = (Button) findViewById(R.id.AddHome);
        AddHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),SubjectDifficultyAddition.class);
                startActivity(i);


            }
        });

        Button SubHome = (Button) findViewById(R.id.SubHome);
        SubHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(),SubjectDifficultySubtraction.class);
                startActivity(ii);


            }
        });

        Button MultHome = (Button) findViewById(R.id.MultHome);
        MultHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent iii = new Intent(getApplicationContext(),SubjectDifficultyMultiplication.class);
                startActivity(iii);


            }
        });
        Button DivHome = (Button) findViewById(R.id.DivHome);
        DivHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent iii = new Intent(getApplicationContext(),SubjectDifficultyDivision.class);
                startActivity(iii);


            }
        });


    }


}