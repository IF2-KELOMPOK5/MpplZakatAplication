package com.example.kel_5.peganganzakat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class fitrah extends AppCompatActivity {
    EditText edituang;
    TextView tvhasil;
    Button hitung;

    Integer uang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitrah);

        edituang = (EditText) findViewById(R.id.uang);
        tvhasil = (TextView) findViewById(R.id.textView4);
        hitung = (Button) findViewById(R.id.hitung);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasiljumlah();
            }
        });
    }

    public void hasiljumlah(){
        if (!edituang.getText().toString().isEmpty()) {
            Toast.makeText(this, "Mohon isi form Angka 1", Toast.LENGTH_SHORT).show();
        }
        try {
            uang = Integer.parseInt(edituang.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "Mohon isi angka pada form 1", Toast.LENGTH_SHORT).show();
        }
        double hasil = uang * 0.025;
        tvhasil.setText(String.valueOf(hasil));
    }

}
