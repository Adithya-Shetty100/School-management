package com.example.circular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String msg="";
    public void p1(View view){
        msg="Open House";
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    public void p2(View view){
        msg="Party";
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    public void p3(View view){
        msg="Result";
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}