package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Kvittering extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kvittering);

        final SharedPreferences sharedPreferences = getSharedPreferences("SaveData", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();

        Button sendOrderButton = findViewById(R.id.sendOrderButton);
        Button clearOrderButton = findViewById(R.id.clearOrderButton);

        final TextView typeKvittering1 = findViewById(R.id.typeKvittering1);
        final TextView typeKvittering2 = findViewById(R.id.typeKvittering2);
        final TextView typeKvittering3 = findViewById(R.id.typeKvittering3);
        final TextView typeKvittering4 = findViewById(R.id.typeKvittering4);
        final TextView typeKvittering5 = findViewById(R.id.typeKvittering5);
        final TextView typeKvittering6 = findViewById(R.id.typeKvittering6);
        final TextView typeKvittering7 = findViewById(R.id.typeKvittering7);
        final TextView typeKvittering8 = findViewById(R.id.typeKvittering8);
        final TextView typeKvittering9 = findViewById(R.id.typeKvittering9);

        final TextView AntalKvittering1 = findViewById(R.id.AntalKvittering1);
        final TextView AntalKvittering2 = findViewById(R.id.AntalKvittering2);
        final TextView AntalKvittering3 = findViewById(R.id.AntalKvittering3);
        final TextView AntalKvittering4 = findViewById(R.id.AntalKvittering4);
        final TextView AntalKvittering5 = findViewById(R.id.AntalKvittering5);
        final TextView AntalKvittering6 = findViewById(R.id.AntalKvittering6);
        final TextView AntalKvittering7 = findViewById(R.id.AntalKvittering7);
        final TextView AntalKvittering8 = findViewById(R.id.AntalKvittering8);
        final TextView AntalKvittering9 = findViewById(R.id.AntalKvittering9);

        final TextView SizeKvittering1 = findViewById(R.id.SizeKvittering1);
        final TextView SizeKvittering2 = findViewById(R.id.SizeKvittering2);
        final TextView SizeKvittering3 = findViewById(R.id.SizeKvittering3);
        final TextView SizeKvittering4 = findViewById(R.id.SizeKvittering4);
        final TextView SizeKvittering5 = findViewById(R.id.SizeKvittering5);
        final TextView SizeKvittering6 = findViewById(R.id.SizeKvittering6);
        final TextView SizeKvittering7 = findViewById(R.id.SizeKvittering7);
        final TextView SizeKvittering8 = findViewById(R.id.SizeKvittering8);
        final TextView SizeKvittering9 = findViewById(R.id.SizeKvittering9);

        final String bordNummer = sharedPreferences.getString("bordNummerBestillingText1", "Error");
        final String menuVælger = sharedPreferences.getString("menuVælger", "ERROR:CONTACT TECH SUPPORT");

        final String size1 = sharedPreferences.getString("StørrelseBestillingsText1","");
        final String size2 = sharedPreferences.getString("StørrelseBestillingsText2","");
        final String size3 = sharedPreferences.getString("StørrelseBestillingsText3","");
        final String size4 = sharedPreferences.getString("StørrelseBestillingsText4","");
        final String size5 = sharedPreferences.getString("StørrelseBestillingsText5","");
        final String size6 = sharedPreferences.getString("StørrelseBestillingsText6","");
        final String size7 = sharedPreferences.getString("StørrelseBestillingsText7","");
        final String size8 = sharedPreferences.getString("StørrelseBestillingsText8","");
        final String size9 = sharedPreferences.getString("StørrelseBestillingsText9","");


        final String antal1 = sharedPreferences.getString("antalBestillingText1","");
        final String antal2 = sharedPreferences.getString("antalBestillingText2","");
        final String antal3 = sharedPreferences.getString("antalBestillingText3","");
        final String antal4 = sharedPreferences.getString("antalBestillingText4","");
        final String antal5 = sharedPreferences.getString("antalBestillingText5","");
        final String antal6 = sharedPreferences.getString("antalBestillingText6","");
        final String antal7 = sharedPreferences.getString("antalBestillingText7","");
        final String antal8 = sharedPreferences.getString("antalBestillingText8","");
        final String antal9 = sharedPreferences.getString("antalBestillingText9","");

        final String type1 = sharedPreferences.getString("TypeBestillingText1","");
        final String type2 = sharedPreferences.getString("TypeBestillingText2","");
        final String type3 = sharedPreferences.getString("TypeBestillingText3","");
        final String type4 = sharedPreferences.getString("TypeBestillingText4","");
        final String type5 = sharedPreferences.getString("TypeBestillingText5","");
        final String type6 = sharedPreferences.getString("TypeBestillingText6","");
        final String type7 = sharedPreferences.getString("TypeBestillingText7","");
        final String type8 = sharedPreferences.getString("TypeBestillingText8","");
        final String type9 = sharedPreferences.getString("TypeBestillingText9","");



        typeKvittering1.setText(type1);
        typeKvittering2.setText(type2);
        typeKvittering3.setText(type3);
        typeKvittering4.setText(type4);
        typeKvittering5.setText(type5);
        typeKvittering6.setText(type6);
        typeKvittering7.setText(type7);
        typeKvittering8.setText(type8);
        typeKvittering9.setText(type9);

        AntalKvittering1.setText(antal1);
        AntalKvittering2.setText(antal2);
        AntalKvittering3.setText(antal3);
        AntalKvittering4.setText(antal4);
        AntalKvittering5.setText(antal5);
        AntalKvittering6.setText(antal6);
        AntalKvittering7.setText(antal7);
        AntalKvittering8.setText(antal8);
        AntalKvittering9.setText(antal9);

        SizeKvittering1.setText(size1);
        SizeKvittering2.setText(size2);
        SizeKvittering3.setText(size3);
        SizeKvittering4.setText(size4);
        SizeKvittering5.setText(size5);
        SizeKvittering6.setText(size6);
        SizeKvittering7.setText(size7);
        SizeKvittering8.setText(size8);
        SizeKvittering9.setText(size9);




        clearOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("antalBestillingText1", ""); editor.putString("StørrelseBestillingsText1", ""); editor.putString("TypeBestillingText1", "");
                editor.putString("antalBestillingText2", ""); editor.putString("StørrelseBestillingsText2", ""); editor.putString("TypeBestillingText2", "");
                editor.putString("antalBestillingText3", ""); editor.putString("StørrelseBestillingsText3", ""); editor.putString("TypeBestillingText3", "");
                editor.putString("antalBestillingText4", ""); editor.putString("StørrelseBestillingsText4", ""); editor.putString("TypeBestillingText4", "");
                editor.putString("antalBestillingText5", ""); editor.putString("StørrelseBestillingsText5", ""); editor.putString("TypeBestillingText5", "");
                editor.putString("antalBestillingText6", ""); editor.putString("StørrelseBestillingsText6", ""); editor.putString("TypeBestillingText6", "");
                editor.putString("antalBestillingText7", ""); editor.putString("StørrelseBestillingsText7", ""); editor.putString("TypeBestillingText7", "");
                editor.putString("antalBestillingText8", ""); editor.putString("StørrelseBestillingsText8", ""); editor.putString("TypeBestillingText8", "");
                editor.putString("antalBestillingText9", ""); editor.putString("StørrelseBestillingsText9", ""); editor.putString("TypeBestillingText9", "");



            }
        });


        sendOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new SendMessage().execute(
                         menuVælger + "-" + bordNummer + "-" +antal1 + "-"  + type1 + "-"  + size1 + "-"  + antal2 + "-"  + type2 + "-"  + size2 + "-"  + antal3 + "-"  + type3 + "-"  + size3 + "-" +
                         antal4 + "-" + type4 + "-" + size4 + "-" + antal5 + "-" + type5 + "-" + size5 + "-" + antal6 + "-" + type6 + "-" + size6 + "-" +
                         antal7 + "-" + type7 + "-" + size7 + "-" + antal8 + "-" + type8 + "-" + size8 + "-" + antal9 +  "-" + type9 + "-" + size9);

            }
        });






    }


}
