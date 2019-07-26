package com.lv.appcongty1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lv.appcongty1.R;
import com.lv.appcongty1.model.Promo;

import java.util.List;

public class PromoAdapter extends RecyclerView.Adapter<PromoAdapter.ViewHolder> {
private final List<Promo> promoList;

    public PromoAdapter(List<Promo> promoList) {
        this.promoList = promoList;
    }


    @NonNull
@Override
public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_promo, parent, false);
        return new ViewHolder(itemView);
        }

@Override
public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Promo promo = promoList.get(position);
        holder.tvName.setText(promo.getName());
        holder.tvDetails.setText(promo.getDetails());
        }

@Override
public int getItemCount() {
        if (promoList == null) return 0;
        return promoList.size();
        }

class ViewHolder extends RecyclerView.ViewHolder {
    final TextView tvName;
    final TextView tvDetails;

    ViewHolder(View itemView) {
        super(itemView);
        tvDetails = itemView.findViewById(R.id.tvPromoDetails);
        tvName = itemView.findViewById(R.id.tvPromoName);
    }

}
}
