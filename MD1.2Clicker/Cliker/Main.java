package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView counter;
    private int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = (TextView) findViewById(R.id.counter);
        ImageButton upper_button = (ImageButton) findViewById(R.id.upper_button);
        ImageButton down_button = (ImageButton) findViewById(R.id.down_button);
        ImageButton restart_button = (ImageButton) findViewById(R.id.restart_button);

        upper_button.setOnClickListener(clickListenerUp);
        down_button.setOnClickListener(clickListenerDown);
        restart_button.setOnClickListener(clickListenerRestart);

    }

    View.OnClickListener clickListenerUp = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            count ++;
            if (1 < count % 10 && count % 10 < 5)
            {
                String s = "Кликов: " + count + " раза";
                counter.setText(s.toCharArray(),0, s.length());
            } else {
                String s = "Кликов: " + count + " раз";
                counter.setText(s.toCharArray(),0, s.length());
            }


        }
    };

    View.OnClickListener clickListenerDown = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            count --;
            if (1 < count % 10 && count % 10 < 5)
            {
                String s = "Кликов: " + count + " раза";
                counter.setText(s.toCharArray(),0, s.length());
            } else {
                String s = "Кликов: " + count + " раз";
                counter.setText(s.toCharArray(),0, s.length());
            }

        }
    };

    View.OnClickListener clickListenerRestart = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            count = 0;
            String s = "Кликов: " + count + " раз";
            counter.setText(s.toCharArray(),0, s.length());

        }
    };

}