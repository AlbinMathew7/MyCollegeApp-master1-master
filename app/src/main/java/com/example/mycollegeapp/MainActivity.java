package com.example.mycollegeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView location;
    private ImageView gas;
    private ImageView temprature;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        location=(ImageView)findViewById(R.id.location);

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(getApplicationContext(),mapctivity.class));
            }
        });
        temprature=(ImageView)findViewById(R.id.temprature);

        temprature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),nxtactivity.class));
            }
        });
    }
}
