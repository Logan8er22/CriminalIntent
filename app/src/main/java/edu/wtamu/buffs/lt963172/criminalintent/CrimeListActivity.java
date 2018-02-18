package edu.wtamu.buffs.lt963172.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by lt963172 on 2/18/2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
