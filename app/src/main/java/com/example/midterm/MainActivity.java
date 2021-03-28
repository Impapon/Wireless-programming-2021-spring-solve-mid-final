package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText name, id, phoneNumber;
    private Button goToNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.main_name);
        id = findViewById(R.id.main_id);
        phoneNumber = findViewById(R.id.main_phone);

        goToNext = findViewById(R.id.main_goToNext);

        goToNext.setOnClickListener(v-> changeActivity());
    }

    private void changeActivity() {
        String nameString = name.getText().toString().trim();
        String idString = id.getText().toString().trim();
        String phoneString = phoneNumber.getText().toString().trim();

        if(nameString.isEmpty() || idString.isEmpty() || phoneString.isEmpty()){
            Toast.makeText(this, "All Input required!!", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("sendName", nameString);
        intent.putExtra("sendId", idString);
        intent.putExtra("sendPhone", phoneString);

        startActivity(intent);
    }
}