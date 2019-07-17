package com.lv.appcongty1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lv.appcongty1.R;
import com.lv.appcongty1.databinding.ActivityRegisterStep1Binding;
import com.lv.appcongty1.databinding.ActivityRegisterStep3Binding;
import com.lv.appcongty1.model.Register_Step3;

public class Register_Step3_Activity extends AppCompatActivity {
    private MyClickHandlers myClickHandlers;
    private Register_Step3 register_step3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_register__step3_);
        ActivityRegisterStep3Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_register_step3);
        register_step3 = new Register_Step3("Step 3/4", "Fingerprint", "To add your fingerprint, lift and rest your finger at homebutton repeatedly (optional)", "Skip This Step ->","Continue");
        binding.setRegisterStep3(register_step3);
        myClickHandlers = new MyClickHandlers();
        binding.setHandlers(myClickHandlers);
    }

    public class MyClickHandlers {
        public void back(View view) {
            finish();
        }
        public void continue_(View view) {
            startActivity(new Intent(Register_Step3_Activity.this, Register_Step4_Activity.class));
        }
    }
}
