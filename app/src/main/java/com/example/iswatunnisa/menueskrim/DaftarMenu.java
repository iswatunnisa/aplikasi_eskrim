package com.example.iswatunnisa.menueskrim;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

public class DaftarMenu extends Activity {
   // SearchView sv;
    ListView listItem;

    String[] nama = {"Vanilla", "Strawberry", "GreenTea", "Mocca", "Grape", "Orange", "Chocolate", "MixTaste", "Coffee"};
    String[] harga = {"10000", "15000", "18000", "14000", "17000", "16000", "19000", "20000", "12000"};
    int[] gambar = {R.drawable.a1, R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a8,R.drawable.a9};
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       // SearchView.OnQueryTextListener{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_eskrim);

        adapter = new CustomAdapter(DaftarMenu.this, nama, harga, gambar);
        listItem = (ListView) findViewById(R.id.lv_item);
        listItem.setAdapter(adapter);

        // sv = (SearchView) findViewById(R.id.cari_menu);
        /* String[] locales = Locale.getISOCountries();

       for (String countryCode : locales) {
            Locale obj = new Locale("", countryCode);
            negara.add(obj.getDisplayCountry());
        }

        lv.setAdapter(adapter);
        cari_menu.setOnQueryTextListener(DaftarMenu.this);

    @Override
    public boolean onQueryTextChange(String newText) {
        adapter.getFilter().filter(newText);//memfilter adapter pada textbaru
        return false;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false; //submit query
    }
*/
        }
    }
//}

