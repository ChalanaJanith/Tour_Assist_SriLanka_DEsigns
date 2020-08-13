package com.example.mad_Signup_Page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserProfile extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        btn = findViewById(R.id.editProfile);
        btn = findViewById(R.id.deleteProfile);
    }

    public void gotoUpdatepage(View view) {
        Intent update = new Intent(UserProfile.this,UserEditPage.class);
        startActivity(update);

    }

    public void gotoDeletePage(View view)
    {
        Intent delete = new Intent(UserProfile.this,userDeletePage.class);
        startActivity(delete);
    }

}