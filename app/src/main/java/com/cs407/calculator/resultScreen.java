package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;



public class resultScreen extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_screen);
        textView = (TextView) findViewById(R.id.textView2);

        Intent intent = getIntent();
        String eq = intent.getStringExtra("equation");
        String result = intent.getStringExtra("result");
        String print = eq + " = " + result;
        textView.setText(print);
    }
}