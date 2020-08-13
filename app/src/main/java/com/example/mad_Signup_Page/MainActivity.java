package com.example.mad_Signup_Page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.signup);
    }

    public void gotoNext(View view) {
        Intent dsp = new Intent(MainActivity.this,Mad_Login_Page.class);
        startActivity(dsp);
    }
}