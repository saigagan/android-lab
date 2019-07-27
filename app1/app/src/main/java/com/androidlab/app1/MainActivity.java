package com.androidlab.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText uname, pwd;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname = findViewById(R.id.uname);
        pwd = findViewById(R.id.pwd);
        login = findViewById(R.id.login);
    }

    public void click(View v) {
        String user = uname.getText().toString();
        String passwd = pwd.getText().toString();

        if(user.equals("gagan") && passwd.equals("cvr123")) {
            Toast.makeText(this, "Welcome, " + user, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Invalid Username/Password", Toast.LENGTH_LONG).show();
        }
    }
}
