package com.example.nextlocation.BoundaryLayer.Launcher;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.nextlocation.BoundaryLayer.UI.MapFragment;
import com.example.nextlocation.BoundaryLayer.UI.POIListFragment;
import com.example.nextlocation.BoundaryLayer.UI.SettingsFragment;
import com.example.nextlocation.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private Fragment selectedFragment = null;
    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.menu_map:
                    selectedFragment = fragmentList.get(0);
                    break;
                case R.id.menu_list:
                    selectedFragment = fragmentList.get(1);
                    break;
                case R.id.menu_settings:
                    selectedFragment = fragmentList.get(2);
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment, selectedFragment).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpFragmentList();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, fragmentList.get(0)).commit();
    }

    private void setUpFragmentList(){
        this.fragmentList.add(new MapFragment());
        this.fragmentList.add(new POIListFragment());
        this.fragmentList.add(new SettingsFragment());
    }
}