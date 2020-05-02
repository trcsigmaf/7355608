package com.example.myapplication;

import java.util.regex.*;

public class TextChecker
{
    public static boolean checkPassRegex(String password)
    {
        String regex = "^[A-Za-z0-9]*$";

        Pattern checkRegex = Pattern.compile(regex);
        Matcher matcher = checkRegex.matcher(password);

        if(matcher.find())
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    public static boolean checkUserRegex(String username)
    {
        String regex = "^[A-Za-z0-9]{3,15}$";

        Pattern checkRegex = Pattern.compile(regex);
        Matcher matcher = checkRegex.matcher(username);

        if(matcher.find())
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    public static boolean checkEmailRegex(String email)
    {
        String regex = "^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{2,}$.";
        Pattern checkRegex = Pattern.compile(regex);
        Matcher matcher = checkRegex.matcher(email);

        if(matcher.find())
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    public static boolean checkPhoneNumber(String phoneNumber)
    {
        String regex = "^[0-9]{10}$";
        Pattern checkRegex = Pattern.compile(regex);
        Matcher matcher = checkRegex.matcher(phoneNumber);

        if(matcher.find())
        {
            return true;
        }

        else
        {
            return false;
        }
    }
}
