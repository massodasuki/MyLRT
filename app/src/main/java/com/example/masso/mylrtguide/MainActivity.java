package com.example.masso.mylrtguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.masso.mylrtguide.attractionLandMark.attractAqua;
import com.example.masso.mylrtguide.attractionLandMark.attractBatuCaves;
import com.example.masso.mylrtguide.attractionLandMark.attractBerjayaTimesSquare;
import com.example.masso.mylrtguide.attractionLandMark.attractCity;
import com.example.masso.mylrtguide.attractionLandMark.attractDataran;
import com.example.masso.mylrtguide.attractionLandMark.attractMarket;
import com.example.masso.mylrtguide.attractionLandMark.attractMasjid;
import com.example.masso.mylrtguide.attractionLandMark.attractMenara;
import com.example.masso.mylrtguide.attractionLandMark.attractSultan;
import com.example.masso.mylrtguide.attractionLandMark.attractSuria;
import com.example.masso.mylrtguide.attractionLandMark.attractStreetFoodNightMarket;
import com.example.masso.mylrtguide.attractionLandMark.attractMidValleyMegaMallBangsar;
import com.example.masso.mylrtguide.attractionLandMark.attractChinaTownKualaLumpur;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "My Guide LRT Version 1.0", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_railway_tmn_melati) {

            Intent intent = new Intent(getApplicationContext(), TamanMelati.class);
            startActivity(intent);

            // Handle the camera action
        } else if (id == R.id.nav_railway_batu_caves) {

            Intent intent = new Intent(getApplicationContext(), BatuCaves.class);
            startActivity(intent);

        } else if (id == R.id.nav_railway_ampang) {

            Intent intent = new Intent(getApplicationContext(), Ampang.class);
            startActivity(intent);

        } else if (id == R.id.nav_railway_tanjung_malim) {

            Intent intent = new Intent(getApplicationContext(), TanjungMalim.class);
            startActivity(intent);
        }

        else if (id == R.id.nav_railway_klia2express) {

            Intent intent = new Intent(getApplicationContext(), ErlKlia2Express.class);
            startActivity(intent);

        }

        else if (id == R.id.nav_railway_klia2transit) {

            Intent intent = new Intent(getApplicationContext(), ErlKlia2Transit.class);
            startActivity(intent);

        }

        else if (id == R.id.Suria) {

            Intent intent = new Intent(getApplicationContext(), attractSuria.class);
            startActivity(intent);

        } else if (id == R.id.Aqua) {

            Intent intent = new Intent(getApplicationContext(), attractAqua.class);
            startActivity(intent);

        } else if (id == R.id.Menara) {

            Intent intent = new Intent(getApplicationContext(), attractMenara.class);
            startActivity(intent);

        } else if (id == R.id.Masjid) {

            Intent intent = new Intent(getApplicationContext(), attractMasjid.class);
            startActivity(intent);

        } else if (id == R.id.Dataran) {

            Intent intent = new Intent(getApplicationContext(), attractDataran.class);
            startActivity(intent);

        } else if (id == R.id.City) {

            Intent intent = new Intent(getApplicationContext(), attractCity.class);
            startActivity(intent);

        } else if (id == R.id.Sultan) {

            Intent intent = new Intent(getApplicationContext(), attractSultan.class);
            startActivity(intent);

        } else if (id == R.id.Market) {

            Intent intent = new Intent(getApplicationContext(), attractMarket.class);
            startActivity(intent);

        }

        else if (id == R.id.BatuCaves) {

            Intent intent = new Intent(getApplicationContext(), attractBatuCaves.class);
            startActivity(intent);

        }

        else if (id == R.id.Megamall) {

            Intent intent = new Intent(getApplicationContext(), attractMidValleyMegaMallBangsar.class);
            startActivity(intent);

        }

        else if (id == R.id.Berjaya) {

            Intent intent = new Intent(getApplicationContext(), attractBerjayaTimesSquare.class);
            startActivity(intent);

        }

        else if (id == R.id.Food) {

            Intent intent = new Intent(getApplicationContext(), attractStreetFoodNightMarket.class);
            startActivity(intent);

        }

        else if (id == R.id.China) {

            Intent intent = new Intent(getApplicationContext(), attractChinaTownKualaLumpur.class);
            startActivity(intent);

        }




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }
}
