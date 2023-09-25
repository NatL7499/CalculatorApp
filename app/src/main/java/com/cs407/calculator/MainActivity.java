package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addNum(View view){
        EditText txt1 = (EditText) findViewById(R.id.num1);
        EditText txt2 = (EditText) findViewById(R.id.num2);

        if(!txt1.getText().toString().matches("") && !txt2.getText().toString().matches("") ) {

            String eq = txt1.getText().toString() + " + " + txt2.getText().toString();
            int firstVal = Integer.parseInt(txt1.getText().toString());
            int secondVal = Integer.parseInt(txt2.getText().toString());

            String result = String.valueOf(firstVal + secondVal);
            goToResult(eq, result);
        }
    }

    public void subNum(View view){
        EditText txt1 = (EditText) findViewById(R.id.num1);
        EditText txt2 = (EditText) findViewById(R.id.num2);

        if(!txt1.getText().toString().matches("") && !txt2.getText().toString().matches("") ) {

            String eq = txt1.getText().toString() + " - " + txt2.getText().toString();
            int firstVal = Integer.parseInt(txt1.getText().toString());
            int secondVal = Integer.parseInt(txt2.getText().toString());

            String result = String.valueOf(firstVal - secondVal);
            goToResult(eq, result);
        }
    }

    public void multiNum(View view){
        EditText txt1 = (EditText) findViewById(R.id.num1);
        EditText txt2 = (EditText) findViewById(R.id.num2);

        if(!txt1.getText().toString().matches("") && !txt2.getText().toString().matches("") ) {

            String eq = txt1.getText().toString() + " x " + txt2.getText().toString();
            int firstVal = Integer.parseInt(txt1.getText().toString());
            int secondVal = Integer.parseInt(txt2.getText().toString());

            String result = String.valueOf(firstVal * secondVal);
            goToResult(eq, result);
        }
    }

    public void divNum(View view){

        EditText txt1 = (EditText) findViewById(R.id.num1);
        EditText txt2 = (EditText) findViewById(R.id.num2);

        if(!txt1.getText().toString().matches("") && !txt2.getText().toString().matches("") ) {
            String eq = txt1.getText().toString() + " / " + txt2.getText().toString();

            if (Integer.parseInt(txt2.getText().toString()) == 0) {
                goToResult(eq, "Error: Div by 0");
            }

            int firstVal = Integer.parseInt(txt1.getText().toString());
            int secondVal = Integer.parseInt(txt2.getText().toString());
            String result = String.valueOf((float) firstVal / secondVal);

            goToResult(eq, result);
        }
    }

    public void goToResult(String equation, String result){
        Intent intent = new Intent(this, resultScreen.class);
        intent.putExtra("equation", equation);
        intent.putExtra("result", result);
        startActivity(intent);
    }
}