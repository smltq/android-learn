package com.example.helloworld;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_test);

        //1.代码获取资源示例
//        TextView textView=findViewById(R.id.helloWorld);
//        textView.setBackground(getResources().getDrawable(R.drawable.demo5));

        //2.代码设置主题
//        setTheme(R.style.AppTheme);

        //3.字符串资源
        TextView textView=findViewById(R.id.helloWorld);
        textView.setTextColor(getResources().getColor(R.color.colorPrimary));
//        textView.setText(getResources().getString(R.string.app_name));

//        textView.setText(getResources().getString(R.string.app_name));

        //4.logcat
        Log.v("MainActivity.onCreate", "Verbose");
        Log.d("MainActivity.onCreate","Debug");
        Log.i("MainActivity.onCreate","Info");
        Log.w("MainActivity.onCreate", "Warning");
        Log.e("MainActivity.onCreate", "Error");
        Log.wtf("MainActivity.onCreate","Assert");
    }
}