package com.example.taskonefoobar_10_8;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signUp=findViewById(R.id.text2);
        signUp.setPaintFlags(signUp.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);
    }
}