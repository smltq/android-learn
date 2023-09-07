package com.example.helloworld;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.代码获取资源示例
//        TextView textView=findViewById(R.id.helloWorld);
//        textView.setBackground(getResources().getDrawable(R.drawable.demo5));
    }
}