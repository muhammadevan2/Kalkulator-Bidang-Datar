package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    EditText edt_panjang, edt_lebar;
    TextView txt_luas,txt_keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        initComponent();
    }

        private void initComponent() {
            edt_panjang = findViewById(R.id.edt_panjang);
            edt_lebar = findViewById(R.id.edt_lebar);
            txt_luas = findViewById(R.id.txt_luas);
            txt_keliling = findViewById(R.id.txt_keliling);
        }
    public void hitungsegitiga (View v) {
        double alas = Double.parseDouble(edt_panjang.getText().toString());
        double tinggi = Double.parseDouble(edt_panjang.getText().toString());

        double luas =  (alas * tinggi) /2;
        double keliling = alas * alas * alas;
        txt_luas.setText("" + luas + " cm");
        txt_keliling.setText("" + keliling + " cm");
    }

}