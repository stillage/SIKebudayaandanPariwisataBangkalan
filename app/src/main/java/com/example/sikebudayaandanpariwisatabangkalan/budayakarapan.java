package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class budayakarapan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budayakarapan);

        TextView dsckarapan = (TextView)findViewById(R.id.desckarapan);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Keraban Sapeh atau lebih familiar disebut dengan karapan sapi, merupakan kebudayaan suku Madura yang sangat khas dan terkenal. Karapan sapi merupakan kesenian pesta adat rakyat berupa perlombaan dengan menggunakan semacam gerobak yang ditarik oleh dua ekor sapi dan terdapat satu joki sebagai pengendali laju sapi. Sejarah karapan sapi berawal dari Syeh Ahmad Baidawi yang memperkenalkan kepada masyarakat Madura tentang cara bercocok tanam sawah dengan menggunakan alat dari sepasang bambu disebut ‘nanggala’ atau ‘salaga’. Nanggala atau salaga ini ditarik oleh dua ekor sapi yang kemudian digunakan untuk membajak persawahan. Karapan sapi pada awal mulanya digunakan untuk menyeleksi sapi-sapi terbaik yang bisa digunakan untuk membajak sawah. Namun kemudian hal ini berkembang menjadi tradisi dan kesenian tersendiri.\n" +
                "\n" +
                "Masyarakat Madura biasa mengadakan perlombaan karapan sapi pada sekitar bulan-bulan Agustus dan September dan finalnya biasa dilaksanakan pada bulan Oktober. Tradisi tahunan karapan sapi ini cukup bergengsi di kalangan suku Madura karena sapi yang menjadi juara pada perlombaan ini selain meningkatkan status daya jualnya, juga dapat meningkatkan status sosial pemilik sapi. Karapan sapi biasa dilaksanakan pada areal persawahan dengan panjang lintasan sekitar 100 meter. Joki-joki karapan sapi harus berusaha memacu sapi-sapi mereka untuk dapat mencapai garis finish terlebih dahulu, yang tercepatlah yang dinyatakan sebagai pemenang.";
        stringBuilder.append(someMessage);

        dsckarapan.setText(stringBuilder.toString());
    }
}
