package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1,number2;
    TextView result;
    Button btn_sum, btn_subtraction, btn_multiple, btn_divided, btn_average;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.edt_number1);
        number2 = findViewById(R.id.edt_number2);
        result =  findViewById(R.id.tv_Result);

        // SUM (Tổng)
        btn_sum = findViewById(R.id.btn_Sum);
        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // get data when user enter from EditText
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();
                int a = Integer.parseInt(num1);
                int b = Integer.parseInt(num2);
                float sum = a+b;
                result.setText("Result: "+ sum);
            }
        });

        // Subtraction (Trừ)
        btn_subtraction = findViewById(R.id.btn_Subtraction);
        btn_subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // get data when user enter from EditText
                int a = Integer.parseInt(number1.getText().toString());
                int b = Integer.parseInt(number2.getText().toString());
                float subtraction = a - b;
                result.setText("Result: "+ subtraction);
            }
        });


        // MULTIPLE (Nhân)
        btn_multiple = findViewById(R.id.btn_Multiple);
        btn_multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // get data when user enter from EditText
                int a = Integer.parseInt(number1.getText().toString());
                int b = Integer.parseInt(number2.getText().toString());
                float multiple = a * b;
                result.setText("Result: "+ multiple);
            }
        });


        // DIVIDED (Chia)
        btn_divided = findViewById(R.id.btn_Divided);
        btn_divided.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // get data when user enter from EditText
                int a = Integer.parseInt(number1.getText().toString());
                int b = Integer.parseInt(number2.getText().toString());
                float divided = a / b;
                result.setText("Result: "+ divided);
            }
        });



        // AVERAGE (Trung Bình Cộng)
        btn_average = findViewById(R.id.btn_Average);
        btn_average.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // get data when user enter from EditText
                int a = Integer.parseInt(number1.getText().toString());
                int b = Integer.parseInt(number2.getText().toString());
                float average = (float)(a + b)/2;
                result.setText("Result: "+ average);

            }
        });


    }
}






















