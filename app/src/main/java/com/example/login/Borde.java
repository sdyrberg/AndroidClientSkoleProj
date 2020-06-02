package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Borde extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borde);

        final SharedPreferences sharedPreferences = getSharedPreferences("SaveData", Context.MODE_PRIVATE);
        String bord1Tid = sharedPreferences.getString("tidBord1","Ledigt");
        String bord2Tid = sharedPreferences.getString("tidBord2","Ledigt");
        String bord3Tid = sharedPreferences.getString("tidBord3","Ledigt");
        String bord4Tid = sharedPreferences.getString("tidBord4","Ledigt");
        String bord5Tid = sharedPreferences.getString("tidBord5","Ledigt");
        String bord6Tid = sharedPreferences.getString("tidBord6","Ledigt");
        String bord7Tid = sharedPreferences.getString("tidBord7","Ledigt");
        String bord8Tid = sharedPreferences.getString("tidBord8","Ledigt");
        String bord9Tid = sharedPreferences.getString("tidBord9","Ledigt");
        String bord10Tid = sharedPreferences.getString("tidBord10","Ledigt");
        String bord11Tid = sharedPreferences.getString("tidBord11","Ledigt");
        String bord12Tid = sharedPreferences.getString("tidBord12","Ledigt");
        String bord13Tid = sharedPreferences.getString("tidBord13","Ledigt");
        String bord14Tid = sharedPreferences.getString("tidBord14","Ledigt");
        String bord15Tid = sharedPreferences.getString("tidBord15","Ledigt");

        final SharedPreferences.Editor editor = sharedPreferences.edit();





        Button bord1 = (Button) (findViewById(R.id.Bord1));
        Button bord2 = (Button) (findViewById(R.id.Bord2));
        Button bord3 = (Button) (findViewById(R.id.Bord3));
        Button bord4 = (Button) (findViewById(R.id.Bord4));
        Button bord5 = (Button) (findViewById(R.id.Bord5));
        Button bord6 = (Button) (findViewById(R.id.Bord6));
        Button bord7 = (Button) (findViewById(R.id.Bord7));
        Button bord8 = (Button) (findViewById(R.id.Bord8));
        Button bord9 = (Button) (findViewById(R.id.Bord9));
        Button bord10 = (Button) (findViewById(R.id.Bord10));
        Button bord11 = (Button) (findViewById(R.id.Bord11));
        Button bord12 = (Button) (findViewById(R.id.Bord12));
        Button bord13 = (Button) (findViewById(R.id.Bord13));
        Button bord14 = (Button) (findViewById(R.id.Bord14));
        Button bord15 = (Button) (findViewById(R.id.Bord15));

        EditText bord1Text = (EditText) (findViewById(R.id.textBord1));
        EditText bord2Text = (EditText) (findViewById(R.id.textBord2));
        EditText bord3Text = (EditText) (findViewById(R.id.textBord3));
        EditText bord4Text = (EditText) (findViewById(R.id.textBord4));
        EditText bord5Text = (EditText) (findViewById(R.id.textBord5));
        EditText bord6Text = (EditText) (findViewById(R.id.textBord6));
        EditText bord7Text = (EditText) (findViewById(R.id.textBord7));
        EditText bord8Text = (EditText) (findViewById(R.id.textBord8));
        EditText bord9Text = (EditText) (findViewById(R.id.textBord9));
        EditText bord10Text = (EditText) (findViewById(R.id.textBord10));
        EditText bord11Text = (EditText) (findViewById(R.id.textBord11));
        EditText bord12Text = (EditText) (findViewById(R.id.textBord12));
        EditText bord13Text = (EditText) (findViewById(R.id.textBord13));
        EditText bord14Text = (EditText) (findViewById(R.id.textBord14));
        EditText bord15Text = (EditText) (findViewById(R.id.textBord15));

        bord1Text.setText(bord1Tid);
        bord2Text.setText(bord2Tid);
        bord3Text.setText(bord3Tid);
        bord4Text.setText(bord4Tid);
        bord5Text.setText(bord5Tid);
        bord6Text.setText(bord6Tid);
        bord7Text.setText(bord7Tid);
        bord8Text.setText(bord8Tid);
        bord9Text.setText(bord9Tid);
        bord10Text.setText(bord10Tid);
        bord11Text.setText(bord11Tid);
        bord12Text.setText(bord12Tid);
        bord13Text.setText(bord13Tid);
        bord14Text.setText(bord14Tid);
        bord15Text.setText(bord15Tid);


        bord1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editor.putString("bordClicked", "Bord1");
                editor.apply();
                Intent bord1I = new Intent(getApplicationContext(),Bord1.class);
                startActivity(bord1I);
            }});
        bord2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editor.putString("bordClicked", "Bord2");
                editor.apply();
                Intent bord1I = new Intent(getApplicationContext(),Bord1.class);
                startActivity(bord1I);
            }});
        bord3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editor.putString("bordClicked", "Bord3");
                editor.apply();
                Intent bord1I = new Intent(getApplicationContext(),Bord1.class);
                startActivity(bord1I);
            }});
        bord4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editor.putString("bordClicked", "Bord4");
                editor.apply();
                Intent bord1I = new Intent(getApplicationContext(),Bord1.class);
                startActivity(bord1I);
            }});
        bord5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editor.putString("bordClicked", "Bord5");
                editor.apply();
                Intent bord1I = new Intent(getApplicationContext(),Bord1.class);
                startActivity(bord1I);
            }});
        bord6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editor.putString("bordClicked", "Bord6");
                editor.apply();
                Intent bord1I = new Intent(getApplicationContext(),Bord1.class);
                startActivity(bord1I);
            }});
        bord7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editor.putString("bordClicked", "Bord7");
                editor.apply();
                Intent bord1I = new Intent(getApplicationContext(),Bord1.class);
                startActivity(bord1I);
            }});
        bord8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editor.putString("bordClicked", "Bord8");
                editor.apply();
                Intent bord1I = new Intent(getApplicationContext(),Bord1.class);
                startActivity(bord1I);
            }});
        bord9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editor.putString("bordClicked", "Bord9");
                editor.apply();
                Intent bord1I = new Intent(getApplicationContext(),Bord1.class);
                startActivity(bord1I);
            }});
        bord10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editor.putString("bordClicked", "Bord10");
                editor.apply();
                Intent bord1I = new Intent(getApplicationContext(),Bord1.class);
                startActivity(bord1I);
            }});
        bord11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editor.putString("bordClicked", "Bord11");
                editor.apply();
                Intent bord1I = new Intent(getApplicationContext(),Bord1.class);
                startActivity(bord1I);
            }});
        bord12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editor.putString("bordClicked", "Bord12");
                editor.apply();
                Intent bord1I = new Intent(getApplicationContext(),Bord1.class);
                startActivity(bord1I);
            }});
        bord13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editor.putString("bordClicked", "Bord13");
                editor.apply();
                Intent bord1I = new Intent(getApplicationContext(),Bord1.class);
                startActivity(bord1I);
            }});
        bord14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editor.putString("bordClicked", "Bord14");
                editor.apply();
                Intent bord1I = new Intent(getApplicationContext(),Bord1.class);
                startActivity(bord1I);
            }});
        bord15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                editor.putString("bordClicked", "Bord15");
                editor.apply();
                Intent bord1I = new Intent(getApplicationContext(),Bord1.class);
                startActivity(bord1I);
            }});


    }
}
