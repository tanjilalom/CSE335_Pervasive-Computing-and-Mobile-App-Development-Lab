package com.example.databaseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class usdtobdt extends AppCompatActivity {
    EditText usdtext;
    TextView outputbdt;
    int usd, bdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usdtobdt);
        usdtext= findViewById(R.id.usd);
        outputbdt= findViewById(R.id.outputbdt);
    }

    public void convertFunction(View view) {
        usd= Integer.parseInt(usdtext.getText().toString());

        bdt= usd*103;

        outputbdt.setText(+bdt+ " BDT");

    }
}