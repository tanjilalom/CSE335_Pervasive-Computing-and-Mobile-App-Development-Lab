package com.example.databaseproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class aboutme extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    String[] converterArray={"My Info","My Picture"};
    Spinner myspinner;
    String spinnertype;
    FragmentManager myfragmentmanager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);

        myspinner=findViewById(R.id.spinner1);

        ArrayAdapter Adapter= new ArrayAdapter(this,android.R.layout.simple_spinner_item,converterArray);
        Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        myspinner.setAdapter(Adapter);
        myspinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        String value = myspinner.getSelectedItem().toString();

        spinnertype= converterArray[i];
        if (spinnertype.equals("My Info")){
            //load BMI Fragment
            myfragmentmanager = getSupportFragmentManager();
            FragmentTransaction myfragmentTransaction = myfragmentmanager.beginTransaction();
            myfragmentTransaction.setReorderingAllowed(true);
            myfragmentTransaction.replace(R.id.fragment, frag1.class, null);
            myfragmentTransaction.commit();

        }
        else if (spinnertype.equals("My Picture")) {
            //load Currency Converter Fragment

            myfragmentmanager = getSupportFragmentManager();
            FragmentTransaction myfragmentTransaction = myfragmentmanager.beginTransaction();
            myfragmentTransaction.setReorderingAllowed(true);
            myfragmentTransaction.replace(R.id.fragment, frag2.class, null);

            myfragmentTransaction.commit();

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

