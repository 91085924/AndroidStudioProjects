package com.example.palmdigital.javaexpression1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 10;
        String b = " Alan Turing";
        boolean c = true;

        Log.i(tag: "info", msg: "Hello, Android!");
        Log.i(tag: "info", msg: "a = " + a);
        Log.i(tag: "info", msg: "b = " + b);
        Log.i(tag: "info", msg: "c = " + c);
        a++;
        Log.i(tag: "info", msg: "a = " + a);
        Log.i(tag: "info", msg: "c = " + (1 + 1 == 3));

        float myFloat = 4.0f;
        double myDouble = 42.0;
        int result = myAwesomeFunction();
        Log.i(tag:"info", msg:"myAwesomeFunction returned = " + results);

        Log.i(tag:"info", msg:"myFloat function returned = " + myFloatReturner);

        Log.i(tag:"info", msg:"myReturn returned = " + myReturner);
        //Challenge: make a method that returns void that logs something out to the logcat
        //      the console


        
    }//end of onCreate method
    int myReturner()
    {
        return 10;
    }


    int myAwesomeFunction()
    {
    return 1000;
    }

    //return float
    float myFloatReturner()
    {
        return 100.0f;
    }

}// end of class Main Activity

