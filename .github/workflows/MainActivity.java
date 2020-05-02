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

        //Find our button. It's just a regular button center in the screen.
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button1);

        //Set an onClickListener to detect clicks.
        button1.setOnClickListener(new ButtonListener1());
        button2.setOnClickListener(new ButtonListener2());
    }

    class ButtonListener1 implements View.OnClickListener
    {
        @Override
        public void onClick(View v)
        {
            //Create a new Intent from this activity to Page 2.
            Intent intent = new Intent(MainActivity.this, Page2.class);
            startActivity(intent);
        }
    }

    class ButtonListener2 implements View.OnClickListener
    {
        @Override
        public void onClick(View v)
        {
            //Create a new Intent from this activity to Page 3.
            Intent intent = new Intent(MainActivity.this, Page3.class);
            startActivity(intent);
        }
    }
}
