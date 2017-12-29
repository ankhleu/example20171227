package com.example1.student.example20171227;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void click1 (View v)
        {
            EditText ed3,ed4;

            ed3 =(EditText)findViewById(R.id.editText3);
            ed4 =(EditText)findViewById(R.id.editText4);
            int q1=Integer.valueOf(ed3.getText().toString());
            int q2=Integer.valueOf(ed4.getText().toString());
            int ans=q1+q2;
            TextView tv=(TextView)findViewById(R.id.textView);

            tv.setText(String.valueOf(ans));
        }


    }

