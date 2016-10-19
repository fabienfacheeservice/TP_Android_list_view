package com.example.fachefabien.listviewrecyclerview.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import com.example.fachefabien.listviewrecyclerview.R;
import com.example.fachefabien.listviewrecyclerview.adapter.FlightAdapter;
import com.example.fachefabien.listviewrecyclerview.model.Flight;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    /* on déclare ici la listeView afin de la manipuler dans toutes les méthodes de l'activité */
    ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        //TODO
    }

    @Override
    protected void onStart() {
        super.onStart();
        //TODO
    }

    private List<Flight> createAllFlight() {
        List<Flight> flights = new ArrayList<Flight>();
        flights.add(new Flight("QR42", "Paris", "Doha", "22/08/2017", "22/08/2017", "10:30", "17:55"));
        flights.add(new Flight("TG931", "Paris", "Bangkok", "22/08/2017", "23/08/2017", "13:40", "05:55"));
        flights.add(new Flight("EY12", "Londres", "Sydney", "19/08/2017", "20/08/2017", "09:35", "17:55"));
        flights.add(new Flight("BA15", "Bruxelles", "Rio De Janero", "26/08/2017", "26/08/2017", "07:55", "17:15"));
        flights.add(new Flight("FR1134", "Berlin", "Barcelone", "02/09/2017", "02/09/2017", "21:00", "23:35"));
        flights.add(new Flight("FR134", "New York", "Paris", "02/07/2017", "03/07/2017", "20:00", "23:35"));
        flights.add(new Flight("IB334", "Madrid", "Tokyo", "09/07/2017", "10/09/2017", "15:15", "17:45"));
        flights.add(new Flight("QR42", "Paris", "Doha", "22/08/2017", "22/08/2017", "10:30", "17:55"));
        flights.add(new Flight("TG931", "Paris", "Bangkok", "22/08/2017", "23/08/2017", "13:40", "05:55"));
        flights.add(new Flight("EY12", "Londres", "Sydney", "19/08/2017", "20/08/2017", "09:35", "17:55"));
        flights.add(new Flight("BA15", "Bruxelles", "Rio De Janero", "26/08/2017", "26/08/2017", "07:55", "17:15"));
        flights.add(new Flight("FR1134", "Berlin", "Barcelone", "02/09/2017", "02/09/2017", "21:00", "23:35"));
        flights.add(new Flight("FR134", "New York", "Paris", "02/07/2017", "03/07/2017", "20:00", "23:35"));
        flights.add(new Flight("IB334", "Madrid", "Tokyo", "09/07/2017", "10/09/2017", "15:15", "17:45"));
        flights.add(new Flight("QR42", "Paris", "Doha", "22/08/2017", "22/08/2017", "10:30", "17:55"));
        flights.add(new Flight("TG931", "Paris", "Bangkok", "22/08/2017", "23/08/2017", "13:40", "05:55"));
        flights.add(new Flight("EY12", "Londres", "Sydney", "19/08/2017", "20/08/2017", "09:35", "17:55"));
        flights.add(new Flight("BA15", "Bruxelles", "Rio De Janero", "26/08/2017", "26/08/2017", "07:55", "17:15"));
        flights.add(new Flight("FR1134", "Berlin", "Barcelone", "02/09/2017", "02/09/2017", "21:00", "23:35"));
        flights.add(new Flight("FR134", "New York", "Paris", "02/07/2017", "03/07/2017", "20:00", "23:35"));
        flights.add(new Flight("IB334", "Madrid", "Tokyo", "09/07/2017", "10/09/2017", "15:15", "17:45"));
        flights.add(new Flight("QR42", "Paris", "Doha", "22/08/2017", "22/08/2017", "10:30", "17:55"));
        flights.add(new Flight("TG931", "Paris", "Bangkok", "22/08/2017", "23/08/2017", "13:40", "05:55"));
        flights.add(new Flight("EY12", "Londres", "Sydney", "19/08/2017", "20/08/2017", "09:35", "17:55"));
        flights.add(new Flight("BA15", "Bruxelles", "Rio De Janero", "26/08/2017", "26/08/2017", "07:55", "17:15"));
        flights.add(new Flight("FR1134", "Berlin", "Barcelone", "02/09/2017", "02/09/2017", "21:00", "23:35"));
        flights.add(new Flight("FR134", "New York", "Paris", "02/07/2017", "03/07/2017", "20:00", "23:35"));
        flights.add(new Flight("IB334", "Madrid", "Tokyo", "09/07/2017", "10/09/2017", "15:15", "17:45"));

        return flights;
    }


    private void myElementDetail(){

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(final AdapterView<?> parent, View view, int position, long id) {
                //TODO
            }
        });
    }

    private void deleteMyElement(){
        //SI VOUS ETES EN RETARD SUPPRIMEZ LE CODE ET UTILISEZ JUSTE UN TOAST "Je suis supprimé"

        /* on va créer un une dialogue box avec possibilité d'annuler l'action */
        mListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(final AdapterView<?> parent, View view, final int position, long id) {
                /* On va utiliser le AlertDialogue.Builder on va spécifier les messages dans les deux cas */
                AlertDialog.Builder alert = new AlertDialog.Builder(ListViewActivity.this);
                //TODO
                /* on lance la créatiion de la fenêtre de dialogue */
                alert.create().show();
                return true;
            }
        });

    }
}
