package com.stamasoft.ptithom.robiclonenavdrawer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.stamasoft.ptithom.robiclonenavdrawer.PagerAdapter_Offer;
import com.stamasoft.ptithom.robiclonenavdrawer.R;


public class Offer extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_offers, container, false);

        TabLayout tabLayout = root.findViewById(R.id.tab_layout_offer);

        tabLayout.addTab(tabLayout.newTab().setText("Super Deals"));
        tabLayout.addTab(tabLayout.newTab().setText("Internet"));
        tabLayout.addTab(tabLayout.newTab().setText("Bundles"));
        tabLayout.addTab(tabLayout.newTab().setText("Rate Cutter"));
        tabLayout.addTab(tabLayout.newTab().setText("Minutes"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        final ViewPager viewPager = root.findViewById(R.id.view_pager_offer);
        final PagerAdapter_Offer adapter = new PagerAdapter_Offer(getChildFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return root;
    }
}