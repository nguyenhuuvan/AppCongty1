package com.lv.appcongty1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import com.lv.appcongty1.R;
import com.lv.appcongty1.RadarMarkerView;
import com.lv.appcongty1.adapter.InsuranceAdapter;
import com.lv.appcongty1.databinding.ActivityInsuranceBinding;
import com.lv.appcongty1.model.Insurance;
import com.lv.appcongty1.model.InsuranceItem;

import java.util.ArrayList;
import java.util.List;

import spencerstudios.com.bungeelib.Bungee;

public class InsuranceActivity extends AppCompatActivity {
    private RadarChart chart;
    private ActivityInsuranceBinding binding;
    private InsuranceAdapter adapter;
    private List<InsuranceItem> insuranceItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_insurance);
        binding.setInsurance(new Insurance(
                getString(R.string.insurance_title),
                getString(R.string.insurance_life_),
                getString(R.string.insurance_get),
                getString(R.string.insurance_buy),
                getString(R.string.insurance_house),
                getString(R.string.insurance_health),
                getString(R.string.insurance_vehical),
                getString(R.string.insurance_disability),
                getString(R.string.insurance_my)));
        Bungee.slideLeft(this);
        binding.setOnClickListener(new OnClickListener());

        insuranceItemList = new ArrayList<>();
        adapter = new InsuranceAdapter(insuranceItemList);
        binding.rvInsurance.setAdapter(adapter);
        binding.rvInsurance.hasFixedSize();
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        binding.rvInsurance.setLayoutManager(manager);
        fakeData();
        setChartView();

    }

    private void fakeData() {
        insuranceItemList.add(new InsuranceItem(R.drawable.health,"Health Insurance","Rp 1.200.000","Due on 12/12/17"));
        insuranceItemList.add(new InsuranceItem(R.drawable.house,"Health Insurance","Rp 1.200.000","Due on 12/12/17"));
        insuranceItemList.add(new InsuranceItem(R.drawable.vehical,"Health Insurance","Rp 1.200.000","Due on 12/12/17"));
        insuranceItemList.add(new InsuranceItem(R.drawable.disability,"Health Insurance","Rp 1.200.000","Due on 12/12/17"));
        insuranceItemList.add(new InsuranceItem(R.drawable.health,"Health Insurance","Rp 1.200.000","Due on 12/12/17"));
        insuranceItemList.add(new InsuranceItem(R.drawable.house,"Health Insurance","Rp 1.200.000","Due on 12/12/17"));
    }

    public class OnClickListener {
        public void onBackClickListener(View view) {
            finish();
            Bungee.slideRight(InsuranceActivity.this);
        }

        public void onExpandListener(View view) {
            if (binding.expandableLayout.isExpanded()) {
                binding.imgExpandBuy.setImageResource(R.drawable.expand);
            } else {
                binding.imgExpandBuy.setImageResource(R.drawable.collapse);
            }
            binding.expandableLayout.toggle();
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Bungee.slideRight(this);
    }

    private void setChartView() {
        chart = findViewById(R.id.chart1);
        chart.setBackgroundColor(Color.rgb(255, 255, 255));

        chart.getDescription().setEnabled(false);

        chart.setWebLineWidth(1f);
        chart.setWebColor(Color.LTGRAY);
        chart.setWebLineWidthInner(1f);
        chart.setWebColorInner(Color.LTGRAY);
        chart.setWebAlpha(100);

        // create a custom MarkerView (extend MarkerView) and specify the layout
        // to use for it
        MarkerView mv = new RadarMarkerView(this, R.layout.makerview);
        mv.setChartView(chart); // For bounds control
        chart.setMarker(mv); // Set the marker to the chart

        setData();

        chart.animateXY(1400, 1400, Easing.EaseInOutQuad);

        XAxis xAxis = chart.getXAxis();
        xAxis.setTextSize(9f);
        xAxis.setYOffset(0f);
        xAxis.setXOffset(0f);
        xAxis.setValueFormatter(new ValueFormatter() {

            private final String[] mActivities = new String[]{getString(R.string.insurance_health), getString(R.string.insurance_life), getString(R.string.insurance_house), getString(R.string.insurance_disability), getString(R.string.insurance_other), getString(R.string.insurance_vehical)};

            @Override
            public String getFormattedValue(float value) {
                return mActivities[(int) value % mActivities.length];
            }
        });
        xAxis.setTextColor(Color.BLACK);

        YAxis yAxis = chart.getYAxis();
        yAxis.setLabelCount(6, false);
        yAxis.setTextSize(9f);
        yAxis.setAxisMinimum(0f);
        yAxis.setAxisMaximum(80f);
        yAxis.setDrawLabels(false);
    }

    private void setData() {

        float mul = 80;
        float min = 20;
        int cnt = 6;

        ArrayList<RadarEntry> entries1 = new ArrayList<>();
        ArrayList<RadarEntry> entries2 = new ArrayList<>();

        // NOTE: The order of the entries when being added to the entries array determines their position around the center of
        // the chart.
        for (int i = 0; i < cnt; i++) {
            float val1 = (float) (Math.random() * mul) + min;
            entries1.add(new RadarEntry(val1));

            float val2 = (float) (Math.random() * mul) + min;
            entries2.add(new RadarEntry(val2));
        }

        RadarDataSet set1 = new RadarDataSet(entries1, "House");
        set1.setColor(Color.rgb(255, 0, 0));
        set1.setFillColor(Color.rgb(254, 153, 74));
        set1.setDrawFilled(true);
        set1.setFillAlpha(180);
        set1.setLineWidth(1f);
        set1.setDrawHighlightCircleEnabled(true);
        set1.setDrawHighlightIndicators(false);

        ArrayList<IRadarDataSet> sets = new ArrayList<>();
        sets.add(set1);

        RadarData data = new RadarData(sets);
        data.setValueTextSize(8f);
        data.setDrawValues(false);
        data.setValueTextColor(Color.WHITE);

        chart.setData(data);
        chart.invalidate();
    }

}


