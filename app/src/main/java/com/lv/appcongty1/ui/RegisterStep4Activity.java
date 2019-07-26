package com.lv.appcongty1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.lv.appcongty1.R;
import com.lv.appcongty1.databinding.ActivityRegisterStep4Binding;
import com.lv.appcongty1.model.RegisterStep4;

import spencerstudios.com.bungeelib.Bungee;

public class RegisterStep4Activity extends AppCompatActivity {
    private RegisterStep4 registerStep4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_register_step4);
        ActivityRegisterStep4Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_register_step4);
        registerStep4 = new RegisterStep4(getString(R.string.register_step4_step),getString(R.string.register_step4_title),getString(R.string.register_step4_description),getString(R.string.register_step4_title_use_card),getString(R.string.register_step4_description_use_card),getString(R.string.register_step4_title_without_card),getString(R.string.register_step4_description_without_card),getString(R.string.register_continue));
        binding.setRegisterStep4(registerStep4);
        binding.setOnClickListener(new OnClickListener());
        Bungee.slideLeft(this);
    }
    public class OnClickListener {

        public void onBackClickListener (View view) {
            finish();
            Bungee.slideRight(RegisterStep4Activity.this);
        }
        public void onSuccessClickListener(View view) {
            final AlertDialog.Builder builder = new AlertDialog.Builder(RegisterStep4Activity.this);
            LayoutInflater inflater = (LayoutInflater) RegisterStep4Activity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            @SuppressLint("InflateParams") View dialogView = inflater.inflate(R.layout.dialog_register_success, null);
            builder.setView(dialogView);
            final Dialog dialog = builder.create();
            dialog.getWindow().getAttributes().windowAnimations = R.style.zoom_center;
            dialog.show();
            Button success = dialogView.findViewById(R.id.btnSuccess);
            success.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    startActivity(new Intent(RegisterStep4Activity.this,HomeActivity.class));
                }
            });
            dialog.setCancelable(false);
        }
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Bungee.slideRight(this);
    }
}
