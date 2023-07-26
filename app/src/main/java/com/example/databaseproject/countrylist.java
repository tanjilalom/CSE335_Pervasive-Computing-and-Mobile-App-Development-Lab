package com.example.databaseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class countrylist extends AppCompatActivity {

    ListView mylistview;
    String [] countryname;
    String selectedvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countrylist);

        mylistview = findViewById(R.id.listviewid);
        countryname = getResources().getStringArray(R.array.countryname);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, R.layout.sampleview, R.id.textviewsample, countryname);

        mylistview.setAdapter(myAdapter);

        mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                selectedvalue = countryname[position];

                if (selectedvalue.equals("Bangladesh"))
                {
                    Intent myIntent= new Intent(countrylist.this, countryshow.class);
                    myIntent.putExtra("name", "bd");
                    startActivity(myIntent);
                }

                if (selectedvalue.equals("India"))
                {
                    Intent myintent= new Intent(countrylist.this, countryshow.class);
                    myintent.putExtra("name", "india");
                    startActivity(myintent);
                }

                if (selectedvalue.equals("Malaysia"))
                {
                    Intent myintent= new Intent(countrylist.this, countryshow.class);
                    myintent.putExtra("name", "malay");
                    startActivity(myintent);
                }

                if (selectedvalue.equals("Dubai"))
                {
                    Intent myintent= new Intent(countrylist.this, countryshow.class);
                    myintent.putExtra("name", "dubai");
                    startActivity(myintent);
                }

                if (selectedvalue.equals("Japan"))
                {
                    Intent myintent= new Intent(countrylist.this, countryshow.class);
                    myintent.putExtra("name", "japan");
                    startActivity(myintent);
                }



            }
        });



    }
}