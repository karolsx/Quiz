package com.example.admin.Quiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;


public class quiz extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_layout);


        Button checkButton = (Button) findViewById(R.id.checkButton);
        checkButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                checkPoints();
            }
        });
        Button resetButton = (Button) findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resetQuiz();
            }
        });
    }

    protected int pointsEarned = 0;



    protected void checkPoints() {

        RadioButton[] buttons = new RadioButton[5];
        buttons[0] = (RadioButton) findViewById(R.id.radioButon12);
        buttons[1] = (RadioButton) findViewById(R.id.radioButon21);
        buttons[2] = (RadioButton) findViewById(R.id.radioButon31);
        buttons[3] = (RadioButton) findViewById(R.id.radioButon42);
        buttons[4] = (RadioButton) findViewById(R.id.radioButon53);

        for (int i = 0; i < 5; i++) {
            //buttons[i].setOnClickListener(new View.OnClickListener() {
            if(buttons[i].isChecked())
                pointsEarned++;

            //});

        }
        Toast.makeText(getApplicationContext(), "Zdobyte punkty: " + pointsEarned + "/5", Toast.LENGTH_LONG).show();
        pointsEarned=0;
    }
    protected void resetQuiz()
    {
        RadioGroup[] radioGr = new RadioGroup[5];
        radioGr[0] = (RadioGroup) findViewById(R.id.radioGroup1);
        radioGr[1] = (RadioGroup) findViewById(R.id.radioGroup2);
        radioGr[2] = (RadioGroup) findViewById(R.id.radioGroup3);
        radioGr[3] = (RadioGroup) findViewById(R.id.radioGroup4);
        radioGr[4] = (RadioGroup) findViewById(R.id.radioGroup5);
        for (int i=0;i<5;i++)
        {
            radioGr[i].clearCheck();
        }
        pointsEarned=0;
        ScrollView scroll = (ScrollView) findViewById(R.id.scrollView1);
        scroll.fullScroll(0);
    }
}

