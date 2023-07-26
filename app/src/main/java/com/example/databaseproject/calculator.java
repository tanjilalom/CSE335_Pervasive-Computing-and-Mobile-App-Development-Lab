package com.example.databaseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class calculator extends AppCompatActivity {
    TextView primaryView, secondaryView;
    String num1,num2,operator;
    float root;
    boolean hasDot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        primaryView = findViewById(R.id.primaryTextviewId);
        secondaryView=findViewById(R.id.secondaryTextviewID);
        hasDot = false;
    }

    public void numberFunction(View v) {
        String tempValue = primaryView.getText().toString();
        if (tempValue.equals("0")) {
            if (v.getId() == R.id.zeroBtnID) {
                primaryView.setText("0");

            } else if (v.getId() == R.id.oneBtnID) {
                primaryView.setText("1");

            } else if (v.getId() == R.id.twoBtnID) {
                primaryView.setText("2");

            } else if (v.getId() == R.id.threeBtnID) {
                primaryView.setText("3");

            } else if (v.getId() == R.id.fourBtnID) {
                primaryView.setText("4");

            } else if (v.getId() == R.id.fiveBtnID) {
                primaryView.setText("5");

            } else if (v.getId() == R.id.sixBtnID) {
                primaryView.setText("6");

            } else if (v.getId() == R.id.sevenBtnID) {
                primaryView.setText("7");

            } else if (v.getId() == R.id.eightBtnID) {
                primaryView.setText("8");

            } else
                primaryView.setText("9");

        } else {
            if (v.getId() == R.id.zeroBtnID) {
                primaryView.setText(tempValue + "0");

            } else if (v.getId() == R.id.oneBtnID) {
                primaryView.setText(tempValue + "1");

            } else if (v.getId() == R.id.twoBtnID) {
                primaryView.setText(tempValue + "2");

            } else if (v.getId() == R.id.threeBtnID) {
                primaryView.setText(tempValue + "3");

            } else if (v.getId() == R.id.fourBtnID) {
                primaryView.setText(tempValue + "4");

            } else if (v.getId() == R.id.fiveBtnID) {
                primaryView.setText(tempValue + "5");

            } else if (v.getId() == R.id.sixBtnID) {
                primaryView.setText(tempValue + "6");

            } else if (v.getId() == R.id.sevenBtnID) {
                primaryView.setText(tempValue + "7");

            } else if (v.getId() == R.id.eightBtnID) {
                primaryView.setText(tempValue + "8");

            } else
                primaryView.setText(tempValue + "9");

        }

    }

    public void ClearFunction(View view) {
        primaryView.setText("0");
        num2=null;
        num1=null;
        operator=null;
        secondaryView.setText("");

    }

    public void operatorFunction(View view) {
        String primaryValue=primaryView.getText().toString();

        if(view.getId()==R.id.sumtnID){
            operator="+";
        }
        else if(view.getId()==R.id.subBtnID){
            operator="-";
        }
        else if(view.getId()==R.id.multiBtnID){
            operator="*";
        }
        else {
            operator="/";
        }
        secondaryView.setText(primaryValue+" "+operator);
        num1=primaryValue;
        primaryView.setText("0");

    }

    public void resultFunction(View view) {
        double result;
        num2=primaryView.getText().toString();
        if(operator.equals("+")){

            result=Double.parseDouble(num1)+Double.parseDouble(num2);
        }
        else if(operator.equals("-")){
            result=Double.parseDouble(num1)-Double.parseDouble(num2);
        }
        else if(operator.equals("*")){
            result=Double.parseDouble(num1)*Double.parseDouble(num2);
        }
        else {
            result=Double.parseDouble(num1)/Double.parseDouble(num2);
        }
        primaryView.setText(""+result);
        secondaryView.setText(num1 +" "+operator+" "+num2+"=");

    }

    public void deleteFunction(View view) {

        if (primaryView.getText().equals("")) {
            primaryView.setText(null);
        } else {
            int len = primaryView.getText().length();
            String s = primaryView.getText().toString();
            if (s.charAt(len - 1) == '.') {
                hasDot = false;
                primaryView.setText(primaryView.getText().subSequence(0, primaryView.getText().length() - 1));

            } else {
                primaryView.setText(primaryView.getText().subSequence(0, primaryView.getText().length() - 1));
            }
        }

    }

    public void rootFunction(View view) {


    }
}