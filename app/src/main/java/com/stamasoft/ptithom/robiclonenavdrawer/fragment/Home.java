package com.stamasoft.ptithom.robiclonenavdrawer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.stamasoft.ptithom.robiclonenavdrawer.PagerAdapter_Home;
import com.stamasoft.ptithom.robiclonenavdrawer.R;
import com.stamasoft.ptithom.robiclonenavdrawer.RecyclerViewAdapter_2;
import com.stamasoft.ptithom.robiclonenavdrawer.RecyclerViewAdapter_3;
import com.stamasoft.ptithom.robiclonenavdrawer.RecyclerViewAdapter_4;

import java.util.ArrayList;


public class Home extends Fragment {

    private ArrayList<String> mImageUrls = new ArrayList<>();
    private RecyclerViewAdapter_2 mAdapter;

    private ArrayList<String> pImageUrls = new ArrayList<>();
    private RecyclerViewAdapter_3 pAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        initImageBitmaps(root);
        initImageBitmaps2(root);
        initImageBitmaps3(root);

        TabLayout tabLayout = root.findViewById(R.id.tab_layout_home);

        tabLayout.addTab(tabLayout.newTab().setText("Hot Deals"));
        tabLayout.addTab(tabLayout.newTab().setText("Cashback Deals"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = root.findViewById(R.id.view_pager_home);
        final PagerAdapter_Home adapter = new PagerAdapter_Home(getChildFragmentManager(), tabLayout.getTabCount());
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

    private void initImageBitmaps(View rootView) {
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView_jfy);
        mAdapter = new RecyclerViewAdapter_2(requireContext(), mImageUrls);
        recyclerView.setAdapter(mAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        mImageUrls.add("https://webapi.robi.com.bd/uploads/2023/08/049cedfb-16c2-4be1-9eff-45524751944c.jpg");
        mImageUrls.add("https://webapi.robi.com.bd/uploads/2022/05/f3a65419-ca1f-448a-99eb-5938d64113ec.jpg");
        mImageUrls.add("https://webapi.robi.com.bd/uploads/files/shares/press_release/5e00b18151379.jpg");
        mImageUrls.add("https://webapi.robi.com.bd/uploads/2024/02/b7c8ce4d-f7c4-46b5-90d0-33a70aa0aa9b.jpg");
        mImageUrls.add("https://webapi.robi.com.bd/uploads/2024/02/3c9221b2-bc3b-48cb-8f1a-f61ac16914a8.jpg");
    }

    private void initImageBitmaps2(View rootView) {
        RecyclerView recyclerView = rootView.findViewById(R.id.rv_whatsnew);
        pAdapter = new RecyclerViewAdapter_3(requireContext(), pImageUrls);
        recyclerView.setAdapter(pAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        pImageUrls.add("https://www.tbsnews.net/sites/default/files/styles/big_3/public/images/2024/03/28/ipltoffeepr.jpg");
        pImageUrls.add("https://i.ytimg.com/vi/NDxA8AIEz6U/hq720.jpg?sqp=-oaymwEhCK4FEIIDSFryq4qpAxMIARUAAAAAGAElAADIQj0AgKJD&rs=AOn4CLCx0I_Ec9Nhu7-HiftqJ2DFfys-8Q");
        pImageUrls.add("https://i.ytimg.com/vi/xhk2Z4smFls/maxresdefault.jpg");
        pImageUrls.add("https://timesofindia.indiatimes.com/photo/msid-101984808,imgsize-162977.cms");
        pImageUrls.add("https://www.risingbd.com/media/imgAll/2020August/en/Photo-2010101518-2010101637.jpg");
    }

    private void initImageBitmaps3(View rootView) {
        RecyclerView recyclerView = rootView.findViewById(R.id.rv_whatsnew2);

        // Initialize your image URLs and image names ArrayLists here
        ArrayList<String> wImageUrls = new ArrayList<>();
        ArrayList<String> wHead = new ArrayList<>();

        // Add sample data (you can replace this with your actual data)
        wImageUrls.add("https://www.eyenews.news/media/imgAll/2023February/en/hotel-2305051633.jpg");
        wHead.add("Watch 'Hotel Relax'");

        wImageUrls.add("https://banglakobita.com.bd/wp-content/uploads/2021/05/padma-nodir-maji.jpg");
        wHead.add("Read 'Padma Nadir Majhi' on Robi Boighor!");

        wImageUrls.add("https://cdn.10minuteschool.com/10ms-homepage-cover.png");
        wHead.add("Free Online Platform");

        wImageUrls.add("https://i.ytimg.com/vi/oHAdQaKG5KU/sddefault.jpg");
        wHead.add("Read 'Poka' on Robi Boighor!");

        wImageUrls.add("https://webapi.robi.com.bd/uploads/2021/01/76e4ab45-5182-42ef-9c76-1a98b5fb5de8.jpg");
        wHead.add("Enjoy your time with 'JoyGames'");

        wImageUrls.add("https://i.ytimg.com/vi/zbyC7YN35js/maxresdefault.jpg");
        wHead.add("Watch 'FRIDAY' on Binge!");

        wImageUrls.add("https://i0.wp.com/redwanadb.com/wp-content/uploads/2016/10/Aainabaji-poster.jpg?fit=1280%2C720&ssl=1");
        wHead.add("Watch 'আয়নাবাজি' on Binge!");

        // Initialize and set the RecyclerView adapter
        RecyclerViewAdapter_4 wAdapter = new RecyclerViewAdapter_4(requireContext(), wHead, wImageUrls);
        recyclerView.setAdapter(wAdapter);

        // Set the layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false));
    }


}


