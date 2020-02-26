package com.example.lecture2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class AddressActivity extends AppCompatActivity {

    public static final String ADDRESS = "com.example.myfirstapp.ADDRESS";

    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        Intent intent = getIntent();
        name = intent.getStringExtra(NameActivity.NAME);
    }

    public void next(View view) {
        Intent intent = new Intent(this, BirthdayActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String address = editText.getText().toString();
        intent.putExtra(NameActivity.NAME, name);
        intent.putExtra(ADDRESS, address);
        startActivity(intent);
    }
}
