package com.lv.appcongty1.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.RecyclerView;

import com.lv.appcongty1.R;
import com.lv.appcongty1.databinding.ItemCharityBinding;
import com.lv.appcongty1.model.CharityItem;

import java.util.List;

public class CharityAdapter extends RecyclerView.Adapter<CharityAdapter.ViewHolder> {
    private  List<CharityItem> charityItemList;

    public CharityAdapter(List<CharityItem> charityItemList) {
        this.charityItemList = charityItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
//        View itemView = inflater.inflate(R.layout.item_charity, parent, false);
//        return new ViewHolder(itemView);
        ItemCharityBinding itemCharityBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.item_charity,parent,false);
        return new ViewHolder(itemCharityBinding);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
//        CharityItem charityItem = charityItemList.get(position);
//        holder.tvName.setText(charityItem.getName());
        //        holder.tvName.setText("Nguyễn Hữu Văn");
//        holder.tvDeadLine.setText(charityItem.getDeadline());
//        holder.tvDescription.setText(charityItem.getDescription());
//        holder.tvRpSupported.setText(""+ charityItem.getRp_Supported());
//        holder.tvRpTotal.setText("Rp "+ charityItem.getRp_Total());

        holder.setBinding(charityItemList.get(position),position);



    }

    @Override
    public int getItemCount() {
        if (charityItemList == null) return 0;
        return charityItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ObservableField<String> deadLine = new ObservableField<>();
        public ObservableField<String> name = new ObservableField<>();
        public ObservableField<String> description = new ObservableField<>();
        public ObservableField<String> rpSupported  = new ObservableField<>();
        public ObservableField<String> rpTotal = new ObservableField<>();
        private ItemCharityBinding itemCharityBinding;

         ViewHolder(ItemCharityBinding itemCharityBinding) {
            super(itemCharityBinding.getRoot());
            this.itemCharityBinding = itemCharityBinding;
        }
         void setBinding(CharityItem charityItem,int position){
            if(itemCharityBinding.getCharity()==null){
                itemCharityBinding.setCharity(this);
            }
            deadLine.set(charityItem.getDeadline());
            name.set(charityItem.getName());
            description.set(charityItem.getDescription());
            rpSupported.set("Rp " +charityItem.getRp_Supported());
            rpTotal.set("Rp "+charityItem.getRp_Total());

        }
    }

//    class ViewHolder extends RecyclerView.ViewHolder {
//        TextView tvDeadLine;
//        TextView tvName;
//        TextView tvDescription;
//        TextView tvRpSupported;
//        TextView tvRpTotal;
//
//        ViewHolder(View itemView) {
//            super(itemView);
//            tvDeadLine = itemView.findViewById(R.id.tvDeadLine);
//            tvName = itemView.findViewById(R.id.tvName);
//            tvDescription = itemView.findViewById(R.id.tvDescription);
//            tvRpSupported = itemView.findViewById(R.id.tvRp_Supported);
//            tvRpTotal = itemView.findViewById(R.id.tvRp_Total);
//        }
//
//    }
}
