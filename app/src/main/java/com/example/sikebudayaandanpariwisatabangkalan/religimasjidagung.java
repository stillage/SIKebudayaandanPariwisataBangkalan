package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class religimasjidagung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religimasjidagung);

        TextView dscmasjid = (TextView)findViewById(R.id.descmasjid);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Masjid Agung Bangkalan terletak di tengah kota Bangkalan, tepatnya di alun-alun Kota Bangkalan sebelah baratnya. Hingga sampai saat ini, Masjid Agung Bangkalan sudah mengalami beberapa proses renovasi.\n" +
                "\n" +
                "Masjid ini berdiri diatas lahan seluas 11.527 meter persegi, sedangkan bangunannya memiliki luas 3.000 meter persegi. Bangunan asli yang masih dipertahankan sampai sekarang adalah bangunan utama masjid sebagai tempat sholat utama. Memiliki atap limas bersusun tiga sangat khas dengan arsitektur asli Indonesia. Meskipun sudah 2 kali di renovasi, namun masyarakat setempat tetap mempertahankan seni arsitektur asli pada bangunan utama masjid.\n" +
                "\n" +
                "Sebanyak dua buah menara yang menjulang tinggi dibangun setelah masjid tersebut berdiri, menara tersebut dibangun dengan gaya masjid Turki dengan menara yang ramping dan runcing seperti pensil. Disebelah kiri masjid terdapat fasilitas tempat wudhu dan toilet untuk pria, sedangkan disebelah kanan terdapat tempat wudhu dan toilet untuk wanita.\n" +
                "\n" +
                "Arsitektur dalam bangunan utama masjid dipenuhi sekitar 16 tiang penyangga yang terbuat dari kayu, dengan ukiran tumbuhan sulur yang terdapat dibagian bawah tiang penyangga. Kemudian mihrab di buat menjorok keluar, dengan mimbar disamping ruangannya. Lampu gantung besar nan klasik juga ikut diletakkan ditengah-tengah ruang sholat sebagai penerang utama.";
        stringBuilder.append(someMessage);

        dscmasjid.setText(stringBuilder.toString());
    }
}
