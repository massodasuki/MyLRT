package com.example.masso.mylrtguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.masso.mylrtguide.ErlKlia2TransitInfo.InfoErlKlia2TransBandarTasikSelatan;
import com.example.masso.mylrtguide.ErlKlia2TransitInfo.InfoErlKlia2TransKLIA;
import com.example.masso.mylrtguide.ErlKlia2TransitInfo.InfoErlKlia2TransKlSentral;
import com.example.masso.mylrtguide.ErlKlia2TransitInfo.InfoErlKlia2TransPutraCyber;
import com.example.masso.mylrtguide.ErlKlia2TransitInfo.InfoErlKlia2TransSalakTinggi;

public class ErlKlia2Transit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erl_klia2_transit);
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

                Intent intent = new Intent(getApplicationContext(), InfoErlKlia2TransKLIA.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoErlKlia2TransSalakTinggi.class);
                startActivity(intent);

            }
        });

        // --- End Button4  ---

        // -- Start Button5  Instance
        Button btn5 = (Button) findViewById(R.id.button5);
        // Button "Kebelankang" Event Handling
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoErlKlia2TransPutraCyber.class);
                startActivity(intent);

            }
        });

        // --- End Button5  ---

        // -- Start Button6  Instance
        Button btn6 = (Button) findViewById(R.id.button6);
        // Button "Kebelankang" Event Handling
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoErlKlia2TransBandarTasikSelatan.class);
                startActivity(intent);

            }
        });

        // --- End Button6  ---

        // -- Start Button7  Instance
        Button btn7 = (Button) findViewById(R.id.button7);
        // Button "Kebelankang" Event Handling
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoErlKlia2TransKlSentral.class);
                startActivity(intent);

            }
        });

        // --- End Button7  ---

    }

}
