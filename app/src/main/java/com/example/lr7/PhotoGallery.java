package com.example.lr7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PhotoGallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallert_activity);

        final RecyclerView rv = findViewById(R.id.rView);
        rv.setLayoutManager(new GridLayoutManager(this, 3));
    }
}
