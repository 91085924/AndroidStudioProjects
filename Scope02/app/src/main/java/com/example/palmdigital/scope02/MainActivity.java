package com.example.palmdigital.scope02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void myAwesomeMethod01()
    {
     int myInt;
     double myDouble;
     String myString;
     TextView textView1;
     ImageView imageView1;
     myInt = 5;
     myDouble = 2.5;
     myString = "hello";
     textView1 = null;
     imageView1 = null;
    }

    public void myAwesomeMethod02()
    {
        int myInt2;
        double myDouble2;
        String myString2;
        TextView textView2;
        ImageView imageView2;
        myInt2 = 5;
        myDouble2 = 2.5;
        myString2 = "hello";
        textView2 = null;
        imageView2 = null;
    }

    public void myAwesomeMethod03()
    {
        String myString;
        myString = "hello";
    }

    public void myAwesomeMethod04()
    {
        TextView textView1;
        textView1 = null;
    }

    public void myAwesomeMethod05()
    {
        ImageView imageView1;
        imageView1 = null;
    }
}
