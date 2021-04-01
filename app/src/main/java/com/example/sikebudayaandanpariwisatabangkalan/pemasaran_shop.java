package com.example.sikebudayaandanpariwisatabangkalan;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class pemasaran_shop extends AppCompatActivity {
    Button Tel1,Tel2,Tel3,Tel4,Tel5,Tel7,Tel8,Tel9,Tel10,Tel11,Tel12,Tel13,Tel14,Tel15,Tel16,Tel17,Tel18;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemasaran_shop);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Tel1 = (Button)findViewById(R.id.telepon1);
        Tel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+62313097934"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_shop.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_shop.this,
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
                callintent.setData(Uri.parse("tel:+62313071095"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_shop.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_shop.this,
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
                callintent.setData(Uri.parse("tel:+62313071103"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_shop.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_shop.this,
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
                callintent.setData(Uri.parse("tel:+62313036026"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_shop.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_shop.this,
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
                callintent.setData(Uri.parse("tel:+62313079315"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_shop.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_shop.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });

        Tel7 = (Button)findViewById(R.id.telepon7);
        Tel7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+623171496352"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_shop.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_shop.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });

        Tel8 = (Button)findViewById(R.id.telepon8);
        Tel8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+62313091606"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_shop.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_shop.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });

        Tel9 = (Button)findViewById(R.id.telepon9);
        Tel9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+62313095971"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_shop.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_shop.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });

        Tel10 = (Button)findViewById(R.id.telepon10);
        Tel10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+62313096246"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_shop.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_shop.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });

        Tel11 = (Button)findViewById(R.id.telepon11);
        Tel11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+628179337722"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_shop.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_shop.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });

        Tel12 = (Button)findViewById(R.id.telepon12);
        Tel12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+6281703622798"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_shop.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_shop.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });

        Tel13 = (Button)findViewById(R.id.telepon13);
        Tel13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+6285645923605"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_shop.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_shop.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });

        Tel14 = (Button)findViewById(R.id.telepon14);
        Tel14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+623170546024"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_shop.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_shop.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });

        Tel15 = (Button)findViewById(R.id.telepon15);
        Tel15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+6285655511778"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_shop.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_shop.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });

        Tel16 = (Button)findViewById(R.id.telepon16);
        Tel16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+62313012983"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_shop.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_shop.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });

        Tel17 = (Button)findViewById(R.id.telepon17);
        Tel17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+6285230071717"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_shop.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_shop.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });

        Tel18 = (Button)findViewById(R.id.telepon18);
        Tel18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+6281273111811"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_shop.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_shop.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });
    }
}
