package com.unscripted.www.fitnessappprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    // Declare ToggleButtons instances
    ToggleButton beginner, novice, advanced;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize ToggleButtons
        beginner = (ToggleButton) findViewById(R.id.toggleBeginner);
        novice = (ToggleButton) findViewById(R.id.toggleNovice);
        advanced = (ToggleButton) findViewById(R.id.toggleAdvanced);

        beginner.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    beginner.setTextOn("Beginner");

                    novice.setChecked(false);

                    advanced.setChecked(false);
                }
            }
        });

        novice.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    beginner.setChecked(false);


                    novice.setTextOn("Novice");

                    advanced.setChecked(false);

                }
            }
        });

        advanced.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    beginner.setChecked(false);


                    novice.setChecked(false);


                    advanced.setTextOn("Advanced");
                }
            }
        });



        ImageButton launchActivityTwoButton = (ImageButton) findViewById(R.id.imageButton2);
        launchActivityTwoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO:
                // Launch Activity Two
                // Hint: use Context's startActivity() method

                // Create an intent stating which Activity you would like to
                // start
                // Intent intent = new Intent(this, ActivityTwo.class);
                //Intent intent = new Intent(android.content.Intent, ActivityTwo);
                Intent intent = new Intent(MainActivity.this, Workout.class);

                // Launch the Activity using the intent
                startActivity(intent);

            }
        });
    }
}
