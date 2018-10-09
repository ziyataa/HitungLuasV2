package com.ziyata.hitungluasv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasLingkaranActivity extends AppCompatActivity {

    EditText edtJariJari;
    TextView txtHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);

        txtHasil = findViewById(R.id.txtHasil);
        edtJariJari = findViewById(R.id.edtJariJari);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double JariJari = Double.valueOf(edtJariJari.getText().toString());

                hitungLuasLingkaran(JariJari);
            }
        });
    }

    public void hitungLuasLingkaran(Double jariJari) {
    Double hasil;
    hasil = 3.14 * jariJari * jariJari;

    txtHasil.setText(String.valueOf(hasil));
    }
}
