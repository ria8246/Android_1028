package com.example.g6vqu4.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //lefut mikor elindul
        setContentView(R.layout.activity_main); //beállítja a tartalmat

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
                                      @Override
                                      public void onClick(View view) {
                                          Intent intentPeldany = new Intent(getApplicationContext(), MasikActivity.class);
                                          intentPeldany.putExtra("g6vqu4.talkingandroid.MESSAGE", "Hello masik activitx");
                                          startActivity(intentPeldany);
                                      }
                                  }

        );

    }
}
