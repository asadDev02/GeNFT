package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    String emailtext;
    String passtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }

    public void func(View view) {
        Intent login = new Intent(MainActivity.this,Dashboard.class);
        email = findViewById(R.id.email);
        emailtext = email.getText().toString();
        password = findViewById(R.id.password);
        passtext = password.getText().toString();
        login.putExtra("email",emailtext);
        login.putExtra("pass",passtext);
        startActivity(login);
        finish();
    }

    public void register(View view) {
        Intent reg = new Intent(MainActivity.this,Signup.class);
        startActivity(reg);
    }

    public void forgotPassword(View view) {
        Intent reg = new Intent(MainActivity.this,ForgotPassword.class);
        startActivity(reg);
    }
}