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

public class destinasi_kuliner extends AppCompatActivity {

    ListView list;

    String titles[] = {"BEBEK SINJAY", "KUE BONGKO", "TAJIN SOBHI", "NASI SERPANG"};

    String description[] = {"Lokasi: Jl. Raya Ketengan No.45, Junok, Tunjung, Kec. Burneh, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Jl. Raya Arosbaya, Tambak, Tengket, Arosbaya, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Mlajah, Kec. Bangkalan, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Jl. Trunojoyo No.21 B, Pejagan, Kec. Bangkalan, Kabupaten Bangkalan, Jawa Timu."};

    int imgs[] = {R.drawable.kulinerbebek, R.drawable.kulinerbongko, R.drawable.kulinertajinsobhi, R.drawable.kulinernasiserpang};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinasi_kuliner);

        list = findViewById(R.id.list_view_kuliner);


        destinasi_kuliner.MyAdapter adapter = new destinasi_kuliner.MyAdapter(this, titles, imgs, description);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Toast.makeText(destinasi_kuliner.this, "BEBEK SINJAY", Toast.LENGTH_SHORT).show();
                    Intent tentbebek = new Intent(destinasi_kuliner.this, kulinerbebek.class);
                    startActivity(tentbebek);
                }
                if (position==1){
                    Toast.makeText(destinasi_kuliner.this, "KUE BONGKO", Toast.LENGTH_SHORT).show();
                    Intent tentkue = new Intent(destinasi_kuliner.this, kulinerkue.class);
                    startActivity(tentkue);
                }
                if (position==2){
                    Toast.makeText(destinasi_kuliner.this, "TAJIN SOBHI", Toast.LENGTH_SHORT).show();
                    Intent tenttajin = new Intent(destinasi_kuliner.this, kulinertajin.class);
                    startActivity(tenttajin);
                }
                if (position==3){
                    Toast.makeText(destinasi_kuliner.this, "NASI SERPANG", Toast.LENGTH_SHORT).show();
                    Intent tentnasi = new Intent(destinasi_kuliner.this, kulinernasi.class);
                    startActivity(tentnasi);
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
            super(c,R.layout.rowkuliner, R.id.txt_judul_kuliner, titles);
            this.context=c;
            this.imgs=imgs;
            this.myTitles=titles;
            this.myDescriptions=description;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.rowkuliner, parent, false);
            ImageView images = row.findViewById(R.id.logo_kuliner);
            TextView myTilte = row.findViewById(R.id.txt_judul_kuliner);
            TextView myDescription = row.findViewById(R.id.txt_keterangan_kuliner);
            images.setImageResource(imgs[position]);
            myTilte.setText(titles[position]);
            myDescription.setText(description[position]);
            return row;
        }
    }
}
