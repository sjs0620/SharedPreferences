package com.sjs.edu.sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GetActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get);
        ((Button)findViewById(R.id.buttonGet)).setOnClickListener(this);

        SharedPreferences sharedPreferences = getSharedPreferences("LogIn",Context.MODE_PRIVATE);
        String nameKey = sharedPreferences.getString("nameKey","Null");
        String passwordKey = sharedPreferences.getString("passwordKey","Null");
        String emailKey = sharedPreferences.getString("emailKey","Null");

        ((TextView)findViewById(R.id.textViewGetName)).setText(nameKey);
        ((TextView)findViewById(R.id.textViewGetPassword)).setText(passwordKey);
        ((TextView)findViewById(R.id.textViewGetMail)).setText(emailKey);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,MainActivity.class);
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    public void finish() {
        super.finish();
    }
}
