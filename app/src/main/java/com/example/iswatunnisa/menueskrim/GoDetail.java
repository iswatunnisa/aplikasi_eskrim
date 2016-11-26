package com.example.iswatunnisa.menueskrim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class GoDetail extends AppCompatActivity {

    ImageView ivGambarDetail;
    TextView tvNamaDetail;
    TextView tvHargaDetail;
    TextView tvKuantitas;
    Button btnOrder, btnTambah, btnKurang, btnExit;
    int kuantitas = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.go_detail);
        ivGambarDetail = (ImageView) findViewById(R.id.iv_gambar_detail);
        tvNamaDetail = (TextView) findViewById(R.id.tv_nama_detail);
        tvHargaDetail = (TextView) findViewById(R.id.tv_harga_detail);
        btnTambah = (Button) findViewById(R.id.btn_tambah);
        btnKurang = (Button) findViewById(R.id.btn_kurang);
        tvKuantitas = (TextView) findViewById(R.id.tv_kuantitas);
        tvKuantitas.setText("Jumlah = "+kuantitas+" Porsi");
        Intent getDetail = getIntent();
        ivGambarDetail.setImageResource(getDetail.getIntExtra("gambar",0));
        tvNamaDetail.setText(getDetail.getStringExtra("nama"));
        tvHargaDetail.setText(getDetail.getStringExtra("harga"));
        String tampungHarga = String.valueOf(tvHargaDetail.getText());
        final Integer intHarga = Integer.parseInt(tampungHarga);
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kuantitas = kuantitas + 1;
                int jumlah = kuantitas * intHarga;
                tvHargaDetail.setText(jumlah+"");
                tvKuantitas.setText("Jumlah = "+kuantitas+" Porsi");
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kuantitas == 1) {
                    Toast.makeText(GoDetail.this, "Tidak Jadi Order, Klik Back", Toast.LENGTH_SHORT).show();
                } else if (kuantitas >= 1) {
                    kuantitas = kuantitas - 1;
                    int jumlah = kuantitas * intHarga;
                    tvHargaDetail.setText(jumlah + "");
                    tvKuantitas.setText("Jumlah = "+kuantitas+" Porsi");
                }
            }
        });

        Button kembali = (Button) findViewById(R.id.btn_back);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(GoDetail.this, DaftarMenu.class);
                startActivity(i);
            }
        });

        Button order = (Button) findViewById(R.id.btn_order);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GoDetail.this, "Order telah Diproses", Toast.LENGTH_SHORT).show();

            }
        });

        Button keluar = (Button) findViewById(R.id.btn_exit);
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                moveTaskToBack(true);
            }
        });


    }
}

