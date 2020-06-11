package com.example.gissurfing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    TextView datanama, dataalamat, datatelepon;
    Button btnopen;
    ImageView datagambar;
    public static String id, nama, alamat, gambar, telepon;
    public static Double Latitude, Longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanama=findViewById(R.id.tv_nama);
        dataalamat=findViewById(R.id.tv_alamat);
        datatelepon=findViewById(R.id.tv_telepon);
        btnopen=findViewById(R.id.btn_open);
        datagambar=findViewById(R.id.img_gambar);

        datanama.setText(nama);
        dataalamat.setText(alamat);
        datatelepon.setText(telepon);
        Picasso.get().load(gambar).into(datagambar);

        btnopen.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent open = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+telepon));
        startActivity(open);
    }
}
