package com.example.android.mykathmandutour;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToursFragment extends Fragment {


    public ToursFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.places_list, container, false );
        // Create a list of places
        final ArrayList<Places> places = new ArrayList<>();

        places.add( new Places( getResources().getString( R.string.tour_cooking ), getResources().getString( R.string.cooking_detail ), getResources().getString( R.string.web_cooking_tour ) ) );
        places.add( new Places( getResources().getString( R.string.tour_day ), getResources().getString( R.string.day_detail ), getResources().getString( R.string.web_pegion_travels ) ) );
        places.add( new Places( getResources().getString( R.string.tour_hike ), getResources().getString( R.string.hike_detail ), getResources().getString( R.string.web_hiking_tour ) ) );
        places.add( new Places( getResources().getString( R.string.tour_sunrise ), getResources().getString( R.string.sunrise_detail ), getResources().getString( R.string.web_sunrise_tour ) ) );
        places.add( new Places( getResources().getString( R.string.tour_temple ), getResources().getString( R.string.temple_detail ), getResources().getString( R.string.web_pashupati_tour ) ) );
        places.add( new Places( getResources().getString( R.string.tour_world_heritage ), getResources().getString( R.string.world_heritage_detail ), getResources().getString( R.string.web_planet_adventures ) ) );


        //Create an PlacesAdapter, whose data source is a list of places.
        PlacesAdapter adapter = new PlacesAdapter( getActivity(), places );

        //Find the ListView object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById( R.id.list );

        //Make the ListView use the PlacesAdapter.
        listView.setAdapter( adapter );


        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Places place = places.get( i );
                String link = place.getWebName();
                Uri uri = Uri.parse( link );
                Intent intent = new Intent( Intent.ACTION_VIEW, uri );
                startActivity( intent );

            }
        } );

        return rootView;

    }

}
