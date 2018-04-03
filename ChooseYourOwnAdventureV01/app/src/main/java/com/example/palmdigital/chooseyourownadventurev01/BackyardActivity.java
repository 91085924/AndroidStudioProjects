package com.example.palmdigital.chooseyourownadventurev01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BackyardActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backyard);

        Button buttonScreamObject = findViewById(R.id.buttonLeftScream);
        Button buttonFaintObject = findViewById(R.id.buttonRightFaint);

        buttonScreamObject.setOnClickListener(this);
        buttonFaintObject.setOnClickListener(this);
    }//end of onCreate

    public void onClick()
    {
        
    }

}//end of class
