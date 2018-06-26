package com.example.android.mykathmandutour;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by prajbhanda on 6/24/2018.
 */

public class PlacesAdapter extends ArrayAdapter<Places> {
    /**
     * Resource Id for the background color
     */


    public PlacesAdapter(Activity context, ArrayList<Places> words) {
        super( context, 0, words );
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Places currentWordAdapter = getItem( position );

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from( getContext() ).inflate( R.layout.list_item, parent, false );
        }


        TextView miwokTextView = (TextView) listItemView.findViewById( R.id.places_name_view );
        miwokTextView.setText( currentWordAdapter.getPlaceName() );

        TextView engTextView = (TextView) listItemView.findViewById( R.id.places_address_view );
        engTextView.setText( currentWordAdapter.getAddress() );


        ImageView engImageView = (ImageView) listItemView.findViewById( R.id.image );
        ImageView moreInfoImageView = (ImageView) listItemView.findViewById( R.id.more_info_view );
        if (currentWordAdapter.hasImage()) {
            engImageView.setImageResource( currentWordAdapter.getImageResourceId() );

            engImageView.setVisibility( View.VISIBLE );
            moreInfoImageView.setVisibility( View.GONE );
        } else {
            engImageView.setVisibility( View.GONE );
            moreInfoImageView.setVisibility( View.VISIBLE );
        }

        return listItemView;

    }
}
