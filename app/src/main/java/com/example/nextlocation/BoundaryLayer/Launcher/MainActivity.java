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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}