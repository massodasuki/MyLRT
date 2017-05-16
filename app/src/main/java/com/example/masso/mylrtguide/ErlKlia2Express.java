package com.example.masso.mylrtguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.masso.mylrtguide.ErlKlia2ExpressInfo.InfoErlKlia2ExKLIA;
import com.example.masso.mylrtguide.ErlKlia2ExpressInfo.InfoErlKlia2ExKlSentral;

public class ErlKlia2Express extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erl_klia2_express);
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

        // -- Start Button3  Instance

        Button btn3 = (Button) findViewById(R.id.button3);
        // Button "Kebelankang" Event Handling
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoErlKlia2ExKLIA.class);
                startActivity(intent);

            }
        });

        // --- End Button3  ---

        // -- Start Button4  Instance
        Button btn4 = (Button) findViewById(R.id.button4);
        // Button "Kebelankang" Event Handling
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoErlKlia2ExKlSentral.class);
                startActivity(intent);

            }
        });

        // --- End Button4  ---
    }

}
