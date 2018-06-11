package com.example.ichanghyeon.application02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

//        int temp = getIntent().getIntExtra("clickNum",0);
//
//        Toast.makeText(this,temp+"",Toast.LENGTH_LONG).show();
    }
}
