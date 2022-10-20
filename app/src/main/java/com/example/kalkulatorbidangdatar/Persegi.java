package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Persegi extends AppCompatActivity {

    EditText edt_panjang, edt_lebar;
    TextView txt_luas,txt_keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        initComponent();
    }
    private void initComponent() {
        edt_panjang = findViewById(R.id.edt_panjang);
        edt_lebar = findViewById(R.id.edt_lebar);
        txt_luas = findViewById(R.id.txt_luas);
        txt_keliling = findViewById(R.id.txt_keliling);
    }

    public void hitungpersegi(View v) {
        double panjang = Double.parseDouble(edt_panjang.getText().toString());
        double lebar = Double.parseDouble(edt_lebar.getText().toString());
        double luas = panjang * lebar;
        double keliling = 2 * panjang + 2 * lebar;
        txt_luas.setText("" + luas + " cm");
        txt_keliling.setText("" + keliling + " cm");
    }
}