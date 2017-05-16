package com.example.masso.mylrtguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjAngkasapuri;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjBankNegara;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjBatangKali;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjBatuTiga;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjBukitBadak;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjJalanKastam;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjJalanTempler;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjKLSentral;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjKepong;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjKepongSentral;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjKgDatoHarun;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjKgRajaUda;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjKlang;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjKualaKubuBharu;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjKualaLumpur;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjKuang;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjPadangJawa;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjPantaiDalam;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjPelabuhanKlang;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjPetaling;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjPutra;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjRasa;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjRawang;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjSegambut;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjSerendah;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjSeriSetia;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjSetiaJaya;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjSgBuluh;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjShahAlam;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjSubangJaya;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjTelukGadong;
import com.example.masso.mylrtguide.TanjungMalimInfo.InfoTanjTelukPulai;

public class TanjungMalim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanjung_malim);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjKualaKubuBharu.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjRasa.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjBatangKali.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjSerendah.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjRawang.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjKuang.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjSgBuluh.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjKepongSentral.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjKepong.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjSegambut.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjPutra.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjBankNegara.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjKualaLumpur.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjKLSentral.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjAngkasapuri.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjPantaiDalam.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjPetaling.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjJalanTempler.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjKgDatoHarun.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjSeriSetia.class);
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

                Intent intent = new Intent(getApplicationContext(), InfoTanjSetiaJaya.class);
                startActivity(intent);

            }
        });
        // --- End Button23  ---


        // -- Start Button24  Instance
        Button btn24 = (Button) findViewById(R.id.button24);
        // Button "Kebelankang" Event Handling
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoTanjSubangJaya.class);
                startActivity(intent);

            }
        });
        // --- End Button24  ---

        // -- Start Button25  Instance
        Button btn25 = (Button) findViewById(R.id.button25);
        // Button "Kebelankang" Event Handling
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoTanjBatuTiga.class);
                startActivity(intent);

            }
        });
        // --- End Button25  ---// -- Start Button23  Instance


        Button btn26 = (Button) findViewById(R.id.button26);
        // Button
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoTanjShahAlam.class);
                startActivity(intent);

            }
        });
        // --- End Button23  ---// -- Start Button23  Instance


        Button btn27 = (Button) findViewById(R.id.button27);
        // Button
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoTanjPadangJawa.class);
                startActivity(intent);

            }
        });
        // --- End Button23  ---

        Button btn28 = (Button) findViewById(R.id.button28);
        // Button "Kebelankang" Event Handling
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoTanjBukitBadak.class);
                startActivity(intent);

            }
        });
        // --- End Button23  ---

        Button btn29 = (Button) findViewById(R.id.button29);
        // Button "Kebelankang" Event Handling
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoTanjKlang.class);
                startActivity(intent);

            }
        });
        // --- End Button23  ---
        Button btn30 = (Button) findViewById(R.id.button30);
        // Button "Kebelankang" Event Handling
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoTanjTelukPulai.class);
                startActivity(intent);

            }
        });
        // --- End Button23  ---

        Button btn31 = (Button) findViewById(R.id.button31);
        // Button "Kebelankang" Event Handling
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoTanjTelukGadong.class);
                startActivity(intent);

            }
        });
        // --- End Button23  ---

        Button btn32 = (Button) findViewById(R.id.button32);
        // Button "Kebelankang" Event Handling
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoTanjKgRajaUda.class);
                startActivity(intent);

            }
        });
        // --- End Button23  ---

        Button btn33 = (Button) findViewById(R.id.button33);
        // Button "Kebelankang" Event Handling
        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoTanjJalanKastam.class);
                startActivity(intent);

            }
        });
        // --- End Button23  ---

        Button btn34 = (Button) findViewById(R.id.button34);
        // Button "Kebelankang" Event Handling
        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), InfoTanjPelabuhanKlang.class);
                startActivity(intent);

            }
        });
        // --- End Button23  ---


    }

}
