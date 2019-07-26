package com.lv.appcongty1.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.lv.appcongty1.fragment.InsightFragment;
import com.lv.appcongty1.fragment.MyWalletFragment;
import com.lv.appcongty1.fragment.ToolFragment;

public class HomePagerAdapter extends FragmentPagerAdapter {

    public HomePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MyWalletFragment();
            case 1:
                return new InsightFragment();
            case 2:
                return new ToolFragment();
            default:
                return new MyWalletFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

}
