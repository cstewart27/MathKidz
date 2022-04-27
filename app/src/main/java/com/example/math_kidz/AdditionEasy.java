package com.example.math_kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class AdditionEasy extends AppCompatActivity {

    private int CorrectAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_easy);

        Random rand = new Random(); //instance of random class


        int upperbound = 10;
        //generate random values from 0-9
        int AddRand1 = rand.nextInt(upperbound);
        int AddRand2 = rand.nextInt(upperbound);


        //generating answer for user to pick from
        CorrectAnswer = AddRand1 + AddRand2;




        TextView questionTextView = (TextView) findViewById(R.id.AdditionTextView);
        questionTextView.setText(AddRand1 + " + " + AddRand2);
        TextView scoreTextView = (TextView) findViewById(R.id.ScoreTracker);

        EditText UserInput = (EditText) findViewById(R.id.AddEasyInput);

        Button AnswerChecker = (Button) findViewById(R.id.CheckButton);




            AnswerChecker.setOnClickListener(new View.OnClickListener() {


                int Score = 0;


                public void onClick(View view) {


                    if (UserInput.getText().toString().equals(String.valueOf(CorrectAnswer))) {

                        ScoreDisplay(Score);
                        CorrectAnswer=QuestionGenerator();

                    }
                    else{
                        Score=0;
                        scoreTextView.setText(String.valueOf(Score));
                    }

                }

                private void ScoreDisplay(int num) {
                    Score = Score + 1;
                    scoreTextView.setText(String.valueOf(Score));


                }

                public int QuestionGenerator() {
                    int upperbound = 10;
                    int AddRand1 = rand.nextInt(upperbound);
                    int AddRand2 = rand.nextInt(upperbound);
                    int NewCorrectAnswer = AddRand1 + AddRand2;
                    questionTextView.setText(AddRand1 + " + " + AddRand2);
                    return  NewCorrectAnswer;


                }


            });





    }
}