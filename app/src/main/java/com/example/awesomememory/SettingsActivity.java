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
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceManager;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {


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
        check3 = sharedPreferences2.getBoolean("DARKMODE",false);
        linearLayout3 = (LinearLayout)findViewById(R.id.linear3);

    }

    public void onResume(){
        super.onResume();


        if(!check3){

            linearLayout3.setBackgroundResource(R.drawable.white_brick);



        }else{
            linearLayout3.setBackgroundResource(R.drawable.triangle_black);



        }

    }

    @Override
    public void onClick(View v) {

        
    }



    public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);
        }
    }
}