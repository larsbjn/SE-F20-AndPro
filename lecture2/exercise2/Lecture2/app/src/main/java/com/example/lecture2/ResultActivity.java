package com.example.lecture2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String name = intent.getStringExtra(NameActivity.NAME);
        String address = intent.getStringExtra(AddressActivity.ADDRESS);
        String birthday = intent.getStringExtra(BirthdayActivity.BIRTHDAY);

        // Capture the layout's TextView and set the string as its text
        TextView nameTV = findViewById(R.id.nameTV);
        TextView addressTV = findViewById(R.id.addressTV);
        TextView birthdayTV = findViewById(R.id.birthdayTV);
        nameTV.setText(name);
        addressTV.setText(address);
        birthdayTV.setText(birthday);
    }
}
