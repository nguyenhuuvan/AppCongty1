package com.lv.appcongty1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lv.appcongty1.R;
import com.lv.appcongty1.databinding.ActivityRegisterStep3Binding;
import com.lv.appcongty1.model.RegisterStep3;

import spencerstudios.com.bungeelib.Bungee;

public class RegisterStep3Activity extends AppCompatActivity {
    private RegisterStep3 registerStep3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_register__step3_);
        ActivityRegisterStep3Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_register_step3);
        registerStep3 = new RegisterStep3(getString(R.string.register_step3_step), getString(R.string.register_step3_title), getString(R.string.register_step3_description), getString(R.string.register_step3_skip),getString(R.string.register_continue));
        binding.setRegisterStep3(registerStep3);
        binding.setOnClickListener(new OnClickListener() );
        Bungee.slideLeft(this);
    }


    public class OnClickListener {

        public void onBackClickListener (View view) {
            finish();
            Bungee.slideRight(RegisterStep3Activity.this);
        }
        public void onContinueClickListener (View view) {
            startActivity(new Intent(RegisterStep3Activity.this, RegisterStep4Activity.class));
        }
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Bungee.slideRight(this);
    }
}
