package com.example.masso.mylrtguide.ErlKlia2TransitInfo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.masso.mylrtguide.MainActivity;
import com.example.masso.mylrtguide.R;

import com.example.masso.mylrtguide.R;

public class InfoErlKlia2TransPutraCyber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_erl_klia2_trans_putra_cyber);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
