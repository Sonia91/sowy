package com.sonja.sowy;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class BibliographyFragment extends Fragment {

    public BibliographyFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.description_list, container, false);


        final ArrayList<Description> descriptions = new ArrayList<>();
        descriptions.add(new Description(R.string.category_bibliography, R.string.bibliography,
                R.drawable.dot));



        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), descriptions, R.color.category_description);

        ListView listView = (ListView) rootView.findViewById(R.id.list);  ///////!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        listView.setAdapter(adapter);


        return rootView;
    }


    @Override
    public void onStop() {
        super.onStop();

    }

}



