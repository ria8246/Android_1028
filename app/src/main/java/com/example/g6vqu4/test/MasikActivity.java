package com.example.g6vqu4.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MasikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masik);
    }

    Bundle extras = getIntent().getExtras();
    if(extras != null){
        String message = extras.getString();
        TextView MessageTextView = (TextView) findViewById(R.id.Textview4);
    }


    protected void Katt (View view){
        Intent intentPeldany = new Intent(getApplicationContext(),MasikActivity.class);
        in
        startActivity(intentPeldany);
    }
}
