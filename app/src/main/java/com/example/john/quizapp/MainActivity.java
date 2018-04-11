package com.example.john.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.answer_4:
                if (checked)
                    score += 25;
                    break;

            case R.id.answer_3:
                if (checked)
                    score += 25;
                break;
        }
    }



    public void displayFinalScore(View view) {
        EditText username =(EditText) findViewById(R.id.username);
        String giveMeName = username.getText().toString();

        CheckBox answer1 = (CheckBox) findViewById(R.id.answer_1);
        boolean checked1 = answer1.isChecked();

        CheckBox answer2 = (CheckBox) findViewById(R.id.answer_2);
        boolean checked2 = answer1.isChecked();

        if (checked2 == true){
            score += 25;
        }

        if (checked1 == true){
            score += 25;
        }

        TextView quantityTextView = (TextView) findViewById(R.id.final_score);
        quantityTextView.setText(giveMeName +" your score is : "+ score + "pts");
    }
}
