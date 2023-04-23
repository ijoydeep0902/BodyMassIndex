package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtres;
        EditText editweight,editheightft,editheightin;
        Button btncal;
        LinearLayout llmain;

        editweight=findViewById(R.id.editweight);
        editheightft=findViewById(R.id.editheightft);
        editheightin=findViewById(R.id.editheightinch);

        btncal=findViewById(R.id.btncal);
        txtres=findViewById(R.id.txtres);
     llmain=findViewById(R.id.linearmain);

        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int weight= Integer.parseInt(editweight.getText().toString());
               int heightft= Integer.parseInt(editheightft.getText().toString());
            int heightin=Integer.parseInt(editheightin.getText().toString() );



        int totalin=heightft*12+heightin;

        double totalcm=totalin*2.35;
        double totalM=totalcm/100;



        double bmi=weight/(totalM*totalM);

                if(bmi>25)
                {
                    txtres.setText("You are Overweight");
                    llmain.setBackgroundColor(getResources().getColor(R.color.OW));
                }
                else if (bmi<18)
                {
                    txtres.setText("you are Underweight");
                    llmain.setBackgroundColor(getResources().getColor(R.color.UW));
                }
                else
                {
                    txtres.setText("Congratulation,You are Fit...");
                    llmain.setBackgroundColor(getResources().getColor(R.color.HEL));
                }

            }
        });
    }
}