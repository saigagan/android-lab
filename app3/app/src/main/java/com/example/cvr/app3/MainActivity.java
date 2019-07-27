package com.example.cvr.app3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText uname,pwd;
    Button login;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(this, HomeActivity.class);

        uname=findViewById(R.id.uname);
        pwd=findViewById(R.id.pwd);
        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u = uname.getText().toString();
                String p = pwd.getText().toString();

                if(u.equals("gagan") && p.equals("gagan")) {
                    intent.putExtra("uname", u);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Invalid Username/Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
