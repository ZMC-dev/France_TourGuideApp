package com.example.android.france_tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PalaceVersaillesFragment extends Fragment {

    public PalaceVersaillesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Le château de Versailles est un château et un monument historique français qui se situe à Versailles, dans les Yvelines, en France. Il fut la résidence des rois de France Louis XIV, Louis XV et Louis XVI. Le roi et la cour y résidèrent de façon permanente du 6 mai 1682 au 6 octobre 1789, à l'exception des années de la Régence de 1715 à 1723. Situés au sud-ouest de Paris, ce château et son domaine visaient à glorifier la monarchie française.\n" +
                "Le château est constitué d'une succession d'éléments ayant une harmonie architecturale. Il s'étale sur 63 154 m2, répartis en 2 300 pièces, dont, actuellement, 1 000 pièces de musée1.\n" +
                "Le parc du château de Versailles s'étend sur 815 ha, contre environ 8 000 ha avant la Révolution française, dont 93 ha de jardins.\n",
                R.drawable.versailles,
                "Prix  :\n" +
                        "Passeport 1 jour : 20€\n" +
                        "Passeport 2 jour : 25€\n" +
                        "Billet Châteu : 18€",
                "Horaires :" +
                        "\nChâteau : de 9h à 17h30\n" +
                        "fermé le lundi\n" +
                        "\n" +
                        "Domaine de Trianon : de 12h à 17h30\n" +
                        "fermé le lundi\n" +
                        "\n" +
                        "Jardins : de 8h à 18h\n" +
                        "\n" +
                        "Galerie des Carrosses : de 12h30 à 17h30\n" +
                        "fermée le lundi\n",
                "Adresse :\n 6 Parvis Notre-Dame - Pl. Jean-Paul II, 75004 Paris",
                "Website : http://www.chateauversailles.fr/"));


        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ListView listView = (ListView)rootView.findViewById(R.id.list);

        listView.setAdapter(new PlaceAdapter(getActivity(),places, R.color.category_background));

        return rootView;
    }

}

