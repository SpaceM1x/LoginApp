package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private TextView userData;
    private Button BackButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        userData = findViewById(R.id.textView);
        BackButton = findViewById(R.id.button2);

        String Login = getIntent().getStringExtra("Login");
        userData.setText("Добро пожаловать "+Login +" Информация о "+Login );
    }

    public void onBackClick(View view){
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);

        startActivity(intent);

    }
}