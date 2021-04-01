package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pemasaran_hotel extends AppCompatActivity {
    Button Tel1,Tel2,Tel3,Tel4,Tel5,Tel6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemasaran_hotel);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Tel1 = (Button)findViewById(R.id.telepon1);
        Tel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+62313095388"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_hotel.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_hotel.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });

        Tel2 = (Button)findViewById(R.id.telepon2);
        Tel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+623130633670"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_hotel.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_hotel.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });

        Tel3 = (Button)findViewById(R.id.telepon3);
        Tel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+62313098769"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_hotel.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_hotel.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });

        Tel4 = (Button)findViewById(R.id.telepon4);
        Tel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+62312095596"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_hotel.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_hotel.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });

        Tel5 = (Button)findViewById(R.id.telepon5);
        Tel5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+62313061999"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_hotel.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_hotel.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });

        Tel6 = (Button)findViewById(R.id.telepon6);
        Tel6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+62313090457"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_hotel.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_hotel.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });
    }
}
