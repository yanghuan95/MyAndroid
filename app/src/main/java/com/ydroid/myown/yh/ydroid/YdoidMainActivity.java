package com.ydroid.myown.yh.ydroid;

import android.support.v4.app.Fragment;

public class YdoidMainActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return YdroidListFragment.newInstance();
    }
}
