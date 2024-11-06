package com.stamasoft.ptithom.robiclonenavdrawer;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter_Offer extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public PagerAdapter_Offer(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs; }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                SuperDealsFragment tab1 = new SuperDealsFragment();
                return tab1;
            case 1:
                InternetFragment tab2 = new InternetFragment();
                return tab2;
            case 2:
                BundlesFragment tab3 = new BundlesFragment();
                return tab3;
            case 3:
                RateCutterFragment tab4 = new RateCutterFragment();
                return tab4;
            case 4:
                MinutesFragment tab5 = new MinutesFragment();
                return tab5;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}