package com.example.palmdigital.numguess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Answer = findViewById(R.id.Answer);
        Answer.setOnClickListener(this);
    }

    public void onClick(View view)
    {


    }
}
