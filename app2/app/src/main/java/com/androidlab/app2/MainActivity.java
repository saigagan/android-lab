package com.androidlab.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    EditText uname,pwd;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname=findViewById(R.id.uname);
        uname.addTextChangedListener(this);
        pwd=findViewById(R.id.pwd);
        pwd.addTextChangedListener(this);
        login=findViewById(R.id.login);
    }
    public void click(View v) {
        String user = uname.getText().toString();
        String password = pwd.getText().toString();

        if (user.equals("gagan")&&password.equals("cvr123"))
        {
            Toast.makeText(this,"welcome"+user,Toast.LENGTH_LONG).show();
        }
    else{
            Toast.makeText(this,"invalid username/paasword"+user,Toast.LENGTH_LONG).show();
        }


    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }

    @Override
    public void afterTextChanged(Editable editable) {
        String user = uname.getText().toString();
        String password = pwd.getText().toString();

        if (user.equals("gagan")&&password.equals("cvr123"))
        {
           login.setEnabled(true);
        }
        else{
            login.setEnabled(false);
        }
    }
}
