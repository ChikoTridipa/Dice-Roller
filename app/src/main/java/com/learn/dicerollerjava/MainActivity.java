package com.learn.dicerollerjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView TextViewDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ButtonDice = (Button) findViewById(R.id.button001);
        ButtonDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int min = 1;
                int max = 6;

                Random random = new Random();
                int randomNumber = random.nextInt((max - min) + 1) + min;

                final TextView TextViewDice = (TextView) findViewById(R.id.text001);
                TextViewDice.setText("" + randomNumber);
            }
        });
    }
}