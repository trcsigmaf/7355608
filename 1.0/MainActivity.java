package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v)
    {
        String buttonText;
        //Create a new Intent from this activity to driver registration or customer registration
        buttonText = ((Button)v).getText().toString();
        if(buttonText.equals("Driver"))
        {
            Intent intent = new Intent(MainActivity.this, Driver.class);
            startActivity(intent);
        }

        else if(buttonText.equals("Customer"))
        {
            Intent intent = new Intent(MainActivity.this, Customer.class);
            startActivity(intent);
        }
    }
}
