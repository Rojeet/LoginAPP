package com.example.dell.loginapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    private TextView t2;

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        t2 = (TextView)findViewById(R.id.textView3);
      Typeface mycustomfont = Typeface.createFromAsset(getAssets(),"fonts/Nebulo Demo.ttf");
      t2.setTypeface(mycustomfont);
    }
}

