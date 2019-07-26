package com.lv.appcongty1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lv.appcongty1.R;
import com.lv.appcongty1.model.Welcome;
import com.lv.appcongty1.databinding.ActivityWelcomeBinding;
public class WecomeActivity extends AppCompatActivity {
    private Welcome welcome;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityWelcomeBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_welcome);
        welcome = new Welcome(getString(R.string.welcome_title), getString(R.string.welcome_description), getString(R.string.welcome_creat_acount), getString(R.string.welcome_log_in));
        binding.setWelcome(welcome);
        binding.setOnClickListener(new OnClickListener());
    }

    public class OnClickListener {

        public void onCreatAcount(View view) {
            startActivity(new Intent(WecomeActivity.this, RegisterStep1Activity.class));
        }
    }
}