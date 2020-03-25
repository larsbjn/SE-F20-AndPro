package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void blueOnClick(View v) {
        BlueFragment blue = new BlueFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainer, blue);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void greenOnClick(View v) {
        GreenFragment green = new GreenFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainer, green);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void redOnClick(View v) {
        RedFragment red = new RedFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainer, red);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void whiteOnClick(View v) {
        WhiteFragment white = new WhiteFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainer, white);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}