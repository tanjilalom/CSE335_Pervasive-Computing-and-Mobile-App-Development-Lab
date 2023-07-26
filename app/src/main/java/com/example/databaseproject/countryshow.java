package com.example.databaseproject;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class countryshow extends AppCompatActivity {

    ImageView img;
    TextView txt;
    String cname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countryshow);

        img = findViewById(R.id.imageviewid);
        txt = findViewById(R.id.textviewid);


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            cname = bundle.getString("name");
            show(cname);
        }

    }

    private void show(String cname) {
        if (cname.equals("bd")) {
            img.setImageResource(R.drawable.bd);
            txt.setText(R.string.bd);
        }

        if (cname.equals("india")) {
            img.setImageResource(R.drawable.india);
            txt.setText(R.string.india);
        }

        if (cname.equals("malay")) {
            img.setImageResource(R.drawable.malayshia);
            txt.setText(R.string.malaysia);
        }

        if (cname.equals("dubai")) {
            img.setImageResource(R.drawable.dubai);
            txt.setText(R.string.dubai);
        }

        if (cname.equals("japan")) {
            img.setImageResource(R.drawable.japan);
            txt.setText(R.string.japan);
        }

    }

}