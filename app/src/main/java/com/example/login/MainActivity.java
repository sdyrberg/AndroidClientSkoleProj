package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loginKnap = (Button) (findViewById(R.id.loginSubmit));
        final EditText login = (EditText) (findViewById(R.id.login));
        final EditText pWord = (EditText) (findViewById(R.id.pword));

        loginKnap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String loginText = login.getText().toString();
                String pWordText = pWord.getText().toString();
                if (loginText.equals("") && pWordText.equals("")){

                    Intent activityIntent2 = new Intent(getApplicationContext(),Borde.class);
                    startActivity(activityIntent2);
                    }
                else {
                    Toast.makeText(MainActivity.this, "FAILED", Toast.LENGTH_LONG).show();
                }
            }


        });
    }
}
