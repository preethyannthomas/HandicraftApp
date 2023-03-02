package com.example.handicraftapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle; import java.util.ArrayList;
import java.util.List; public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private HandicraftAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<HandicraftItem> mHandicraftList;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buildRecyclerView();
        createHandicraftList();
    }
    private void createHandicraftList() {
        mHandicraftList = new ArrayList<>();
        mHandicraftList.add(new HandicraftItem(R.drawable.handicraft1, "Handicraft Item 1", "This is the description for Handicraft Item 1", 19.99));
        mHandicraftList.add(new HandicraftItem(R.drawable.handicraft2, "Handicraft Item 2", "This is the description for Handicraft Item 2", 25.99));
        mHandicraftList.add(new HandicraftItem(R.drawable.handicraft3, "Handicraft Item 3", "This is the description for Handicraft Item 3", 14.99));
        mHandicraftList.add(new HandicraftItem(R.drawable.handicraft4, "Handicraft Item 4", "This is the description for Handicraft Item 4", 29.99));
        mHandicraftList.add(new HandicraftItem(R.drawable.handicraft5, "Handicraft Item 5", "This is the description for Handicraft Item 5", 21.99));
        mHandicraftList.add(new HandicraftItem(R.drawable.handicraft6, "Handicraft Item 6", "This is the description for Handicraft Item 6", 16.99));
        mHandicraftList.add(new HandicraftItem(R.drawable.handicraft7, "Handicraft Item 7", "This is the description for Handicraft Item 7", 12.99));
        mHandicraftList.add(new HandicraftItem(R.drawable.handicraft8, "Handicraft Item 8", "This is the description for Handicraft Item 8", 17.99));
    }
    private void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new HandicraftAdapter(mHandicraftList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}




