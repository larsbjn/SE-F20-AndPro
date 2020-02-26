package com.example.lecture2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class NameActivity extends AppCompatActivity {

    public static final String NAME = "com.example.myfirstapp.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        Log.i("Lifecycle", "On Create");
    }

    public void next(View view) {
        Intent intent = new Intent(this, AddressActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String name = editText.getText().toString();
        intent.putExtra(NAME, name);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle", "On Start");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Lifecycle", "On Restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle", "On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle", "On Destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle", "On Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle", "On Resume");
    }
}
