package com.example.jasonhuang.averagecalulator;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
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
        EditText gradeInput2 = (EditText)findViewById(R.id.gradeInput2);
        EditText gradeInput3 = (EditText)findViewById(R.id.gradeInput3);
        EditText percentageInput2 = (EditText)findViewById(R.id.percentageInput2);
        EditText percentageInput3 = (EditText)findViewById(R.id.percentageInput3);
        double gradeSum = 0;
        double percentageSum = 0;
        double average = 0;


        if(gradeInput.getText() == null){
            gradeSum = gradeSum + 0;
        }else{
            gradeSum = gradeSum + Double.parseDouble(gradeInput.getText().toString());
        }
        if(percentageInput.getText() == null){
            percentageSum = percentageSum + 0;
        }else{
            percentageSum = percentageSum + Double.parseDouble(percentageInput.getText().toString());
            average = average + calulateAverage(gradeSum, percentageSum);
            gradeSum = percentageSum = 0;
        }


        if(gradeInput2.getText() == null){
            gradeSum = gradeSum + 0;
        }else{
            gradeSum = gradeSum + Double.parseDouble(gradeInput2.getText().toString());
        }
        if(percentageInput2.getText() == null){
            percentageSum = percentageSum + 0;
        }else{
            percentageSum = percentageSum + Double.parseDouble(percentageInput2.getText().toString());
            average = average + calulateAverage(gradeSum, percentageSum);
            gradeSum = percentageSum = 0;
        }
        if(gradeInput3.getText() == null){
            gradeSum = gradeSum + 0;
        }else{
            gradeSum = gradeSum + Double.parseDouble(gradeInput3.getText().toString());
        }
        if(percentageInput3.getText() == null){
            percentageSum = percentageSum + 0;
        }else{
            percentageSum = percentageSum + Double.parseDouble(percentageInput3.getText().toString());
            average = average + calulateAverage(gradeSum, percentageSum);
        }


        resultDisplay.setText(Double.toString( average));
    }



    private double calulateAverage(double grade, double percentage){
        percentage = percentage / 100;
        double avg = grade * percentage;
        return avg;
    }

    public void moreButton(View v){

        EditText gradeInput2 = (EditText)findViewById(R.id.gradeInput2);
        EditText gradeInput3 = (EditText)findViewById(R.id.gradeInput3);
        EditText percentageInput2 = (EditText)findViewById(R.id.percentageInput2);
        EditText percentageInput3 = (EditText)findViewById(R.id.percentageInput3);

        if((gradeInput2.getVisibility() == gradeInput2.INVISIBLE) && (percentageInput2.getVisibility() == percentageInput2.INVISIBLE)){
            //Do nothing
        }else{
            gradeInput3.setVisibility(gradeInput3.VISIBLE);
            percentageInput3.setVisibility(percentageInput3.VISIBLE);
        }

        if(gradeInput2.getVisibility() == gradeInput2.INVISIBLE){
            gradeInput2.setVisibility(gradeInput2.VISIBLE);
        }
        if(percentageInput2.getVisibility() == percentageInput2.INVISIBLE){
            percentageInput2.setVisibility(percentageInput2.VISIBLE);
        }
    }

    public void test(View v){
       // EditText testInput = (EditText)findViewById(R.id.testInput);
       // testInput.setVisibility(View.VISIBLE);
     //   Intent intent = new Intent(this, activity2.class);
    //    startActivity(intent);

    }
}
