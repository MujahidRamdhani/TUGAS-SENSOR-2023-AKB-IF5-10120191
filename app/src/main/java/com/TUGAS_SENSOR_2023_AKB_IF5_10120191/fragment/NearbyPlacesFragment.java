package com.TUGAS_SENSOR_2023_AKB_IF5_10120191.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.TUGAS_SENSOR_2023_AKB_IF5_10120191.R;
import com.TUGAS_SENSOR_2023_AKB_IF5_10120191.activity.MapsActivity;

// Nama : Ahmad Mujahid Ramdhani
// Kelas : IF-5
// Nim : 10120191

public class NearbyPlacesFragment extends Fragment {

    Activity context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        context = getActivity();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nearby_places, container, false);
    }

    public void onStart(){
        super.onStart();
        Button btn= (Button) context.findViewById(R.id.nearby_places);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MapsActivity.class);
                startActivity(intent);
            }
        });
    }

}

