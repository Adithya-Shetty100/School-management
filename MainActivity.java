package com.example.home;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public void details(View view){
        TextView display=(TextView)findViewById(R.id.enter);
        display.setText("Name:Adithya   Section:Q\nB.Tech ECE    2019-23");
    }

    public void report(View view){
        TextView display=(TextView)findViewById(R.id.enter);
        display.setText("Math:A    Comp:A\nPhy:B     Mech:A\nSGPA: 8.36");
    }

    public void attend(View view){
        TextView display=(TextView)findViewById(R.id.enter);
        display.setText("Total Days: 120     Present:92\nAttendence: 76.67%");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}