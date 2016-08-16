package com.example.hwhong.asynctaskproject;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;


import java.lang.ref.WeakReference;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private ArrayAdapter<String> adapter;
    private String[] compList = {"Airbnb", "Amazon", "Apple", "Beme", "Facebook", "Google", "Hipmunk",
            "Lyft", "Snapchat", "Soundcloud", "Spotify", "Twitter", "Uber", "Yelp"};

    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res = getResources();

        gridView = (GridView) findViewById(R.id.gridview);

        gridView.setAdapter(new ImageAdapter(getApplicationContext(), compList));
    }
}
