package com.example.alc4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.activity_a_toolbar);
        mToolbar.setTitle(getString(R.string.app_name_activity_a));

        Button buttonOne = findViewById(R.id.btn1);
        Button buttonTwo = findViewById(R.id.btn2);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ActivityB.class));
                finish();
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ActivityC.class));
                finish();
            }
        });
    }
}
