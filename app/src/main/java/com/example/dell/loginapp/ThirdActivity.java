package com.example.dell.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ThirdActivity extends AppCompatActivity {
    private Button login_account;
    private EditText username;
    private EditText smail;
    private EditText spassword;
    private Button third;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);


        username = (EditText) findViewById(R.id.username);
        smail = (EditText) findViewById(R.id.email);
        spassword = (EditText) findViewById(R.id.pwd);
        login_account = (Button) findViewById(R.id.btn2);
        login_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();

            }
        });
        third = (Button) findViewById(R.id.btn);
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valid();
                Intent intent = new Intent(ThirdActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }


    public boolean valid() {
        boolean valid = true;

        String mail = smail.getText().toString();
        String pass = spassword.getText().toString();
        String user = username.getText().toString();

        if (mail.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(mail).matches()) {
            smail.setError("enter a valid email address");
            valid = false;
        } else {
            smail.setError(null);
        }
        if (user.isEmpty() || username.length()<2 || username.length()>20){
            username.setError("Invalid Username");
            valid = false;
        }else {
            username.setError(null);
        }
        if (pass.isEmpty() || spassword.length() < 4 || spassword.length() > 10) {
            spassword.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            spassword.setError(null);
        }

            return valid;
    }

        private void validate(){
        Intent intent = new Intent(ThirdActivity.this, MainActivity.class);
        startActivity(intent);
        }
}