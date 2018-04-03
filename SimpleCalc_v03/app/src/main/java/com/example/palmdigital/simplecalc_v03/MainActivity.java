package com.example.palmdigital.simplecalc_v03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        TextView textViewNum1Display;
        TextView textViewNum2Display;
        TextView textViewOutput;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewNum1Display = findViewById(R.id.tv_Num1Display);
        textViewNum2Display = findViewById(R.id.tvNum2Display);
        textViewOutput = findViewById(R.id.tv_output);

        ImageView imageView0 = findViewById(R.id.imageView_0_t);
        ImageView imageView1 = findViewById(R.id.imageView_1_t);
        ImageView imageView2 = findViewById(R.id.imageView_2_t);
        ImageView imageView3 = findViewById(R.id.imageView_3_t);

    }
}
