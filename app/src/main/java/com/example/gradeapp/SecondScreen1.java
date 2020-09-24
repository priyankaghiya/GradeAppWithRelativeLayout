package com.example.gradeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondScreen1 extends Activity {
        TextView tv6;
        Button btn2;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second_screen1);
            
            tv6=findViewById(R.id.tv6);
            btn2=findViewById(R.id.btn2);
            Intent ii=getIntent();
            
            int maths=Integer.parseInt(ii.getStringExtra("mark1"));
            int chemistry=Integer.parseInt(ii.getStringExtra("mark2"));
            int physics=Integer.parseInt(ii.getStringExtra("mark3"));
            
            float total=maths+chemistry+physics;
            
            float per=(total/300)*100;
            tv6.setText("YOUR TOTAL AND PERCENTAGE ARE "+total+" and "+per);

            final String ma1=Integer.toString(maths);
            final String ma2=Integer.toString(chemistry);
            final String ma3=Integer.toString(physics);
            final String ma4=Float.toString(total);
            final String ma5=Float.toString(per);

            
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ij=new Intent(getApplicationContext(),ThirdScreen1.class);
                    ij.putExtra("mark1",ma1);
                    ij.putExtra("mark2",ma2);
                    ij.putExtra("mark3",ma3);
                    ij.putExtra("total",ma4);
                    ij.putExtra("per",ma5);
                    startActivity(ij);
                    finish();                  
                    
                    
                    
                }
            });
        }
}
