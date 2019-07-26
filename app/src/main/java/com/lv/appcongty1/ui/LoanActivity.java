package com.lv.appcongty1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.lv.appcongty1.R;
import com.lv.appcongty1.adapter.LoanPagerAdapter;
import com.lv.appcongty1.databinding.ActivityLoanBinding;
import com.lv.appcongty1.model.Loan;

import spencerstudios.com.bungeelib.Bungee;

public class LoanActivity extends AppCompatActivity {
    private LoanPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoanBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_loan);
        binding.setLoan(new Loan(getString(R.string.loan_titleToolbar)));
        Bungee.slideLeft(this);
        binding.setOnClickListener(new OnClickListener());

        adapter = new LoanPagerAdapter(getSupportFragmentManager());
        binding.viewPager.setAdapter(adapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager);


    }

    public class OnClickListener {

        public void onBackClickListener (View view) {
            finish();
            Bungee.slideRight(LoanActivity.this);
        }
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Bungee.slideRight(this);
    }
}
