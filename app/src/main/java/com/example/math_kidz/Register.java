package com.example.math_kidz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private EditText email, password;
    private Button btnRegister;
    private TextView textLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();

        email = findViewById(R.id.registerEmail);
        password = findViewById(R.id.registerEmail);
        btnRegister = findViewById(R.id.btnRegister);
        textLogin = findViewById(R.id.textLogin);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Register();

            }
        });

        textLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Register.this, Login.class));
            }
        });


    }

    private void Register(){
        String user = email.getText().toString();
        String pass = password.getText().toString();
        int score = 0;
        if(user.isEmpty()){
            email.setError("Email can not be empty");
        }
        if(pass.isEmpty()){
            password.setError("Password can not be empty");
        }
        else{

            mAuth.createUserWithEmailAndPassword(user, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){

                        FirebaseUser firebaseUser = mAuth.getCurrentUser();
                        //Enters user data into Firebase realtime database
                        Score writeUserDetails = new Score(score);
                        //Extracts user reference from Database
                        DatabaseReference referenceProfile = FirebaseDatabase.getInstance().getReference("Registered Users");
                        referenceProfile.child(firebaseUser.getUid()).setValue(writeUserDetails).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {

                                if(task.isSuccessful()){
                                    Toast.makeText(Register.this, "User registered successfully. Please verify your email", Toast.LENGTH_LONG).show();
                                    startActivity(new Intent(Register.this, Menu.class));
                                }
                                else{
                                    Toast.makeText(Register.this, "User registered failed. Please try again", Toast.LENGTH_LONG).show();

                                }

                            }
                        });

                    }
                    else{
                        Toast.makeText(Register.this, "Registeration Failed"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }


    }


}