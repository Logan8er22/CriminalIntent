package edu.wtamu.buffs.lt963172.criminalintent;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected CrimeListFragment createFragment() {
        return new CrimeFragment();
    }
}
