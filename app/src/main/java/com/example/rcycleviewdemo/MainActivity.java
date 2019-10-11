package com.example.rcycleviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView progamminglist =(RecyclerView)findViewById(R.id.programminglist);
        int numberofcolom =3;
       // progamminglist.setLayoutManager(new LinearLayoutManager(this)); list or vertical
//        progamminglist.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        progamminglist.setLayoutManager(new GridLayoutManager(this,numberofcolom));
        String[] lan={"hindi","englis","marathi","Urdu","Hidndu","Laptop","Computer","Bottle"};
        progamminglist.setAdapter(new ProgrammingAdapter(lan));


    }
}
