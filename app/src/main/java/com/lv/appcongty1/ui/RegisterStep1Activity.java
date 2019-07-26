package com.lv.appcongty1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lv.appcongty1.R;
import com.lv.appcongty1.databinding.ActivityRegisterStep1Binding;
import com.lv.appcongty1.model.RegisterStep1;

import spencerstudios.com.bungeelib.Bungee;

public class RegisterStep1Activity extends AppCompatActivity {
    private RegisterStep1 registerStep1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_register_step1);
        ActivityRegisterStep1Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_register_step1);
        registerStep1 = new RegisterStep1(getString(R.string.register_step1_step), getString(R.string.register_step1_title), getString(R.string.register_step1_description), getString(R.string.register_continue));
        binding.setRegisterStep1(registerStep1);
        binding.setOnClickListener(new OnClickListener());
        Bungee.slideLeft(this);
    }
    public class OnClickListener {

        public void onBackClickListener (View view) {
            finish();
            Bungee.slideRight(RegisterStep1Activity.this);
        }
        public void onContinueClickListener (View view) {

            startActivity(new Intent(RegisterStep1Activity.this, RegisterStep2Activity.class));
        }
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Bungee.slideRight(this);
    }
}
