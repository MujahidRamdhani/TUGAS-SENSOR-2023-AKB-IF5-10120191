package com.TUGAS_SENSOR_2023_AKB_IF5_10120191.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.TUGAS_SENSOR_2023_AKB_IF5_10120191.R;
import com.TUGAS_SENSOR_2023_AKB_IF5_10120191.databinding.ActivityMainBinding;
import com.TUGAS_SENSOR_2023_AKB_IF5_10120191.fragment.InfoFragment;
import com.TUGAS_SENSOR_2023_AKB_IF5_10120191.fragment.LocationFragment;
import com.TUGAS_SENSOR_2023_AKB_IF5_10120191.fragment.NearbyPlacesFragment;
import com.TUGAS_SENSOR_2023_AKB_IF5_10120191.fragment.ProfileFragment;


// Nama : Ahmad Mujahid Ramdhani
// Kelas : IF-5
// Nim : 10120191

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new InfoFragment());

        binding.bottomNavigationView2.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){
                case R.id.home:
                    replaceFragment(new InfoFragment());
                    break;
                case R.id.location:
                    replaceFragment(new LocationFragment());
                    break;
                case R.id.resto:
                    replaceFragment(new NearbyPlacesFragment());
                    break;
                case R.id.profile:
                    replaceFragment(new ProfileFragment());
                    break;
            }

            return true;
        });
    }



    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}

