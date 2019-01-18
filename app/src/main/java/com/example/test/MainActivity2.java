package com.example.test;

import android.content.Intent;
import android.preference.EditTextPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity2 extends AppCompatActivity{

    EditText editText;
    Button button_2;
    TextView textView_11;
    TextView textView_1;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView_11 = (TextView)findViewById(R.id.textView_11);
        editText = (EditText)findViewById(R.id.editText);
        button_2 = (Button) findViewById(R.id.button_2);
        btnClick();
    }

    private void btnClick(){
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String value = editText.getText().toString();
               textView_11.setText(""+value);
            }
        });
    }


}
