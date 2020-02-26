package com.example.lecture2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BirthdayActivity extends AppCompatActivity {

    public static final String BIRTHDAY = "com.example.myfirstapp.BIRTHDAY";

    String name, address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        Intent intent = getIntent();
        name = intent.getStringExtra(NameActivity.NAME);
        address = intent.getStringExtra(AddressActivity.ADDRESS);
    }

    public void next(View view) {
        Intent intent = new Intent(this, ResultActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String birthday = editText.getText().toString();
        intent.putExtra(NameActivity.NAME, name);
        intent.putExtra(AddressActivity.ADDRESS, address);
        intent.putExtra(BIRTHDAY, birthday);
        startActivity(intent);
    }
}
