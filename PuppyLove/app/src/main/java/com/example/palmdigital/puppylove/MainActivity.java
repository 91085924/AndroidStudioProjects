package com.example.palmdigital.puppylove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
        String et_nouns1Str = et_nouns1.getText().toString();

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

        String story = "Today I saw him again. When he looks at me with those ";
        story += et_color1Str;
        story += " eyes,it makes my ";
        story += et_bodypart1Str;
        story += " go pitterpat, and I feel as if I have ";
        story += et_nouns1Str;
        story += " in my stomach. When he scrunches his nose, I want to ";
        story += et_verb1Str;
        story += " him softly.He is so ";
        story += et_adjective1Str;
        story += " and ";
        story += et_adjective2Str;
        story += " .Tomorrow he will be mine. For now he ";
        story += et_verbs1Str;
        story += " in the store ";
        story += et_noun1Str;
        story += " looking at me. ";
        story += et_noun2Str;
        story += " love is hard to resist! ";

        TextView output = findViewById(R.id.tv_output);
        output.setText(story);

    }


}
