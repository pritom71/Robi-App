package com.stamasoft.ptithom.robiclonenavdrawer;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs; }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Login_Fragment tab1 = new Login_Fragment();
                return tab1;
            case 1:
                Recharge_Fragment tab2 = new Recharge_Fragment();
                return tab2;
            case 2:
                Sim_Fragment tab3 = new Sim_Fragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}