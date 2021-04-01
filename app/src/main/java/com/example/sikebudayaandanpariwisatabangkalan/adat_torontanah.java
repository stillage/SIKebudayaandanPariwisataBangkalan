package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class adat_torontanah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adat_torontanah);

        TextView dsctorontanah = (TextView)findViewById(R.id.desctorontanah);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Toron Tana (Turun Tanah) adalah tradisi yang dilakukan untuk anak (bayi) berusia 7 bulan dimana tradisi ini untuk menandakan bahwa sang anak sudah mulai bisa menginjak tanah untuk belajar berjalan. Mungkin tradisi ini sudah lumrah dilakukan oleh masyarakat Indonesia terutama masyarakat Madura sendiri. Namun di setiap daerah memiliki kekhasan atau ciri yang berbeda seperti di Bangkalan.\n" +
                "Prosesi turun tanah di Bangkalan umumnya hampir sama dengan tradisi turun tanah di kota di madura yang lain. Acara ini biasanya mengundang tamu anak-anak kecil, kemudian disediakan barang-barang untuk nanti di ambil oleh si bayi yang akan turun tanah seperti sisir, Al-quran, Jagung, Kaca, tasbih, uang, dll. Barang-Barang yang di taruh biasanya tergantung dari orang tua si bayi hendak menaruh barang apa saja di suatu wadah, wadah yang biasa digunakan adalah nampan.\n" +
                "Prosesi pertama anak di hadapkan dengan benda-benda yang ada di depannya nanti si bayi akan mengambil benda tersebut. Benda-benda tersebut memiliki makna untuk kehidupan sang bayi kelak, misalnya barang pertama yang ia ambil Al-Quran bisa di artikan dan di harapkan kelak si bayi akan menjadi orang yang shalih/shalihah, Mengambil kaca bisa diartikan kelak akan pandai bersolek, mengambil uang ia kelak akan suka belanja dan lainnya.\n" +
                "Prosesi yang membedakan dengan prosesi yang ada di belahan kota madura lainnya adalah kalau di Bangkalan khususnya di Kamal, si anak harus menginjak yang disebut “Abu Tomang” setelah mengambil barang. Abu Tomang sendiri adalah istilah yang digunakan untuk abu sisa kayu bakar yang biasanya ada di tungku. Injak abu tomang ini sebagai simbol si anak sudah bisa diturunkah ke tanah untuk berjalan. Biasanya kalau di daerah saya Pamekasan, tidak ada ritual injak abu tomang ini yang ada kadang hanya menginjak bubur saja.\n" +
                "Setelah prosesi selesai semua, biasanya orang tua dari anak tersebut menyediakan alat pemukul biasa disebut “Panebbhâ”. Panebbhâ ini adalah sekumpulan lidi yang biasa digunakan untuk membersihkan kasur. Ketika acara usai, anak-anak yang di undang tadi akan dipukuli dengan panebbhâ tadi oleh tuan rumah sehingga anak-anak berlarian keluar. Hal ini dilakukan sebagai makna untuk mengusir hal-hal negatif yang ada di dalam ruangan tempat acara itu digelar agar tidak berpengaruh buruk bagi si bayi.\n" +
                "Tradisi ini memang telah lumrah dilakukan oleh masyarakat Madura namusn setiap daerah memiliki ciri khas yang berbeda dari mulai ritual yang dilakukan atau tata cara pelaksanaannya sendiri.\n" +
                "\n" +
                "sumber :https://medium.com/@citrazelyn/tradisi-toron-tana-turun-tanah-196d0eae2ee6\n\n";
        stringBuilder.append(someMessage);

        dsctorontanah.setText(stringBuilder.toString());
    }
}
