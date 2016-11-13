package com.example.fonda.loginscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        loginButton = (Button) findViewById(R.id.btnLogin);

    }

    public void onLogin(View view) {
        Toast.makeText(getApplicationContext(), "You're logged in!", Toast.LENGTH_SHORT).show();
    }

}
