package com.example.cvr.app3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView mess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mess = findViewById(R.id.mess);

        Intent intent = getIntent();
        mess.setText(intent.getStringExtra("uname"));
    }
}
