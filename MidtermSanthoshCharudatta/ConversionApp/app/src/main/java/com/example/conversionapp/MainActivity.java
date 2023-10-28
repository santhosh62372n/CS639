package com.example.conversionapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private EditText litersEditText;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        litersEditText = findViewById(R.id.litersEditText);
        convertButton = findViewById(R.id.convertButton);
        resultTextView = findViewById(R.id.resultTextView);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the input in liters from the EditText
                String litersStr = litersEditText.getText().toString();
                if (!litersStr.isEmpty()) {
                    // Convert liters to gallons using the correct conversion factor
                    double liters = Double.parseDouble(litersStr);
                    double gallons = liters * 0.219; // Corrected conversion factor

                    // Display the result in the TextView
                    resultTextView.setText(String.format("%.2f liters is equal to %.3f gallons", liters, gallons)); // Displaying the result with 3 decimal places
                } else {
                    resultTextView.setText("Please enter a value in liters.");
                }
            }
        });
    }
}
