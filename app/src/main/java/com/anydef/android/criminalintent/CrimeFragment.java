package com.anydef.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by ilbcj on 2018/2/5.
 */

public class CrimeFragment extends Fragment {
    private Crime mCrime;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }
}
