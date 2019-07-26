package com.lv.appcongty1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.lv.appcongty1.R;
import com.lv.appcongty1.adapter.InvestmentPagerAdapter;
import com.lv.appcongty1.databinding.ActivityInvestmentBinding;
import com.lv.appcongty1.model.Investment;

import spencerstudios.com.bungeelib.Bungee;

public class InvestmentActivity extends AppCompatActivity {
    private InvestmentPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityInvestmentBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_investment);
        binding.setInvestment(new Investment(getString(R.string.investment_titleToolbar)));
        Bungee.slideLeft(this);
        binding.setOnClickListener(new OnClickListener());

        adapter = new InvestmentPagerAdapter(getSupportFragmentManager());
        binding.viewPager.setAdapter(adapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager);
    }
    public class OnClickListener {

        public void onBackClickListener (View view) {
            finish();
            Bungee.slideRight(InvestmentActivity.this);
        }
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Bungee.slideRight(this);
    }
}
