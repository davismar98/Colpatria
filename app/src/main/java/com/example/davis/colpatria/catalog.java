package com.example.davis.colpatria;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class catalog extends android.support.v4.app.Fragment {

    public catalog() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        container.clearDisappearingChildren();
        View view = inflater.inflate(R.layout.activity_catalog, container, false);

        return view;
    }


}


