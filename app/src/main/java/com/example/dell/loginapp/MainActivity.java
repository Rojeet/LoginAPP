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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText)findViewById(R.id.editText1);
        password = (EditText)findViewById(R.id.editText2);
        login = (Button)findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(email.getText().toString(), password.getText().toString());
            }
        });
    }

    private void validate(String email, String password){
        //noinspection StatementWithEmptyBody
        if (email.equals("Admin")&& password.equals("1234"));
        {
            Toast.makeText(getApplicationContext(), "WELCOME", Toast.LENGTH_SHORT).show();
        }
        }
}
