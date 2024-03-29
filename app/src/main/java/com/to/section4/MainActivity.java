package com.to.section4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button1, button2;
    EditText editText;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = getSharedPreferences(getString(R.string.app_name), MODE_PRIVATE);
        editor = sharedPreferences.edit();


        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        editText = findViewById(R.id.editText);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        String name=editText.getText().toString();
        editor.putString("thiskey",""+name);
        editor.apply();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name1=sharedPreferences.getString("thiskey","default value");
                button2.setText(""+name1);
                startActivity(new Intent(MainActivity.this,MainActivity2.class));

            }
        });


    }
}