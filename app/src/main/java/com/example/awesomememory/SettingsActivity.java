package com.example.awesomememory;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceManager;

public class SettingsActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences2;
    boolean check3;
    LinearLayout linearLayout3;

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
        linearLayout3 = (LinearLayout)findViewById(R.id.linear3);

    }

    public void onResume(){
        super.onResume();

        check3 = sharedPreferences2.getBoolean("DARKMODE",false);

        if(!check3){
            linearLayout3.setBackgroundColor(Color.WHITE);
            Intent intent4 = new Intent(this,SettingsActivity.class);

        }else{
            linearLayout3.setBackgroundColor(Color.DKGRAY);
        } Intent intent4 = new Intent(this,SettingsActivity.class);


    }


    public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);
        }
    }
}