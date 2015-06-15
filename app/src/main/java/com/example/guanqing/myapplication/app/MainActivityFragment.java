package com.example.guanqing.myapplication.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] fakeData = {
                "Mon - Sunny - 88/63",
                "Tue - Rainy - 79/62",
                "Wed - Sunny - 84/64",
                "Thu - Stormy - 86/61",
                "Fri - Sunny - 81/61",
                "Sat - Tornado - 77/59",
                "Sun - Rainy - 82/63",
                "Mon - Tsunami - 89/60",
                "Tue - Sunny - 78/64",
                "Wed - Cloudy - 84/64",
                "Thu - Sunny - 86/61",
                "Fri - Volcano ash - 81/61"
        };
        List<String> data = new ArrayList<String>(Arrays.asList(fakeData));

        ArrayAdapter adapter = new ArrayAdapter(
                //current context
                getActivity(),
                //id of layout
                R.layout.list_item_forecast,
                //id of view
                R.id.list_item_forecast_textview,
                //data
                data
        );
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(adapter);


        return rootView;
    }
}
