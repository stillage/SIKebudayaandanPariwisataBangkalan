package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class kulinertajin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kulinertajin);

        TextView dsctajin = (TextView)findViewById(R.id.desctajin);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "\n" +
                "Tajin Sobih atau Bubur Sobih ini merupakan salah satu kuliner yang berasal dari Kabupaten Bangkalan. Tepatnya berasal dari Desa Sobih Salah satu desa kecil yang terletak di Kecamatan Bangkalan. Sebagian besar penjual Tajin Sobih ini memang datang langsung dari Desa Sobih itulah mengapa dinamakan Tajin Sobih.\n" +
                "\n" +
                "Tajin Sobih ini biasa dijajakan oleh ibu – ibu yang berusia lanjut dengan cara dipikul diatas kepala mereka dan dibawa berkeliling. Ketika melihat tampilan Tajin Sobih secara langsung teman – teman pasti akan langsung teringat dengan Bubur Sum Sum. Terdiri dari isian yang terbuat dari tepung ketan dan tepung terigu dengan warna dan bentuk yang bermacam – macam.\n"+
                "Makanan tradisional Bangkalan yang satu ini benar – benar masih terasa lekat nuansa tradisionalnya. Teman – teman bisa menyantap Tajin Sobih dengan bungkusan daun pisang dan sendoknya berasal dari daun pisang juga. Tajin Sobih yang manis dan gurih ini merupakan salah satu menu berbuka puasa yang banyak dicari masyarakat Bangkalan.\n" +
                "\n" +
                "Tidak semua orang bisa membuat Tajin Sobih dengan rasa yang khas, resep dan cara membuat Tajin Sobih ini membutuhkan tangan yang sudah terbiasa memasaknya. Untuk harga seporsi Tajin Sobih masih sangat murah yakni 2500 rupiah. Untuk porsi yang lebih banyak teman – teman cukup membayar dengan harga 5000 rupiah saja. ";

        stringBuilder.append(someMessage);

        dsctajin.setText(stringBuilder.toString());
    }
}
