package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class alamjeddih extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alamjeddih);

        TextView dscjeddi = (TextView)findViewById(R.id.descjeddih);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Bukit Jaddih berjarak 10 kilometer dari pusat kota kabupaten Bangkalan.\n" +
                "\n" +
                "Dari pusat kota Surabaya, Bukit Jaddih berjarak sekitar 28 km dan dapat dijangkau melalui jembatan Suramadu yang menghubungkan Pulau Madura dengan Surabaya.\n" +
                "\n" +
                "Pemandangan yang kamu lihat di Bukit Jaddih ini merupakan bentukan akibat penambangan kapur putih selama bertahun-tahun hingga membentuk keelokan tebing raksasa dengan bentuk eksotis dan artistik.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Hal Yang Harus Diperhatikan Saat Ke Bukit Jaddih\n" +
                "Untuk menuju destinasi ini, pengunjung akan melalui jembatan Suramadu. Pengunjung bisa menggunakan kendaraan roda dua maupun roda empat. Hanya saja, mendekati area, jalan mulai terjal dan tidak merata. Pengunjung diharapkan hati-hati melintasi lajur ini.\n" +
                "\n" +
                "Selain itu, yang perlu diperhatikan adalah penambangan masih aktif dilakukan di Bukit Jaddih. Tak heran jika pengunjung akan melihat truk angkut berlalu-lalang. Sebab itu, sebagai antisipasi situasi penambangan batu kapur, pengunjung dianjurkan memakai masker."+
                "Harga Tiket Masuk Bukit Jaddih\n" +
                "Untuk berwisata dan mengunjungi tempat ini sebenarnya pengunjung tidak dipungut bayaran. Namun dari pengalaman beberapa wisatawan yang pernah ke area ini, pengujung akan dibebankan biaya yang tidak resmi. Nilainya kurang lebih Rp20.000.";
        stringBuilder.append(someMessage);

        dscjeddi.setText(stringBuilder.toString());
    }
}
