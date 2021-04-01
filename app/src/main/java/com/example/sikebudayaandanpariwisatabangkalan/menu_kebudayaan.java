package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;


public class menu_kebudayaan extends AppCompatActivity {

    ViewFlipper v_filp;
    ImageButton tnadat, tnseni, tnlagu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_kebudayaan);

        tnadat = (ImageButton)findViewById(R.id.adatistiadat);
        tnadat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inadat = new Intent(menu_kebudayaan.this, kebudayaan_adat_istiadat.class);
                startActivity(inadat);
            }
        });

        tnseni = (ImageButton)findViewById(R.id.kesenian);
        tnseni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inseni = new Intent(menu_kebudayaan.this, kebudayaan_kesenian.class);
                startActivity(inseni);
            }
        });

        tnlagu = (ImageButton)findViewById(R.id.lagutradisi);
        tnlagu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lag = new Intent(menu_kebudayaan.this, kebudayaan_lagu.class);
                startActivity(lag);
            }
        });


        int  images[] = {R.drawable.imagesa, R.drawable.imagesb, R.drawable.imagesc};
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
}
