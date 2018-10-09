package com.ziyata.hitungluasv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    //TODO 1 Luas Persegi membuat method luasPersegi
    public void luasPersegi(View view) {
        //TODO 2 Luas Persegi membuat object intent
        Intent pindah = new Intent(MenuActivity.this, LuasPersegiActivity.class);

        //TODO 3 menjalankan startActivity
        startActivity(pindah);
    }

    public void LuasPersegiPanjang(View view) {
        Intent pindah1 = new Intent(MenuActivity.this, LuasPersegiPanjangActivity.class);

        startActivity(pindah1);
    }

    public void LuasLingkaran(View view) {
        Intent pindah2 = new Intent(MenuActivity.this, LuasLingkaranActivity.class);

        startActivity(pindah2);
    }

    public void LuasSegitiga(View view) {
        Intent pindah3 = new Intent(MenuActivity.this, LuasSegitigaActivity.class);

        startActivity(pindah3);
    }

}