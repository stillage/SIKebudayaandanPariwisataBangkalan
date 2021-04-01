package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class buatanmercusuar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buatanmercusuar);

        TextView dscmercusuar = (TextView)findViewById(R.id.descmercusuar);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Berwisata ke Pulau Madura rasanya ada yang kurang jika TreTan belum mengunjungi salah satu obyek wisata andalan Kabupaten Bangkalan ini. Obyek Wisata ini adalah Mercusuar Sembilangan yang berdiri kokoh sejak Jaman Belanda hingga sekarang yang berguna untuk membantu navigasi hilir mudik kapal yang lewat agar menghindari daerah yang rawan seperti batuan karang serta daerah laut yang dangkal. Sumber cahaya yang digunakan pada lampu mercusuar pada umumnya mulai dari api, lensa hingga lampu dan seiring perkembangan zaman, Mercusuar di seluruh dunia telah merosot dikarnakan penggunaannya yang telah tergantikan oleh GPS (Global Positioning System).\n"+
                "Hingga kini Mercusuar tersebut masih befungsi sebagai navigasi kapal laut dibawah kendali Departemen Perhubungan dan sering ramai dikunjungi oleh para wisatawan yang ingin menaiki hingga kepuncak dan melihat keindahan alam disekitar Desa Sembilangan yang cukup mempesona.\n"+
                "Untuk dapat sampai hingga ke puncak mercusuar yang tingginya mencapai 65 meter, TreTan harus melewati 17 lantai dengan menggunakan anak tangga yang terbuat dari besi. Rasa lelah ketika menaiki tiap anak tangga akan terasa disaat hampir mendekati puncak. Perjuangan melewati anak tangga mercusuar akan terbayar setelah melihat indahnya alam dan hilir mudik kapal serta angin yang lumayan kencang menerpa tubuh.\n"+
                "diatas mercusuar, kita bisa mengabadikan alam sekitar dengan foto menggunakan HP ataupun DSLR. Moment seperti ini biasanya menjadi incaran pecinta fotografi landscape professional, selain dari atas puncak moment fotografi bisa diambil saat sore hari ketika matahari mulai terbenam.";
        stringBuilder.append(someMessage);

        dscmercusuar.setText(stringBuilder.toString());
    }
}