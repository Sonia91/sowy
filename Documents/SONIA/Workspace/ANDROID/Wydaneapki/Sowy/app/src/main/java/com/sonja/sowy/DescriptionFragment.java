package com.sonja.sowy;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class DescriptionFragment extends Fragment {



    public DescriptionFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.description_list, container, false);


        final ArrayList<Description> descriptions = new ArrayList<>();
        descriptions.add(new Description(R.string.puchacz, R.string.puchacz_description,
                R.drawable.puchacz));
        descriptions.add(new Description(R.string.puszczyk_zwyczajny, R.string.puszczyk_zwyczajny_description,
                R.drawable.puszczyk_zwyczajny));
        descriptions.add(new Description(R.string.plomykowka, R.string.plomykowka_description,
                R.drawable.plomykowka));
        descriptions.add(new Description(R.string.pojdzka, R.string.pojdzka_description,
                R.drawable.pojdzka));
        descriptions.add(new Description(R.string.uszatka, R.string.uszatka_description,
                R.drawable.uszatka));



       DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), descriptions, R.color.category_description);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();

    }

}
