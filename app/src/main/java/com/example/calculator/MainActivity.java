package com.example.calculator;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editFirstNumber;
    private EditText editSecondNumber;
    private TextView textSeeResults;
    int num1, num2;

    public void sumNumbers(View view) {
        String s1 = editFirstNumber.getText().toString();
        // taking input from text box 2
        String s2 = editSecondNumber.getText().toString();
        // converting string to int.
        num1 = Integer.parseInt(s1);
        // converting string to int.
        num2 = Integer.parseInt(s2);
        int sum = num1 + num2;
        textSeeResults.setText(String.format("%d", sum));
    }

    public void minusNumbers(View view) {
        String s1 = editFirstNumber.getText().toString();
        // taking input from text box 2
        String s2 = editSecondNumber.getText().toString();
        // converting string to int.
        num1 = Integer.parseInt(s1);
        // converting string to int.
        num2 = Integer.parseInt(s2);
        int sum = num1 - num2;
        textSeeResults.setText(String.format("%d", sum));
    }

    public void multiplyNumbers(View view) {
        String s1 = editFirstNumber.getText().toString();
        // taking input from text box 2
        String s2 = editSecondNumber.getText().toString();
        // converting string to int.
        num1 = Integer.parseInt(s1);
        // converting string to int.
        num2 = Integer.parseInt(s2);
        int sum = num1 * num2;
        textSeeResults.setText(String.format("%d", sum));
    }

    public void divideNumbers(View view) {
        String s1 = editFirstNumber.getText().toString();
        // taking input from text box 2
        String s2 = editSecondNumber.getText().toString();
        // converting string to int.
        num1 = Integer.parseInt(s1);
        // converting string to int.
        num2 = Integer.parseInt(s2);
        int sum = num1 / num2;
        textSeeResults.setText(String.format("%d", sum));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editFirstNumber = findViewById(R.id.editFirstNumber);
        editSecondNumber = findViewById(R.id.editSecondNumber);
        textSeeResults = findViewById(R.id.textSeeResult);
        }


}