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
public class MonumentsFragment extends Fragment {


    public MonumentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.places_list, container, false );
        // Create a list of places
        ArrayList<Places> places = new ArrayList<>();
        places.add( new Places( getResources().getString( R.string.monument_pashupati ), getResources().getString( R.string.pashupati_address ), R.drawable.pashupati ) );
        places.add( new Places( getResources().getString( R.string.monument_sahidgate ), getResources().getString( R.string.sahidgate_address ), R.drawable.sahid_date ) );
        places.add( new Places( getResources().getString( R.string.monument_mandala ), getResources().getString( R.string.mandala_address ), R.drawable.mandala ) );
        places.add( new Places( getResources().getString( R.string.monument_nautalle ), getResources().getString( R.string.nautalle_address ), R.drawable.nautalle ) );
        places.add( new Places( getResources().getString( R.string.monument_mahadev ), getResources().getString( R.string.mahadev_address ), R.drawable.shiva ) );
        places.add( new Places( getResources().getString( R.string.monument_bhairav ), getResources().getString( R.string.bhairav_address ), R.drawable.bhairav ) );
        places.add( new Places( getResources().getString( R.string.monument_stupa ), getResources().getString( R.string.stupa_address ), R.drawable.ashok_stupa ) );


        //Create an PlacesAdapter, whose data source is a list of places.
        PlacesAdapter adapter = new PlacesAdapter( getActivity(), places );

        //Find the ListView object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById( R.id.list );

        //Make the ListView use the PlacesAdapter.
        listView.setAdapter( adapter );

        return rootView;


    }

}
