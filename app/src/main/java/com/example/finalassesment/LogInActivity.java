package com.example.finalassesment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogInActivity extends AppCompatActivity {
    private EditText name;
    private EditText password;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name = findViewById(R.id.nameid);
        password = findViewById(R.id.passid);
        loginButton = findViewById(R.id.loginbtnid);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( password.getText().charAt(2)=='w') {
                    Intent intent = new Intent(LogInActivity.this,NextActivity.class);
                    startActivity(intent);

                } else  {
                    Toast.makeText(getApplicationContext(), "Login failed! Enter your password again!", Toast.LENGTH_LONG).show();
                    password.setText("");
                }
            }
        });
    }
}