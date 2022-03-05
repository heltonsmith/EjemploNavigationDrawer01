package com.heltonbustos.ejemplonavigationdrawer01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Fragmento3 extends Fragment {

    Button btnSaludar;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_fragmento3, container, false);
        btnSaludar = v.findViewById(R.id.btnSaludar);
        // Inflate the layout for this fragment

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Holaaa gracias por venir!!!",Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }
}