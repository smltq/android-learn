package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        RelativeLayout relativeLayout=new RelativeLayout(this);
//        RelativeLayout.LayoutParams params=new RelativeLayout.LayoutParams(
//                ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
//        params.addRule(RelativeLayout.CENTER_IN_PARENT);
//
//        TextView textView=new TextView(this);
//        textView.setText("程序设计7班7班！");
//        textView.setTextSize(30);
//        textView.setTextColor(Color.RED);
//
//        relativeLayout.addView(textView,params);
//
//        setContentView(relativeLayout);

        setContentView(R.layout.activity_main);
    }
}