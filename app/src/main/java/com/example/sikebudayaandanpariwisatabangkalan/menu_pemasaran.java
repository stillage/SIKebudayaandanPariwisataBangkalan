package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;


public class menu_pemasaran extends AppCompatActivity {

    ViewFlipper v_filp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_pemasaran);

        int  images[] = {R.drawable.hotelningrat, R.drawable.sinjay, R.drawable.batik1, R.drawable.batik2, R.drawable.ratoebhu};
        v_filp = findViewById(R.id.vlipper);

        for (int image: images){
            flipperImages(image);
        }
    }

    public void flipperImages(int image){
        ImageView imageview = new ImageView(this);
        imageview.setBackgroundResource(image);

        v_filp.addView(imageview);
        v_filp.setFlipInterval(3000);//3 detik
        v_filp.setAutoStart(true);

        v_filp.setInAnimation(this, android.R.anim.slide_in_left);
        v_filp.setOutAnimation(this, android.R.anim.slide_out_right);

    }

    public void hotel(View view) {
        Intent a = new Intent(menu_pemasaran.this, pemasaran_hotel.class);
        startActivity(a);
    }

    public void serviskendaraan(View view) {
        Intent b = new Intent(menu_pemasaran.this, pemasaran_rental.class);
        startActivity(b);
    }

    public void restoran(View view) {
        Intent c = new Intent(menu_pemasaran.this, pemasaran_restoran.class);
        startActivity(c);
    }

    public void sovenir(View view) {
        Intent d = new Intent(menu_pemasaran.this, pemasaran_shop.class);
        startActivity(d);
    }
}