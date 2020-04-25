package com.example.test2application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.EOFException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView count = findViewById(R.id.count_view);
        count.setText("0");
    }

    @Override
    protected void onResume() {
        super.onResume();
        final TextView count = findViewById(R.id.count_view);

        Button countBtn = findViewById(R.id.up_count);
        Button downBtn = findViewById(R.id.down_count);
        Button resetBtn = findViewById(R.id.reset_count);
        final int[] number = {0};

        countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number[0]++;
                count.setText(String.valueOf(number[0]));
            }
        });
        downBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number[0]--;
                count.setText(String.valueOf(number[0]));
            }
        });
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count.setText("0");
                number[0]=0;
            }
        });

    }
}
