package com.lv.appcongty1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lv.appcongty1.R;
import com.lv.appcongty1.databinding.ActivityRegisterStep2Binding;
import com.lv.appcongty1.model.RegisterStep2;

import spencerstudios.com.bungeelib.Bungee;

public class RegisterStep2Activity extends AppCompatActivity {
    private RegisterStep2 registerStep2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_register_step2_);
        ActivityRegisterStep2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_register_step2_);
        registerStep2 = new RegisterStep2(getString(R.string.register_step2_step), getString(R.string.register_step2_title), getString(R.string.register_step2_description), getString(R.string.register_continue),getString(R.string.register_step2_re_send));
        binding.setRegisterStep2(registerStep2);
        binding.setOnClickListener(new OnClickListener());
        Bungee.slideLeft(this);
    }

    public class OnClickListener {

        public void onBackClickListener (View view) {
            finish();
            Bungee.slideRight(RegisterStep2Activity.this);
        }
        public void onContinueClickListener (View view) {
            startActivity(new Intent(RegisterStep2Activity.this, RegisterStep3Activity.class));
        }
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Bungee.slideRight(this);
    }
}
