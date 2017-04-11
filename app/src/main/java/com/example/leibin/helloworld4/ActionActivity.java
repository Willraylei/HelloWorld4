package com.example.leibin.helloworld4;

import android.os.Bundle;
import android.preference.PreferenceActivity;



public class ActionActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.action_preferences);
    }
}
