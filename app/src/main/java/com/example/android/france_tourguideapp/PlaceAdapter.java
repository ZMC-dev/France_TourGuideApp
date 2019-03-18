package com.example.android.france_tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceId;

    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param places          is the list of {@link Place}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of places
     */
    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView placeImage = (ImageView) listItemView.findViewById(R.id.image);
        // return image provided for this place
        placeImage.setImageResource(currentPlace.getPlaceImageId());


        // Find the TextView in the list_item.xml layout with the ID description_text_view.
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        // Get the description of this place
        descriptionTextView.setText(currentPlace.getPlaceDescription());


        // Find the TextView in the list_item.xml layout with the ID price_text_view.
        TextView priceTextView = (TextView) listItemView.findViewById(R.id.price_text_view);
        // Get the information about tickets and price to access to this place
        priceTextView.setText(currentPlace.getPriceInformation());


        // Find the TextView in the list_item.xml layout with the ID times_text_view.
        TextView timesTextView = (TextView) listItemView.findViewById(R.id.times_text_view);
        // Get the information about opening times of this place
        timesTextView.setText(currentPlace.getOpeningTime());


        // Find the TextView in the list_item.xml layout with the ID times_text_view.
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        // Get the information about opening times of this place
        locationTextView.setText(currentPlace.getPlaceLocation());


        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }

}