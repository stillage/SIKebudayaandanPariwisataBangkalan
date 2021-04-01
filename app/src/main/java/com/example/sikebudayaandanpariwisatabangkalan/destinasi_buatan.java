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

public class destinasi_buatan extends AppCompatActivity {

    ListView list;

    String titles[] = {"TAMAN PASEBAN", "TAMAN REKREASI", "MERCUSUAR BANGKALAN"};

    String description[] = {"Lokasi: JL. Jend. Ahmad Yani, Demangan, Kecamatan Bangkalan, Jawa Timur.",
            "Lokasi: Mlajah, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Socah, Slempit, Pernajuh, Kabupaten Bangkalan, Jawa Timur."};

    int imgs[] = {R.drawable.buatanpaseban, R.drawable.buatantaman, R.drawable.buatanmercusuar};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinasi_buatan);

        list = findViewById(R.id.list_view_buatan);


        destinasi_buatan.MyAdapter adapter = new destinasi_buatan.MyAdapter(this, titles, imgs, description);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Toast.makeText(destinasi_buatan.this, "TAMAN PASEBAN", Toast.LENGTH_SHORT).show();
                    Intent tentpaseban = new Intent(destinasi_buatan.this, buatanpaseban.class);
                    startActivity(tentpaseban);
                }
                if (position==1){
                    Toast.makeText(destinasi_buatan.this, "TAMAN REKREASI", Toast.LENGTH_SHORT).show();
                    Intent tentrekreasi = new Intent(destinasi_buatan.this, buatantaman.class);
                    startActivity(tentrekreasi);
                }
                if (position==2){
                    Toast.makeText(destinasi_buatan.this, "MERCUSUAR BANGKALAN", Toast.LENGTH_SHORT).show();
                    Intent tentmercusuar = new Intent(destinasi_buatan.this, buatanmercusuar.class);
                    startActivity(tentmercusuar);
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
            super(c,R.layout.rowbuatan, R.id.txt_judul_buatan, titles);
            this.context=c;
            this.imgs=imgs;
            this.myTitles=titles;
            this.myDescriptions=description;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.rowbuatan, parent, false);
            ImageView images = row.findViewById(R.id.logo_buatan);
            TextView myTilte = row.findViewById(R.id.txt_judul_buatan);
            TextView myDescription = row.findViewById(R.id.txt_keterangan_buatan);
            images.setImageResource(imgs[position]);
            myTilte.setText(titles[position]);
            myDescription.setText(description[position]);
            return row;
        }
    }
}
