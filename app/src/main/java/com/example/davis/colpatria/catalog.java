package com.example.davis.colpatria;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.CardView;

public class catalog extends android.support.v4.app.Fragment {

    CardView card;

    public catalog() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        container.clearDisappearingChildren();
        View view = inflater.inflate(R.layout.activity_catalog, container, false);

        card = view.findViewById(R.id.card1);

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(getActivity(), ProductosActivity.class);
                startActivity(myintent);
            }
        });


        return view;
    }


}


