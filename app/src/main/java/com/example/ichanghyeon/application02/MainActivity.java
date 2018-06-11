package com.example.ichanghyeon.application02;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

//    Button btn;
//    int clickNum = 0;

    ViewPager pager;
    PagerAdapter mAdapter;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = findViewById(R.id.pager);
        tabLayout = findViewById(R.id.tab);
        mAdapter = new PagerAdapter(getSupportFragmentManager());

        tabLayout.addTab(tabLayout.newTab().setText("1번"));
        tabLayout.addTab(tabLayout.newTab().setText("2번"));
        tabLayout.addTab(tabLayout.newTab().setText("3번"));

        pager.addOnPageChangeListener(new
                TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        pager.setAdapter(mAdapter);


//        btn = findViewById(R.id.next_btn);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clickNum++;
//                Intent intent = new Intent(MainActivity.this, SubActivity.class);
//
//                intent.putExtra("clickNum",clickNum);
//
//                startActivity(intent);
//            }
//        });
    }
}
