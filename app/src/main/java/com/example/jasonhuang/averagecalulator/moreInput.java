package com.example.jasonhuang.averagecalulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class moreInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_input_activity);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Spinner numberOneSpinner = (Spinner)findViewById(R.id.numSpinner1);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(moreInput.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.moreInputSpinnerOne));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        numberOneSpinner.setAdapter(myAdapter);



    }









}
