package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class kulinerbebek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kulinerbebek);

        TextView dscbebek = (TextView)findViewById(R.id.descbebek);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Kepopuleran Bebek Sinjay hingga ke luar madura tentu tidak mudah didapatkan. Ada perjuangan dan cerita inspiratif selama proses perjalanannya. Perintisan Rumah Makan Sinjay ini dimulai sekitar tahun 2000-an. Saat itu,  Hj. Muslihah yang diketahui sebagai pendiri rumah Makan Bebek Sinjay, memutuskan untuk berjualan kuliner dan ternyata uasahanya tersebut berhasil dan populer hingga sekarang. \n"+
                "embeli yang membludak setiap harinya, membuat pihak rumah makan memberi tata cara mengantre. Teman Traveler yang akan ke sini, bisa memperhatikan petunjuk antri.Di dinding sudah ada tulisan yang jelas mana tempat untuk pemesanan. Setelah mendapat nota, baru setelah itu pindah ke bagian lain untuk mendapatkan makanan. Kemudian untuk take away sudah disediakan loket tersendiri.\n"+
                "Satu porsi Bebek Sinjay, dibanderol dengan harga yng cukup murah. Teman Traveler cukup membayar sekitar Rp25 ribu untuk setiap porsinya. Untuk merasakan langsung kenikmatan Bebek Sinjay, bisa langsung menuju ke alamat warung pusat di  Jalan Raya Ketengan No.45, Junok, Tunjung, Kecamatan Burneh, Kabupaten Bangkalan. Dari Jembatan Suramadu, cukup berkendara sekitar 20 menit. \n" +
                "\n" +
                "Itulah beberapa hal tentang Bebek Sinjay dengan segala kenikmatannya. Kalau masih belum bisa ke sini, Nasi Bebek Sinjay saat ini sudah tersedia cabang di beberapa kota. Tinggal pilih mana yang paling dekat dengan rumah kalian. ";

        stringBuilder.append(someMessage);

        dscbebek.setText(stringBuilder.toString());
    }
}
