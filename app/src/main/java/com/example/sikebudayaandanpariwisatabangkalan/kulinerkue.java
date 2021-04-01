package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class kulinerkue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kulinerkue);

        TextView dsckue = (TextView)findViewById(R.id.desckue);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Kue Bongko khas dari Kecamatan Arosbaya Bangkalan, sebenarnya kue manis ini sudah tidak asing di telinga masyarakat sekitar karena rasanya yang enak sekali. Cocok untuk dijadikan camilan bisa juga disuguhkan saat ada tamu yang berkunjung ke rumah. Untuk harganya sendiri sangat murah lho, teman-teman cukup membayar Rp. 3.000,- saja untuk satu bungkus kue Bongko Arosbaya ini.\n" +
                "\n" +
                "Jenis kuliner yang satu ini memang terkenal berasal dari Keamatan Arosbaya, entah kalau ada versi serupa dari daerah lainnya. Di Arosbaya sendiri cukup banyak bisa ditemukan namun yang menjadi makanan khas desa ini khas dan favorit ialah, dimana kue manis ini berbentuk seperti bubur namun bentuk serta pengemasan Bongko yang menjadi ciri khas yang berbeda.\n"+
                "Menurut salah satu penjualnya di desa Arosbaya, resep Bongko sendiri diperoleh secara turun temurun kue manis ini dinamakan Bongko karena sebenarnya kue ini awalnya hanya di jual di rumah bukan di warung. Selain itu karena makanan ini hanya di jual di rumah, maka orang mengartikan makanan tersebut makanan rumah, dan arti rumah sendiri dalam bahasa madura yaitu Bungko sehingga dinamakan Bongko.\n" +
                "\n" +
                "Nikmatnya Kue Bongko Khas Arosbaya\n" +
                "Untuk teman-teman yang penasaran dapat menikmati makanan khas Arosbaya ini dengan mudah. Tidak akan sulit untuk mencarinya dimana jika hari biasa Bongko biasa di jual di pasar dan ketika bulan ramadhan di warung-warung pinggir jalan desa Arosbaya juga akan mudah ditemui.\n" +
                "\n" +
                "Selain sebagai makanan khas Bongko juga salah satu makanan tradisional yang dapat bertahan dan tetap ada meskipun banyak makanan tradisional yang tergeser oleh makanan modern lainnya yang lebih menarik untuk dinikmati.";

        stringBuilder.append(someMessage);

        dsckue.setText(stringBuilder.toString());
    }
}
