package com.example.android.mykathmandutour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.places_list, container, false );
        // Create a list of places
        ArrayList<Places> places = new ArrayList<>();
        places.add( new Places( getResources().getString( R.string.restro_alice ), getResources().getString( R.string.alice_address ), R.drawable.alice ) );
        places.add( new Places( getResources().getString( R.string.restro_bajeko ), getResources().getString( R.string.bajeko_address ), R.drawable.bajeko ) );
        places.add( new Places( getResources().getString( R.string.restro_black_olive ), getResources().getString( R.string.olive_address ), R.drawable.black_olive ) );
        places.add( new Places( getResources().getString( R.string.restro_or2k ), getResources().getString( R.string.or2k_address ), R.drawable.or2k ) );
        places.add( new Places( getResources().getString( R.string.restro_third_eye ), getResources().getString( R.string.third_address ), R.drawable.third_eye ) );


        //Create an PlacesAdapter, whose data source is a list of places.
        PlacesAdapter adapter = new PlacesAdapter( getActivity(), places );

        //Find the ListView object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById( R.id.list );

        //Make the ListView use the PlacesAdapter.
        listView.setAdapter( adapter );

        return rootView;


    }

}
