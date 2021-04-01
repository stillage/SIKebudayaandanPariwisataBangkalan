package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class buatanpaseban extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buatanpaseban);

        TextView dscpaseban = (TextView)findViewById(R.id.descpaseban);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Tempat itu adalah Taman Paseban yang tidak lama diresmikan oleh Pemerintah Bangkalan dan dicanangkan sebagai icon Kota Bangkalan. Sebelumnya tempat itu digunakan oleh para pedagang kaki lima dan menjadi pusat kuliner masyakarat Bangkalan yang di sebut PUMARA (Pusat Makanan Rakyat), sekarang telah direlokasi di dekat Stadion Gelora Bangkalan.\n" +
                "\n" +
                "Di Taman Paseban telah disediakan beberapa tempat duduk santai bagi para pengunjung dan beberapa pedagang kaki lima yang berjualan disekitar taman. Di sebelah barat taman ada Monumen Buah Salak yang cukup besar yang juga sebagai salah satu icon Kota Bangkalan sebagai penghasil buah salak.\n"+
                "di Malam hari suasana disekitar Taman cukup indah dengan adanya lampu penerang yang telah disediakan dan beberapa lampu hias untuk memperindah lokasi Taman Paseban jadi kapanpun waktunya taman ini bisa dikunjungi oleh masyarakat sekitar setiap saat.\n" +
                "\n" +
                "Lokasi Taman Paseban berada di tengah-tengah Kota Bangkalan, Tempatnya cukup strategis selain dekat dengan alun-alun juga berdekatan dengan Masjid Agung Bangkalan, Gedung Rato Ebuh dan Lapangan Tenis.";
        stringBuilder.append(someMessage);

        dscpaseban.setText(stringBuilder.toString());
    }
}
