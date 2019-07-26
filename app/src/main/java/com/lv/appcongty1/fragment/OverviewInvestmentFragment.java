package com.lv.appcongty1.fragment;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.lv.appcongty1.R;
import com.lv.appcongty1.databinding.FragmentOverviewInvestmentBinding;
import com.lv.appcongty1.model.OverviewInvestment;

import java.util.ArrayList;

public class OverviewInvestmentFragment extends Fragment {
    private FragmentOverviewInvestmentBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_overview_investment, container, false);
        binding.setInvestment(new OverviewInvestment(getString(R.string.overview_investment_total_port), getString(R.string.overview_investment_total_rp), getString(R.string.overview_investment_day),
                getString(R.string.overview_investment_week), getString(R.string.overview_investment_month), getString(R.string.overview_investment_year), getString(R.string.overview_investment), getString(R.string.overview_investment_des),
                        getString(R.string.overview_investment_my_portfolio), getString(R.string.overview_investment_portfolio_name), getString(R.string.overview_investment_portfolio_money),
                                getString(R.string.overview_investment_portfolio_share), getString(R.string.overview_investment_portfolio_percent)));
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.day.setTextColor(getResources().getColor(R.color.black));
                binding.week.setTextColor(getResources().getColor(R.color.colorTextGray));
                binding.month.setTextColor(getResources().getColor(R.color.colorTextGray));
                binding.year.setTextColor(getResources().getColor(R.color.colorTextGray));
                lineChartDay();
            }
        });
        binding.week.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.day.setTextColor(getResources().getColor(R.color.colorTextGray));
                binding.week.setTextColor(getResources().getColor(R.color.black));
                binding.month.setTextColor(getResources().getColor(R.color.colorTextGray));
                binding.year.setTextColor(getResources().getColor(R.color.colorTextGray));
                lineChartWeek();
            }
        });
        binding.month.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.day.setTextColor(getResources().getColor(R.color.colorTextGray));
                binding.week.setTextColor(getResources().getColor(R.color.colorTextGray));
                binding.month.setTextColor(getResources().getColor(R.color.black));
                binding.year.setTextColor(getResources().getColor(R.color.colorTextGray));
                lineChartMonth();
            }
        });
        binding.year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.day.setTextColor(getResources().getColor(R.color.colorTextGray));
                binding.week.setTextColor(getResources().getColor(R.color.colorTextGray));
                binding.month.setTextColor(getResources().getColor(R.color.colorTextGray));
                binding.year.setTextColor(getResources().getColor(R.color.black));
                lineChartYear();
            }
        });

        setLineChart();
        setLineChartPortFolio();
    }

    private void setLineChartPortFolio() {
        binding.linechartPortfolio.setTouchEnabled(false);
        binding.linechartPortfolio.setDragEnabled(true);
        binding.linechartPortfolio.setScaleEnabled(true);
        binding.linechartPortfolio.setPinchZoom(false);
        binding.linechartPortfolio.setDrawGridBackground(false);
        binding.linechartPortfolio.setMaxHighlightDistance(200);
        binding.linechartPortfolio.setViewPortOffsets(0, 0, 0, 0);


        binding.linechartPortfolio.animateXY(1000, 1000);
        Description description = new Description();
        description.setText("");

        binding.linechartPortfolio.setDescription(description);


        ArrayList<Entry> entryArrayList = new ArrayList<>();
        entryArrayList.add(new Entry(0, 40f, "1"));
        entryArrayList.add(new Entry(1, 45f, "2"));
        entryArrayList.add(new Entry(2, 35f, "3"));
        entryArrayList.add(new Entry(3, 40f, "4"));
        entryArrayList.add(new Entry(4, 35f, "5"));


        LineDataSet lineDataSet = new LineDataSet(entryArrayList, "");
        lineDataSet.setLineWidth(1f);
        lineDataSet.setColor(getResources().getColor(R.color.orange));

        lineDataSet.setCircleHoleColor(Color.WHITE);
        lineDataSet.setHighLightColor(Color.RED);
        lineDataSet.setDrawValues(false);
        lineDataSet.setCircleRadius(3f);
        lineDataSet.setCircleColor(getResources().getColor(R.color.orange));
        lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        lineDataSet.setCubicIntensity(0.2f);


        lineDataSet.setDrawFilled(true);
        lineDataSet.setFillColor(getResources().getColor(R.color.background_char_investment));
        lineDataSet.setFillAlpha(80);

        Legend legend = binding.linechartPortfolio.getLegend();
        legend.setEnabled(false);

        lineDataSet.setDrawCircles(true);


        ArrayList<ILineDataSet> iLineDataSetArrayList = new ArrayList<>();
        iLineDataSetArrayList.add(lineDataSet);

        //LineData is the data accord
        LineData lineData = new LineData(iLineDataSetArrayList);
        lineData.setValueTextSize(10f);
        lineData.setValueTextColor(getResources().getColor(R.color.colorTextGray));


        binding.linechartPortfolio.setData(lineData);
        binding.linechartPortfolio.invalidate();
    }

    private void setLineChart() {
        binding.linechartInvestment.setTouchEnabled(false);
        binding.linechartInvestment.setDragEnabled(true);
        binding.linechartInvestment.setScaleEnabled(true);
        binding.linechartInvestment.setPinchZoom(false);
        binding.linechartInvestment.setDrawGridBackground(false);
        binding.linechartInvestment.setMaxHighlightDistance(200);
        binding.linechartInvestment.setViewPortOffsets(0, 0, 0, 0);

        lineChartDay();
    }

    private void lineChartDay() {
        binding.linechartInvestment.animateXY(1000, 1000);
        Description description = new Description();
        description.setText("Day");

        binding.linechartInvestment.setDescription(description);


        ArrayList<Entry> entryArrayList = new ArrayList<>();
        entryArrayList.add(new Entry(0, 40f, "1"));
        entryArrayList.add(new Entry(1, 45f, "2"));
        entryArrayList.add(new Entry(2, 35f, "3"));
        entryArrayList.add(new Entry(3, 40f, "4"));
        entryArrayList.add(new Entry(4, 35f, "5"));


        LineDataSet lineDataSet = new LineDataSet(entryArrayList, "");
        lineDataSet.setLineWidth(1f);
        lineDataSet.setColor(getResources().getColor(R.color.orange));

        lineDataSet.setCircleHoleColor(Color.WHITE);
        lineDataSet.setHighLightColor(Color.RED);
        lineDataSet.setDrawValues(true);
        lineDataSet.setCircleRadius(3f);
        lineDataSet.setCircleColor(getResources().getColor(R.color.orange));
        lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        lineDataSet.setCubicIntensity(0.2f);


        lineDataSet.setDrawFilled(true);
        lineDataSet.setFillColor(getResources().getColor(R.color.background_char_investment));
        lineDataSet.setFillAlpha(80);

        Legend legend = binding.linechartInvestment.getLegend();
        legend.setEnabled(false);

        lineDataSet.setDrawCircles(true);


        ArrayList<ILineDataSet> iLineDataSetArrayList = new ArrayList<>();
        iLineDataSetArrayList.add(lineDataSet);

        //LineData is the data accord
        LineData lineData = new LineData(iLineDataSetArrayList);
        lineData.setValueTextSize(10f);
        lineData.setValueTextColor(getResources().getColor(R.color.colorTextGray));


        binding.linechartInvestment.setData(lineData);
        binding.linechartInvestment.invalidate();
    }

    private void lineChartWeek() {
        binding.linechartInvestment.animateXY(1000, 1000);
        Description description = new Description();
        description.setText("Week");

        binding.linechartInvestment.setDescription(description);


        ArrayList<Entry> entryArrayList = new ArrayList<>();
        entryArrayList.add(new Entry(0, 40f, "1"));
        entryArrayList.add(new Entry(1, 45f, "2"));
        entryArrayList.add(new Entry(2, 35f, "3"));
        entryArrayList.add(new Entry(3, 40f, "4"));
        entryArrayList.add(new Entry(4, 35f, "5"));
        entryArrayList.add(new Entry(5, 30f, "6"));
        entryArrayList.add(new Entry(6, 45f, "7"));
        entryArrayList.add(new Entry(7, 38f, "8"));


        LineDataSet lineDataSet = new LineDataSet(entryArrayList, "");
        lineDataSet.setLineWidth(1f);
        lineDataSet.setColor(getResources().getColor(R.color.orange));

        lineDataSet.setCircleHoleColor(Color.WHITE);
        lineDataSet.setHighLightColor(Color.RED);
        lineDataSet.setDrawValues(true);
        lineDataSet.setCircleRadius(3f);
        lineDataSet.setCircleColor(getResources().getColor(R.color.orange));
        lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        lineDataSet.setCubicIntensity(0.2f);


        lineDataSet.setDrawFilled(true);
        lineDataSet.setFillColor(getResources().getColor(R.color.background_char_investment));
        lineDataSet.setFillAlpha(80);

        Legend legend = binding.linechartInvestment.getLegend();
        legend.setEnabled(false);

        lineDataSet.setDrawCircles(true);


        ArrayList<ILineDataSet> iLineDataSetArrayList = new ArrayList<>();
        iLineDataSetArrayList.add(lineDataSet);

        //LineData is the data accord
        LineData lineData = new LineData(iLineDataSetArrayList);
        lineData.setValueTextSize(10f);
        lineData.setValueTextColor(getResources().getColor(R.color.colorTextGray));


        binding.linechartInvestment.setData(lineData);
        binding.linechartInvestment.invalidate();
    }

    private void lineChartMonth() {
        binding.linechartInvestment.animateXY(1000, 1000);
        Description description = new Description();
        description.setText("Month");

        binding.linechartInvestment.setDescription(description);


        ArrayList<Entry> entryArrayList = new ArrayList<>();
        entryArrayList.add(new Entry(0, 40f, "1"));
        entryArrayList.add(new Entry(1, 45f, "2"));
        entryArrayList.add(new Entry(2, 35f, "3"));
        entryArrayList.add(new Entry(3, 40f, "4"));
        entryArrayList.add(new Entry(4, 35f, "5"));
        entryArrayList.add(new Entry(5, 30f, "6"));
        entryArrayList.add(new Entry(6, 45f, "7"));
        entryArrayList.add(new Entry(7, 38f, "8"));
        entryArrayList.add(new Entry(8, 45f, "9"));
        entryArrayList.add(new Entry(9, 35f, "10"));


        LineDataSet lineDataSet = new LineDataSet(entryArrayList, "");
        lineDataSet.setLineWidth(1f);
        lineDataSet.setColor(getResources().getColor(R.color.orange));

        lineDataSet.setCircleHoleColor(Color.WHITE);
        lineDataSet.setHighLightColor(Color.RED);
        lineDataSet.setDrawValues(true);
        lineDataSet.setCircleRadius(3f);
        lineDataSet.setCircleColor(getResources().getColor(R.color.orange));
        lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        lineDataSet.setCubicIntensity(0.2f);


        lineDataSet.setDrawFilled(true);
        lineDataSet.setFillColor(getResources().getColor(R.color.background_char_investment));
        lineDataSet.setFillAlpha(80);

        Legend legend = binding.linechartInvestment.getLegend();
        legend.setEnabled(false);

        lineDataSet.setDrawCircles(true);


        ArrayList<ILineDataSet> iLineDataSetArrayList = new ArrayList<>();
        iLineDataSetArrayList.add(lineDataSet);

        //LineData is the data accord
        LineData lineData = new LineData(iLineDataSetArrayList);
        lineData.setValueTextSize(10f);
        lineData.setValueTextColor(getResources().getColor(R.color.colorTextGray));


        binding.linechartInvestment.setData(lineData);
        binding.linechartInvestment.invalidate();
    }

    private void lineChartYear() {
        binding.linechartInvestment.animateXY(1000, 1000);
        Description description = new Description();
        description.setText("Year");

        binding.linechartInvestment.setDescription(description);


        ArrayList<Entry> entryArrayList = new ArrayList<>();
        entryArrayList.add(new Entry(0, 40f, "1"));
        entryArrayList.add(new Entry(1, 45f, "2"));
        entryArrayList.add(new Entry(2, 35f, "3"));
        entryArrayList.add(new Entry(3, 40f, "4"));
        entryArrayList.add(new Entry(4, 35f, "5"));
        entryArrayList.add(new Entry(5, 35f, "6"));
        entryArrayList.add(new Entry(6, 45f, "7"));
        entryArrayList.add(new Entry(7, 38f, "8"));
        entryArrayList.add(new Entry(8, 45f, "9"));
        entryArrayList.add(new Entry(9, 35f, "10"));
        entryArrayList.add(new Entry(10, 40f, "10"));
        entryArrayList.add(new Entry(11, 30f, "10"));


        LineDataSet lineDataSet = new LineDataSet(entryArrayList, "");
        lineDataSet.setLineWidth(1f);
        lineDataSet.setColor(getResources().getColor(R.color.orange));

        lineDataSet.setCircleHoleColor(Color.WHITE);
        lineDataSet.setHighLightColor(Color.RED);
        lineDataSet.setDrawValues(true);
        lineDataSet.setCircleRadius(3f);
        lineDataSet.setCircleColor(getResources().getColor(R.color.orange));
        lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        lineDataSet.setCubicIntensity(0.2f);


        lineDataSet.setDrawFilled(true);
        lineDataSet.setFillColor(getResources().getColor(R.color.background_char_investment));
        lineDataSet.setFillAlpha(80);

        Legend legend = binding.linechartInvestment.getLegend();
        legend.setEnabled(false);

        lineDataSet.setDrawCircles(true);


        ArrayList<ILineDataSet> iLineDataSetArrayList = new ArrayList<>();
        iLineDataSetArrayList.add(lineDataSet);

        //LineData is the data accord
        LineData lineData = new LineData(iLineDataSetArrayList);
        lineData.setValueTextSize(10f);
        lineData.setValueTextColor(getResources().getColor(R.color.colorTextGray));


        binding.linechartInvestment.setData(lineData);
        binding.linechartInvestment.invalidate();
    }
}
