package com.lv.appcongty1.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lv.appcongty1.R;
import com.lv.appcongty1.databinding.FragmentInsightBinding;
import com.lv.appcongty1.model.Insight;
import com.lv.appcongty1.ui.InsuranceActivity;
import com.lv.appcongty1.ui.InvestmentActivity;
import com.lv.appcongty1.ui.LoanActivity;

import java.util.List;


public class InsightFragment extends Fragment {

    private List<Insight> insightList;
    private FragmentInsightBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_insight, container, false);
        binding.setInsight(new Insight(
                getString(R.string.insight_status),
                getString(R.string.insight_status_description),
                getString(R.string.insight_cashflow),
                getString(R.string.insight_loan),
                getString(R.string.insight_insurance),
                getString(R.string.insight_investment),
                getString(R.string.insight_name),
                getString(R.string.insight_content),
                getString(R.string.insight_askmore)

        ));

        return binding.getRoot();
    }
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            binding.circleStatus.setValueAnimated(0,80,1500);

            binding.circleCashFlow.setValueAnimated(0,80,1500);
            binding.circleInsurance.setValueAnimated(0,70,1500);
            binding.circleInvestment.setValueAnimated(0,60,1500);
            binding.circleLoan.setValueAnimated(0,50,1500);
        }
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.linearLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), LoanActivity.class));
            }
        });
        binding.linearInvestment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), InvestmentActivity.class));
            }
        });
        binding.linearInsurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), InsuranceActivity.class));
            }
        });
    }
}
