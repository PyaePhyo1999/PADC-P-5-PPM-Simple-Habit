package com.example.acer.simplehabit.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.acer.simplehabit.R;
import com.example.acer.simplehabit.adapters.AllTopicsAdapter;
import com.example.acer.simplehabit.adapters.HealthyMindAdapter;
import com.example.acer.simplehabit.adapters.MostPopularAdapter;
import com.example.acer.simplehabit.adapters.SleepBetterAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Acer on 5/18/2018.
 */

public class SeriesFragment extends Fragment {
    @BindView(R.id.rv_healthy_mind)
    RecyclerView rvHealthyMind;

    @BindView(R.id.rv_sleep_better)
    RecyclerView rvSleepBetter;

    @BindView(R.id.rv_most_popular)
    RecyclerView rvMostPopular;

    @BindView(R.id.rv_all_topic)
    RecyclerView rvAllTopics;

    private HealthyMindAdapter mHealthyMindAdapter;
    private SleepBetterAdapter mSleepBetterAdapter;
    private MostPopularAdapter mMostPopularAdapter;
    private AllTopicsAdapter mAllTopicsAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_series,container,false);
        ButterKnife.bind(this,view);

        mHealthyMindAdapter = new HealthyMindAdapter();
        mSleepBetterAdapter = new SleepBetterAdapter();
        mMostPopularAdapter = new MostPopularAdapter();
        mAllTopicsAdapter = new AllTopicsAdapter();

        LinearLayoutManager linearLayoutManagerForHealthyMind = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        rvHealthyMind.setLayoutManager(linearLayoutManagerForHealthyMind);
        rvHealthyMind.setAdapter(mHealthyMindAdapter);

        LinearLayoutManager linearLayoutManagerForSleepBetter = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL, false);
        rvSleepBetter.setAdapter(mSleepBetterAdapter);
        rvSleepBetter.setLayoutManager(linearLayoutManagerForSleepBetter);

        LinearLayoutManager linearLayoutManagerForMostPopular = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        rvMostPopular.setAdapter(mMostPopularAdapter);
        rvMostPopular.setLayoutManager(linearLayoutManagerForMostPopular);

        LinearLayoutManager linearLayoutManagerForAllTopics = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        rvAllTopics.setAdapter(mAllTopicsAdapter);
        rvAllTopics.setLayoutManager(linearLayoutManagerForAllTopics);
        return view;
    }
}
