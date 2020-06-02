package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Bord1 extends AppCompatActivity {

    public static final String SHARED_PREFS = "sharedPrefs";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bord1);

        Button frokostKnap = findViewById(R.id.frokostKnap);
        Button aftenKnapBord1 = findViewById(R.id.aftenKnapBord1);
        Button Seating = (Button) (findViewById(R.id.seating));
        final Button Bestilling = (Button) (findViewById(R.id.bestilling));
        Button Betaling = (Button) (findViewById(R.id.betaling));

        final SharedPreferences sharedPreferences = getSharedPreferences("SaveData", Context.MODE_PRIVATE);
        final String bordNummer = sharedPreferences.getString("bordClicked","DATA NOT FOUND");
        final SharedPreferences.Editor editor = sharedPreferences.edit();

        TextView bordNummerHeader = (TextView) (findViewById(R.id.BordNummerHeader));
        bordNummerHeader.setText(bordNummer);

        aftenKnapBord1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("menuVælger", "Aften");
                editor.apply();
                Intent bestilling = new Intent(getApplicationContext(), Bestilling.class);
                startActivity(bestilling);
            }
        });

        frokostKnap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("menuVælger", "Frokost");
                editor.apply();
                Intent bestilling = new Intent(getApplicationContext(), Bestilling.class);
                startActivity(bestilling);
            }
        });

        Seating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date currentTime = Calendar.getInstance().getTime();
                SimpleDateFormat dateFormat = new SimpleDateFormat("hh.mm.ss");
                String output = dateFormat.format(currentTime);

                if(bordNummer.equals("Bord 1")) {

                    editor.putString("tidBord1", output);
                    editor.apply();

                    new SendMessage().execute(bordNummer + " satte sig klokken: " + output);
                }
                if(bordNummer.equals("Bord 2")) {

                    editor.putString("tidBord2", output);
                    editor.apply();

                    new SendMessage().execute(bordNummer + " satte sig klokken: " + output);
                }
                if(bordNummer.equals("Bord 3")) {

                    editor.putString("tidBord3", output);
                    editor.apply();

                    new SendMessage().execute(bordNummer + " satte sig klokken: " + output);
                }
                if(bordNummer.equals("Bord 4")) {

                    editor.putString("tidBord4", output);
                    editor.apply();

                    new SendMessage().execute(bordNummer + " satte sig klokken: " + output);
                }
                if(bordNummer.equals("Bord 5")) {

                    editor.putString("tidBord5", output);
                    editor.apply();

                    new SendMessage().execute(bordNummer + " satte sig klokken: " + output);
                }
                if(bordNummer.equals("Bord 6")) {

                    editor.putString("tidBord6", output);
                    editor.apply();

                    new SendMessage().execute(bordNummer + " satte sig klokken: " + output);
                }
                if(bordNummer.equals("Bord 7")) {

                    editor.putString("tidBord7", output);
                    editor.apply();

                    new SendMessage().execute(bordNummer + " satte sig klokken: " + output);
                }
                if(bordNummer.equals("Bord 8")) {

                    editor.putString("tidBord8", output);
                    editor.apply();

                    new SendMessage().execute(bordNummer + " satte sig klokken: " + output);
                }
                if(bordNummer.equals("Bord 9")) {

                    editor.putString("tidBord5", output);
                    editor.apply();

                    new SendMessage().execute(bordNummer + " satte sig klokken: " + output);
                }
                if(bordNummer.equals("Bord 9")) {

                    editor.putString("tidBord5", output);
                    editor.apply();

                    new SendMessage().execute(bordNummer + " satte sig klokken: " + output);
                }
                if(bordNummer.equals("Bord 10")) {

                    editor.putString("tidBord10", output);
                    editor.apply();

                    new SendMessage().execute(bordNummer + " satte sig klokken: " + output);
                }
                if(bordNummer.equals("Bord 11")) {

                    editor.putString("tidBord11", output);
                    editor.apply();

                    new SendMessage().execute(bordNummer + " satte sig klokken: " + output);
                }
                if(bordNummer.equals("Bord 12")) {

                    editor.putString("tidBord12", output);
                    editor.apply();

                    new SendMessage().execute(bordNummer + " satte sig klokken: " + output);
                }
                if(bordNummer.equals("Bord 13")) {

                    editor.putString("tidBord13", output);
                    editor.apply();

                    new SendMessage().execute(bordNummer + " satte sig klokken: " + output);
                }
                if(bordNummer.equals("Bord 14")) {

                    editor.putString("tidBord14", output);
                    editor.apply();

                    new SendMessage().execute(bordNummer + " satte sig klokken: " + output);
                }
                if(bordNummer.equals("Bord 15")) {

                    editor.putString("tidBord15", output);
                    editor.apply();

                    new SendMessage().execute(bordNummer + " satte sig klokken: " + output);
                }

            }
        });

        Bestilling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("menuVælger", "Drikke");
                editor.apply();
                Intent bestilling = new Intent(getApplicationContext(), Bestilling.class);
                startActivity(bestilling);
            }
        });
    }
    public void onBackPressed() {
        Intent backtoBorde= new Intent(getApplicationContext(),Borde.class);
        startActivity(backtoBorde);
    }
}
