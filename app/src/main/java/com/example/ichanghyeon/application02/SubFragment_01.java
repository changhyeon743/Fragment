package com.example.ichanghyeon.application02;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ichanghyeon on 2018. 6. 11..
 */

public class SubFragment_01 extends Fragment{
    public SubFragment_01() {
        super();
    }

    ListView list;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.fragment_one,null);

        list = v.findViewById(R.id.List);
        ArrayList data = new ArrayList<String>();
        data.add("Data1");
        data.add("Data2");
        data.add("Data3");

        CustomAdapter adapter = new CustomAdapter(data);

        list.setAdapter(adapter);

        return v;
    }


}
