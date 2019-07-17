package com.lv.appcongty1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.lv.appcongty1.R;
import com.lv.appcongty1.databinding.ActivityRegisterStep4Binding;
import com.lv.appcongty1.model.Register_Step4;

import java.util.Date;
import java.util.Objects;

public class Register_Step4_Activity extends AppCompatActivity {
    private MyClickHandlers myClickHandlers;
    private Register_Step4 register_step4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_register_step4);
        ActivityRegisterStep4Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_register_step4);
        register_step4 = new Register_Step4("Step 4/4","One step away to your acount","Now we need to verify your indentity","Use identity card","Get the full feature of your IndoAlliz! You can store up to IDR 10 Million","Without identity card","You only can store IDR 1 Million to your  IndoAlliz wallet","Continue");
        binding.setRegisterStep4(register_step4);
        myClickHandlers = new MyClickHandlers();
        binding.setHandlers(myClickHandlers);
    }
    public class MyClickHandlers {
        public void back(View view) {
            finish();
        }
        public void success(View view) {
            final AlertDialog.Builder builder = new AlertDialog.Builder(Register_Step4_Activity.this);
            LayoutInflater inflater = (LayoutInflater) Register_Step4_Activity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            @SuppressLint("InflateParams") View dialogView = inflater.inflate(R.layout.dialog_register_success, null);
            builder.setView(dialogView);
            final Dialog dialog = builder.create();
            dialog.show();
            Button success = dialogView.findViewById(R.id.btnSuccess);
            success.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {

                    startActivity(new Intent(Register_Step4_Activity.this,HomeActivity.class));
                }
            });

        }
    }
}
