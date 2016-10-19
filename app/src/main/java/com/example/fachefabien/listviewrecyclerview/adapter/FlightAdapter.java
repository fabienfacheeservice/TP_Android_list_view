package com.example.fachefabien.listviewrecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fachefabien.listviewrecyclerview.R;
import com.example.fachefabien.listviewrecyclerview.model.Flight;

import java.util.List;

/**
 * Created by fachefabien on 09/10/2016.
 */

public class FlightAdapter extends ArrayAdapter<Flight> {


    public FlightAdapter(Context context, int resource, List<Flight> flights) {
        super(context, 0, flights);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //TODO
        return null;
    }

    private class FlightViewHolder{
        /* pour cette exemple je n'ai pris qu'un seul champ */
        public TextView flightNumber;
    }
}
