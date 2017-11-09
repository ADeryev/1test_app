package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String dispFieldText = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView1 = findViewById(R.id.textView1);
        textView1.setText(dispFieldText);
    }
}
