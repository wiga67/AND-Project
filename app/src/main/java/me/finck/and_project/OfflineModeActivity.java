package me.finck.and_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.navigation.NavigationView;

import org.jetbrains.annotations.NotNull;

public class OfflineModeActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationDrawer;
    NavHostFragment nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline_mode);
        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        //Return to Main activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initViews();


        }
    private void initViews() {
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationDrawer = findViewById(R.id.nav_view);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragmentContainerView);
        NavController navCo = navHostFragment.getNavController();

        navigationDrawer.setNavigationItemSelectedListener(menuItem -> {
            switch(menuItem.getItemId()) {
                case R.id.nav_home:
                    Log.i("navigation","home clicked");
                    drawerLayout.closeDrawer(GravityCompat.START);
                    return true;
                case R.id.nav_gallery:
                    Log.i("navigation","gallery clicked");
                    drawerLayout.closeDrawer(GravityCompat.START);
                    navCo.navigate(R.id.action_test2_to_login);
                    return true;
                case R.id.nav_share:
                    Log.i("navigation","share clicked");
                    drawerLayout.closeDrawer(GravityCompat.START);
                    return true;
                default:
                    return false;
            }
        }

        );


    }


    }


