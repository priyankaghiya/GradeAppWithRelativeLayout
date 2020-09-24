package com.example.gradeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText ed3,ed4,ed5;
    Button btn1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed3=findViewById(R.id.ed3);
        ed4=findViewById(R.id.ed4);
        ed5=findViewById(R.id.ed5);

        btn1=findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m1=ed3.getText().toString();
                String m2=ed4.getText().toString();
                String m3=ed5.getText().toString();

                Intent ii=new Intent(getApplicationContext(),SecondScreen1.class);
                ii.putExtra("mark1",m1);
                ii.putExtra("mark2",m2);
                ii.putExtra("mark3",m3);
                startActivity(ii);
                finish();

            }
        });
    }
}
