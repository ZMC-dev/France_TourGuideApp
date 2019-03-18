package com.example.android.france_tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 */
public class EiffelTowerFragment extends Fragment {


    public EiffelTowerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Tour Eiffel",
                R.drawable.eiffel,
                "16€",
                "9 am to 20 pm",
                "Champs de mars"));


        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ListView listView = (ListView)rootView.findViewById(R.id.list);

        listView.setAdapter(new PlaceAdapter(getActivity(),places, R.color.category_background));

        return rootView;
    }

}


