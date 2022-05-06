package com.example.math_kidz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class Menu extends AppCompatActivity {
    FirebaseDatabase firebaseDatabase;
    DatabaseReference referenceProfile;
    private FirebaseAuth mAuth;
    private Button btnSignout;
    TextView retrieveScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



        mAuth = FirebaseAuth.getInstance();

        FirebaseUser firebaseUser = mAuth.getCurrentUser();

        //Extracts user referenfce from Database
        referenceProfile = firebaseDatabase.getInstance().getReference("Registered Users").child(mAuth.getUid());
        getdata();

        retrieveScore = findViewById(R.id.retrieveScore);


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

    private void getdata() {

        // calling add value event listener method
        // for getting the values from database.
        referenceProfile.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String score = snapshot.child("totalScore0").getValue().toString();
                retrieveScore.setText(score);
                
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // calling on cancelled method when we receive
                // any error or we are not able to get the data.
                Toast.makeText(Menu.this, "Fail to get data.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}