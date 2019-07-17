package com.lv.appcongty1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lv.appcongty1.R;
import com.lv.appcongty1.model.Register_Step1;
import com.lv.appcongty1.model.Welcome;
import com.lv.appcongty1.databinding.ActivityWelcomeBinding;

public class WecomeActivity extends AppCompatActivity {
    private Welcome welcome;
    private MyClickHandlers handlers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_welcome);

        ActivityWelcomeBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_welcome);
        welcome = new Welcome("Let's get started", "Never a better time than now to start thinking about how are manage all your finances whithease", "Creat Acount", "Log in");
        binding.setWelcome(welcome);
        handlers = new MyClickHandlers();
        binding.setHandlers(handlers);
    }
    public class MyClickHandlers {

        public void onCreat(View view) {
            startActivity(new Intent(WecomeActivity.this, Register_Step1_Activity.class));
        }
    }
}