package com.lv.appcongty1.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lv.appcongty1.R;
import com.lv.appcongty1.adapter.PromoAdapter;
import com.lv.appcongty1.databinding.FragmentMyWalletBinding;
import com.lv.appcongty1.model.MyWallet;
import com.lv.appcongty1.model.Promo;
import com.lv.appcongty1.ui.CharityActivity;
import com.lv.appcongty1.ui.SendGiftActivity;

import java.util.ArrayList;
import java.util.List;


public class MyWalletFragment extends Fragment {
    private List<Promo> promoList;
    private PromoAdapter promoAdapter;
    private FragmentMyWalletBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_my_wallet, container, false);
        binding.setMyWallet(new MyWallet(
                getString(R.string.home_nameUser),
                getString(R.string.home_emailUser),
                getString(R.string.home_myBalance),
                getString(R.string.home_rp),
                getString(R.string.home_send),
                getString(R.string.pay),
                getString(R.string.home_topUp),
                getString(R.string.request),
                getString(R.string.home_shopping),
                getString(R.string.home_bill_payment),
                getString(R.string.home_charity),
                getString(R.string.home_send_gift),
                getString(R.string.home_split_bills),
                getString(R.string.home_cash_back),
                getString(R.string.home_promo)));

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        promoList = new ArrayList<>();

        promoAdapter = new PromoAdapter(promoList);
        binding.rvPromo.setAdapter(promoAdapter);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        binding.rvPromo.setLayoutManager(layoutManager);
        fakeData();
        binding.linearCharity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),CharityActivity.class));
            }
        });
        binding.linearSendGift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),SendGiftActivity.class));
            }
        });
    }

    private void fakeData() {
        promoList.add(new Promo(getString(R.string.home_promoname), getString(R.string.home_promodetails)));
        promoList.add(new Promo(getString(R.string.home_promoname), getString(R.string.home_promodetails)));
        promoList.add(new Promo(getString(R.string.home_promoname), getString(R.string.home_promodetails)));
        promoList.add(new Promo(getString(R.string.home_promoname), getString(R.string.home_promodetails)));
        promoList.add(new Promo(getString(R.string.home_promoname), getString(R.string.home_promodetails)));
        promoList.add(new Promo(getString(R.string.home_promoname), getString(R.string.home_promodetails)));
        promoList.add(new Promo(getString(R.string.home_promoname), getString(R.string.home_promodetails)));
    }
}
