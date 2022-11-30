package com.example.datacommunicationbetweentwoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtInfo;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();
        initializeListeners();
    }

    private void initializeViews(){
        edtInfo = findViewById(R.id.edtInfo);
        btnNext = findViewById(R.id.btnNext);
    }

    private void initializeListeners(){
        btnNext.setOnClickListener(new BtnNextClickListener());
    }

    class BtnNextClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("information",edtInfo.getText().toString());
            intent.putExtra("code",11);
            intent.putExtra("isValue",true);

            startActivityForResult(intent,1);
        }
    }
}