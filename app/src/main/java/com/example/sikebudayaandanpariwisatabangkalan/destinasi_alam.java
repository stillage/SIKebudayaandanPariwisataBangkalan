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

public class destinasi_alam extends AppCompatActivity {



    ListView list;
    String titles[] = {"BUKIT JEDDIH", "AROSBAYA", "PANTAI SIRING KEMUNING", "LABUHAN MANGROVE", "BUKIT GEGER", "PANTAI RONGKANG"};
    String description[] = {"Parseh, Socah, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Buduran, Arosbaya, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Macajah, Tanjungbumi, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Labuhan, Kecamatan Sepuluh, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Desa Geger, Kecamatan Geger, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Desa Kwanyar, Kecamatan Geger, Kabupaten Bangkalan, Jawa Timur."};

    int imgs[] = {R.drawable.alamjeddih, R.drawable.alamarosbaya, R.drawable.alamsiring, R.drawable.alammangrove, R.drawable.alambukitgeger, R.drawable.alampantairongkang};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinasi_alam);

        list = findViewById(R.id.list_view_alam);


        destinasi_alam.MyAdapter adapter = new MyAdapter(this, titles, imgs, description);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Toast.makeText(destinasi_alam.this, "BUKIT JEDDIH...", Toast.LENGTH_SHORT).show();
                    Intent tentjeddih = new Intent(destinasi_alam.this, alamjeddih.class);
                    startActivity(tentjeddih);
                }
                if (position==1){
                    Toast.makeText(destinasi_alam.this, "BUKIT AROSBAYA...", Toast.LENGTH_SHORT).show();
                    Intent tentarosbaya = new Intent(destinasi_alam.this, alamarosbaya.class);
                    startActivity(tentarosbaya);
                }
                if (position==2){
                    Toast.makeText(destinasi_alam.this, "PANTAI SIRING KEMUNING...", Toast.LENGTH_SHORT).show();
                    Intent tentsiring = new Intent(destinasi_alam.this, alamkemuning.class);
                    startActivity(tentsiring);
                }
                if (position==3){
                    Toast.makeText(destinasi_alam.this, "LABUHAN MANGROVE...", Toast.LENGTH_SHORT).show();
                    Intent tentmangrove = new Intent(destinasi_alam.this, alammangrove.class);
                    startActivity(tentmangrove);
                }
                if (position==4){
                    Toast.makeText(destinasi_alam.this, "BUKIT GEGER...", Toast.LENGTH_SHORT).show();
                    Intent tentgeger = new Intent(destinasi_alam.this, alamgeger.class);
                    startActivity(tentgeger);
                }
                if (position==5){
                    Toast.makeText(destinasi_alam.this, "PANTAI RONGKANG...", Toast.LENGTH_SHORT).show();
                    Intent tentrongkang = new Intent(destinasi_alam.this, alamrongkang.class);
                    startActivity(tentrongkang);
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
            super(c,R.layout.rowalam, R.id.txt_judul_alam, titles);
            this.context=c;
            this.imgs=imgs;
            this.myTitles=titles;
            this.myDescriptions=description;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.rowalam, parent, false);
            ImageView images = row.findViewById(R.id.logo_alam);
            TextView myTilte = row.findViewById(R.id.txt_judul_alam);
            TextView myDescription = row.findViewById(R.id.txt_keterangan_alam);
            images.setImageResource(imgs[position]);
            myTilte.setText(titles[position]);
            myDescription.setText(description[position]);
            return row;
        }
    }
}
