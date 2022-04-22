package com.example.math_kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

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