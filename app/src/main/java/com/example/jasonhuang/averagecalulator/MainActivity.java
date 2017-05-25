package com.example.jasonhuang.averagecalulator;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

    }

    public void calulateButton(View v){
        //This is the display once the calulate button is pressed
        TextView resultDisplay = (TextView)findViewById(R.id.resultDisplay);

        EditText gradeInput = (EditText)findViewById(R.id.gradeInput);
        EditText percentageInput = (EditText)findViewById(R.id.percentageInput);

        resultDisplay.setText(Double.toString( calulateAverage(gradeInput, percentageInput) ));
    }


    private double calulateAverage(EditText grade, EditText percentage){

        double a = Integer.parseInt(grade.getText().toString());
        double b = Integer.parseInt(percentage.getText().toString());

        b = b / 100;

        double avg = a * b;

        return avg;
    }

    public void test(View v){
       // EditText testInput = (EditText)findViewById(R.id.testInput);
       // testInput.setVisibility(View.VISIBLE);
     //   Intent intent = new Intent(this, activity2.class);
    //    startActivity(intent);

    }
}
