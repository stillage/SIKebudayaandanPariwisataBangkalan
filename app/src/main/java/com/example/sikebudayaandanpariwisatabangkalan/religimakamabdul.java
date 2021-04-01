package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class religimakamabdul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religimakamabdul);

        TextView dscmakamabdul= (TextView)findViewById(R.id.descmakamabdul);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Selain Makam Kholil Bin Abdul Latief yang pernah kita bahas sebelumnya, ada obyek wisata religi lain di pulau Madura yang juga wajib dikunjungi oleh peziarah, yaitu Makam Sultan Abdul Kadirun. Makam yang lokasinya berada ditengah-tengah jantung Kota Bangkalan ini tepatnya terletak di jalan protokol Sultan Abdul Kadirun yang berada satu area dengan Masjid Agung Bangkalan. Didalam komplek makam terdapat banyak makam-makam keramat yang masih satu garis keturunan dengan raja-raja Madura Barat.\n"+
                "Sosok dari Sultan Abdul Kadirun sendiri sebenarnya mempunyai nama asli Raden Maulana Abdul Kadir. Beliau adalah putra kedua dari tiga belas bersaudara hasil dari perkawinan Raden Abduh alias Sultan Abdurahman Cakra Adiningrat I (1780-1815) dengan istri keduanya yang bernama Raden Ayu Saruni. Selain menjadi seorang Raja, beliau juga seorang ahli agama yang khusyuk, namun juga terkenal sebagai seorang yang ahli strategi dan taktik berperang. Beliau pada saat masa mudanya, sering kali secara langsung memimpin pasukan ke medan perang, baik saat melawan tentara kolonial Inggris maupun sejumlah kerajaan di Pulau Jawa dan Sulawesi. Beliau ini juga yang menggagas berdirinya Masjid Agung Bangkalan.\n"+
                "Fasilitas di Makam Sultan Abdul Kadirun\n" +
                "Wisata religi yang satu ini untungnya telah memiliki beberapa fasilitas-fasilitas penunjang bagi wisatawan yang berkunjung, antara lain adalah;\n" +
                "\n" +
                "- Kamar mandi umum\n" +
                "\n" +
                "Kebanyakan peziarah yang ada di sini adalah berasal dari luar kota. Nah jika anda habis menempuh perjalanan lama, anda bisa terlebih dahulu membasuh muka atau buang air kecil di toilet yang telah disediakan pihak pengelola tanpa harus bingung mencari kesana-kemari.\n" +
                "\n" +
                "- Masjid\n" +
                "\n" +
                "Seperti yang dikatakann di atas, komplek pemakaman ini letaknya persis di belakang Masjid Agung Bangkalan jadi bagi anda yang mendengar panggilan sholat saat sedang berziarah tidak perlu repot-repot berjalan jauh untuk mencari mushola karena sudah ada masjid yang bisa menjadi tempat ibadah anda.\n" +
                "\n" +
                "- Warung atau tempat makan\n" +
                "\n" +
                "Lokasi dari pemakaman ini yang berada di tengah kota membuat kesan strategis semakin kental. Keluar dari sana anda tidak perlu lagi susah payah mencari orang yang berjualan makanan dan minuman karena di sana telah banyak yang menjajakan dagangannya.\n" +
                "\n" +
                "- Toko souvenir\n" +
                "\n" +
                "Selesai berziarah, anda pastinya tidak ingin langsung bergegas pulang, melainkan membeli oleh-oleh untuk sanak saudara atau teman yang ada di kampung tempat anda tinggal. Di sekitar sana juga anda bisa dengan mudahnya menemukan pedagang yang menjual souvenir-souvenir murah khas pulau Madura.\n" +
                "\n" +
                "- Lahan parkir\n" +
                "\n" +
                "Yang satu ini tentunya penting bagi pengunjung yang berencana untuk membawa kendaraan sendiri. Area yang luas memungkinkan daerah ini menampung banyak kendaraan bermotor.";
        stringBuilder.append(someMessage);

        dscmakamabdul.setText(stringBuilder.toString());
    }
}
