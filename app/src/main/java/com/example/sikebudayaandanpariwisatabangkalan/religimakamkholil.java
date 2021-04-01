package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class religimakamkholil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religimakamkholil);

        TextView dsckholil= (TextView)findViewById(R.id.desckholil);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "SyekhKholil kecil berasal dari keluarga ulama. Ayahnya, KH. Abdul Lathif, mempunyai pertalian darah dengan Sunan Gunung Jati. Ayah Abdul Lathif adalah Kyai Hamim, anak dari Kyai Abdul Karim. Yang disebut terakhir ini adalah anak dari Kyai Muharram bin Kyai Asror Karomah bin Kyai Abdullah bin Sayyid Sulaiman. Sayyid Sulaiman adalah cucu Sunan Gunung Jati. Maka tak salah kalau KH. Abdul Lathif mendambakan anaknya kelak bisa mengikuti jejak Sunan Gunung Jati karena memang dia masih terhitung keturunannya. Kyai Kholil Al-Bangkalani lahir di Bangkalan, Jawa Timur, sekitar tahun 1820 masehi./n"+
                "Warga Jawa Timur menyebutnya sebagai 'Syaikhona'. Berakar dari bahasa Arab yang artinya adalah guru kita. Syaikhuna Kholil adalah gurunya Kiai Hasyim Asy'ari, pendiri Nahdlatul Ulama (NU), dan maha gurunya para ulama besar nusantara di Indonesia.\n"+
                "Meski sudah tidak lawa wafat, nama besar Kiai Kholil memberikan berkah bagi warga Bangkalan dan Madura. Memasuki hari ketiga perayaan Lebaran, komplek makam Kiai Kholil dipenuhi peziarah. \n" +
                "\n" +
                "Untuk berziarah ke makam yang terletak di masjid itu, para peziarah tidak dikenakan biaya. Para peziarah dipersilahkan untuk menyisihkan sebagian harta sesuai dengan kemampuannya masing-masing. Uang yang disedekahkan nantinya digunakan untuk biaya operasional kegiatan masjid. \n" +
                "\n" +
                "Usai berdoa di dekat makam Kiai Kholil, para peziarah bisa merasakan sajian kuliner khas Madura. Sekitar 50 meter dari pelataran masjid, deretan pedagang dengan gerobak berlomba-lomba menyajikan makanan terbaiknya. Mulai dari sate madura, mie ayam, es kelapa, semuanya bisa dinikmati dengan kocek miring. \n"+
                "Selain wisata kuliner, peziarah juga bisa membeli celurit, golok, dan serangkaian pedang sebagai buah tangan. Tentunya kualitas barang nomor wahid yang disajikan kepada pengunjung. Harganya pun tidak buat kantong menjerit. Hanya dengan modal Rp25.000, kamu bisa membawa pulang pisau dan golok anti-karat.";
        stringBuilder.append(someMessage);

        dsckholil.setText(stringBuilder.toString());
    }
}
