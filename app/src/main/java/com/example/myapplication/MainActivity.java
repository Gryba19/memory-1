package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    TextView helloText;
    Button przycisk;
    Button przycisk2;
    Button idzPrzycisk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText = (TextView) findViewById(R.id.helloText);
        helloText.setText("Zmieniony");
        helloText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "kliknięto pole tekstowe", Toast.LENGTH_SHORT).show();
            }

        });

        przycisk = (Button) findViewById(R.id.przycisk);
        przycisk.setOnClickListener(this);

        przycisk2 = (Button) findViewById((R.id.przycisk2));
        przycisk2.setOnClickListener(this);

        idzPrzycisk = (Button) findViewById(R.id.idzPrzycisk);
        idzPrzycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
        @Override
        public void onClick (View v){

            if (v.getId() == przycisk.getId()) {
                Toast.makeText(this, "kliknięto przycisk pierwszy", Toast.LENGTH_SHORT).show();
                helloText.setText("Nowy tekst po kliknięciu przycisku pierwszego");
            } else if (v.getId() == przycisk2.getId()) {
                Toast.makeText(this, "kliknięto przycisk drugiego", Toast.LENGTH_SHORT).show();
                helloText.setText("Nowy tekst po kliknięciu przycisku drugiego");
            }
        }
    }
