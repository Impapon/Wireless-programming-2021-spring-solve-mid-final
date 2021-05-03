package com.example.finalassesment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;


public class Celsius_to_Fahrenhei extends Fragment {

    Button btn;
    TextView showres;
    EditText editText;
    View v;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.fragment_celsius_to__fahrenhei, container, false);

        btn = v.findViewById(R.id.ctofbuttonid);
        showres = v.findViewById(R.id.ctofconvertres);
        editText = v.findViewById(R.id.celsius);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String cel= editText.getText().toString();


                double doublecel;
                double far;

                doublecel  = Double.parseDouble(cel);


                far = (doublecel*1.8)+32;


                DecimalFormat df = new DecimalFormat("#.###");
                df.setRoundingMode(RoundingMode.CEILING);

                showres.setText(df.format(far));
                //editText.setText("");
            }
        });
        return v;
    }
}