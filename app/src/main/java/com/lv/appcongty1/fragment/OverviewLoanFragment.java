package com.lv.appcongty1.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.lv.appcongty1.R;
import com.lv.appcongty1.databinding.FragmentOverviewBinding;
import com.lv.appcongty1.model.Overview;

public class OverviewLoanFragment extends Fragment {
    private FragmentOverviewBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_overview, container, false);
        binding.setOverview(new Overview(getString(R.string.overview_total_loan), getString(R.string.overview_total_rp), getString(R.string.overview_eaened), getString(R.string.overview_eaened_rp), getString(R.string.overview_good_balance),
                getString(R.string.overview_good_balance_des), getString(R.string.overview_spend), getString(R.string.overview_spend_rp), getString(R.string.overview_top_spending),
                getString(R.string.overview_rent), getString(R.string.overview_utility), getString(R.string.overview_transport), getString(R.string.overview_food), getString(R.string.overview_good_utility_des),
                getString(R.string.overview_monthly_bubget), getString(R.string.overview_transportation), getString(R.string.overview_rp_day), getString(R.string.overview_transport_rp),
                getString(R.string.overview_transport_rp2), getString(R.string.overview_good_transportation_des)));
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imgExpandSpending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.expanSpending.isExpanded()) {
                    binding.imgExpandSpending.setImageResource(R.drawable.expand);
                } else {
                    binding.imgExpandSpending.setImageResource(R.drawable.collapse);
                }
                binding.expanSpending.toggle();
            }
        });
        binding.imgExpandMonthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.expanMonthly.isExpanded()) {
                    binding.imgExpandMonthly.setImageResource(R.drawable.expand);
                } else {
                    binding.imgExpandMonthly.setImageResource(R.drawable.collapse);
                }
                binding.expanMonthly.toggle();
            }
        });
    }

}
