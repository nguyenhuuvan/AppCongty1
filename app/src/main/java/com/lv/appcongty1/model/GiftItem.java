package com.lv.appcongty1.model;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class GiftItem {
    private Integer imgGift;
    private String nameGift;

    public GiftItem(int imgGift, String nameGift) {
        this.imgGift = imgGift;
        this.nameGift = nameGift;
    }

    public int getImgGift() {
        return imgGift;
    }
    @BindingAdapter({ "imageUrl" })
    public static void setImgGift(ImageView imageView,  Integer src) {
        imageView.setImageResource(src);
    }

    public String getNameGift() {
        return nameGift;
    }

    public void setNameGift(String nameGift) {
        this.nameGift = nameGift;
    }
}
