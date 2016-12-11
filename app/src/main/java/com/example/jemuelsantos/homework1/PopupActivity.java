package com.example.jemuelsantos.homework1;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class PopupActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);

        String name = getIntent().getStringExtra(EXTRA_NAME);

        TextView txt = (TextView) findViewById(R.id.textView3);
        txt.setText("Hi " + name);

    }
}
