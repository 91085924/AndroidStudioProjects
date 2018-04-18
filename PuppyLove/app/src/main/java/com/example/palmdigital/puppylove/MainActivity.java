package com.example.palmdigital.puppylove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        EditText et_color1 = findViewById(R.id.et_color1);
        String et_color1Str = et_color1.getText().toString();

        EditText et_bodypart1 = findViewById(R.id.et_bodypart1);
        String et_bodypart1Str = et_bodypart1.getText().toString();

        EditText et_nouns1 = findViewById(R.id.et_nouns1);
        String et_nouns1Str = et_bodypart1.getText().toString();

        EditText et_verb1 = findViewById(R.id.et_verb1);
        String et_verb1Str = et_verb1.getText().toString();

        EditText et_adjective1 = findViewById(R.id.et_adjective1);
        String et_adjective1Str = et_adjective1.getText().toString();

        EditText et_adjective2 = findViewById(R.id.et_adjective2);
        String et_adjective2Str = et_adjective2.getText().toString();

        EditText et_verbs1 = findViewById(R.id.et_verbs1);
        String et_verbs1Str = et_verb1.getText().toString();

        EditText et_noun1 = findViewById(R.id.et_noun1);
        String et_noun1Str = et_noun1.getText().toString();

        EditText et_noun2 = findViewById(R.id.et_noun2);
        String et_noun2Str = et_noun2.getText().toString();

    }


}
