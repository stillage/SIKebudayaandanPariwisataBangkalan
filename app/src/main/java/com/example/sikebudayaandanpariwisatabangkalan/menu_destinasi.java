package com.example.sikebudayaandanpariwisatabangkalan;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import android.content.Intent;
import android.widget.ImageButton;
import android.view.View;

public class menu_destinasi extends AppCompatActivity {

    ViewFlipper v_filp;
    ImageButton tnalam, tnbuatan, tnreligi, tnkuliner, tnbudaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_destinasi);

        tnalam = (ImageButton)findViewById(R.id.alam);
        tnalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inalam = new Intent(menu_destinasi.this, destinasi_alam.class);
                startActivity(inalam);
            }
        });

        tnbuatan = (ImageButton)findViewById(R.id.buatan);
        tnbuatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inbuatan = new Intent(menu_destinasi.this, destinasi_buatan.class);
                startActivity(inbuatan);
            }
        });

        tnreligi = (ImageButton)findViewById(R.id.religi);
        tnreligi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inreligi = new Intent(menu_destinasi.this, destinasi_religi.class);
                startActivity(inreligi);
            }
        });

        tnkuliner = (ImageButton)findViewById(R.id.kuliner);
        tnkuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inkuliner = new Intent(menu_destinasi.this, destinasi_kuliner.class);
                startActivity(inkuliner);
            }
        });
        tnbudaya = (ImageButton)findViewById(R.id.budaya);
        tnbudaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inbuda = new Intent(menu_destinasi.this, destinasi_budaya.class);
                startActivity(inbuda);
            }
        });


        int  images[] = {R.drawable.imagea, R.drawable.imageb, R.drawable.imagec, R.drawable.imaged, R.drawable.imagee};

        v_filp = findViewById(R.id.vlipper);


        for (int image: images){
            flipperImages(image);
        }
    }

    public void flipperImages(int image){
        ImageView imageview = new ImageView(this);
        imageview.setBackgroundResource(image);

        v_filp.addView(imageview);
        v_filp.setFlipInterval(2000);//2 detik
        v_filp.setAutoStart(true);

        v_filp.setInAnimation(this, android.R.anim.slide_in_left);
        v_filp.setOutAnimation(this, android.R.anim.slide_out_right);

    }
}
