package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    EditText editText;
    TextView textView1, textView2, textView3, textView4, textView5, textView6;
    ImageButton imageButton1, imageButton2, imageButton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = findViewById(R.id.editTextNumber2);
        spinner = findViewById(R.id.spinner1);
        imageButton1 = findViewById((R.id.imageButton1));
        imageButton2 = findViewById((R.id.imageButton2));
        imageButton3 = findViewById((R.id.imageButton3));
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Unit, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }

    public void onClick(View view) {
        String unit = spinner.getSelectedItem().toString();
        double input;
        try {
            input = Double.valueOf(editText.getText().toString());
        }
        catch (Exception e) {
            Toast.makeText(this, "Please enter a number.", Toast.LENGTH_SHORT).show();
            return;
        }
        if (unit.equals("Metre")) {
            double cm = input * 100.0;
            double foot = input * 3.28084;
            double inch = input * 39.3701;
            textView1.setText(String.format("%.2f", cm));
            textView2.setText(String.format("%.2f", foot));
            textView3.setText(String.format("%.2f", inch));
            textView4.setText("Centimetre");
            textView5.setText("Foot");
            textView6.setText("Inch");
        }
        else {
            Toast.makeText(this, "Please choose correct conversion type.", Toast.LENGTH_SHORT).show();
        }
    }



    public void onClick2(View view) {
        String unit = spinner.getSelectedItem().toString();
        double input;
        try {
            input = Double.valueOf(editText.getText().toString());
        }
        catch (Exception e) {
            Toast.makeText(this, "Please enter a number.", Toast.LENGTH_SHORT).show();
            return;
        }
        if (unit.equals("Celsius")) {
            double F = input * 1.8 + 32;
            double K = input + 273.15;
            textView1.setText(String.format("%.2f", F));
            textView2.setText(String.format("%.2f", K));
            textView3.setText(" ");
            textView4.setText("Fahrenheit");
            textView5.setText("Kelvin");
            textView6.setText(" ");
        }
        else {
            Toast.makeText(this, "Please choose correct conversion type.", Toast.LENGTH_SHORT).show();
        }
    }




    public void onClick3(View view) {
        String unit = spinner.getSelectedItem().toString();
        double input;
        try {
            input = Double.valueOf(editText.getText().toString());
        }
        catch (Exception e) {
            Toast.makeText(this, "Please enter a number.", Toast.LENGTH_SHORT).show();
            return;
        }
        if (unit.equals("Kilograms")) {
            double G = input * 1000.0;
            double Oz = input * 35.274;
            double Lb = input * 2.20462262185;
            textView1.setText(String.format("%.2f", G));
            textView2.setText(String.format("%.2f", Oz));
            textView3.setText(String.format("%.2f", Lb));
            textView4.setText("Gram");
            textView5.setText("Ounce(Oz)");
            textView6.setText("Pound(lb)");
        }
        else {
            Toast.makeText(this, "Please choose correct conversion type.", Toast.LENGTH_SHORT).show();
        }
    }
}