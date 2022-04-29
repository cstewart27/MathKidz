package com.example.math_kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Menu extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private Button btnSignout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        mAuth = FirebaseAuth.getInstance();
        btnSignout = findViewById(R.id.signOutButton);

        btnSignout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            logout();

            }
        });




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

    public void onStart(){
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser==null){
            startActivity(new Intent(Menu.this, Login.class));
        }
    }
    public void logout() {

        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(Menu.this, Login.class));


    }


}