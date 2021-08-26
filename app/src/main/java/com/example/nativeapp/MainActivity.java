package com.example.nativeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("cycle", "onStart is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("cycle", "onResume is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("cycle", "onPause is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("cycle", "onStop is called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("cycle", "onRestart is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("cycle", "onDestroy is called");
    }
}