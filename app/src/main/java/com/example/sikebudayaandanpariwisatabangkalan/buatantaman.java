package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class buatantaman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buatantaman);

        TextView dsctaman = (TextView)findViewById(R.id.desctaman);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Taman Rekreasi Kota sepertinya menjadi alternatif menarik bagi anda yang ingin berlibur bersama keluarga namun memiliki waktu dan budget terbatas. Taman Rekreasi Kota Bangkalan yang terletak tepat di belakang Stadion Gelora Bangkalan Jalan Soekarno Hatta atau sekitar 2 km dari Bangkalan Plaza ini berhasil menjadi tempat rekreasi favorit masyarakat Bangkalan juga mereka yang sudah pernah datang berkunjung.\n"+
                "Taman Rekreasi Kota Bangkalan atau yang akrab di sebut TRK ini merupakan salah satu obyek wisata minat khusus tengah kota yang di kelola langsung oleh pemerintah kabupaten Bangkalan. Taman tengah kota yang di penuhi dengan bermacam – macam wahana bermain anak - anak, kolam renang dan danau buatan yang di desain khusus bagi anda yang hobi memancing atau sekedar ingin bermain perahu mengelilingi danau.\n" +
                "\n" +
                "Dengan hanya membayar karcis sebesar Rp. 5000 anda sudah bisa masuk ke dalam taman. Suasana rindang dan nyaman dari pepohonan yang sengaja di tanam dalam taman membuat anda lupa bahwa anda sedang berekreasi di tengah kota. Fasilitas tempat duduk yang nyaman juga telah di sediakan di sekitar taman bagi anda yang ingin duduk bersantai atau mengawasi putra putri saat bermain.\n"+
                "Di dalam wahana kolam berenang juga telah di sediakan tempat penyewaan pelampung cukup Rp. 3000 saja. Setelah puas bermain, berkeliling dan berenang anda bisa datang ke kafetaria yang berada di TRK, tanpa anda perlu merasa kebingungan untuk mencari makanan dan minuman.\n" +
                "\n" +
                "Taman Rekreasi Kota Bangkalan yang menjadi obyek wisata tengah kota Bangkalan ini resmi di buka sejak 23 Februari 2010 oleh bupati Bangkalan RKH. Fuad Amin Imro, S.pd. Walau sudah lama di buka TRK selalu menjadi salah satu wisata favorit sekaligus kebanggaan masyarakat Bangkalan. Jadi, bagi anda yang sedang berkunjung ke pulau Madura bagaimana kalau anda juga mencoba serunya semua wahana di TRK Bangkalan.";
        stringBuilder.append(someMessage);

        dsctaman.setText(stringBuilder.toString());
    }
}