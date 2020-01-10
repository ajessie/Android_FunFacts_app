package com.example.randomfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    // declare our view variables
    private TextView factTextView;
    private Button showFactButton;
    private FactBook factBook = new FactBook(); //creates new FactBook object; constructor
    private RelativeLayout relativeLayout;
    private BackgroundColor backgroundColor = new BackgroundColor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assign the views from layout file to corresponding variables
        factTextView   = findViewById(R.id.fact1);
        showFactButton = findViewById(R.id.button);
        relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = factBook.getFact();
                int color = backgroundColor.getColor();
                //good method for short amounts of I/O
/*
                if (randomNumber == 1) fact = "lalalal";
                else if (randomNumber == 2) fact = "test test";
                else if (randomNumber == 0) fact = "poop";
*/

                //update the screen with the new fact
                factTextView.setText(fact);
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
                

            }

        };

        showFactButton.setOnClickListener(listener);
    }
}
