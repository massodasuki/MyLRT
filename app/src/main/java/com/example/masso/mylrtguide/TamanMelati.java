package com.example.masso.mylrtguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.masso.mylrtguide.TamanMelatiInfo.InfoAbdullahHukum;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoAmpangPark;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoAsiaJaya;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoBangsar;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoDamai;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoDatoKeramat;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoJelatek;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoKLCC;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoKLSentral;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoKampungBaru;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoKelanaJaya;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoKerinchi;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoMasjidJamek;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoPasarSeni;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoSetiaWangsa;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoSriRampai;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoTamanBahagia;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoTamanJaya;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoTamanParamount;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoUniversiti;
import com.example.masso.mylrtguide.TamanMelatiInfo.InfoWangsaMaju;

public class TamanMelati extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taman_melati);
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

                Intent intent = new Intent(getApplicationContext(), InfoWangsaMaju.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoSriRampai.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoSetiaWangsa.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoJelatek.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoDatoKeramat.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoDamai.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoAmpangPark.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoKLCC.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoKampungBaru.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoMasjidJamek.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoPasarSeni.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoKLSentral.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBangsar.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoAbdullahHukum.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoKerinchi.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoUniversiti.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTamanJaya.class);
                startActivity(intent);

            }
        });

        // --- End Button19  ---

        // -- Start Button20  Instance
        Button btn20 = (Button) findViewById(R.id.button20);
        // Button "Kebelankang" Event Handling
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoAsiaJaya.class);
                startActivity(intent);

            }
        });

        // --- End Button20  ---

        // -- Start Button21  Instance
        Button btn21 = (Button) findViewById(R.id.button21);
        // Button "Kebelankang" Event Handling
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoTamanParamount.class);
                startActivity(intent);

            }
        });

        // --- End Button21  ---

        // -- Start Button22  Instance
        Button btn22 = (Button) findViewById(R.id.button22);
        // Button "Kebelankang" Event Handling
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoTamanBahagia.class);
                startActivity(intent);

            }
        });

        // --- End Button22  ---

        // -- Start Button23  Instance
        Button btn23 = (Button) findViewById(R.id.button23);
        // Button "Kebelankang" Event Handling
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoKelanaJaya.class);
                startActivity(intent);

            }
        });

        // --- End Button23  ---

    }

}
