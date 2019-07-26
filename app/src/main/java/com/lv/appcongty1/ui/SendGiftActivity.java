package com.lv.appcongty1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lv.appcongty1.R;
import com.lv.appcongty1.adapter.GiftAdapter;
import com.lv.appcongty1.databinding.ActivitySendGiftBinding;
import com.lv.appcongty1.model.Gift;
import com.lv.appcongty1.model.GiftItem;

import java.util.ArrayList;
import java.util.List;

import spencerstudios.com.bungeelib.Bungee;

public class SendGiftActivity extends AppCompatActivity {
    private Gift gift;
    private List<GiftItem> giftList;
    private GiftAdapter giftAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bungee.split(this);
        gift = new Gift(getString(R.string.sendgift_titletoolbar), getString(R.string.sendgift_titleAct), getString(R.string.sendgift_description), getString(R.string.register_continue));
        ActivitySendGiftBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_send_gift);
        binding.setOnClickListener(new OnClickListener());
        binding.setSendgift(gift);
        Bungee.slideLeft(this);

        giftList = new ArrayList<>();
        giftAdapter = new GiftAdapter(giftList);
        binding.rvGift.setAdapter(giftAdapter);
        binding.rvGift.hasFixedSize();
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        binding.rvGift.setLayoutManager(manager);
        fakeData();
    }

    private void fakeData() {
        giftList.add(new GiftItem(R.drawable.gift2, "Birthday"));
        giftList.add(new GiftItem(R.drawable.gift1, "Chinese New Year"));
        giftList.add(new GiftItem(R.drawable.gift3, "Eid Mubarak"));
        giftList.add(new GiftItem(R.drawable.gift1, "Chinese New Year"));
        giftList.add(new GiftItem(R.drawable.gift2, "Birthday"));
        giftList.add(new GiftItem(R.drawable.gift3, "Eid Mubarak"));
    }

    public class OnClickListener {
        public void onBackClickListener(View view) {
            finish();
            Bungee.slideRight(SendGiftActivity.this);
        }

        public void onContinueClickListener(View view) {

            startActivity(new Intent(SendGiftActivity.this, SendGiftSuccessAcivity.class));

        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Bungee.slideRight(this);
    }
}
