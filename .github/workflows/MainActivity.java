package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v)
    {
        String buttonText;
        //Create a new Intent from this activity to Page 2.
        buttonText = ((Button)v).getText().toString();
        if(buttonText.equals("Driver"))
        {
            Intent intent = new Intent(MainActivity.this, Page2.class);
            startActivity(intent);
        }
        else if(buttonText.equals("Customer"))
        {
            Intent intent = new Intent(MainActivity.this, Page3.class);
            startActivity(intent);
        }
    }
}
