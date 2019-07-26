package com.lv.appcongty1.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.lv.appcongty1.R;

import spencerstudios.com.bungeelib.Bungee;

public class SendGiftSuccessAcivity extends AppCompatActivity {
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_gift_success_acivity);
        Bungee.fade(this);
        progressBar = findViewById(R.id.progressbar);

        RunAble runAble = new RunAble();
        new Thread(runAble).start();
    }

    class RunAble implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(1500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new Runnable() {
                @Override
                public void run() {
                    final AlertDialog.Builder builder = new AlertDialog.Builder(SendGiftSuccessAcivity.this);
                    LayoutInflater inflater = (LayoutInflater) SendGiftSuccessAcivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    @SuppressLint("InflateParams") View dialogView = inflater.inflate(R.layout.dialog_send_gift_success, null);
                    builder.setView(dialogView);
                    final Dialog dialog = builder.create();
                    dialog.getWindow().getAttributes().windowAnimations = R.style.zoom_center;
                    dialog.show();
                    Button success = dialogView.findViewById(R.id.btnSuccess);
                    success.setOnClickListener(new View.OnClickListener() {
                        @SuppressLint("SetTextI18n")
                        @Override
                        public void onClick(View v) {
                            finish();
                            Bungee.fade(SendGiftSuccessAcivity.this);
                        }
                    });
                    dialog.setCancelable(false);
                }
            });


        }
    }
}
