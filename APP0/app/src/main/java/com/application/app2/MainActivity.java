package com.application.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    Boolean showName = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showName = !showName;
                textView.setText(showName?"Gagan":"Check Later");
                button.setText(showName?"Check":"OK");
            }
        });

        Toast.makeText(getApplicationContext(), "play store", Toast.LENGTH_LONG).show();
    }
}
