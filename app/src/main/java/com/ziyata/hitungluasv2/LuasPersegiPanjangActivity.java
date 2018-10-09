package com.ziyata.hitungluasv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasPersegiPanjangActivity extends AppCompatActivity {

    EditText edtPanjang;
    EditText edtLebar;
    TextView txtHasil;
    Button btnHitung;
    Integer Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi_panjang);

        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        txtHasil = findViewById(R.id.txtHasil);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer panjang = Integer.valueOf(edtPanjang.getText().toString());
                Integer lebar = Integer.valueOf(edtLebar.getText().toString());

                hitungLuasPersegiPanjang(panjang,lebar);
            }
        });
    }

    public void hitungLuasPersegiPanjang(Integer panjang,Integer lebar){
        Integer hasil;
        hasil = panjang * lebar;

        txtHasil.setText(String.valueOf(hasil));
    }
}
