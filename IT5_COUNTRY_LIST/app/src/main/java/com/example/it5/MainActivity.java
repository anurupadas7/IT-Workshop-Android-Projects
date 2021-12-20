package com.example.it5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ListView myListView = findViewById(R.id.myListView);
        ArrayList<String> grocery = new ArrayList<>();

        grocery.add("India");
        grocery.add("Bangladesh");
        grocery.add("Japan");
        grocery.add("USA");
        grocery.add("UK");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,grocery);
        myListView.setAdapter((arrayAdapter));


        ArrayList<String> grocery2 = new ArrayList<>();

        grocery2.add("Delhi");
        grocery2.add("Dhaka");
        grocery2.add("Tokyo");
        grocery2.add("Washington DC");
        grocery2.add("London");

        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,grocery);
        myListView.setAdapter((arrayAdapter2));


        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = "Item" + position + "" + view.toString();
//                Toast.makeText(MainActivity.this, "CAPITAL: "+ grocery2.get(position)+ "", Toast.LENGTH_SHORT).show();
                display= findViewById(R.id.output);
                display.setText(grocery2.get(position));

            }
        });
    }
}