package com.example.kel_5.peganganzakat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView showRide = (ImageView) findViewById(R.id.intro);

        showRide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, Intro.class);
                startActivity(intent);
            }

        });

        ImageView showRide1 = (ImageView) findViewById(R.id.hitung);

        showRide1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(menu.this, hitung.class);
                startActivity(intent1);
            }
        });

        ImageView showRide2 = (ImageView) findViewById(R.id.fitrah);

        showRide2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(menu.this, fitrah.class);
                startActivity(intent2);
            }
        });

        ImageView showRide3 = (ImageView) findViewById(R.id.maal);

        showRide3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(menu.this, maal.class);
                startActivity(intent3);
            }
        });

    }
}