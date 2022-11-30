package com.example.datacommunicationbetweentwoactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {

    TextView txtInfo;
    Button btnPrevious;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initializeViews();
        extractData();
        initializeListeners();
    }

    private void initializeListeners(){
        //btnPrevious.setOnClickListener(new BtnPreviousClickListener());
    }

    private void initializeViews(){
        txtInfo = findViewById(R.id.txtInfo);
        btnPrevious = findViewById(R.id.btnPrevious);
    }

    private void extractData(){

    }

    /*class BtnPreviousClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {

        }
    }*/
}
