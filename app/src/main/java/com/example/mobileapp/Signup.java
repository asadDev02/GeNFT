package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Signup extends AppCompatActivity {

    EditText email;
    EditText password;
    String emailtext;
    String passtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void signup(View view) {
        Intent signup = new Intent(Signup.this,Dashboard.class);
        email = findViewById(R.id.emails);
        emailtext = email.getText().toString();
        password = findViewById(R.id.passwords);
        passtext = password.getText().toString();
        signup.putExtra("email",emailtext);
        signup.putExtra("pass",passtext);
        startActivity(signup);
        finish();

    }
}