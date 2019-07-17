package com.lv.appcongty1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lv.appcongty1.R;
import com.lv.appcongty1.databinding.ActivityRegisterStep1Binding;
import com.lv.appcongty1.databinding.ActivityRegisterStep2Binding;
import com.lv.appcongty1.model.Register_Step1;
import com.lv.appcongty1.model.Register_Step2;

public class Register_Step2_Activity extends AppCompatActivity {
    private MyClickHandlers handlers;
    private Register_Step2 register_step2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_register__step2_);
        ActivityRegisterStep2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_register__step2_);
        register_step2 = new Register_Step2("Step 2/4", "Verification", "Enter 4 digit number that send to +62900382349", "Continue","Re-send code in 0:30");
        binding.setRegisterStep2(register_step2);
        handlers = new MyClickHandlers();
        binding.setHandlers(handlers);
    }

    public class MyClickHandlers {
        public void back(View view) {
            finish();
        }
        public void continue_(View view) {
            startActivity(new Intent(Register_Step2_Activity.this, Register_Step3_Activity.class));
        }
    }
}
