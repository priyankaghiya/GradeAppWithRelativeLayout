package com.example.gradeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdScreen1 extends Activity {

    TextView tv7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen1);

        tv7=findViewById(R.id.tv7);

        Intent ij=getIntent();
        int mark1=Integer.parseInt(ij.getStringExtra("mark1"));
        int mark2=Integer.parseInt(ij.getStringExtra("mark2"));
        int mark3=Integer.parseInt(ij.getStringExtra("mark3"));
        float total=Float.parseFloat(ij.getStringExtra("total"));
        float per=Float.parseFloat(ij.getStringExtra("per"));

        char grade;
        if(per>=85)
        {
            grade='A';
            Toast.makeText(getApplicationContext(),"Congratulation you have passed with distinction",Toast.LENGTH_LONG).show();
        }
        else if(per>=65 && per<85)
        {
            grade='B';
            Toast.makeText(getApplicationContext(),"Congratulation well done",Toast.LENGTH_LONG).show();
        }
        else
        {
            grade='C';
            Toast.makeText(getApplicationContext(),"Better Luck Next Time",Toast.LENGTH_LONG).show();
        }

        tv7.setText("YOUR REPORT CARD IS :\n" +
                "MARKS OF THE SUBJECTS ARE \n"+
                "MATHS "+mark1+" \nCHEMISTRY "+mark2+"\n PHYSICS "+mark3+
                "\nTOTAL "+total+"\n PERCENTAGE "+per+" \nGRADE "+grade);


    }
}
