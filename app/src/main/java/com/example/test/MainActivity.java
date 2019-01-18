package com.example.test;

import android.content.Intent;
import android.renderscript.Type;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView textView_1;
    Button button_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_1 = (TextView) findViewById(R.id.textView_1);
        button_1 = (Button) findViewById(R.id.button_1);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });

        Intent callerIntent = getIntent();

        if(callerIntent != null) {
            // Not necessary, but helps in overcoming runtime errors
            // if getIntent returns a null
            Bundle extras = callerIntent.getExtras();
            if(extras != null) {
                // Read the extras
                String data = extras.getString("value");
                if(data != null) {
                    // Use the data on second activity
                    textView_1.setText(data);
                }
            }
        }
    }


}
