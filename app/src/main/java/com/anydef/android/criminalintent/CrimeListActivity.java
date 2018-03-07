package com.anydef.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by ilbcj on 2018/3/7.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        Fragment fragment = new CrimeListFragment();
        return fragment;
    }
}
