package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private EditText num1, num2;
    private Button sum,difference,multiply,divide;
    private TextView answer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        num1 = (EditText)findViewById(R.id.num1id);
        num2 = (EditText) findViewById(R.id.num2id);
        sum = (Button) findViewById(R.id.button1);
        difference = (Button) findViewById(R.id.button2);
        multiply = (Button) findViewById(R.id.button3);
        divide = (Button) findViewById(R.id.button4);
        answer = (TextView) findViewById(R.id.textView3);

//        Log.d("greeting","Hi");
//       Log.d("MyTag", "Hello, world!");

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 + number2;
                answer.setText(String.valueOf(sum));
            }
        });

        difference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int difference = number1 - number2;
                answer.setText(String.valueOf(difference));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int multiply = number1 * number2;
                answer.setText(String.valueOf(multiply));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number1 = Float.parseFloat(num1.getText().toString());
                float number2 = Float.parseFloat(num2.getText().toString());
                float divide = number1 / number2; // Corrected the calculation to division
                answer.setText(String.valueOf(divide));
            }
        }); }
}


