package com.example.datacommunicationbetweentwoactivities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtInfo;
    Button btnNext;
    TextView txtResult;
    String result;

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
        txtResult = findViewById(R.id.txtResult);
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

            //startActivity(intent);
            startActivityForResult(intent,1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bundle bundle = data.getExtras();
        result = bundle.getString("result");
        txtResult.setText(result);
    }
}