package com.classassignment.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.classassignment.myapplication.adapter.ViewPagerAdapter;
import com.classassignment.myapplication.fragments.Login;
import com.classassignment.myapplication.fragments.Signup;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        tabId = findViewById(R.id.tabId);

        tabId.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new Login(), "Login");
        viewPagerAdapter.addFragment(new Signup(), "Signup");

        viewPager.setAdapter(viewPagerAdapter);
        tabId.setupWithViewPager(viewPager);
    }
}
