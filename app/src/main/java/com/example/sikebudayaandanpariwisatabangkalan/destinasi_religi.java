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

public class destinasi_religi extends AppCompatActivity {

    ListView list;

    String titles[] = {"MASJID AGUNG BANGKALAN", "MAKAM SULTAN ABDUL KADIRUN", "PASAREAN MATA AER EBUH", "MAKAM KHOLIL BANGKALAN"};

    String description[] = {"Lokasi: Tajasah, Mertajasah, Kec. Bangkalan, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Demangan, Kec. Bangkalan, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Karang Pao, Arosbaya, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Tajasah, Mertajasah, Kec. Bangkalan, Kabupaten Bangkalan, Jawa Timur."};

    int imgs[] = {R.drawable.religimasjid, R.drawable.religisultankadirun, R.drawable.religiairmataebu, R.drawable.religimakamkholil};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinasi_religi);

        list = findViewById(R.id.list_view_religi);


        destinasi_religi.MyAdapter adapter = new destinasi_religi.MyAdapter(this, titles, imgs, description);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Toast.makeText(destinasi_religi.this, "MASJID AGUNG BANGKALAN", Toast.LENGTH_SHORT).show();
                    Intent tentmasjid = new Intent(destinasi_religi.this, religimasjidagung.class);
                    startActivity(tentmasjid);
                }
                if (position==1){
                    Toast.makeText(destinasi_religi.this, "MAKAM SULTAN ABDUL KADIRUN", Toast.LENGTH_SHORT).show();
                    Intent tentabdul = new Intent(destinasi_religi.this, religimakamabdul.class);
                    startActivity(tentabdul);
                }
                if (position==2){
                    Toast.makeText(destinasi_religi.this, "PASAREAN MATA AER EBUH", Toast.LENGTH_SHORT).show();
                    Intent tentebuh = new Intent(destinasi_religi.this, religimataaerebuh.class);
                    startActivity(tentebuh);
                }
                if (position==3){
                    Toast.makeText(destinasi_religi.this, "MAKAM KHOLIL BANGKALAN", Toast.LENGTH_SHORT).show();
                    Intent tentkholil = new Intent(destinasi_religi.this, religimakamkholil.class);
                    startActivity(tentkholil);
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
            super(c,R.layout.rowreligi, R.id.txt_judul_religi, titles);
            this.context=c;
            this.imgs=imgs;
            this.myTitles=titles;
            this.myDescriptions=description;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.rowreligi, parent, false);
            ImageView images = row.findViewById(R.id.logo_religi);
            TextView myTilte = row.findViewById(R.id.txt_judul_religi);
            TextView myDescription = row.findViewById(R.id.txt_keterangan_religi);
            images.setImageResource(imgs[position]);
            myTilte.setText(titles[position]);
            myDescription.setText(description[position]);
            return row;
        }
    }
}
