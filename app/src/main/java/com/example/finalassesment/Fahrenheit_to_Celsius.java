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


public class Fahrenheit_to_Celsius extends Fragment {

    Button btn;
    TextView showres;
    EditText editText;
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v=  inflater.inflate(R.layout.fragment_fahrenheit_to__celsius, container, false);
    btn = v.findViewById(R.id.ftocbuttonid);
    showres = v.findViewById(R.id.ftocconvertres);
    editText = v.findViewById(R.id.Fahrenheit);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String far= editText.getText().toString();


            double doublefar;
            double cel;

            doublefar  = Double.parseDouble(far);


            cel = ((doublefar-32)*5)/9;


            DecimalFormat df = new DecimalFormat("#.###");
            df.setRoundingMode(RoundingMode.CEILING);

            showres.setText(df.format(cel));
            //editText.setText("");
        }
    });



        return v;
    }
}