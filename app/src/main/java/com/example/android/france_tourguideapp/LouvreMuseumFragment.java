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
public class LouvreMuseumFragment extends Fragment {


    public LouvreMuseumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Le musée du Louvre, inauguré en 1793 sous l'appellation Muséum central des arts de la République dans le palais du Louvre, ancienne résidence royale située au centre de Paris, est aujourd'hui le plus grand musée d'art et d'antiquités au monde. Sa surface d'exposition est de 72 735 m27.\n" +
                "Fin 2016, ses collections comprenaient 554 731 œuvres, dont 35 000 exposées et 264 486 œuvres graphiques. Celles-ci présentent l'art occidental du Moyen Âge à 1848, celui des civilisations antiques qui l'ont précédé et influencé (orientales, égyptienne, grecque, étrusque et romaine), les arts des premiers chrétiens et de l'Islam.",
                R.drawable.louvre,
                "Prix  : 17 euros \n" +
                        "Entrée rapide en moins de 30 minutes",
                "Horaires : \nLundi : 9 h - 18 h\n" +
                        "Mardi : Fermé\n" +
                        "Mercredi : 9 h - 21h45\n" +
                        "Jeudi : 9 h - 18 h\n" +
                        "Vendredi : 9 h - 21h45\n" +
                        "Samedi : 9 h - 18 h (jusqu'à 21h45 le premier samedi de chaque mois)\n" +
                        "Dimanche : 9 h - 18 h",
                "Adresse : Musée du Louvre, Rue de Rivoli, 75001 Paris",
                "Website : https://www.louvre.fr/"));


        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ListView listView = (ListView)rootView.findViewById(R.id.list);

        listView.setAdapter(new PlaceAdapter(getActivity(),places, R.color.category_background));

        return rootView;
    }

}
