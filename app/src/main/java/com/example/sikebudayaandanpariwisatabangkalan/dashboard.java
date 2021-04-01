package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class dashboard extends AppCompatActivity {

    ImageButton mKebudayaan, mDestinasi, mPemasaran, mEkodanKrea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        mKebudayaan = (ImageButton) findViewById(R.id.kebudayaan);
        mDestinasi = (ImageButton) findViewById(R.id.destinasi);
        mPemasaran = (ImageButton) findViewById(R.id.pemasaran);
        mEkodanKrea = (ImageButton)findViewById(R.id.ekodankrea);
        mEkodanKrea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), " Devisi Ini Masih Akan Di Resmikan ",Toast.LENGTH_LONG).show();
            }
        });

    }

    public void kebud(View view) {
        Intent a = new Intent(dashboard.this, menu_kebudayaan.class);
        startActivity(a);
    }

    public void desti(View view) {
        Intent b = new Intent(dashboard.this, menu_destinasi.class);
        startActivity(b);
    }

    public void pema(View view) {
        Intent c = new Intent(dashboard.this, menu_pemasaran.class);
        startActivity(c);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_about, menu);
        return true;
    }
    public void inst(MenuItem item) {
        Uri uri = Uri.parse("https://www.instagram.com/disbudparbangkalan/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.instagram.android");
        try
        {
            Toast.makeText(dashboard.this, "Instagram", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
        catch (ActivityNotFoundException e){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/instagram/")));
        }
    }

    public void yout(MenuItem item) {
        Uri uri = Uri.parse("https://www.youtube.com/channel/UCiLaPLPR48TW9v87bKl1hLQ");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.youtube.android");
        try
        {
            Toast.makeText(dashboard.this, "Youtube", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
        catch (ActivityNotFoundException e){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCiLaPLPR48TW9v87bKl1hLQ")));
        }
    }

    public void face(MenuItem item) {
        Uri uri = Uri.parse("https://www.facebook.com/disbudpar.bangkalan.9");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.facebook.android");
        try
        {
            Toast.makeText(dashboard.this, "Facebook", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
        catch (ActivityNotFoundException e){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/disbudpar.bangkalan.9")));
        }
    }

    public void maps(MenuItem item) {
        Uri uri = Uri.parse("https://goo.gl/maps/i5aWWe3oBDVN2JNdA");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.maps.google.android");
        try
        {
            Toast.makeText(dashboard.this, "Google Maps", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
        catch (ActivityNotFoundException e){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/i5aWWe3oBDVN2JNdA")));
        }
    }

    public void desk(MenuItem item) {
        Uri uri = Uri.parse("https://deskgram.co/kajebbangkalan");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("co.deskgram.android");
        try
        {
            Toast.makeText(dashboard.this, "Deskgram", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
        catch (ActivityNotFoundException e){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://deskgram.co/kajebbangkalan")));
        }
    }
}