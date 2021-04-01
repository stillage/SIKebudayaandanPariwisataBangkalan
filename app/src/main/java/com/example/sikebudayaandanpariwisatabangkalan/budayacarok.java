package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class budayacarok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budayacarok);

        TextView dsccarok = (TextView)findViewById(R.id.desccarok);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Sebenarnya budaya carok yang sudah menjadi ikon bagi orang Madura, sampai detik ini masih belum jelas asal-muasalnya. Berdasarkan legenda rakyat, adalah bermula dari perkelahian antara Pak Sakera dengan dua bersaudara, Markasan dan Manbakri, yang antek-antek Belanda"+
                "Tujuan Carok\n" +
                "\n" +
                "Carok senantiasa dilakukan sebagai ritus balas dendam terhadap orang yang melakukan pelecehan harga diri, terutama gangguan terhadap isteri, yang membuat lelaki Madura malo (malu) dan tada’ tajina (direndahkan martabatnya). Carok telah menjadi arena reproduksi kekerasan. Korban carok, tidak dikubur di pemakaman umum melainkan di halaman rumah. Pakaiannya yang berlumur darah disimpan di almari khusus agar pengalaman traumatik terus berkobar guna mewariskan balas dendam."+
                "Prasyarat Carok\n" +
                "\n" +
                "Persiapan untuk melakukan carok, termasuk memenuhi 3 syarat utama, yaitu kadigdajan, tampeng sereng, dan banda. (Wiyata, 2002: 45). Untuk lebih jelasnya dapat dijelaskan sebagai berikut:\n" +
                "\n" +
                "1.Kadigdajan (kapasitas diri) adalah segala sesuatu yang berkaitan dengan kesiapan diri secara fisik dan mental. Prasyarat fisik dapat berupa penguasaan teknik bela diri. Prasyarat mental, pengertiannya lebih terkait dengan apakah orang tersebut punya nyali, angko (pemberani), ataupun juga jago.\n" +
                "\n" +
                "2.Tampeng sereng, menyangkut kepemilikan kekuatan yang diperoleh secara non-fisik, seperti membentengi diri sehingga kebal terhadap serangan musuh. Untuk maksud ini, pelaku carok meminta bantuan seorang “kiai”, yang akan melakukan “pengisian” mantra-mantra ke badan pelaku carok. Aktifitas berkunjung ke seorang ”kiai” ini disebut nyabis.\n" +
                "\n" +
                "3.Prasyarat ketiga adalah tersedianya dana (banda). Dalam konteks ini, carok mempunyai dimensi ekonomi, karena carok membutuhkan banyak biaya. Biaya diperlukan antara lain untuk melakukan persiapan mental dengan menebus mantra-mantra yang diperlukan, dan membeli celurit dengan kualitas nomor satu, dan juga diperlukan sebagai persiapan untuk menyelenggarakan kegiatan ritual keagamaan bagi pelaku carok yang kemungkinan terbunuh (selamatan 7 hari, 40 hari, 100 hari, hingga 1000 hari sejak kematian).";
        stringBuilder.append(someMessage);

        dsccarok.setText(stringBuilder.toString());
    }
}
