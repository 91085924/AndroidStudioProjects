package com.example.palmdigital.chooseyourownadventurev01;

import  android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExploreActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        Button buttonBackyardObject = findViewById(R.id.buttonLeftBackyard);
        Button buttonToiletObject = findViewById(R.id.buttonRightToilet);
        buttonBackyardObject.setOnClickListener(this);
        buttonToiletObject.setOnClickListener(this);
    }//end of create

    public void onClick(View v)
    {
        if(v.getId() == R.id.buttonLeftBackyard)
        {
            Intent i = new Intent(this, BackyardActivity.class);
            startActivity(i);
        }
        else
        {
            Intent i = new Intent(this, ToiletActivity.class);
            startActivity(i);
        }
    }
}
