package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class alammangrove extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alammangrove);

        TextView dscmangrove = (TextView)findViewById(R.id.descmangrove);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Taman Pendidikan Mangrove Labuhan (TPML) ini terletak di desa Labuhan, Kecamatan Sepulu, Kabupaten Bangkalan, Propinsi Jawa Timur atau sekitar 40 Km dari arah utara Kota Bangkalan sebelum Pantai Siring Kemuning, diatas lahan seluas 6,64 hektar, di bawah pengawasan Badan Pengelola Hutan Mangrove (BPHM) wilayah I Bali.\n" +
                "\n" +
                "Kawasan hutan Mangrove Labuhan ini sebenarnya adalah bekas kawasan tambak yang diubah menjadi area konservasi Mangrove. Kemudian dikembangkan menjadi Taman Pendidikan Mangrove oleh Kelompok Tani Mangrove “Cemara Sejahtera” yang merupakan kelompok binaan PT. Pertamina Hulu Energi West Madura Offshore. \n"+
                "Adapun jenis burung migran yang singgah di Taman Pendidikan Mangrove yakni burung Gajahan Pengala (Whimbrel Numenius atau Phaeopus), Cerek (Plover, Charadrius SP), dan Trinil Kaki Merah (Common Redshank/Tringa Totanus).\n" +
                "\n" +
                "Selain itu, burung pantai seperti Trinil Pantai (Common Sandpiper atau Actytis Hypoleucos), burung air seperti Cangak Merah (Purple Heron atau Ardea Purpurea) dan Kuntul Kecil (Litle Egret atau Egretta Garzetta). \n"+
                "Ongkos masuk murah Rp 5 ribu per orang. Belum termasuk parkir kendaraan. Yang tak boleh lupa dibawa bila berkunjung ke sana adalah topi, kemeja lengan panjang atau kacamata hitam, karena suhu di Bulan Agustus sedang terik-teriknya. Untuk mengitari hutan mangrove, pengelola telah membangun jembatan kayu sepanjang 350 meter.";

        stringBuilder.append(someMessage);

        dscmangrove.setText(stringBuilder.toString());
    }
}
