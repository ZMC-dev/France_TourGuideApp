package com.example.android.france_tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NotreDameCathedralFragment extends Fragment {


    public NotreDameCathedralFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("La cathédrale Notre-Dame de Paris, en forme courte Notre-Dame, est la cathédrale de l'archidiocèse de Paris, en France. Elle est située dans l'est de l'île de la Cité, dans le 4e arrondissement de Paris. Sa façade occidentale domine le parvis Notre-Dame - place Jean-Paul-II.\n" +
                "La cathédrale est depuis l'origine l'un des monuments les plus emblématiques de Paris. Longtemps la plus haute construction de la ville, elle occupe à Paris une place symbolique de premier rang et est l'une des plus célèbres cathédrales du pays, avec celles de Reims, où étaient sacrés les rois de France, de Strasbourg, d'Amiens, de Beauvais et de Chartres. Édifice à la fois religieux et patrimonial, elle est liée à de nombreux épisodes de l’histoire de France.",
                R.drawable.notre_dame,
                "Prix  :\nPLEIN TARIF : 10€\n" +
                        "TARIF RÉDUIT : 8€",
                "Horaires :\nNocturnes les vendredis et samedis jusqu’à 23h en juillet/août.\n" +
                        "DU 2 JANVIER AU 31 MARS\n" +
                        "Ouvert tous les jours\n" +
                        "10.00-17.30\n" +
                        "DU 1ER AVRIL AU 30 SEPTEMBRE\n" +
                        "Ouvert tous les jours\n" +
                        "10.00-18.30\n" +
                        "DU 1ER OCTOBRE AU 31 DÉCEMBRE\n" +
                        "Ouvert tous les jours\n" +
                        "10.00-17.30\n" +
                        "Dimanche : 9 h - 18 h",
                "Adresse :\n 6 Parvis Notre-Dame - Pl. Jean-Paul II, 75004 Paris",
                 "Website : http://www.notredamedeparis.fr/"));


        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ListView listView = (ListView)rootView.findViewById(R.id.list);

        listView.setAdapter(new PlaceAdapter(getActivity(),places, R.color.category_background));

        return rootView;
    }

}
