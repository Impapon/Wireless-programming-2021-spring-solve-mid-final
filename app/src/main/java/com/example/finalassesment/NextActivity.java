package com.example.finalassesment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        if (savedInstanceState == null){
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fraglayout, new BMI());
            transaction.commit();
        }

        ListView listView = findViewById(R.id.nextListView);

        String[] listaction = {"Calculate BMI", "Fahrenheit to Celsius", "Celsius to Fahrenheit"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaction);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((context, v, pos, id) -> {
            if(pos == 0){
                anotherFragment(new BMI());
            }
            else if(pos == 1){
                anotherFragment(new Fahrenheit_to_Celsius());
            }
            else if(pos == 2){
                anotherFragment(new Celsius_to_Fahrenhei());
            }
        });
    }

    private void anotherFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fraglayout, fragment);
        transaction.commit();
    }

}