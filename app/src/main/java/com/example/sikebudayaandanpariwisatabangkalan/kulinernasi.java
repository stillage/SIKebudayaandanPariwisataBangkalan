package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class kulinernasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kulinernasi);

        TextView dscnasi = (TextView)findViewById(R.id.descnasi);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Kata serpang sejatinya adalah nama dusun di Ds.Sabiyan, Kec.Arosbaya sekitar 10km dari pusat kota Bangkalan. Resep nasi serpang sendiri diwariskan secara turun-temurun dan masih menjadi penopang perekonomian dusun tersebut.\n" +
                "\n" +
                "Tetapi ketika ditanya, Kepala Desa Sabiyan, Hairis Zaman, mengatakan bahwa nasi serpang bukan berasal dari Dusun Serpang tetapi dari Dusun Timur Sungai yang jaraknya 800 m dari Dusun Serpang. Tetapi para penjual menjajakan nasi tersebut di dekat dusun serpang sehingga mereka menamai nasi tersebut dengan nasi serpang.\n" +
                "\n" +
                "Penampakan nasi serpang sendiri adalah sekepal nasi yang diisi dengan berbagai lauk pauk seperti sambal goreng kerang, rempeyek udan, empal goreng, kuah sik-usik (santan kental dengan kerupuk kulit sapi), pepes tongkol, telur asin, bihun kecap, serta serundeng. Meskipun hanya sekepal nasi tetapi nasi serpang cukup mengenyangkan. Dan juga karena banyaknya lauk yang ditawarkan sehingga kesan nasi tersebut menjadi colourfull.\n"+
                "Untuk di Bangkalan kota sendiri, nasi serpang dijual diberbagai tempat khusunya dipinggir jalan utama dan hanya tersedia waktu pagi hari mulai pukul 05.30 hingga 07.30, dikarenakan stok dari nasi serpang yang sangat terbatas. \n" +
                "\n" +
                "Harga untuk nasi serpang ini bervariasi tergantung penjual, ada yang menjual seharga Rp 12 ribu hingga Rp 18 ribu. Lumayan mahal memang tetapi jika sudah menjadi penikmat tentu akan tetap dibeli juga";

        stringBuilder.append(someMessage);

        dscnasi.setText(stringBuilder.toString());
    }
}
