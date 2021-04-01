package com.example.sikebudayaandanpariwisatabangkalan;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class adat_rokatsomor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adat_rokatsomor);

        TextView dscrokatsomor = (TextView)findViewById(R.id.descrokatsomor);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Umumnya orang lebih mengenal rokat (larung sesaji) yang biasa diadakan di laut. Namun di Ketengan, Kecamatan Burneh, ada selamatan sumur. Mengapa tradisi ini tetap dilestarikan?\n" +
                "Uumbul-umbul dan spanduk dengan tulisan berwarna mencolok terpampang di pintu masuk Kampung Lobuk-Ketengan, Kelurahan Tunjung, Kecamatan Burneh. Kemarin warga di kampung itu sedang punya gawe upacara adat rokat sumur Somber Brumbung.\n" +
                "Sekelompok orang dipimpin seorang berpakaian ala Sakera (hitam-hitam dengan kaos merah putih) meniti pematang sawah. Mereka melangkah berbaris sambil membawa tumpeng lima warna dan buah-buahan untuk sesaji. Lantunan ayat Alquran mengiringi langkah mereka menuju lokasi sumur, yang dipercaya masyarakat setempat membawa berkah bagi kehidupan mereka.\n" +
                "Dulunya, sumur itu sebuah sumber mata air. Manfaatnya sangat dirasakan masyarakat. Selain sebagai sumber pengairan sawah, air sumur dipercaya bisa menyembuhkan penyakit. Bahkan, yang jauh jodoh pun, katanya, dapat segera mendapat berkah jika memanfaatkan air sumur tersebut.\n" +
                "Lokasi rokat sumur berada di tengah areal lumbung padi kampung. Hampir sebagian besar lahan di sana merupakan areal persawahan. Tiap memasuki bulan Safar, mereka mengadakan ritual si sumur itu. Di sisi lain, dengan rokat sumur itu masyarakat diharapkan menjadi lebih peduli untuk menjaga kelestarian mata air.\n";
        stringBuilder.append(someMessage);

        dscrokatsomor.setText(stringBuilder.toString());
    }
}
