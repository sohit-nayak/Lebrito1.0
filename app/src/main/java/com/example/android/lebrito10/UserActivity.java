package com.example.android.lebrito10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        final TextView tvWelcomeMsg=(TextView) findViewById(R.id.tvWelcomeMsg);
        final TextView tvUserName=(TextView) findViewById(R.id.tvUserName);
        final TextView tvEmailId=(TextView) findViewById(R.id.tvEmailId);
        final EditText etUserName=(EditText) findViewById(R.id.etUsername);
        final EditText etEmailId=(EditText) findViewById(R.id.etEmailId);

    }
}
