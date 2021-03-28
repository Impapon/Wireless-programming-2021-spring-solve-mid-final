package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class InfoActivity extends AppCompatActivity {
    private TextView message;
    private String id, name, phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        name = getIntent().getStringExtra("sendName");
        id = getIntent().getStringExtra("sendId");
        phone = getIntent().getStringExtra("sendPhone");
        message = findViewById(R.id.info_message);

        Button processInfo = findViewById(R.id.info_process);
        processInfo.setOnClickListener(v->showMessage());
    }

    private void showMessage(){
        String department = "";

        switch (id.charAt(5)){
            case '5':
                department = "CSE";
                break;

            case '4':
                department = "Software Engineering";
                break;

            case '3':
                department = "BBA";
                break;

            case '2':
                department = "English";
                break;

            case '1':
                department = "Pharmacy";
                break;

            default:
                department = "Invalid department!";
                break;
        }

        String semester = "";
        switch (id.charAt(2)){
            case '1':
                semester = "Spring";
                break;

            case '2':
                semester = "Summer";
                break;

            case '3':
                semester = "Fall";
                break;
        }

        int lastDigit = Integer.parseInt(String.valueOf(phone.charAt(phone.length()-1)));

        String messageString;
        if(lastDigit % 2 == 0){
            messageString = name + " has admitted in " + semester + " 201" + id.charAt(1);
        }
        else{
            messageString = name + "\nhas admitted in " +  department;
        }

        message.setText(messageString);
    }
}