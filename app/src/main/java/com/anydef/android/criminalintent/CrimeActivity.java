package com.anydef.android.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.anydef.android.criminalintent.R.id.fragment_container;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        Fragment  fragment = new CrimeFragment();
        return fragment;
    }
}
