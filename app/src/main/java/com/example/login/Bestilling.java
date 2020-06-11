package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Bestilling extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bestilling);
        final SharedPreferences sharedPreferences = getSharedPreferences("SaveData", Context.MODE_PRIVATE);
        final String bordNummer = sharedPreferences.getString("bordClicked","DATA NOT FOUND");
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        final String menuVælger = sharedPreferences.getString("menuVælger", "ERROR");

        TextView menuHeader = (TextView)(findViewById(R.id.bordHeader));
        menuHeader.setText(menuVælger);

        final Button buttonExtraBestilling1 = findViewById(R.id.buttonOrderExtra1);
        final Button buttonExtraBestilling2 = findViewById(R.id.buttonOrderExtra2);
        final Button buttonExtraBestilling3 = findViewById(R.id.buttonOrderExtra3);
        final Button buttonExtraBestilling4 = findViewById(R.id.buttonOrderExtra4);
        final Button buttonExtraBestilling5 = findViewById(R.id.buttonOrderExtra5);
        final Button buttonExtraBestilling6 = findViewById(R.id.buttonOrderExtra6);
        final Button buttonExtraBestilling7 = findViewById(R.id.buttonOrderExtra7);
        final Button buttonExtraBestilling8 = findViewById(R.id.buttonOrderExtra8);
        final Button buttonExtraBestilling9 = findViewById(R.id.buttonOrderExtra9);

        final Spinner spinnerRowOneBestil1 = findViewById(R.id.spinnerRowOneBestil1);
        final Spinner spinnerRowOneBestil2 = findViewById(R.id.spinnerRowOneBestil2);
        final Spinner spinnerRowOneBestil3 = findViewById(R.id.spinnerRowOneBestil3);
        final Spinner spinnerRowOneBestil4 = findViewById(R.id.spinnerRowOneBestil4);
        final Spinner spinnerRowOneBestil5 = findViewById(R.id.spinnerRowOneBestil5);
        final Spinner spinnerRowOneBestil6 = findViewById(R.id.spinnerRowOneBestil6);
        final Spinner spinnerRowOneBestil7 = findViewById(R.id.spinnerRowOneBestil7);
        final Spinner spinnerRowOneBestil8 = findViewById(R.id.spinnerRowOneBestil8);
        final Spinner spinnerRowOneBestil9 = findViewById(R.id.spinnerRowOneBestil9);

        final Spinner spinnerSize1 = findViewById(R.id.spinnerRowTwoBestil1);
        final Spinner spinnerSize2 = findViewById(R.id.spinnerRowTwoBestil2);
        final Spinner spinnerSize3 = findViewById(R.id.spinnerRowTwoBestil3);
        final Spinner spinnerSize4 = findViewById(R.id.spinnerRowTwoBestil4);
        final Spinner spinnerSize5 = findViewById(R.id.spinnerRowTwoBestil5);
        final Spinner spinnerSize6 = findViewById(R.id.spinnerRowTwoBestil6);
        final Spinner spinnerSize7 = findViewById(R.id.spinnerRowTwoBestil7);
        final Spinner spinnerSize8 = findViewById(R.id.spinnerRowTwoBestil8);
        final Spinner spinnerSize9 = findViewById(R.id.spinnerRowTwoBestil9);

        final Spinner spinnerDrik1 = findViewById(R.id.spinnerRowThreeBestil1);
        final Spinner spinnerDrik2 = findViewById(R.id.spinnerRowThreeBestil2);
        final Spinner spinnerDrik3 = findViewById(R.id.spinnerRowThreeBestil3);
        final Spinner spinnerDrik4 = findViewById(R.id.spinnerRowThreeBestil4);
        final Spinner spinnerDrik5 = findViewById(R.id.spinnerRowThreeBestil5);
        final Spinner spinnerDrik6 = findViewById(R.id.spinnerRowThreeBestil6);
        final Spinner spinnerDrik7 = findViewById(R.id.spinnerRowThreeBestil7);
        final Spinner spinnerDrik8 = findViewById(R.id.spinnerRowThreeBestil8);
        final Spinner spinnerDrik9 = findViewById(R.id.spinnerRowThreeBestil9);

        final Intent tilExtra = new Intent(getApplicationContext(),AddonMenu.class);

        buttonExtraBestilling1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                editor.putString("menuLinjeValg", "Item1");
                editor.apply();
                startActivity(tilExtra);
            }
        });
        buttonExtraBestilling2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putString("menuLinjeValg", "Item2");
                editor.apply();
                startActivity(tilExtra);
            }
        });
        buttonExtraBestilling3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putString("menuLinjeValg", "Item3");
                editor.apply();
                startActivity(tilExtra);
            }
        });
        buttonExtraBestilling4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putString("menuLinjeValg", "Item4");
                editor.apply();
                startActivity(tilExtra);
            }
        });
        buttonExtraBestilling5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putString("menuLinjeValg", "Item5");
                editor.apply();
                startActivity(tilExtra);
            }
        });
        buttonExtraBestilling6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putString("menuLinjeValg", "Item6");
                editor.apply();
                startActivity(tilExtra);
            }
        });
        buttonExtraBestilling7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putString("menuLinjeValg", "Item7");
                editor.apply();
                startActivity(tilExtra);
            }
        });
        buttonExtraBestilling8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putString("menuLinjeValg", "Item8");
                editor.apply();
                startActivity(tilExtra);
            }
        });
        buttonExtraBestilling9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putString("menuLinjeValg", "Item9");
                editor.apply();
                startActivity(tilExtra);
            }
        });


        //Adapters
        if(menuVælger.contains("Drikke")) {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.antal, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.størrelse, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            ArrayAdapter<CharSequence> drikAdapter = ArrayAdapter.createFromResource(this, R.array.drikke, android.R.layout.simple_spinner_item);
            drikAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinnerRowOneBestil1.setAdapter(adapter);
            spinnerRowOneBestil2.setAdapter(adapter);
            spinnerRowOneBestil3.setAdapter(adapter);
            spinnerRowOneBestil4.setAdapter(adapter);
            spinnerRowOneBestil5.setAdapter(adapter);
            spinnerRowOneBestil6.setAdapter(adapter);
            spinnerRowOneBestil7.setAdapter(adapter);
            spinnerRowOneBestil8.setAdapter(adapter);
            spinnerRowOneBestil9.setAdapter(adapter);

            spinnerSize1.setAdapter(adapter2);
            spinnerSize2.setAdapter(adapter2);
            spinnerSize3.setAdapter(adapter2);
            spinnerSize4.setAdapter(adapter2);
            spinnerSize5.setAdapter(adapter2);
            spinnerSize6.setAdapter(adapter2);
            spinnerSize7.setAdapter(adapter2);
            spinnerSize8.setAdapter(adapter2);
            spinnerSize9.setAdapter(adapter2);

            spinnerDrik1.setAdapter((drikAdapter));
            spinnerDrik2.setAdapter((drikAdapter));
            spinnerDrik3.setAdapter((drikAdapter));
            spinnerDrik4.setAdapter((drikAdapter));
            spinnerDrik5.setAdapter((drikAdapter));
            spinnerDrik6.setAdapter((drikAdapter));
            spinnerDrik7.setAdapter((drikAdapter));
            spinnerDrik8.setAdapter((drikAdapter));
            spinnerDrik9.setAdapter((drikAdapter));
        }
        if(menuVælger.contains("Frokost")){
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.antal, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.frokostMenu, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            ArrayAdapter<CharSequence> drikAdapter = ArrayAdapter.createFromResource(this, R.array.bøfStatus, android.R.layout.simple_spinner_item);
            drikAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinnerRowOneBestil1.setAdapter(adapter);
            spinnerRowOneBestil2.setAdapter(adapter);
            spinnerRowOneBestil3.setAdapter(adapter);
            spinnerRowOneBestil4.setAdapter(adapter);
            spinnerRowOneBestil5.setAdapter(adapter);
            spinnerRowOneBestil6.setAdapter(adapter);
            spinnerRowOneBestil7.setAdapter(adapter);
            spinnerRowOneBestil8.setAdapter(adapter);
            spinnerRowOneBestil9.setAdapter(adapter);

            spinnerSize1.setAdapter(adapter2);
            spinnerSize2.setAdapter(adapter2);
            spinnerSize3.setAdapter(adapter2);
            spinnerSize4.setAdapter(adapter2);
            spinnerSize5.setAdapter(adapter2);
            spinnerSize6.setAdapter(adapter2);
            spinnerSize7.setAdapter(adapter2);
            spinnerSize8.setAdapter(adapter2);
            spinnerSize9.setAdapter(adapter2);

            spinnerDrik1.setAdapter((drikAdapter));
            spinnerDrik2.setAdapter((drikAdapter));
            spinnerDrik3.setAdapter((drikAdapter));
            spinnerDrik4.setAdapter((drikAdapter));
            spinnerDrik5.setAdapter((drikAdapter));
            spinnerDrik6.setAdapter((drikAdapter));
            spinnerDrik7.setAdapter((drikAdapter));
            spinnerDrik8.setAdapter((drikAdapter));
            spinnerDrik9.setAdapter((drikAdapter));
        }
        if(menuVælger.contains("Aften")){
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.antal, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.aften, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            ArrayAdapter<CharSequence> drikAdapter = ArrayAdapter.createFromResource(this, R.array.bøfStatus, android.R.layout.simple_spinner_item);
            drikAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinnerRowOneBestil1.setAdapter(adapter);
            spinnerRowOneBestil2.setAdapter(adapter);
            spinnerRowOneBestil3.setAdapter(adapter);
            spinnerRowOneBestil4.setAdapter(adapter);
            spinnerRowOneBestil5.setAdapter(adapter);
            spinnerRowOneBestil6.setAdapter(adapter);
            spinnerRowOneBestil7.setAdapter(adapter);
            spinnerRowOneBestil8.setAdapter(adapter);
            spinnerRowOneBestil9.setAdapter(adapter);

            spinnerSize1.setAdapter(adapter2);
            spinnerSize2.setAdapter(adapter2);
            spinnerSize3.setAdapter(adapter2);
            spinnerSize4.setAdapter(adapter2);
            spinnerSize5.setAdapter(adapter2);
            spinnerSize6.setAdapter(adapter2);
            spinnerSize7.setAdapter(adapter2);
            spinnerSize8.setAdapter(adapter2);
            spinnerSize9.setAdapter(adapter2);

            spinnerDrik1.setAdapter((drikAdapter));
            spinnerDrik2.setAdapter((drikAdapter));
            spinnerDrik3.setAdapter((drikAdapter));
            spinnerDrik4.setAdapter((drikAdapter));
            spinnerDrik5.setAdapter((drikAdapter));
            spinnerDrik6.setAdapter((drikAdapter));
            spinnerDrik7.setAdapter((drikAdapter));
            spinnerDrik8.setAdapter((drikAdapter));
            spinnerDrik9.setAdapter((drikAdapter));
        }






        //Buttons
        Button tilKvittering = findViewById(R.id.tilKvitering);



        tilKvittering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean Done = true;
                editor.putString("bordNummerBestillingText1", bordNummer);

                editor.putString("antalBestillingText1", "" );
                editor.putString("StørrelseBestillingsText1", "");
                editor.putString("TypeBestillingText1", "");

                editor.putString("antalBestillingText2", "" );
                editor.putString("StørrelseBestillingsText2", "");
                editor.putString("TypeBestillingText2", "");

                editor.putString("antalBestillingText3", "" );
                editor.putString("StørrelseBestillingsText3", "");
                editor.putString("TypeBestillingText3", "");

                editor.putString("antalBestillingText4", "" );
                editor.putString("StørrelseBestillingsText4", "");
                editor.putString("TypeBestillingText4", "");

                editor.putString("antalBestillingText5", "" );
                editor.putString("StørrelseBestillingsText5", "");
                editor.putString("TypeBestillingText5", "");

                editor.putString("antalBestillingText6", "" );
                editor.putString("StørrelseBestillingsText6", "");
                editor.putString("TypeBestillingText6", "");

                editor.putString("antalBestillingText7", "" );
                editor.putString("StørrelseBestillingsText7", "");
                editor.putString("TypeBestillingText7", "");

                editor.putString("antalBestillingText8", "" );
                editor.putString("StørrelseBestillingsText8", "");
                editor.putString("TypeBestillingText8", "");

                editor.putString("antalBestillingText9", "" );
                editor.putString("StørrelseBestillingsText9", "");
                editor.putString("TypeBestillingText9", "");

                editor.apply();


                String spinnerRowOneBestilText1 = spinnerRowOneBestil1.getSelectedItem().toString();
                String spinnerRowOneBestilText2 = spinnerRowOneBestil2.getSelectedItem().toString();
                String spinnerRowOneBestilText3 = spinnerRowOneBestil3.getSelectedItem().toString();
                String spinnerRowOneBestilText4 = spinnerRowOneBestil4.getSelectedItem().toString();
                String spinnerRowOneBestilText5 = spinnerRowOneBestil5.getSelectedItem().toString();
                String spinnerRowOneBestilText6 = spinnerRowOneBestil6.getSelectedItem().toString();
                String spinnerRowOneBestilText7 = spinnerRowOneBestil7.getSelectedItem().toString();
                String spinnerRowOneBestilText8 = spinnerRowOneBestil8.getSelectedItem().toString();
                String spinnerRowOneBestilText9 = spinnerRowOneBestil9.getSelectedItem().toString();

                String spinnerSizeText1 = spinnerSize1.getSelectedItem().toString();
                String spinnerSizeText2 = spinnerSize2.getSelectedItem().toString();
                String spinnerSizeText3 = spinnerSize3.getSelectedItem().toString();
                String spinnerSizeText4 = spinnerSize4.getSelectedItem().toString();
                String spinnerSizeText5 = spinnerSize5.getSelectedItem().toString();
                String spinnerSizeText6 = spinnerSize6.getSelectedItem().toString();
                String spinnerSizeText7 = spinnerSize7.getSelectedItem().toString();
                String spinnerSizeText8 = spinnerSize8.getSelectedItem().toString();
                String spinnerSizeText9 = spinnerSize9.getSelectedItem().toString();

                String spinnerDrikText1 = spinnerDrik1.getSelectedItem().toString();
                String spinnerDrikText2 = spinnerDrik2.getSelectedItem().toString();
                String spinnerDrikText3 = spinnerDrik3.getSelectedItem().toString();
                String spinnerDrikText4 = spinnerDrik4.getSelectedItem().toString();
                String spinnerDrikText5 = spinnerDrik5.getSelectedItem().toString();
                String spinnerDrikText6 = spinnerDrik6.getSelectedItem().toString();
                String spinnerDrikText7 = spinnerDrik7.getSelectedItem().toString();
                String spinnerDrikText8 = spinnerDrik8.getSelectedItem().toString();
                String spinnerDrikText9 = spinnerDrik9.getSelectedItem().toString();




                if (spinnerRowOneBestilText2.equals("0") && spinnerRowOneBestilText3.equals("0") && spinnerRowOneBestilText4.equals("0") && spinnerRowOneBestilText5.equals("0") && spinnerRowOneBestilText6.equals("0") && spinnerRowOneBestilText7.equals("0")
                        && spinnerRowOneBestilText8.equals("0") && spinnerRowOneBestilText9.equals("0") &&  Done) {

                    editor.putString("antalBestillingText1", spinnerRowOneBestilText1 );
                    editor.putString("StørrelseBestillingsText1", spinnerSizeText1);
                    editor.putString("TypeBestillingText1", spinnerDrikText1);
                    editor.apply();

                    Done = false;

                }
                if (spinnerRowOneBestilText3.equals("0") && spinnerRowOneBestilText4.equals("0") && spinnerRowOneBestilText5.equals("0") && spinnerRowOneBestilText6.equals("0")
                        && spinnerRowOneBestilText7.equals("0") && spinnerRowOneBestilText8.equals("0") && spinnerRowOneBestilText9.equals("0") && Done) {



                    editor.putString("antalBestillingText1", spinnerRowOneBestilText1 );
                    editor.putString("StørrelseBestillingsText1", spinnerSizeText1);
                    editor.putString("TypeBestillingText1", spinnerDrikText1);

                    editor.putString("antalBestillingText2", spinnerRowOneBestilText2 );
                    editor.putString("StørrelseBestillingsText2", spinnerSizeText2);
                    editor.putString("TypeBestillingText2", spinnerDrikText2);

                    editor.apply();
                    Done = false;
                }
                if (spinnerRowOneBestilText4.equals("0") && spinnerRowOneBestilText5.equals("0") && spinnerRowOneBestilText6.equals("0") && spinnerRowOneBestilText7.equals("0") && spinnerRowOneBestilText8.equals("0") && spinnerRowOneBestilText9.equals("0")  && Done) {

                    Done = false;

                    editor.putString("antalBestillingText1", spinnerRowOneBestilText1 );
                    editor.putString("StørrelseBestillingsText1", spinnerSizeText1);
                    editor.putString("TypeBestillingText1", spinnerDrikText1);

                    editor.putString("antalBestillingText2", spinnerRowOneBestilText2 );
                    editor.putString("StørrelseBestillingsText2", spinnerSizeText2);
                    editor.putString("TypeBestillingText2", spinnerDrikText2);

                    editor.putString("antalBestillingText3", spinnerRowOneBestilText3 );
                    editor.putString("StørrelseBestillingsText3", spinnerSizeText3);
                    editor.putString("TypeBestillingText3", spinnerDrikText3);

                    editor.apply();
                }
                if (spinnerRowOneBestilText5.equals("0") && spinnerRowOneBestilText6.equals("0") && spinnerRowOneBestilText7.equals("0") && spinnerRowOneBestilText8.equals("0") && spinnerRowOneBestilText9.equals("0") && Done) {

                    Done = false;

                    editor.putString("antalBestillingText1", spinnerRowOneBestilText1 );
                    editor.putString("StørrelseBestillingsText1", spinnerSizeText1);
                    editor.putString("TypeBestillingText1", spinnerDrikText1);

                    editor.putString("antalBestillingText2", spinnerRowOneBestilText2 );
                    editor.putString("StørrelseBestillingsText2", spinnerSizeText2);
                    editor.putString("TypeBestillingText2", spinnerDrikText2);

                    editor.putString("antalBestillingText3", spinnerRowOneBestilText3 );
                    editor.putString("StørrelseBestillingsText3", spinnerSizeText3);
                    editor.putString("TypeBestillingText3", spinnerDrikText3);

                    editor.putString("antalBestillingText4", spinnerRowOneBestilText4 );
                    editor.putString("StørrelseBestillingsText4", spinnerSizeText4);
                    editor.putString("TypeBestillingText4", spinnerDrikText4);
                    editor.apply();

                }
                if (spinnerRowOneBestilText6.equals("0") && spinnerRowOneBestilText7.equals("0") && spinnerRowOneBestilText8.equals("0") && spinnerRowOneBestilText9.equals("0")  && Done) {


                    Done = false;

                    editor.putString("antalBestillingText1", spinnerRowOneBestilText1 );
                    editor.putString("StørrelseBestillingsText1", spinnerSizeText1);
                    editor.putString("TypeBestillingText1", spinnerDrikText1);

                    editor.putString("antalBestillingText2", spinnerRowOneBestilText2 );
                    editor.putString("StørrelseBestillingsText2", spinnerSizeText2);
                    editor.putString("TypeBestillingText2", spinnerDrikText2);

                    editor.putString("antalBestillingText3", spinnerRowOneBestilText3 );
                    editor.putString("StørrelseBestillingsText3", spinnerSizeText3);
                    editor.putString("TypeBestillingText3", spinnerDrikText3);

                    editor.putString("antalBestillingText4", spinnerRowOneBestilText4 );
                    editor.putString("StørrelseBestillingsText4", spinnerSizeText4);
                    editor.putString("TypeBestillingText4", spinnerDrikText4);

                    editor.putString("antalBestillingText5", spinnerRowOneBestilText5 );
                    editor.putString("StørrelseBestillingsText5", spinnerSizeText5);
                    editor.putString("TypeBestillingText5", spinnerDrikText5);

                    editor.apply();

                }
                if (spinnerRowOneBestilText7.equals("0") && spinnerRowOneBestilText8.equals("0") && spinnerRowOneBestilText9.equals("0")  && Done) {

                    editor.putString("antalBestillingText1", spinnerRowOneBestilText1 );
                    editor.putString("StørrelseBestillingsText1", spinnerSizeText1);
                    editor.putString("TypeBestillingText1", spinnerDrikText1);

                    editor.putString("antalBestillingText2", spinnerRowOneBestilText2 );
                    editor.putString("StørrelseBestillingsText2", spinnerSizeText2);
                    editor.putString("TypeBestillingText2", spinnerDrikText2);

                    editor.putString("antalBestillingText3", spinnerRowOneBestilText3 );
                    editor.putString("StørrelseBestillingsText3", spinnerSizeText3);
                    editor.putString("TypeBestillingText3", spinnerDrikText3);

                    editor.putString("antalBestillingText4", spinnerRowOneBestilText4 );
                    editor.putString("StørrelseBestillingsText4", spinnerSizeText4);
                    editor.putString("TypeBestillingText4", spinnerDrikText4);

                    editor.putString("antalBestillingText5", spinnerRowOneBestilText5 );
                    editor.putString("StørrelseBestillingsText5", spinnerSizeText5);
                    editor.putString("TypeBestillingText5", spinnerDrikText5);

                    editor.putString("antalBestillingText6", spinnerRowOneBestilText6 );
                    editor.putString("StørrelseBestillingsText6", spinnerSizeText6);
                    editor.putString("TypeBestillingText6", spinnerDrikText6);

                    editor.apply();
                    Done = false;
                }
                if (spinnerRowOneBestilText8.equals("0") && spinnerRowOneBestilText9.equals("0")  && Done) {
                    editor.putString("antalBestillingText1", spinnerRowOneBestilText1 );
                    editor.putString("StørrelseBestillingsText1", spinnerSizeText1);
                    editor.putString("TypeBestillingText1", spinnerDrikText1);

                    editor.putString("antalBestillingText2", spinnerRowOneBestilText2 );
                    editor.putString("StørrelseBestillingsText2", spinnerSizeText2);
                    editor.putString("TypeBestillingText2", spinnerDrikText2);

                    editor.putString("antalBestillingText3", spinnerRowOneBestilText3 );
                    editor.putString("StørrelseBestillingsText3", spinnerSizeText3);
                    editor.putString("TypeBestillingText3", spinnerDrikText3);

                    editor.putString("antalBestillingText4", spinnerRowOneBestilText4 );
                    editor.putString("StørrelseBestillingsText4", spinnerSizeText4);
                    editor.putString("TypeBestillingText4", spinnerDrikText4);

                    editor.putString("antalBestillingText5", spinnerRowOneBestilText5 );
                    editor.putString("StørrelseBestillingsText5", spinnerSizeText5);
                    editor.putString("TypeBestillingText5", spinnerDrikText5);

                    editor.putString("antalBestillingText6", spinnerRowOneBestilText6 );
                    editor.putString("StørrelseBestillingsText6", spinnerSizeText6);
                    editor.putString("TypeBestillingText6", spinnerDrikText6);

                    editor.putString("antalBestillingText7", spinnerRowOneBestilText7 );
                    editor.putString("StørrelseBestillingsText7", spinnerSizeText7);
                    editor.putString("TypeBestillingText7", spinnerDrikText7);

                    editor.apply();
                    Done = false;
                }
                if (spinnerRowOneBestilText9.equals("0")  && Done) {
                    editor.putString("antalBestillingText1", spinnerRowOneBestilText1 );
                    editor.putString("StørrelseBestillingsText1", spinnerSizeText1);
                    editor.putString("TypeBestillingText1", spinnerDrikText1);

                    editor.putString("antalBestillingText2", spinnerRowOneBestilText2 );
                    editor.putString("StørrelseBestillingsText2", spinnerSizeText2);
                    editor.putString("TypeBestillingText2", spinnerDrikText2);

                    editor.putString("antalBestillingText3", spinnerRowOneBestilText3 );
                    editor.putString("StørrelseBestillingsText3", spinnerSizeText3);
                    editor.putString("TypeBestillingText3", spinnerDrikText3);

                    editor.putString("antalBestillingText4", spinnerRowOneBestilText4 );
                    editor.putString("StørrelseBestillingsText4", spinnerSizeText4);
                    editor.putString("TypeBestillingText4", spinnerDrikText4);

                    editor.putString("antalBestillingText5", spinnerRowOneBestilText5 );
                    editor.putString("StørrelseBestillingsText5", spinnerSizeText5);
                    editor.putString("TypeBestillingText5", spinnerDrikText5);

                    editor.putString("antalBestillingText6", spinnerRowOneBestilText6 );
                    editor.putString("StørrelseBestillingsText6", spinnerSizeText6);
                    editor.putString("TypeBestillingText6", spinnerDrikText6);

                    editor.putString("antalBestillingText7", spinnerRowOneBestilText7 );
                    editor.putString("StørrelseBestillingsText7", spinnerSizeText7);
                    editor.putString("TypeBestillingText7", spinnerDrikText7);

                    editor.putString("antalBestillingText8", spinnerRowOneBestilText8 );
                    editor.putString("StørrelseBestillingsText8", spinnerSizeText8);
                    editor.putString("TypeBestillingText8", spinnerDrikText8);
                    editor.apply();
                    Done = false;
                }


                    if (Done) {
                        new SendMessage().execute("HEJ JEG ER EN FEJL");
                        editor.putString("antalBestillingText1", spinnerRowOneBestilText1 );
                        editor.putString("StørrelseBestillingsText1", spinnerSizeText1);
                        editor.putString("TypeBestillingText1", spinnerDrikText1);

                        editor.putString("antalBestillingText2", spinnerRowOneBestilText2 );
                        editor.putString("StørrelseBestillingsText2", spinnerSizeText2);
                        editor.putString("TypeBestillingText2", spinnerDrikText2);

                        editor.putString("antalBestillingText3", spinnerRowOneBestilText3 );
                        editor.putString("StørrelseBestillingsText3", spinnerSizeText3);
                        editor.putString("TypeBestillingText3", spinnerDrikText3);

                        editor.putString("antalBestillingText4", spinnerRowOneBestilText4 );
                        editor.putString("StørrelseBestillingsText4", spinnerSizeText4);
                        editor.putString("TypeBestillingText4", spinnerDrikText4);

                        editor.putString("antalBestillingText5", spinnerRowOneBestilText5 );
                        editor.putString("StørrelseBestillingsText5", spinnerSizeText5);
                        editor.putString("TypeBestillingText5", spinnerDrikText5);

                        editor.putString("antalBestillingText6", spinnerRowOneBestilText6 );
                        editor.putString("StørrelseBestillingsText6", spinnerSizeText6);
                        editor.putString("TypeBestillingText6", spinnerDrikText6);

                        editor.putString("antalBestillingText7", spinnerRowOneBestilText7 );
                        editor.putString("StørrelseBestillingsText7", spinnerSizeText7);
                        editor.putString("TypeBestillingText7", spinnerDrikText7);

                        editor.putString("antalBestillingText8", spinnerRowOneBestilText8 );
                        editor.putString("StørrelseBestillingsText8", spinnerSizeText8);
                        editor.putString("TypeBestillingText8", spinnerDrikText8);

                        editor.putString("antalBestillingText9", spinnerRowOneBestilText9 );
                        editor.putString("StørrelseBestillingsText9", spinnerSizeText9);
                        editor.putString("TypeBestillingText9", spinnerDrikText9);

                        editor.apply();
                        Done = false;


                }
                if(spinnerRowOneBestilText1.equals("0")){ editor.putString("antalBestillingText1", ""); editor.putString("StørrelseBestillingsText1", ""); editor.putString("TypeBestillingText1", ""); }
                if(spinnerRowOneBestilText2.equals("0")){ editor.putString("antalBestillingText2", ""); editor.putString("StørrelseBestillingsText2", ""); editor.putString("TypeBestillingText2", ""); }
                if(spinnerRowOneBestilText3.equals("0")){ editor.putString("antalBestillingText3", ""); editor.putString("StørrelseBestillingsText3", ""); editor.putString("TypeBestillingText3", ""); }
                if(spinnerRowOneBestilText4.equals("0")){ editor.putString("antalBestillingText4", ""); editor.putString("StørrelseBestillingsText4", ""); editor.putString("TypeBestillingText4", ""); }
                if(spinnerRowOneBestilText5.equals("0")){ editor.putString("antalBestillingText5", ""); editor.putString("StørrelseBestillingsText5", ""); editor.putString("TypeBestillingText5", ""); }
                if(spinnerRowOneBestilText6.equals("0")){ editor.putString("antalBestillingText6", ""); editor.putString("StørrelseBestillingsText6", ""); editor.putString("TypeBestillingText6", ""); }
                if(spinnerRowOneBestilText7.equals("0")){ editor.putString("antalBestillingText7", ""); editor.putString("StørrelseBestillingsText7", ""); editor.putString("TypeBestillingText7", ""); }
                if(spinnerRowOneBestilText8.equals("0")){ editor.putString("antalBestillingText8", ""); editor.putString("StørrelseBestillingsText8", ""); editor.putString("TypeBestillingText8", ""); }
                if(spinnerRowOneBestilText9.equals("0")){ editor.putString("antalBestillingText9", ""); editor.putString("StørrelseBestillingsText9", ""); editor.putString("TypeBestillingText9", ""); }



                Intent tilKvitClass= new Intent(getApplicationContext(),Kvittering.class);
                startActivity(tilKvitClass);
            }
        });



    }

    public void onBackPressed() {
        Intent backtoBord= new Intent(getApplicationContext(),Bord1.class);
        startActivity(backtoBord);
    }



}
