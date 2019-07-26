package com.lv.appcongty1.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.RecyclerView;

import com.lv.appcongty1.R;
import com.lv.appcongty1.databinding.ItemMyInsuranceBinding;
import com.lv.appcongty1.model.InsuranceItem;

import java.util.List;

public class InsuranceAdapter extends RecyclerView.Adapter<InsuranceAdapter.ViewHolder> {

    private List<InsuranceItem> insuranceItems;

    public InsuranceAdapter(List<InsuranceItem> insuranceItems) {
        this.insuranceItems = insuranceItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMyInsuranceBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_my_insurance, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setBinding(insuranceItems.get(position), position);
    }

    @Override
    public int getItemCount() {
        if (insuranceItems == null) return 0;
        return insuranceItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ObservableField<String> name = new ObservableField<>();
        public ObservableField<String> rp = new ObservableField<>();
        public ObservableField<String> time = new ObservableField<>();
        public ObservableField<Integer> img = new ObservableField<>();
        private ItemMyInsuranceBinding binding;

        ViewHolder(ItemMyInsuranceBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void setBinding(InsuranceItem insurance, int position) {
            if (binding.getInsurance() == null) {
                binding.setInsurance(this);
            }
            name.set(insurance.getName());
            rp.set(insurance.getRp());
            time.set(insurance.getTime());
            img.set(insurance.getImage());

        }
    }
}
