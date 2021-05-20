package me.finck.and_project;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationView;

public class OnlineModeActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationDrawer;
    NavHostFragment nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_mode);
        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        //Return to Main activity
        initViews();


        }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
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
                    return true;
                case R.id.nav_share:
                    Log.i("navigation","share clicked");
                    drawerLayout.closeDrawer(GravityCompat.START);
                    return true;
                case R.id.nav_logout:
                    Log.i("navigation","share clicked");
                    signOut(this);
                    drawerLayout.closeDrawer(GravityCompat.START);
                    return true;
                case R.id.nav_offline:
                    Log.i("navigation","share clicked");
                    drawerLayout.closeDrawer(GravityCompat.START);
                    signOut(this);
                    Context context = getApplicationContext();
                    Class destination = OfflineModeActivity.class;
                    Intent intent = new Intent(context, destination);
                    startActivity(intent);
                    return true;
                default:
                    return false;
            }
        }

        );


    }
    public void signOut(OnlineModeActivity v) {
        AuthUI.getInstance()
                .signOut(this)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    public void onComplete(@NonNull Task<Void> task) {
                    }
                });
    }



}


