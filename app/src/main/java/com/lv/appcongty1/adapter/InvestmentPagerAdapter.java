package com.lv.appcongty1.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.lv.appcongty1.fragment.FundFragment;
import com.lv.appcongty1.fragment.OverviewInvestmentFragment;
import com.lv.appcongty1.fragment.StockFragment;

public class InvestmentPagerAdapter extends FragmentPagerAdapter {

    public InvestmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new OverviewInvestmentFragment();
            case 1:
                return new StockFragment();
            case 2:
                return new FundFragment();
            default:
                return new OverviewInvestmentFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Overview";
            case 1:
                return "Stock";
            default:
                return "Fund";
        }
    }

}
