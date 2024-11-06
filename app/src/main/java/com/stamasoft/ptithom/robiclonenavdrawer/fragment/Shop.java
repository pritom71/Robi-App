package com.stamasoft.ptithom.robiclonenavdrawer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.stamasoft.ptithom.robiclonenavdrawer.R;
import com.stamasoft.ptithom.robiclonenavdrawer.RecyclerViewShop;
import com.stamasoft.ptithom.robiclonenavdrawer.RecyclerViewShop2;
import com.stamasoft.ptithom.robiclonenavdrawer.RecyclerViewShop3;

import java.util.ArrayList;

public class Shop extends Fragment {

    private ArrayList<String> proImageUrls = new ArrayList<>();
    private ArrayList<String> proName = new ArrayList<>();
    private ArrayList<String> proPrice = new ArrayList<>();
    private ArrayList<String> proDis = new ArrayList<>();
    private RecyclerViewShop sAdapter;
    private RecyclerViewShop2 sAdapter2;
    private RecyclerViewShop3 sAdapter3;
    private ArrayList<String> proImageUrls2 = new ArrayList<>();
    private ArrayList<String> proName2 = new ArrayList<>();
    private ArrayList<String> proPrice2 = new ArrayList<>();
    private ArrayList<String> proDis2 = new ArrayList<>();

    private ArrayList<String> proImageUrls3 = new ArrayList<>();
    private ArrayList<String> proName3 = new ArrayList<>();
    private ArrayList<String> proPrice3 = new ArrayList<>();
    private ArrayList<String> proDis3 = new ArrayList<>();

    ViewFlipper viewFlipper,viewFlipper2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_shop, container, false);

        // Initialize viewFlipper
        viewFlipper = rootView.findViewById(R.id.viewFlipper_shop);
        viewFlipper2 = rootView.findViewById(R.id.viewFlipper_shop2);

        // Set animation
        Animation in = AnimationUtils.loadAnimation(requireContext(), android.R.anim.slide_in_left);
        viewFlipper.setInAnimation(in);
        viewFlipper2.setInAnimation(in);
        initImageBitmaps(rootView);
        initImageBitmaps2(rootView);
        initImageBitmaps3(rootView);
        return rootView;
    }
    private void initImageBitmaps(View rootView) {
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView_shop1);
        sAdapter = new RecyclerViewShop(requireContext(), proImageUrls, proName, proPrice, proDis);
        recyclerView.setAdapter(sAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        proImageUrls.add("https://fdn2.gsmarena.com/vv/bigpic/oneplus-nord-2-5g-new.jpg");
        proName.add("OnePlus Nord 2");
        proPrice.add("৳ 15,899.00");
        proDis.add("-20%");

        proImageUrls.add("https://asia-exstatic-vivofs.vivo.com/PSee2l50xoirPK7y/1674014367810/e6bb97634aab414a17ba638ff526fa6a.png");
        proName.add("vivo Y02");
        proPrice.add("৳ 10,999.00");
        proDis.add("-3%");

        proImageUrls.add("https://asia-exstatic-vivofs.vivo.com/PSee2l50xoirPK7y/1695365793586/fd2574975f45b0b23340355de6454465.png");
        proName.add("vivo Y17s");
        proPrice.add("৳ 14,499.00");
        proDis.add("-10%");

        proImageUrls.add("https://www.startech.com.bd/image/cache/catalog/mobile/samsung/galaxy-a04/galaxy-a04-white-500x500.webp");
        proName.add("Samsung A04");
        proPrice.add("৳ 14,999.00");
        proDis.add("-13%");

        proImageUrls.add("https://adminapi.applegadgetsbd.com/storage/media/large/iPhone-11-Black-5949.jpg");
        proName.add("Iphone 11");
        proPrice.add("৳ 40,500.00");
        proDis.add("-25%");

        proImageUrls.add("https://www.mobiledokan.co/wp-content/uploads/2024/03/Motorola-Edge-50-Ultra-Nordic-Wood.webp");
        proName.add("Motorola Edge 50");
        proPrice.add("৳ 90,000.00");
        proDis.add("-20%");
    }
    private void initImageBitmaps2(View rootView) {
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView_shop2);
        sAdapter2 = new RecyclerViewShop2(requireContext(), proImageUrls2, proName2, proPrice2, proDis2);
        recyclerView.setAdapter(sAdapter2);

        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        proImageUrls2.add("https://www.techlandbd.com/image/cache/wp/gj/Earbuds/HAVIT/HAVIT%20TW947/havit-tw947-1100x1100.webp");
        proName2.add("HAVIT TW947");
        proPrice2.add("৳ 1,600.00");
        proDis2.add("-3%");


        proImageUrls2.add("https://www.gadstyle.com/wp-content/uploads/2023/05/havit-sk763-rgb-gaming-usb-speaker.webp");
        proName2.add("Havit SK763");
        proPrice2.add("৳ 790.00");
        proDis2.add("None");

        proImageUrls2.add("https://www.gadstyle.com/wp-content/uploads/2021/12/havit-m9016-bluetooth-calling-smart-watch-1.jpg");
        proName2.add("Havit M9016 ");
        proPrice2.add("৳ 2,850.00");
        proDis2.add("-5%");

        proImageUrls2.add("https://adminapi.applegadgetsbd.com/storage/media/large/iPhone-14-Midnight-4715.jpg");
        proName2.add("iPhone 14");
        proPrice2.add("৳ 118,000");
        proDis2.add("-13%");

        proImageUrls2.add("https://adminapi.applegadgetsbd.com/storage/media/large/Galaxy-S24_S24-Plus-Marble-Gray-1733.jpg");
        proName2.add("Galaxy S24+");
        proPrice2.add("৳ 101,500");
        proDis2.add("None");

        proImageUrls2.add("https://adminapi.applegadgetsbd.com/storage/media/large/3772-72569.jpg");
        proName2.add("QuietComfort");
        proPrice2.add("৳  30,000.00");
        proDis2.add("None");
    }
    private static final int NUM_COLUMNS = 2;

    private void initImageBitmaps3(View rootView) {
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView_shop3);
        sAdapter3 = new RecyclerViewShop3(requireContext(), proImageUrls3, proName3, proPrice3, proDis3);
        recyclerView.setAdapter(sAdapter3);

        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), NUM_COLUMNS));

        // Add data for the second column
        proImageUrls3.add("https://www.butterflygroupbd.com/media/catalog/product/cache/807179e0efd3fdc56a08c70c6ed6b007/a/c/ac_01-01.jpg");
        proName3.add("NON-INVERTER AC");
        proPrice3.add("৳ 45,000");
        proDis3.add("-5%");

        proImageUrls3.add("https://www.gadstyle.com/wp-content/uploads/2022/06/baseus-flyer-turbine-handheld-fan-4000mah-1.webp");
        proName3.add("Handheld Fan");
        proPrice3.add("৳ 1,890");
        proDis3.add("-10%");

        proImageUrls3.add("https://dvf83rt16ac4w.cloudfront.net/upload/product/20230205_1675585808_219688.jpeg");
        proName3.add("Fastrack Reflex");
        proPrice3.add("৳ 9,999");
        proDis3.add("-15%");

        proImageUrls3.add("https://dvf83rt16ac4w.cloudfront.net/upload/product/20231028_1698469283_923214.jpeg");
        proName3.add("Kieslect KS");
        proPrice3.add("৳ 3,799");
        proDis3.add("None");

        proImageUrls3.add("https://dvf83rt16ac4w.cloudfront.net/upload/media/1713759750176404.jpeg");
        proName3.add("UGREEN USB");
        proPrice3.add("৳ 499");
        proDis3.add("-3%");

        proImageUrls3.add("https://dvf83rt16ac4w.cloudfront.net/upload/product/20220607_1654583278_404137.png");
        proName3.add("BOYA BY-PM500W");
        proPrice3.add("৳ 15,399");
        proDis3.add("None");

        proImageUrls3.add("https://dvf83rt16ac4w.cloudfront.net/upload/product/20231026_1698290909_643064.jpeg");
        proName3.add("iPhone 15 Pro");
        proPrice3.add("৳ 1,79,999");
        proDis3.add("None");

        proImageUrls3.add("https://dvf83rt16ac4w.cloudfront.net/upload/product/20231023_1698034911_794022.jpeg");
        proName3.add("iPhone 15");
        proPrice3.add("৳ 1,44,999");
        proDis3.add("None");
    }
}
