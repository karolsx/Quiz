package com.example.admin.Quiz;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button przycisk1 = (Button) findViewById(R.id.button001);

        przycisk1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /**setContentView(R.layout.quiz_layout);*/

                Context context;
                context = getApplicationContext();
                Intent intent = new Intent(context, quiz.class);
                startActivity(intent);

            }
        });
    }
}
