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

public class pemasaran_restoran extends AppCompatActivity {
    Button Tel1,Tel2,Tel3,Tel4,Tel5,Tel6,Tel7,Tel8,Tel9,Tel10,Tel11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemasaran_restoran);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Tel1 = (Button)findViewById(R.id.telepon1);
        Tel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int REQUEST_PHONE_CALL = 1;
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel:+62313090095"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_restoran.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_restoran.this,
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
                callintent.setData(Uri.parse("tel:+6287849655545"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_restoran.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_restoran.this,
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
                callintent.setData(Uri.parse("tel:+6287750984115"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_restoran.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_restoran.this,
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
                callintent.setData(Uri.parse("tel:+62313091844"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_restoran.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_restoran.this,
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
                callintent.setData(Uri.parse("tel:+6281332001899"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_restoran.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_restoran.this,
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
                callintent.setData(Uri.parse("tel:+623130952214"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_restoran.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_restoran.this,
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
                callintent.setData(Uri.parse("tel:+6287849752801"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_restoran.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_restoran.this,
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
                callintent.setData(Uri.parse("tel:+6287853774448"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_restoran.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_restoran.this,
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
                callintent.setData(Uri.parse("tel:0313094566"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_restoran.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_restoran.this,
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
                callintent.setData(Uri.parse("tel:0313095734"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_restoran.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_restoran.this,
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
                callintent.setData(Uri.parse("tel:0313096781"));

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(ContextCompat.checkSelfPermission(pemasaran_restoran.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(pemasaran_restoran.this,
                                new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
                    }else {
                        startActivity(callintent);
                    }
                }
            }
        });
    }
}
