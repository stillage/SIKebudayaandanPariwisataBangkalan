package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class alamarosbaya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alamarosbaya);

        TextView dscarosbaya = (TextView)findViewById(R.id.descarosbaya);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Bukit Kapur Arosbaya adalah sebuah kawasan wisata yang terbentuk dari bekas sisa galian dan kerukan penambang batu kapur dan tanah liat yang dilakukan oleh warga setempat. Bukit kapur Arosbaya memang masih tergolong destinasi wisata baru di Kabupaten Bangkalan Pulau Madura Jawa Timur. \n"+
                "Bukit kapur Arosbaya atau bisa disebut dengan Bukit Pelalangan ini terletak di Desa Berbeluk, Kecamatan Arosbaya Kabupaten Bangkalan Provinsi Jawa Timur. Buat kalian yang ingin ke Bukit kapur Arosbaya, aksesnya terbilang cukup mudah. Pertama kalian harus datang ke kota Bangkalan terlebih dahulu. Nah begitu tiba di Kota Bangkalan, lanjutkan perjalanan menuju Kecamatan Arosbaya. \n"+
                "Atau yang ingin membawa langsung kendaraan mobil pribadi atau motor kelokasi Bukit kapur Arosbaya juga bisa.Dari lokasi parkiran air mata ibu kalian lanjutkan perjalanan menuju Bukit kapur Arosbaya. Parkiranya sendiri lumayan luas dan biaya parkirnya murah. Untuk motor dikenakan parkir Rp 5000 dan Mobil Rp 10.000. Sementara harga tiket masuk tiap pegunjung dikenakan biaya Rp 5000 saja. \n" +
                "Tak perlu khawatir kelaparan karena banyak warung yang sudah berjualan disekitar Bukit kapur Arosbaya. Pemandangan disekitar kawasan Bukit kapur Arosbaya juga sangat menggumkan. Pahatan bekas galian terlihat hampir disemua kawasan. Setiap sudut-sudut ada bekas goa-goa yang sudah digali. Perbukitan bekas sisa galian-galian inilah yang terlihat sangat unik dan instagramable sekali bila diupload ke media sosial.\n";
        stringBuilder.append(someMessage);

        dscarosbaya.setText(stringBuilder.toString());
    }
}
