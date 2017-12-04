package com.example.dell.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private Button login;
    private Button signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText)findViewById(R.id.editxt2);
        password = (EditText)findViewById(R.id.password2);
        login = (Button)findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(email.getText().toString(), password.getText().toString());
            }
        });
        signup = (Button)findViewById(R.id.button2);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();
            }
        });

    }

    private void validate(String email, String password){
        //noinspection StatementWithEmptyBody
        if (email.equals("Admin")&& password.equals("1234"));
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
        }

    private void validate(){
        Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(intent);

    }
}
