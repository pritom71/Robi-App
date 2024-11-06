package com.stamasoft.ptithom.robiclonenavdrawer;

import android.os.Bundle;
import android.view.Menu;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.stamasoft.ptithom.robiclonenavdrawer.databinding.ActivityMainBinding;
import com.stamasoft.ptithom.robiclonenavdrawer.fragment.Discover;
import com.stamasoft.ptithom.robiclonenavdrawer.fragment.Home;
import com.stamasoft.ptithom.robiclonenavdrawer.fragment.More;
import com.stamasoft.ptithom.robiclonenavdrawer.fragment.Offer;
import com.stamasoft.ptithom.robiclonenavdrawer.fragment.Shop;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> jfy_Images = new ArrayList<>();

    ActivityMainBinding binding;

    private AppBarConfiguration mAppBarConfiguration;

    MeowBottomNavigation bottomNavigation;


    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        bottomNavigation = findViewById(R.id.bottom_navigation);

// Add items with icons and text
        bottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.home_icon));
        bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.shopcart));
        bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.discover_icon));
        bottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.offerz));
        bottomNavigation.add(new MeowBottomNavigation.Model(5, R.drawable.more_icon));


// Set text for each item
        bottomNavigation.show(1, true);
        binding.bottomNavigation.setOnShowListener(item -> {
            switch (item.getId()) {
                case 1:
                    replaceFragment(new Home());
                    break;
                case 2:
                    replaceFragment(new Shop());
                    break;
                case 3:
                    replaceFragment(new Discover());
                    break;
                case 4:
                    replaceFragment(new Offer());
                    break;
                case 5:
                    replaceFragment(new More());
                    break;
            }
            return null;
        });


        Window window = getWindow();
        window.setStatusBarColor(getResources().getColor(R.color.status));
        // Set up the Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

       /* Toolbar toolbar2 = findViewById(R.id.toolbar2);
        toolbar2.setBackground(ContextCompat.getDrawable(this, R.drawable.rounded_toolbar_background));*/


        /*findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        // Set up the DrawerLayout and NavigationView
       /* DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.home2, R.id.gallery, R.id.slideshow)
                .setOpenableLayout(drawer)
                .build();

        // Set up NavController and link with ActionBar and NavigationView
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);*/
    }


    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


}
