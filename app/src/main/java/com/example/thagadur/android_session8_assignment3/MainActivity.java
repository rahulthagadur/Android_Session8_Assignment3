package com.example.thagadur.android_session8_assignment3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    //1. Declare the objects to be used
    GridView gridView;
    ArrayAdapter<Integer> adapter;

    //3.Create integer array that holds Image View
    public static int [] versionImagesId= {
            R.drawable.gingerbread, R.drawable.honeycomb,
            R.drawable.icecream, R.drawable.jellybean,
            R.drawable.kitkat, R.drawable.lollipop
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //4.create gridView object
        gridView=(GridView)findViewById(R.id.images_grid_view);
        //set the custom adapter and call it
        gridView.setAdapter(new ImageAdapter(this,versionImagesId ));
    }
}
