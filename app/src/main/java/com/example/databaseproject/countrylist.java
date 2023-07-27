package com.example.databaseproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

public class countrylist extends AppCompatActivity {

    ListView mylistview;

    SearchView sv;
    String [] countryname;
    String selectedvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countrylist);

        mylistview = findViewById(R.id.listviewid);
        countryname = getResources().getStringArray(R.array.countryname);
        sv = findViewById(R.id.searchviewid);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, R.layout.sampleview, R.id.textviewsample, countryname);
        mylistview.setAdapter(myAdapter);


        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                myAdapter.getFilter().filter(newText);
                return false;
            }
        });



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