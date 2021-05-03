package com.example.finalassesment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import static android.widget.Toast.*;

public class BMI extends Fragment {
    TextView text;
    EditText weight,height;
    Button calculation;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_b_m_i,container,false);

        text = v.findViewById(R.id.showresid);
        weight = v.findViewById(R.id.weightid);
        height = v.findViewById(R.id.heightid);
        calculation = v.findViewById(R.id.bmicalculationbutton);

        calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputweight= weight.getText().toString();
                String inputheight= height.getText().toString();

                double inputweightDouble,inputheightDouble;
                double result;

                inputweightDouble  = Double.parseDouble(inputweight);
                inputheightDouble = Double.parseDouble(inputheight);
                double res= Math.pow(inputheightDouble,2);

                result = (inputweightDouble /res);


                DecimalFormat df = new DecimalFormat("#.###");
                df.setRoundingMode(RoundingMode.CEILING);

                text.setText(df.format(result));
                String mes = "";
                if(result>25){
                    mes= "Overweight";
                }
                else{
                    mes ="Not Overweight";
                }


                Toast.makeText(getContext(),mes+ " And Score is   "+df.format(result) ,Toast.LENGTH_SHORT).show();

            }
        });



        return v;

    }

}