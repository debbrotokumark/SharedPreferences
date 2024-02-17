package com.to.section4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    Button button1, button2;
ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView);
        SharedPreferences sharedPreferences;
        sharedPreferences = getSharedPreferences(getString(R.string.app_name), MODE_PRIVATE);
        String name = sharedPreferences.getString("thiskey", "defaultvalue");
        textView.setText("" + name);

        LinearLayout layoutmain, layoutsub;

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        layoutmain=findViewById(R.id.mainlayout);
        layoutsub=findViewById(R.id.layoutsub);

        LayoutInflater layoutInflater;

        layoutInflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       View view= layoutInflater.inflate(R.layout.sublay,layoutsub);
       imageView=view.findViewById(R.id.imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "this is image include", Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutsub.removeAllViews();

            }
        });




//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                layoutInflater.inflate(R.layout.sublay,layoutsub);
//
//            }
//        });


    }
}