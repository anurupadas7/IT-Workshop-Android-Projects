package com.example.it1;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

import com.example.it1.OrderActivity;
import com.example.it1.R;

public class MainActivity extends AppCompatActivity {

    public static final String MSG ="com.example.it1.ORDER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }


    public void display(View view)
    {

        Intent intent = new Intent(this, OrderActivity.class);
        EditText name = findViewById(com.example.it1.R.id.name);
        EditText roll = findViewById(com.example.it1.R.id.roll);
        EditText section = findViewById(com.example.it1.R.id.section);
        EditText college = findViewById(com.example.it1.R.id.college);
        EditText stream = findViewById(com.example.it1.R.id.stream);

        String message = "NAME: "+name.getText().toString()+"\n"
                + "ROLL: "+ roll.getText().toString()+ "\n"+
                "SECTION: " +section.getText().toString()+"\n"
                + "COLLEGE: "+ college.getText().toString()+"\n"
                + "STREAM: "+ stream.getText().toString();

        intent.putExtra(MSG,message);
        startActivity(intent);

    }
}