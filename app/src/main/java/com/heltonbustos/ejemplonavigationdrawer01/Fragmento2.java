package com.heltonbustos.ejemplonavigationdrawer01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Fragmento2 extends Fragment {

    ListView lst;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_fragmento2, container, false);

        lst = v.findViewById(R.id.myListView);
        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(v.getContext(), R.array.arraydias, android.R.layout.simple_list_item_1);
        lst.setAdapter(adaptador);

        // Inflate the layout for this fragment
        return v;
    }
}