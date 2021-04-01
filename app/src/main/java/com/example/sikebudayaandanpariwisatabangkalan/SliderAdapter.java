package com.example.sikebudayaandanpariwisatabangkalan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    public int[] slide_image = {
            R.drawable.logobangkalaan,
            R.drawable.logobangkalaan,
            R.drawable.logobangkalaan,
            R.drawable.logobangkalaan,
            R.drawable.logobangkalaan,
            R.drawable.logobangkalaan,
            R.drawable.logobangkalaan,
            R.drawable.logobangkalaan,
            R.drawable.logobangkalaan,
            R.drawable.logobangkalaan,
            R.drawable.logobangkalaan


    };

    public String[] slide_headings = {
            "LAMBANG KABUPATEN BANGKALAN",
            "LAMBANG DAERAH",
            "PERISAI",
            "BINTANG KUNING EMAS",
            "SENJATA PENGGALAN DAN SENJATA CAKRA",
            "LAUTAN",
            "PANAH, ANAK PANAH DAN BUSURNYA",
            "API KONANG",
            "UNTAIAN BUNGA KAPAS",
            "DUA BUAH DAUN SUKUN",
            "SESANTI CIPTA INDRA CAKTI DHARMA"
    };

    public String[] slide_descs = {
            "Arti dari setiap simbol di kabupaten logo bangkalan.",
            "Lambang daerah kabupaten bangkalan ditetapkan berdasarkan "+
                    "Peraturan Daerah Nomor 8 Tahun 1971.",
            "Bentuk bunga teratai bersudut lima sebagai lambang kesetiaan "+
                    "penuh kepada Pancasila dan sifat kesatriaan, keagungan. "+
                    "Persaudaraan dan religious dari masyarakat Kabupaten Bangkalan.",
            "Sebagai lambang segala langkah perjuangan masyarakat selalu "+
                    "dipedomani kepercayaan yang mendalam kebesaran Tuhan Yang Maha Esa.",
            "Sebagai lambang jiwa kepahlawanan dalam menentang penjajah dahulu selalu "+
                    "diwarisi oleh generasi-generasi selanjutnya dalam mempertahankan tegaknya Negara "+
                    "Republik Indonesia berdasarkan Pancasila dan Undang-Undang Dasar 45.",
            "Sebagai tanda bahwa kabupaten Bangkalan sebagai bagian dari Pulau Madura yang "+
                    "dibatasi oleh lautan dan dari tiga arah, sebagai lambang dari kearifan "+
                    "dan kebijaksanaan yang dalam, serta kelapangan dada dalam menyelesaikan tugas dan kewajiban.",
            "Sebagai lambang kemauan yang keras dalam perjuangan menuju masyarakat adil "+
                    "dan makmur sesuai dengan tujuan Proklamasi 17 Agustus 1945.",
            "Sebagai lambang semangat yang tidak kunjung padam dari rakyat Kabupaten Bangkalan, "+
                    "dikenal sebagai daerah yang aktif membentuk suksesnya pembinaan persaudaraan "+
                    "dengan bangsa-bangsa lain di dunia dengan melalui forum olah raga (GANEFO)",
            "Untaian bunga kapas sebanyak 17 (Tujuh Belas) butir melambangkan kemakmuran di bidang sandang dan untaian padi, "+
                    "sebanyak 45 (Empat Puluh Lima) butir melambangkan kemakmuran dibidang pangan.",
            "Saat Sultan Agung Berperang pada tahun 1624 mendarat di pantai kamal dan melihat daun sukun yang melambai"+
                    "Raden Sagara Lahir beralaskan daun sukun (Raden Sagara adalah orang pertama orang yang pertama kali menginjakkan kaki di pulau madura).",
            "Yang berarti bahwa segala karya dari manusia hanya dapat terwujud dengan baik "+
                    "apabila mendapat ridho dari Tuhan yang Maha Esa"

    };

    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_image[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_descs[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((RelativeLayout)object);
    }
}
