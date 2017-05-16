package com.example.masso.mylrtguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.masso.mylrtguide.AmpangInfo.InfoAmpBandarraya;
import com.example.masso.mylrtguide.AmpangInfo.InfoAmpCahaya;
import com.example.masso.mylrtguide.AmpangInfo.InfoAmpCempaka;
import com.example.masso.mylrtguide.AmpangInfo.InfoAmpChanSowLin;
import com.example.masso.mylrtguide.AmpangInfo.InfoAmpHangTuah;
import com.example.masso.mylrtguide.AmpangInfo.InfoAmpMaluri;
import com.example.masso.mylrtguide.AmpangInfo.InfoAmpMasjidJamek;
import com.example.masso.mylrtguide.AmpangInfo.InfoAmpMiharja;
import com.example.masso.mylrtguide.AmpangInfo.InfoAmpPWTC;
import com.example.masso.mylrtguide.AmpangInfo.InfoAmpPandanIndah;
import com.example.masso.mylrtguide.AmpangInfo.InfoAmpPandanJaya;
import com.example.masso.mylrtguide.AmpangInfo.InfoAmpPlazaRakyat;
import com.example.masso.mylrtguide.AmpangInfo.InfoAmpPudu;
import com.example.masso.mylrtguide.AmpangInfo.InfoAmpSentul;
import com.example.masso.mylrtguide.AmpangInfo.InfoAmpSentulTimur;
import com.example.masso.mylrtguide.AmpangInfo.InfoAmpSultanIsmail;
import com.example.masso.mylrtguide.AmpangInfo.InfoAmpTitiwangsa;

public class Ampang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampang);
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

                Intent intent = new Intent(getApplicationContext(), InfoAmpCahaya.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoAmpCempaka.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoAmpPandanIndah.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoAmpPandanJaya.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoAmpMaluri.class);
                startActivity(intent);

            }
        });

        // --- End Button7  ---

        // -- Start Button8  Instance
        Button btn8 = (Button) findViewById(R.id.button8);
        // Button "Kebelankang" Event Handling
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoAmpMiharja.class);
                startActivity(intent);

            }
        });

        // --- End Button8  ---

        // -- Start Button9  Instance
        Button btn9 = (Button) findViewById(R.id.button9);
        // Button "Kebelankang" Event Handling
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoAmpChanSowLin.class);
                startActivity(intent);
            }
        });

        // --- End Button9  ---

        // -- Start Button10  Instance
        Button btn10 = (Button) findViewById(R.id.button10);
        // Button "Kebelankang" Event Handling
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoAmpPudu.class);
                startActivity(intent);


            }
        });

        // --- End Button10  ---

        // -- Start Button11  Instance
        Button btn11 = (Button) findViewById(R.id.button11);
        // Button "Kebelankang" Event Handling
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoAmpHangTuah.class);
                startActivity(intent);

            }
        });

        // --- End Button11  ---

        // -- Start Button12  Instance
        Button btn12 = (Button) findViewById(R.id.button12);
        // Button "Kebelankang" Event Handling
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoAmpPlazaRakyat.class);
                startActivity(intent);
            }
        });

        // --- End Button12  ---

        // -- Start Button13  Instance
        Button btn13 = (Button) findViewById(R.id.button13);
        // Button "Kebelankang" Event Handling
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoAmpMasjidJamek.class);
                startActivity(intent);

            }
        });

        // --- End Button13  ---

        // -- Start Button14  Instance
        Button btn14 = (Button) findViewById(R.id.button14);
        // Button "Kebelankang" Event Handling
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoAmpBandarraya.class);
                startActivity(intent);


            }
        });

        // --- End Button14  ---

        // -- Start Button15  Instance
        Button btn15 = (Button) findViewById(R.id.button15);
        // Button "Kebelankang" Event Handling
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoAmpSultanIsmail.class);
                startActivity(intent);
            }
        });

        // --- End Button15  ---

        // -- Start Button16  Instance
        Button btn16 = (Button) findViewById(R.id.button16);
        // Button "Kebelankang" Event Handling
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoAmpPWTC.class);
                startActivity(intent);


            }
        });

        // --- End Button16  ---

        // -- Start Button17  Instance
        Button btn17 = (Button) findViewById(R.id.button17);
        // Button "Kebelankang" Event Handling
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoAmpTitiwangsa.class);
                startActivity(intent);

            }
        });

        // --- End Button17  ---

        // -- Start Button18  Instance
        Button btn18 = (Button) findViewById(R.id.button18);
        // Button "Kebelankang" Event Handling
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoAmpSentul.class);
                startActivity(intent);

            }
        });

        // --- End Button18  ---

        // -- Start Button19  Instance
        Button btn19 = (Button) findViewById(R.id.button19);
        // Button "Kebelankang" Event Handling
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoAmpSentulTimur.class);
                startActivity(intent);

            }
        });

        // --- End Button19  ---


    }

}
