package com.example.iswatunnisa.menueskrim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageButton mulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton mulai = (ImageButton) findViewById(R.id.ib_mulai);
        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "Silahkan pesan menu", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, DaftarMenu.class);
                startActivity(i);
            }
        });
    }
}