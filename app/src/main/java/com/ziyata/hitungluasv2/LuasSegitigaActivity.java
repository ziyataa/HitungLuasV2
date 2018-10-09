package com.ziyata.hitungluasv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasSegitigaActivity extends AppCompatActivity {

    EditText edtAlas;
    EditText edtTinggi;
    TextView txtHasilLingkaran;
    Button btnHitungLingkaran;
    double hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);

        edtAlas = findViewById(R.id.edtalas);
        edtTinggi = findViewById(R.id.edttinggi);
        txtHasilLingkaran = findViewById(R.id.txtHasil);
        btnHitungLingkaran = findViewById(R.id.btnHitung);

        btnHitungLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer Alas = Integer.valueOf(edtAlas.getText().toString());
                Integer Tinggi = Integer.valueOf(edtTinggi.getText().toString());

                hitungLuassegitiga(Alas,Tinggi);
            }
        });

    }

    private void hitungLuassegitiga(Integer alas, Integer tinggi) {
        hasil = 0.5 * alas * tinggi;

        txtHasilLingkaran.setText(String.valueOf(hasil));
    }
}
