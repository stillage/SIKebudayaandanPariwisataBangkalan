package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class alamrongkang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alamrongkang);

        TextView dscrongkang = (TextView)findViewById(R.id.descrongkang);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Wisata Pantai Rongkang merupakan salah satu tempat wisata favorit yang dapat dikunjungi di Pulau Madura. Wisata Pantai ini memiliki pesona keindahan yang sangat menarik untuk dikunjungi. Wisatawan berbondong – bondong untuk datang pada hari biasa maupun hari liburan. Pantainya yang masih alami, pohon – pohonnya yang rindang dan bebatuan besar berongga bertebaran di tepi Pantai.\n"
                +
                "Keunikkan lainnya selain Pantai yang berbatu adalah sebelum mencapai Pantai ini, anda harus melewati sedikit bebatuan yang berbentuk tebing yang lumayan curam. Hal ini menjadi tantangan tersendiri untuk anda yang penasaran dengan Pantai Rongkang Bangkalan ini. Dikarenakan Pantai ini masih sangat alami dan banyaknya pohon – pohon rindang yang tumbuh subur di sekitar Pantai.\n"+
                "Harga Tiket di Pantai Rongkang\n" +
                " Pantai Rongkang ini dulunya cukup terkenal dan kerap dikunjungi oleh para pencinta alam. Sayangnya Pantai ini belum dijadikan lokasi wisata resmi oleh pemerintah kabupaten Bangkalan sehingga pengunjung masih bebas keluar masuk untuk mendatangi Pantai ini kapanpun, saat pagi hari maupun malam hari.\n" +
                "\n" +
                "Untuk menikmati keindahannya, penggunjung cukup membayar 5000 sampai 20.000 rupiah per orang saja untuk masuk ke area Pantai. Untuk dapat menikmati Pantai Rongkang ini anda tidak dikenakan biaya parkir. Dikarenakan tidak adanya penjagaan yang dapat menjamin maka diharapkan pengunjung dapat menjaga kendaraan pribadinya masing – masing.\n"+
                "Rute Menuju ke Lokasi Pantai Rongkang\n" +
                "Akses menuju Pantai Rongkang masih cukup sulit karena masih ada beberapa jalan yang belum beraspal dikarenakan minimnya fasilitas yang disediakan oleh pemerintah untuk memperbaiki jalan menuju Pantai. Jalannya masih ada yang berlubang dan beberapa jalan masih berupa tanah.\n"+
                "Pertama menyebrang ke pelabuhan Kamal dengan menggunakan perahu. Dibutuhkan waktu kira – kira 30 menit untuk sampai ke Pantai Rongkang. Jarak yang di tempuh kurang lebih 12 km. Akses kedua adalah jalur tersingkat yang dapat dipilih untuk menuju Pantai yaitu melalui jembatan Suramadu. Dibutuhkan waktu kira – kira 15 menit. Dan jarak yang di tempuh kurang lebih 5 km.";

        stringBuilder.append(someMessage);

        dscrongkang.setText(stringBuilder.toString());
    }
}