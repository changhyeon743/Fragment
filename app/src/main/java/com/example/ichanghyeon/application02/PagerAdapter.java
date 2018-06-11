package com.example.ichanghyeon.application02;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by ichanghyeon on 2018. 6. 11..
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new SubFragment_01();
            case 1: return new SubFragment_02();
            case 2: return new SubFragment_03();
        }
        return new SubFragment_01();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
