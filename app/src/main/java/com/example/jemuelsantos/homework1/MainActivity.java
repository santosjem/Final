package com.example.jemuelsantos.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);

        final Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent popupIntent = new Intent (getApplicationContext(), PopupActivity.class);
                popupIntent.putExtra(PopupActivity.EXTRA_NAME, username.getText().toString());
                startActivity(popupIntent);
                        }
                    });
                    }
                }




