package com.lv.appcongty1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lv.appcongty1.R;
import com.lv.appcongty1.databinding.ActivityRegisterStep1Binding;
import com.lv.appcongty1.model.Register_Step1;

public class Register_Step1_Activity extends AppCompatActivity {
    private Register_Step1 register_step1;
    private MyClickHandlers handlers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_register__step1);
        ActivityRegisterStep1Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_register__step1);
        register_step1 = new Register_Step1("Step 1/4", "Registration", "Enter your mobile number, we will send you OTP to verify later", "Continue");
        binding.setRegisterStep1(register_step1);
        handlers = new MyClickHandlers();
        binding.setHandlers(handlers);
    }
    public class MyClickHandlers {

        public void back(View view) {
            finish();
        }
        public void continue_(View view) {
            startActivity(new Intent(Register_Step1_Activity.this, Register_Step2_Activity.class));
        }
    }
}
