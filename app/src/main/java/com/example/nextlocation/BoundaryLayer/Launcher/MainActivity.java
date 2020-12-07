package com.example.nextlocation.BoundaryLayer.Launcher;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.nextlocation.BoundaryLayer.UI.MapFragment;
import com.example.nextlocation.BoundaryLayer.UI.POIListFragment;
import com.example.nextlocation.BoundaryLayer.UI.SettingsFragment;
import com.example.nextlocation.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        //getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new MapFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()){
                case R.id.menu_map:
                    //selectedFragment = new MapFragment();
                    break;
                case R.id.menu_list:
                    //selectedFragment = new POIListFragment();
                    break;
                case R.id.menu_settings:
                    //selectedFragment = new SettingsFragment();
                    break;
            }
            //getSupportFragmentManager().beginTransaction().replace(R.id.fragment, selectedFragment).commit();
            return true;
        }
    };
}