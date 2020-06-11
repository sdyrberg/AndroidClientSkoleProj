package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class AddonMenu extends AppCompatActivity {
    static String isVegan;
    static String isVege;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addon_menu);
        final SharedPreferences sharedPreferences = getSharedPreferences("SaveData", Context.MODE_PRIVATE);
        final String indexAntal = sharedPreferences.getString("menuLinjeValg", "DATA NOT FOUND");
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        Log.i("SE ANTAL", indexAntal);

        final Spinner extraRowSpinner1 = findViewById(R.id.extraSpinner1);
        final Spinner extraRowSpinner2 = findViewById(R.id.extraSpinner2);
        final Spinner extraRowSpinner3 = findViewById(R.id.extraSpinner3);


        final Spinner minusExtraRowSpinner1 = findViewById(R.id.extraMinusSpinner1);
        final Spinner minusExtraRowSpinner2 = findViewById(R.id.extraMinusSpinner2);
        final Spinner minusExtraRowSpinner3 = findViewById(R.id.extraMinusSpinner3);


        final EditText inputText = findViewById(R.id.extraInput);

        final Button submitButton = findViewById(R.id.SubmitKnapExtra);

        final CheckBox checkVegan = findViewById(R.id.veganCheckBox);
        final CheckBox checkVege = findViewById(R.id.vegeCheckBox);





        ArrayAdapter<CharSequence> adapterExtra = ArrayAdapter.createFromResource(this, R.array.ekstra, android.R.layout.simple_spinner_item);
        adapterExtra.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        extraRowSpinner1.setAdapter(adapterExtra);
        extraRowSpinner2.setAdapter(adapterExtra);
        extraRowSpinner3.setAdapter(adapterExtra);


        minusExtraRowSpinner1.setAdapter(adapterExtra);
        minusExtraRowSpinner2.setAdapter(adapterExtra);
        minusExtraRowSpinner3.setAdapter(adapterExtra);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String extraRowSpinnerText1 = extraRowSpinner1.getSelectedItem().toString();
                String extraRowSpinnerText2 = extraRowSpinner2.getSelectedItem().toString();
                String extraRowSpinnerText3 = extraRowSpinner3.getSelectedItem().toString();


                String minusExtraRowSpinnerText1 = minusExtraRowSpinner1.getSelectedItem().toString();
                String minusExtraRowSpinnerText2 = minusExtraRowSpinner2.getSelectedItem().toString();
                String minusExtraRowSpinnerText3 = minusExtraRowSpinner3.getSelectedItem().toString();


                String extraDiverse = inputText.getText().toString();
                if (checkVegan.isChecked()){
                    isVegan = "Vegan";

                }else{
                    isVegan ="";
                }

                if (checkVege.isChecked()){
                    isVege = "Vegetar";
                }else{
                    isVege = "";
                }

                String tilSend =  extraRowSpinnerText1 + " " + extraRowSpinnerText2 + " " + extraRowSpinnerText3 + " "
                        + minusExtraRowSpinnerText1 + " " + minusExtraRowSpinnerText2 + " " + minusExtraRowSpinnerText3 + " " + isVegan + " " + isVege + " " + extraDiverse;
                editor.putString(indexAntal, tilSend);
                editor.apply();
                Log.i("Sendt", tilSend);
                 finish();


            }
        });


    }
}
