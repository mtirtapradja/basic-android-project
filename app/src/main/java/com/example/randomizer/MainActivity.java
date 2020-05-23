package com.example.randomizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button rollButton;
    private TextView resultTextView;
    private SeekBar seekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton = (Button) findViewById(R.id.rollButton);
        resultTextView = (TextView) findViewById(R.id.resultTextView);
        seekBar = (SeekBar) findViewById(R.id.seekBar);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer rand = new Random().nextInt(seekBar.getProgress()) + 1;
                resultTextView.setText(rand.toString());
            }
        });
    }
}
