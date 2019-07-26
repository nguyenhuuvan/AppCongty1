package com.lv.appcongty1.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.RecyclerView;

import com.lv.appcongty1.R;
import com.lv.appcongty1.databinding.ItemGiftBinding;
import com.lv.appcongty1.model.GiftItem;

import java.util.List;

public class GiftAdapter extends RecyclerView.Adapter<GiftAdapter.ViewHolder> {
    private List<GiftItem> giftList;

    public GiftAdapter(List<GiftItem> giftList) {
        this.giftList = giftList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemGiftBinding itemGiftBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_gift, parent, false);
        return new ViewHolder(itemGiftBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.setBinding(giftList.get(position),position);
    }

    @Override
    public int getItemCount() {
        if (giftList == null) return 0;
        return giftList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ObservableField<String> nameGift = new ObservableField<>();
        public ObservableField<Integer> imgGift = new ObservableField<>();
        private ItemGiftBinding itemGiftBinding;

         ViewHolder(ItemGiftBinding itemGiftBinding) {
            super(itemGiftBinding.getRoot());
            this.itemGiftBinding = itemGiftBinding;
        }
        void setBinding(GiftItem giftItem, int position){
            if(itemGiftBinding.getGift()==null){
                itemGiftBinding.setGift(this);
            }
            nameGift.set(giftItem.getNameGift());
            imgGift.set(giftItem.getImgGift());

        }
    }
}
