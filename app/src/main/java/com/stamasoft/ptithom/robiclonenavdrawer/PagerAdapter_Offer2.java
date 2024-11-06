package com.stamasoft.ptithom.robiclonenavdrawer;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter_Offer2 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public PagerAdapter_Offer2(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs; }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                All_Offer2_Fragment tab1 = new All_Offer2_Fragment();
                return tab1;
            case 1:
                Thirtydays_offer2_Fragment tab2 = new Thirtydays_offer2_Fragment();
                return tab2;
            case 2:
                TenDays_offer2_Fragment tab3 = new TenDays_offer2_Fragment();
                return tab3;
            case 3:
                SevenDays_offer2Fragment tab4 = new SevenDays_offer2Fragment();
                return tab4;
            case 4:
                TwoDays_offer2Fragment tab5 = new TwoDays_offer2Fragment();
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