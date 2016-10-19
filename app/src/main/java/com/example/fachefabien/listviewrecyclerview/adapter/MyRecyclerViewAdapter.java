package com.example.fachefabien.listviewrecyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fachefabien.listviewrecyclerview.R;
import com.example.fachefabien.listviewrecyclerview.holder.MyRecycleViewHolder;
import com.example.fachefabien.listviewrecyclerview.model.Flight;

import java.util.List;

/**
 * Created by fachefabien on 18/10/2016.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecycleViewHolder> {


    List<Flight> list;

    //Constructeur prenant en entrée une liste de vols
    public MyRecyclerViewAdapter(List<Flight> list) {
        this.list = list;
    }

    @Override
    public MyRecycleViewHolder onCreateViewHolder(ViewGroup viewGroup, int itemType) {
        //TODO
        return null;
    }

    @Override
    public void onBindViewHolder(MyRecycleViewHolder myViewHolder, int position) {
        //TODO
    }

    @Override
    public int getItemCount() {
        //TODO
        return 0;
    }

}