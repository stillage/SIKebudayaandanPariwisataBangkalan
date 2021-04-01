package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class alamkemuning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alamkemuning);

        TextView dscsiring = (TextView)findViewById(R.id.descsiring);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage =  "Pantai Siring Kemuning mempunyai lokasi dengan warna yang agak kekuning-kuningan. Tidak seperti pantai pasir putih pada umumnya, dilihat dari lokasi agak jauh, pasir putih yang ada di lokasi ini juga sedikit kekuningan. Tidak hanya pasirnya saja, ombak yang menyapu pantai pun turut terlihat kuning. Kata kemuning ini sebenarnya diambil dari Bahasa Jawa, dengan mendapat tambahan “em”, berasal dari kata kuning, sehingga menjadi kemuning. Kemungkinan besar, warna pantai yang agak condong ke arah kuning tersebut yang menjadi asal usul siring kemuning menjadi nama pantai ini. \n"+"\n"+
                "Jam Buka dan Harga Tiket Masuk Pantai Siring Kemuning\n" +
                "Tidak ada jam buka yang pasti untuk pantai Siring Kemuning ini sendiri, namun lebih baik anda memilih waktu pastinya tidak pada malam hari.\n" +
                "\n" +
                "Untuk harga tiket retribusi yang dibebankan kepada para pengunjung di depan pintu masuk pantai Siring Kemuning tidak lah besar, cukup dengan membayar sebesar 3.000 rupiah per orang anda sudah bisa dengan leluasa menikmati pemandangan alam yang disuguhkan pantai yang terletak di Bangkalan ini.\n"+
                "Menempuh perjalanan menuju ke Pantai Siring Kemuning dari Bangkalan tidak lah terlalu susah, terlebih lagi banyak kendaraan yang bisa anda pakai. Entah itu kendaraan pribadi seperti motor, mobil atau menyewa dan juga transportasi umum yang pasti sudah banyak dijumpai, dan hanya membutuhkan biaya sekitar 8.000 rupiah saja.\n";
        stringBuilder.append(someMessage);

        dscsiring.setText(stringBuilder.toString());
    }
}
