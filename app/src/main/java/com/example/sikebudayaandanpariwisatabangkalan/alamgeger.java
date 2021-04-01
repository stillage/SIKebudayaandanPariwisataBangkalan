package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class alamgeger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alamgeger);

        TextView dscgeger = (TextView)findViewById(R.id.descgeger);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Bukit Geger ini terletak sekitar 30 Km dari Kota Bangkalan sebelah tenggara dan berada 150 sampai 200 meter dari atas ketinggian permukaan laut. Tempat ini biasa digunakan sebagai lokasi untuk berkemah karena cuaca alamnya yang sangat mendukung. Bukit ini memiliki luas sekitar 44 Hektar dan merupakan kawasan hutan kayu Mahoni yang berada di bawah perlindungan negara. \n"+
                "Disekitar bukit juga sudah disediakan tempat untuk beristirahat, ada juga penjual makanan dan minuman untuk melepas lapar dan dahaga setelah menaiki anak tangga. Jika musim hujan tiba, disarankan untuk lebih berhati-hati saat menaiki bukit karena jalannya yang licin dan sedikit berlumut. \n"+
                "Umumnya, harga tiket untuk masuk tempat wisata berbeda antara hari libur, minggu atau hari biasa. Berikut kami sertakan daftar harga tiket masuk ke area Kab Bangkalan. Harga bisa berubah sewaktu-waktu.\n" +
                "\n" +
                "Saat weekday, harga tiket masuk Wisata Bukit Geger adalah Rp2,000.00. Sementara saat weekend, harga tiket masuk Wisata Bukit Geger adalah Rp2,000.00. Ada baiknya konfirmasi harga lewat call center di bawah. Harga weekday umumnya berarti hari Senin-Jumat, sementara weekend Sabtu dan Minggu.\n"+
                "Tiap-tiap tempat wisata punya jam buka dan tutup berbeda. Begitu juga dengan destinasi yang ada di Kab Bangkalan. Berikut kami sertakan tabel mengenai jam buka dan jam tutup untuk Wisata Bukit Geger.\n" +
                "\n" +
                "Wisata Bukit Geger buka jam 24 jam dan tutup jam -. Jam ini sesuai dengan zona waktu setempat yakni waktu Asia/Jakarta.";
        stringBuilder.append(someMessage);

        dscgeger.setText(stringBuilder.toString());
    }
}
