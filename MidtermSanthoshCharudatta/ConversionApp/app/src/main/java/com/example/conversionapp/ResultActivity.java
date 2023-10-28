package com.example.conversionapp;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_screen); // Set the layout for the result screen

        double result = getIntent().getDoubleExtra("result", 0.0); // Retrieve the result from the Intent

        TextView resultTextView = findViewById(R.id.resultTextView); // Get the TextView in the result screen layout
        resultTextView.setText(String.format("%.2f liters is equal to %.2f gallons", result, result));
    }
}
