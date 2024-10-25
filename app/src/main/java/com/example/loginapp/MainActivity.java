package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText Login;
    private EditText Password;
    private Button LoginButton;

    User user1 = new User("SecretLogin1","SecretPassword1");

    boolean loginFlag = false;
    boolean passwordFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Login = findViewById(R.id.Login);
        Password = findViewById(R.id.Password);
        LoginButton = findViewById(R.id.button);
    }

    public void checkLoginData(View view){
        String output = user1.logUserIn(Login.getText().toString(), Password.getText().toString());

        Toast.makeText(this, output, Toast.LENGTH_SHORT).show();
        if(user1.logged(Login.getText().toString(), Password.getText().toString())){
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);

            intent.putExtra("Login", Login.getText().toString());

            startActivity(intent);
        }

    }

}