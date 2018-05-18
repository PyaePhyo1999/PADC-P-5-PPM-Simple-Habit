package com.example.acer.simplehabit.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.acer.simplehabit.R;
import com.example.acer.simplehabit.viewholders.ItemAllTopicsViewHolder;
import com.example.acer.simplehabit.viewholders.ItemSleepBetterViewHolder;

/**
 * Created by Acer on 5/18/2018.
 */

public class AllTopicsAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_all_topics,parent,false);
        ItemAllTopicsViewHolder itemAllTopicsViewHolder= new ItemAllTopicsViewHolder (view);
        return itemAllTopicsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
