package com.example.sikebudayaandanpariwisatabangkalan;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class adat_peletkandung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adat_peletkandung);

        TextView dscpeletkandung = (TextView)findViewById(R.id.descpeletkandung);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Upacara pelet kandung diyakini masyarakat memiliki makna supaya kelahiran bayi tidak banyak mengalami hambatan. Lalu menjadi anak yang sholeh. Dengan berbagai prosesi dan ritual, mulai dari pembacaan ayat suci Alquran, mandi kembang, pembelahan kelapa yang menandakan jenis kelamin bayi, pemecahan telur, dan lain sebagainya.\n" +
                "Prosesi ritual pelet kandung yaitu, pertama ibu hamil dipijat dukun bayi. Bersamaan dengan itu,  ada yang melantunkan ayat suci Alquran surat Yasin agar bayi mendapat keselamatan. Serta surat Maryam supaya memiliki kesucian seperti Siti Maryam. masyarakat di kabupaten bangkalan biasa melakukan pelet kandung ketika usia kehamilan ibu-ibu menginjak 7 bulan. Kami berharap tradisi ini tetap eksis sampai kapanpun,\" pungkasnya.\n";
        stringBuilder.append(someMessage);

        dscpeletkandung.setText(stringBuilder.toString());
    }
}

