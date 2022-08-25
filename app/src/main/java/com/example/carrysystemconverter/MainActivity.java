package com.example.carrysystemconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText kg;
    EditText g;
    double last_value_kg;
    double last_value_g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kg=(EditText)findViewById(R.id.edit_kg);
        g=(EditText)findViewById(R.id.edit_g);
        last_value_kg=Double.parseDouble(kg.getText().toString());
        last_value_g=Double.parseDouble(g.getText().toString());
    }

    public void button_calculate_onclick(View view){
        double value_kg=Double.parseDouble(kg.getText().toString());
        double value_g=Double.parseDouble(g.getText().toString());
        int change=1;
        if(value_kg!=last_value_kg){
            change=1;
        }
        else if(value_g!=last_value_g){
            change=2;
            //Toast.makeText(this,"hello world", Toast.LENGTH_SHORT).show();
        }
        switch(change){
            case 1:
                g.setText(value_kg * 1000 + "");
                last_value_kg=Double.parseDouble(kg.getText().toString());
                last_value_g=Double.parseDouble(g.getText().toString());
                break;
            case 2:
                kg.setText(value_g / 1000 + "");
                last_value_kg=Double.parseDouble(kg.getText().toString());
                last_value_g=Double.parseDouble(g.getText().toString());
        }
    }
}