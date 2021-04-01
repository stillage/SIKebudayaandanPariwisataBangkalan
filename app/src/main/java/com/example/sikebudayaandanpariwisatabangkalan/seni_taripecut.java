package com.example.sikebudayaandanpariwisatabangkalan;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class seni_taripecut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seni_taripecut);

        TextView dsctaripecut = (TextView)findViewById(R.id.desctaripecut);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Bentuk Penyajian Tari Pecut dibagi menjadi tujuh unsur, yakni: (a) Gerak Tari Pecut terbagi dalam urutan: gerak menabur bunga, berdoa, thongghul pecut, onclang, tabangan, ngerrap sape, dan kemenangan; (b) Iringan yang digunakan adalah perpaduan Laras Slendro, tabbhuan thukthuk, dan saronen; (c) Pola lantai yang digunakan yakni garis lurus dan garis lengkung serta perpaduan antara keduanya; (d) Tata rias yang digunakan penari putri adalah rias cantik dan rias gagah untuk penari putra. Tata busana yang dikenakan yakni kebaya dan samper untuk penari putri dan untuk penari putra menggunakan odeng, kaos garis-garis merah-putih, selendang di pinggang, dan celana gombor \n";
        stringBuilder.append(someMessage);

        dsctaripecut.setText(stringBuilder.toString());
    }
}
