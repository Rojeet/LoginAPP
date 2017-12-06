package com.example.dell.loginapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView t;
    private EditText email;
    private EditText password;
    private Button login;
    private Button create;
    private static final String TAG = "LoginActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = (TextView)findViewById(R.id.login);
        Typeface mycustomfont = Typeface.createFromAsset(getAssets(),"fonts/Bubble3D.ttf");
        t.setTypeface(mycustomfont);


         email = findViewById(R.id.editxt2);
       password = findViewById(R.id.password2);
       login =(Button)findViewById(R.id.logg);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(email.getText().toString(), password.getText().toString());
                login();
            }
        });
        create =findViewById(R.id.signup);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();

            }
        });

    }

    public void login(){
        Log.d(TAG, "Congratulation");

        if (!validate(email.getText().toString(), password.getText().toString())){
            onLoginFailed();
        }else {
            if (validate(email.getText().toString(), password.getText().toString())){
                onLogin();
            }
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
    }

    public void onLoginFailed(){
        Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
    }

    public void onLogin(){
        Toast.makeText(this, "Login Pass", Toast.LENGTH_SHORT).show();
    }



    private boolean validate(String m, String p){
        String mail = email.getText().toString();
        String pass = password.getText().toString();
        boolean valid = true;

        //noinspection StatementWithEmptyBody
       if (mail.isEmpty()|| !Patterns.EMAIL_ADDRESS.matcher(mail).matches()){
           email.setError("Enter valid Email Address");
           valid=false;
       }else {
           email.setError(null);
       }
           if (pass.isEmpty()|| password.length()<4 || password.length()>10){
               password.setError("Between 4 to 10 character");
               valid=false;
           }else {
               password.setError(null);
           }
           return valid;
       }


    private void validate(){
        Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(intent);
    }
}
