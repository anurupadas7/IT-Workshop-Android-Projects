package com.example.it1;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(com.example.it1.R.layout.activity_order);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        Intent intent = getIntent();
        String message = intent.getStringExtra(com.example.it1.MainActivity.MSG);
        TextView textView = findViewById(com.example.it1.R.id.order);
        textView.setText(message);
    }
}
