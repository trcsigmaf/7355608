package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Driver extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);
    }

    public boolean checkUsername()
    {
        EditText usernameEditText = findViewById(R.id.usernameEditText);
        boolean usernameValid = TextChecker.checkUserRegex(usernameEditText.getText().toString());

        if(usernameValid)
        {
            return true;
        }

        else
        {
            Toast.makeText(this, "Please enter a valid username.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    public boolean checkEmail()
    {
        EditText emailEditText = findViewById(R.id.emailEditText);
        boolean emailValid = TextChecker.checkEmailRegex(emailEditText.getText().toString());

        if(emailValid)
        {
            return true;
        }

        else
        {
            Toast.makeText(this, "Please enter a valid email.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    public boolean checkPhoneNumber()
    {
        EditText phoneNumber = findViewById(R.id.phoneNumberEditText);
        boolean phoneNumberValid = TextChecker.checkPhoneNumber(phoneNumber.getText().toString());

        if(phoneNumberValid)
        {
            return true;
        }

        else
        {
            Toast.makeText(this, "Please enter a phone number.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    public boolean checkPassword()
    {
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        EditText confirmPassword = findViewById(R.id.confirmPasswordEditText);

        boolean passMatching = passwordEditText.getText().toString().equals(confirmPassword.getText().toString());
        boolean passLengthNonZero = passwordEditText.getText().toString().length() > 0 && confirmPassword.getText().toString().length() > 0;
        boolean passValid = TextChecker.checkPassRegex(passwordEditText.getText().toString());

        if(passMatching && passLengthNonZero && passValid)
        {
            return true;
        }

        else
        {
            Toast.makeText(this, "Passwords don't match or password is invalid. Please try again. (Password must contain at least one upper case alphanumeric character)", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    public void nextPage(View v)
    {
        boolean passwordValid = checkPassword();
        boolean usernameValid = checkUsername();
        boolean emailValid = checkEmail();
        boolean phoneNumberValid = checkPhoneNumber();

        if (passwordValid && usernameValid && phoneNumberValid)
        {
            Intent intent = new Intent(Driver.this, Driver2.class);
            startActivity(intent);
        }
    }
}
