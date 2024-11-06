package com.stamasoft.ptithom.robiclonenavdrawer;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter_Home extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public PagerAdapter_Home(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs; }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HotDealsFragment tab1 = new HotDealsFragment();
                return tab1;
            case 1:
                CashBackDealsFragment tab2 = new CashBackDealsFragment();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}