package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class budayatari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budayatari);

        TextView dsctarii = (TextView)findViewById(R.id.desctarii);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Membangkitkan kembali apresiasi masyarakat terhadap budaya daerah, seperti pada kesenian tari tradisional,  memang tidaklah  mudah,  terutama dilakukan di tengah demikian derasnya arus modernisasi yang kini telah melanda semua bidang kehidupan. Sebenarnya, beberapa tahun yang lalu telah ada upaya yang dilakukan oleh sekelompok pemerhati budaya, diantaranya oleh kelompok yang menamakan diri “komunitas tera’ bulan’, melakukan kegiatan apresiasi seni pada setiap malam bulan purnama. Namun kegiatan ini tidak bisa bertahan lama dan tidak muncul lagi, penyebabnya mungkin sudah jenuh atau kurang lagi mendapatkan perhatian dari masyarakat.  Tampaknya belakangan ini telah ada upaya untuk tetap melestarikan kesenian daerah, khususnya budaya Bangkalan sebagaimana yang dilakukan oleh komunitas Sanggar Tari Tarara. Dari usianya,  memang masih relatif muda, namun komunitas seni yang dipimpin oleh Sudarsono ini telah menghasilkan karya-karya tari yang mengagumkan. Dengan mengkolaborasikan antara alat kesenian tradisonal seperti gamelan, gambang, jidor dengan alat musik modern seperti gitar akustik, Darso (panggilan akrab), telah mampu menghasilkan beberapa kreasi baru seni tari yang kontemporer akan tetapi sarat dengan nuansa budaya madura.   Beberapa terobosan telah dilakukan oleh Darso untuk memperkenalkan karyanya kepada publik, tidak hanya melalui berbagai moment maupun event yang ada di Bangkalan. akan tetapi juga melakukan tour ke beberapa kota seperti ke Sampang, Surabaya bahkan ke Jakarta (Taman Mini, Jaya Ancol).\n" +
                "        Diantara hasil karya tarinya yang spektakuler adalah tari ‘rampak jidor’. Tari yang seluruh penarinya para dara ini merupakan tari yang menggambarkan karakter orang madura yang sangat relegius. Seluruh gerak dan alunan irama nyanyian yang mengiringi tari ini mengungkapkan sikap dan  ekspresi sebuah puji-pujian, do’a dan dzikir kepada Allah SWT.  Dzat Yang Maha Kuasa dan Maha Pemberi.  Selain tari jidor adalah tari ‘bedoyo djukenes’, sebuah tari yang menurut riwayat merupakan tari yang biasa digelar untuk menyambut kedatangan prabu Cakraningrat IV yang dikenal pula dengan Pangeran Sidingkap, salah satu dari raja-raja yang memerintah madura di masa lampau. Tari bedoyo djukenes ini merupakan tari yang mengandung maksud sebagai ekspresi ucapan selamat datang kepada prabu seraya memohon kepada Yang Maha Kuasa untuk memberikan perlindungan dan keselamatan kepada beliau dalam memimpin rakyat madura menuju rakyat yang sejahtera, adil dan makmur";
        stringBuilder.append(someMessage);

        dsctarii.setText(stringBuilder.toString());
    }
}
