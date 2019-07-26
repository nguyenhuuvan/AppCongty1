package com.lv.appcongty1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.lv.appcongty1.R;
import com.lv.appcongty1.adapter.CharityAdapter;
import com.lv.appcongty1.databinding.ActivityCharityBinding;
import com.lv.appcongty1.model.Charity;
import com.lv.appcongty1.model.CharityItem;

import java.util.ArrayList;
import java.util.List;

import spencerstudios.com.bungeelib.Bungee;

public class CharityActivity extends AppCompatActivity {
    private CharityAdapter charityAdapter;
    private List<CharityItem> charityItemList;
    private Charity charity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityCharityBinding binding  = DataBindingUtil.setContentView(this, R.layout.activity_charity);
        charity = new Charity(getString(R.string.charity_titletoolbar),getString(R.string.charity_titleAct),getString(R.string.charity_description));
        binding.setCharity(charity);
        Bungee.slideLeft(this);
        binding.setOnClickListener(new OnClickListener());

        charityItemList = new ArrayList<>();
        charityAdapter = new CharityAdapter(charityItemList);
        binding.rvCharity.setAdapter(charityAdapter);
        binding.rvCharity.hasFixedSize();
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        binding.rvCharity.setLayoutManager(manager);
        fakeData();

    }
    private void fakeData() {
        charityItemList.add(new CharityItem("End Soon", "Syria Crisis", "As violence increases in Aleppo, thousand are feeling for their lives, They are ...", 91500000, 18000000));
        charityItemList.add(new CharityItem("End Soon", "Syria Crisis", "As violence increases in Aleppo, thousand are feeling for their lives, They are ...", 91500000, 18000000));
        charityItemList.add(new CharityItem("End Soon", "Syria Crisis", "As violence increases in Aleppo, thousand are feeling for their lives, They are ...", 91500000, 18000000));
        charityItemList.add(new CharityItem("End Soon", "Syria Crisis", "As violence increases in Aleppo, thousand are feeling for their lives, They are ...", 91500000, 18000000));
        charityItemList.add(new CharityItem("End Soon", "Syria Crisis", "As violence increases in Aleppo, thousand are feeling for their lives, They are ...", 91500000, 18000000));
        charityItemList.add(new CharityItem("End Soon", "Syria Crisis", "As violence increases in Aleppo, thousand are feeling for their lives, They are ...", 91500000, 18000000));
    }
    public class OnClickListener {
        public void onBackClickListener (View view) {
            finish();
            Bungee.slideRight(CharityActivity.this);
        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Bungee.slideRight(this);
    }
}
