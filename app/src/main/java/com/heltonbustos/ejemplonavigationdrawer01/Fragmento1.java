package com.heltonbustos.ejemplonavigationdrawer01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragmento1 extends Fragment {

    Button btnSaludar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_fragmento1, container, false);

        btnSaludar = v.findViewById(R.id.btnSaludar);

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Hola :D", Toast.LENGTH_SHORT).show();
            }
        });


        // Inflate the layout for this fragment
        return v;

    }
}