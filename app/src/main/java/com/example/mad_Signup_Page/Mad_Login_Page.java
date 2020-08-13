package com.example.mad_Signup_Page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Mad_Login_Page extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad__login__page);

        img = findViewById(R.id.GoBackIcon);
    }

    public void goback(View view) {

        Intent ic = new Intent(Mad_Login_Page.this,MainActivity.class);
        startActivity(ic);
    }

    public void signpage(View view) {
        Intent sp = new Intent(Mad_Login_Page.this,MainActivity.class);
        startActivity(sp);
    }

    public void forgotpage(View view) {
        Intent fp = new Intent(Mad_Login_Page.this,forgotPasswordPage.class);
        startActivity(fp);
    }
}