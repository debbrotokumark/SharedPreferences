package com.to.section4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView);
        SharedPreferences sharedPreferences;
        sharedPreferences=getSharedPreferences(getString(R.string.app_name),MODE_PRIVATE);
        String name=sharedPreferences.getString("thiskey","defaultvalue");
        textView.setText(""+name);

    }
}