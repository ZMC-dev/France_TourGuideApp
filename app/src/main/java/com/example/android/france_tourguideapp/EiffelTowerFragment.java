package com.example.android.france_tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 */
public class EiffelTowerFragment extends Fragment {

TextView website;

    public EiffelTowerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("La tour Eiffel est une tour de fer puddlé de 324 mètres de hauteur (avec antennes)o 1 située à Paris, à l’extrémité nord-ouest du parc du Champ-de-Mars en bordure de la Seine dans le 7e arrondissement.\n Construite par Gustave Eiffel et ses collaborateurs pour l’Exposition universelle de Paris de 1889, et initialement nommée « tour de 300 mètres », ce monument est devenu le symbole de la capitale française, et un site touristique de premier plan : il s’agit du second site culturel français payant le plus visité en 2011, avec 7,1 millions de visiteurs dont 75 % d'étrangers en 2011",
                R.drawable.eiffel,
                "Prix  :\n16,30 (Adulte)\n8,10€ (Jeunes)\n4,10€ (Enfant)",
                "Horaires :\n 9:00 - 0:45",
                "Adresse :\nChamp de Mars, 5 Avenue Anatole France, 75007 Paris",
                "Website : www.toureiffel.paris/fr"));

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(new PlaceAdapter(getActivity(), places, R.color.category_background));

        return rootView;

    }
    
}