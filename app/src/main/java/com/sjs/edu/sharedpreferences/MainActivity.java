package com.sjs.edu.sharedpreferences;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button buttonInput, buttonGet;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonInput = findViewById(R.id.button1Input);
        buttonGet = findViewById(R.id.button1Get);
        buttonInput.setOnClickListener(this);
        buttonGet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch(v.getId()){
            case R.id.button1Input:
                intent = new Intent(this,InputActivity.class);
                break;
            case R.id.button1Get:
                intent = new Intent(this,GetActivity.class);
                break;
            default:
                intent = new Intent(); //??
        }
        startActivityForResult(intent,Activity.RESULT_FIRST_USER);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);
    }
}
