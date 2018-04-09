package com.example.palmdigital.chooseyourownadventurev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ToiletActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toilet);

        Button buttonYesObject = findViewById(R.id.buttonLeftYes);
        Button buttonHeckYesObject = findViewById(R.id.buttonRightHeckYes);
        buttonYesObject.setOnClickListener(this);
        buttonHeckYesObject.setOnClickListener(this);
    }

    public void onClick(View v)
        if(v.getId() == R.id.buttonLeftYes)
    {
        Intent i = new Intent(this, YesActivity.class);
        startActivity(i);
    }
    else
    {
        Intent i = new Intent(this,HeckYesActivty.class);
        startActivity(i);
    }
}
