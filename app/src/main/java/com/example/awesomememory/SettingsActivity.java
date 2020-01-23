package com.example.awesomememory;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceManager;

public class SettingsActivity extends AppCompatActivity implements SharedPreferences.OnSharedPreferenceChangeListener {


    SharedPreferences sharedPreferences2;
    boolean check3;
    LinearLayout linearLayout3;
    boolean alreadyExecuted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings, new SettingsFragment())
                .commit();
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);

        }

        sharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
        check3 = sharedPreferences2.getBoolean("DARKMODE", false);
        linearLayout3 = (LinearLayout) findViewById(R.id.linear3);
        AppCompatDelegate.setDefaultNightMode(check3 ? AppCompatDelegate.MODE_NIGHT_YES : AppCompatDelegate.MODE_NIGHT_NO);
    }

    public void onResume() {
        super.onResume();
        setDarkMode();
    }

    private void setDarkMode() {
        if (check3) {
            linearLayout3.setBackgroundResource(R.drawable.triangle_black);
        } else {
            linearLayout3.setBackgroundResource(R.drawable.trinangle_white);
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        if (key.equals("DARKMODE")) {
            check3 = sharedPreferences.getBoolean(key, false);
            AppCompatDelegate.setDefaultNightMode(check3 ? AppCompatDelegate.MODE_NIGHT_YES : AppCompatDelegate.MODE_NIGHT_NO);
            setDarkMode();
        }
    }

    public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);
        }
    }
}