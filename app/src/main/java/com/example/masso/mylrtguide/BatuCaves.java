package com.example.masso.mylrtguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvBandarTasikSelatan;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvBangi;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvBankNegara;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvBatangBenar;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvBatuKenton;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvKLSentral;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvKajang;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvKgBatu;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvKualaLumpur;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvLabu;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvMidValley;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvNilai;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvPulauSebangTampin;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvPutra;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvRembau;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvSalakSelatan;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvSenawang;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvSentul;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvSeputeh;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvSerdang;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvSeremban;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvSgGadut;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvTamanWahyu;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvTiroi;
import com.example.masso.mylrtguide.BatuCaveInfo.InfoBtCvUKM;

public class BatuCaves extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batu_caves);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvTamanWahyu.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvKgBatu.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvBatuKenton.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvSentul.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvPutra.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvBankNegara.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvKualaLumpur.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvKLSentral.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvMidValley.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvSeputeh.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvSalakSelatan.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvBandarTasikSelatan.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvSerdang.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvKajang.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvUKM.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvBangi.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvBatangBenar.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvNilai.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvLabu.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvTiroi.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoBtCvSeremban.class);
                startActivity(intent);

            }
        });
        // --- End Button23  ---


        // -- Start Button23  Instance
        Button btn24 = (Button) findViewById(R.id.button24);
        // Button "Kebelankang" Event Handling
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoBtCvSenawang.class);
                startActivity(intent);

            }
        });
        // --- End Button23  ---

        // -- Start Button23  Instance
        Button btn25 = (Button) findViewById(R.id.button25);
        // Button "Kebelankang" Event Handling
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoBtCvSgGadut.class);
                startActivity(intent);

            }
        });
        // --- End Button23  ---// -- Start Button23  Instance
        Button btn26 = (Button) findViewById(R.id.button26);
        // Button "Kebelankang" Event Handling
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoBtCvRembau.class);
                startActivity(intent);

            }
        });
        // --- End Button23  ---// -- Start Button23  Instance

        Button btn27 = (Button) findViewById(R.id.button27);
        // Button "Kebelankang" Event Handling
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoBtCvPulauSebangTampin.class);
                startActivity(intent);

            }
        });
        // --- End Button23  ---

    }

}
