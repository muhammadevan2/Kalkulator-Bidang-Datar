package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends AppCompatActivity {

    EditText edt_panjang;
    TextView txt_luas,txt_keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        initComponent();
    }

    private void initComponent() {
        edt_panjang = findViewById(R.id.edt_panjang);
        txt_luas = findViewById(R.id.txt_luas);
        txt_keliling = findViewById(R.id.txt_keliling);
    }
    public void hitunglingkaran(View v) {
        double jari = Double.parseDouble(edt_panjang.getText().toString()) / 2.0;
        double diameter = Double.parseDouble(edt_panjang.getText().toString());

        double luas = Math.PI * jari * jari;
        double keliling = Math.PI * diameter;
        txt_luas.setText("" + luas + " cm");
        txt_keliling.setText("" + keliling + " cm");

    }
}