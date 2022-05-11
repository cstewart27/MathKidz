package com.math_kidz.math_kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.math_kidz.math_kidz.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button TestButton = (Button) findViewById(R.id.TestButton);
        TestButton.setOnClickListener(v -> {
            Intent iii = new Intent(getApplicationContext(),Menu.class);
            startActivity(iii);


        });


    }


}