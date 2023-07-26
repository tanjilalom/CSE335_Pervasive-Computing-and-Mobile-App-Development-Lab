package com.example.databaseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void calcFunction(View view) {
        Intent intent =new Intent(this, calculator.class);
        startActivity(intent);
    }

    public void bmiEFunction(View view) {
        Intent intent =new Intent(this, bmi.class);
        startActivity(intent);
    }

    public void convertFunction(View view) {
        Intent intent =new Intent(this,usdtobdt.class);
        startActivity(intent);
    }


    public void aboutmeFuntion(View view) {
        Intent intent =new Intent(this,aboutme.class);
        startActivity(intent);
    }

    public void countryFunction(View view) {
        Intent intent = new Intent(this, countrylist.class);
        startActivity(intent);
    }
}
