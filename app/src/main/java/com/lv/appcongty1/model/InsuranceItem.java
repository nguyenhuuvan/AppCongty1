package com.lv.appcongty1.model;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class InsuranceItem {
    private int image;
    private String name,rp,time;

    public InsuranceItem(int image, String name, String rp, String time) {
        this.image = image;
        this.name = name;
        this.rp = rp;
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    @BindingAdapter({ "setImgInsurance" })
    public static void setImage(ImageView imageView, Integer src) {
        imageView.setImageResource(src);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRp() {
        return rp;
    }

    public void setRp(String rp) {
        this.rp = rp;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
