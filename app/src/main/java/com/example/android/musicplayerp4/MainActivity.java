package com.example.android.musicplayerp4;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view that shows the RadioLab podcast title
        TextView numbers = findViewById(R.id.radioLab);
        //Set a clicklistener on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the RadioLab Activity when the radioLab view is clicked
                Intent radioLabInent = new Intent(MainActivity.this, RadioLabActivity.class);
                //Start the new activity
                startActivity(radioLabInent);
            }
        });

        //Find the view that shows the Freakonomics podcast title
        TextView family = findViewById(R.id.freakonomics);
        //Set a clicklistener on that view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the Freakonomics Activity when the freakonomics view is clicked
                Intent freakanomicsIntent = new Intent(MainActivity.this, FreakonomicsActivity.class);
                //Start the new activity
                startActivity(freakanomicsIntent);
            }
        });

        //Find the view that shows the TED Radio Hour title
        TextView colors = findViewById(R.id.tedRadioHour);
        //Set a clicklistener on that view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the TedRadioHour Activity when the tedRadioHour view is clicked
                Intent tedRadioHourIntent = new Intent(MainActivity.this, TedRadioHourActivity.class);
                //Start the new activity
                startActivity(tedRadioHourIntent);
            }
        });

    }

}

