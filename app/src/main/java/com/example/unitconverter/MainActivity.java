package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    private  TextView textView2;
    private TextView Result;




    public MainActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.headline);
        editText= findViewById(R.id.edittext);
        textView2= findViewById(R.id.textView2);
        Result = findViewById(R.id.Result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Submit is work ", Toast.LENGTH_SHORT).show();
           String s = Result.getText().toString();
           int kg = Integer.parseInt(s);
           double pound= 2.205 * kg;
           Result.setText("The pound value is "+ pound);

// hie

            }

        });




    }
}