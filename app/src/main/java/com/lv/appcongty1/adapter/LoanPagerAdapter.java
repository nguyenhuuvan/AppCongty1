package com.lv.appcongty1.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.lv.appcongty1.fragment.AccountFragment;
import com.lv.appcongty1.fragment.CalculatorFragment;
import com.lv.appcongty1.fragment.OverviewLoanFragment;

public class LoanPagerAdapter extends FragmentPagerAdapter {

    public LoanPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new OverviewLoanFragment();
            case 1:
                return new AccountFragment();
            case 2:
                return new CalculatorFragment();
            default:
                return new OverviewLoanFragment();
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
                return "Account";
            default:
                return "Calculator";
        }
    }

}

