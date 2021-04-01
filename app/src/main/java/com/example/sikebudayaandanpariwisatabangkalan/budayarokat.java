package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class budayarokat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budayarokat);

        TextView dscrokatt = (TextView)findViewById(R.id.descrokatt);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Dusun Aeng Benger, Desa Kombangan, Kecamatan Geger, Kabupaten Bangkalan melakukan Rokat Somur.\n" +
                "\n" +
                "Rokat dilakukan sebab sudah menjadi kebiasaan tahunan yang tidak bisa ditinggalkan. Karena hanya satu-satunya sumur yang tidak pernah mati sumbernya sekalipun kemarau panjang.\n" +
                "\n" +
                "Rokat dilakukan satu tahun sekali setiap kemarau panjang dan ditepatkan Jumat Legi dengan harapan setelah sumur dirokat bisa diberi hujan.\n" +
                "\n" +
                "Artikel ini telah tayang di surya.co.id dengan judul Menengok Tradisi Rokat Sumur Dusun Aeng Banger, Desa Kombangan, Bangkalan Madura.\n"+
                "okat dihadiri sekitar 50 warga Dusun Aeng Benger, Jumat (11/10/2019).\n" +
                "\n" +
                "Ada juga warga dusun sebelah yang menumpang mandi atau mengambil air di sumur yang berpartisipasi.\n" +
                "\n" +
                "Yang dilakukan pertama adalah membersihkan sekitar sumur dengan membakar dedaunan yang kering, membersihkan selokan air, membuang sampah-sampah yang ada di sekitar sumur, dan membersihkan sumur.\n" +
                "\n" +
                "Caranya dengan menyumbat sumber airnya, lalu air di dalam sumur dikuras hingga bersih.\n" +
                "\n" +
                "Setelah semua bersih dilanjutkan doa bersama dengan membaca sholawat Nariyah sebanyak tujuh kali dan doa-doa lainnya.\n" +
                "\n" +
                "Warga sekitar yang datang membawa berbagai jajanan toko.\n" +
                "\n" +
                "Sesepuh warga membawa tumpeng dan tajin sebagai simbol rokat/selametan.";
        stringBuilder.append(someMessage);

        dscrokatt.setText(stringBuilder.toString());
    }
}
