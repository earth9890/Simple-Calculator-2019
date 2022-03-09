package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int x = 0;
    public int y = 0;
    public int z;
    public String e1;
    public String e2;
    EditText t2, t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        //convert value into int
        Button b1 = (Button) findViewById(R.id.button);
        Button b2 = (Button) findViewById(R.id.subtract);
        Button b3 = (Button) findViewById(R.id.multiply);
        Button b4 = (Button) findViewById(R.id.division);
        Button b5  = findViewById(R.id.button2);
        t1 = (EditText) findViewById(R.id.textView2);
        t2 = (EditText) findViewById(R.id.textView3);
        TextView tv_data = (TextView) findViewById(R.id.textView);
        e1 = t1.getText().toString();
        e2 = t1.getText().toString();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                e1 = t1.getText().toString();
                e2 = t1.getText().toString();
                if (TextUtils.isEmpty(e1) || TextUtils.isEmpty(e2)) {
                    tv_data.setText("Enter Number Please");
                } else {
                    x = Integer.parseInt(t1.getText().toString());
                    y = Integer.parseInt(t2.getText().toString());
                    z = x + y;
                    tv_data.setText("The Additon  is " + z);

                }
            }


        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                e1 = t1.getText().toString();
                e2 = t1.getText().toString();
                if (e1.isEmpty() || e2.isEmpty()) {
                    tv_data.setText("Enter Number Please");
                } else {
                    x = Integer.parseInt(t1.getText().toString());
                    y = Integer.parseInt(t2.getText().toString());
                    z = x - y;
                    tv_data.setText("The Substraction  is " + z);

                }
            }


        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1 = t1.getText().toString();
                e2 = t1.getText().toString();

                if (e1.isEmpty() || e2.isEmpty()) {
                    tv_data.setText("Enter Number Please");
                } else {
                    x = Integer.parseInt(t1.getText().toString());
                    y = Integer.parseInt(t2.getText().toString());
                    z = x * y;
                    tv_data.setText("The Multiplication  is " + z);

                }
            }


        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;

                e1 = t1.getText().toString();
                e2 = t1.getText().toString();
                if (e1.isEmpty() || e2.isEmpty()) {
                    tv_data.setText("Enter Number Please");
                } else {
                    x = Integer.parseInt(t1.getText().toString());
                    y = Integer.parseInt(t2.getText().toString());
                    z = x / y;
                    tv_data.setText("The Division  is " + z);

                }
            }


        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("");
                t2.setText("");
            }
        });

    }
}



