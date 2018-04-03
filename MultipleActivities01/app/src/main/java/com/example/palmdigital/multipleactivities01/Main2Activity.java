package com.example.palmdigital.multipleactivities01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    Button bBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bBack = findViewById(R.id.buttonGoBack);
        bBack.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        if (v.getId() == R.id.buttonGoBack)
        {
            Intent i = new Intent(this,Main2Activity.class);
            startActivity(i);
        }
    }
}
