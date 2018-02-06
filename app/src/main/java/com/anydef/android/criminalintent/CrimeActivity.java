package com.anydef.android.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.anydef.android.criminalintent.R.id.fragment_container;

public class CrimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(fragment_container);
        if( fragment == null ) {
            fragment = new CrimeFragment();
            fm.beginTransaction().add(fragment_container).commit();
        }
    }
}
