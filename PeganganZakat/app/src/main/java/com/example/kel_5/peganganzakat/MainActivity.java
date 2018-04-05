package com.example.kel_5.peganganzakat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView showRide = (ImageView) findViewById(R.id.intro);

        showRide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Intro.class);
                startActivity(intent);
            }

        });

        ImageView showRide1 = (ImageView) findViewById(R.id.hitung);

        showRide1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, hitung.class);
                startActivity(intent1);
            }
        });
    }
}
