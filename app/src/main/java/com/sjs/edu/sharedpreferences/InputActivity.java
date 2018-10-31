package com.sjs.edu.sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        Button button = findViewById(R.id.buttonInputSave);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        SharedPreferences.Editor editor = getSharedPreferences("LogIn",Context.MODE_PRIVATE).edit();
        editor.putString("nameKey",((EditText)findViewById(R.id.editTextName)).getText().toString());
        editor.putString("passwordKey",((EditText)findViewById(R.id.editTextPassword)).getText().toString());
        editor.putString("emailKey",((EditText)findViewById(R.id.editTextMail)).getText().toString());
        editor.commit();

        Intent intent = new Intent(this,GetActivity.class);
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        startActivityForResult(intent,10);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void finish() {
        super.finish();
    }
}
