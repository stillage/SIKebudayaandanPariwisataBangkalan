package com.example.sikebudayaandanpariwisatabangkalan;


import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import android.content.Intent;


public class destinasi_budaya extends AppCompatActivity {

    ListView list;
    String titles[] = {"KARAPAN SAPI BANGKALAN", "ROKAT BANGKALAN", "CAROK BANGKALAN", "TARI BANGKALAN"};
    String description[] = {"Parseh, Socah, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Buduran, Arosbaya, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Macajah, Tanjungbumi, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Desa Kwanyar, Kecamatan Geger, Kabupaten Bangkalan, Jawa Timur."};

    int imgs[] = {R.drawable.budayakarapan, R.drawable.budayarokat, R.drawable.budayacarok, R.drawable.budayatari};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinasi_budaya);

        list = findViewById(R.id.list_view_budaya);


        destinasi_budaya.MyAdapter adapter = new destinasi_budaya.MyAdapter(this, titles, imgs, description);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Toast.makeText(destinasi_budaya.this, "KARAPAN SAPI BANGKALAN", Toast.LENGTH_SHORT).show();
                    Intent tentjeddih = new Intent(destinasi_budaya.this, budayakarapan.class);
                    startActivity(tentjeddih);
                }
                if (position==1){
                    Toast.makeText(destinasi_budaya.this, "ROKAT BANGKALAN", Toast.LENGTH_SHORT).show();
                    Intent tentarosbaya = new Intent(destinasi_budaya.this, budayarokat.class);
                    startActivity(tentarosbaya);
                }
                if (position==2){
                    Toast.makeText(destinasi_budaya.this, "CAROK BANGKALAN", Toast.LENGTH_SHORT).show();
                    Intent tentsiring = new Intent(destinasi_budaya.this, budayacarok.class);
                    startActivity(tentsiring);
                }
                if (position==3){
                    Toast.makeText(destinasi_budaya.this, "TARI BANGKALAN", Toast.LENGTH_SHORT).show();
                    Intent tentmangrove = new Intent(destinasi_budaya.this, budayatari.class);
                    startActivity(tentmangrove);
                }

            }
        });


    }
    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String myTitles[];
        String myDescriptions[];
        int[] imgs;

        MyAdapter(Context c, String[] titles, int[] imgs, String[] description){
            super(c,R.layout.rowalam, R.id.txt_judul_budaya, titles);
            this.context=c;
            this.imgs=imgs;
            this.myTitles=titles;
            this.myDescriptions=description;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.rowbudaya, parent, false);
            ImageView images = row.findViewById(R.id.logo_budaya);
            TextView myTilte = row.findViewById(R.id.txt_judul_budaya);
            TextView myDescription = row.findViewById(R.id.txt_keterangan_budaya);
            images.setImageResource(imgs[position]);
            myTilte.setText(titles[position]);
            myDescription.setText(description[position]);
            return row;
        }
    }
}
