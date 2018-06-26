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
public class SitesFragment extends Fragment {


    public SitesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.places_list, container, false );
        // Create a list of places
        ArrayList<Places> places = new ArrayList<>();
        places.add( new Places( getResources().getString( R.string.site_boudha ), getResources().getString( R.string.boudha_address ), R.drawable.boudhanath ) );
        places.add( new Places( getResources().getString( R.string.site_swayambhu ), getResources().getString( R.string.swayambhu_address ), R.drawable.swayambhu ) );
        places.add( new Places( getResources().getString( R.string.site_kopan ), getResources().getString( R.string.kopan_address ), R.drawable.kapan ) );
        places.add( new Places( getResources().getString( R.string.site_durbar_square ), getResources().getString( R.string.durbar_square_address ), R.drawable.kathmandu_durbar_square ) );
        places.add( new Places( getResources().getString( R.string.site_bhaktapur_durbar ), getResources().getString( R.string.bhaktapur_address ), R.drawable.bhaktapur_drubar_square ) );
        places.add( new Places( getResources().getString( R.string.site_patan_durbar ), getResources().getString( R.string.patan_address ), R.drawable.patan_durbar_square ) );
        places.add( new Places( getResources().getString( R.string.site_budhanilkantha ), getResources().getString( R.string.budhanilkantha_address ), R.drawable.kathmandu ) );


        //Create an PlacesAdapter, whose data source is a list of places.
        PlacesAdapter adapter = new PlacesAdapter( getActivity(), places );

        //Find the ListView object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById( R.id.list );

        //Make the ListView use the PlacesAdapter.
        listView.setAdapter( adapter );

        return rootView;


    }

}
