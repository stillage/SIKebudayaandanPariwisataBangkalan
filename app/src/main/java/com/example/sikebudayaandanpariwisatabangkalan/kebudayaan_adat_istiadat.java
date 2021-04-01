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

public class kebudayaan_adat_istiadat extends AppCompatActivity {

    ListView list;
    String titles[] = {"ROKAT TASE'", "ROKAT SOMOR BRUMBUNG", "PELET KANDUNG", "BANCANGAN", "TORON TANA"};
    String description[] = {"Kecamatan Sepulu, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Kecamatan Burneh, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Kecamatan Bangkalan, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Kecamatan Bangkalan, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Kecamatan Bangkalan, Kabupaten Bangkalan, Jawa Timur."};

    int imgs[] = {R.drawable.adat_rokattase, R.drawable.adat_rokatsomor, R.drawable.adat_pelet, R.drawable.adat_bacangan, R.drawable.adat_torontanah};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebudayaan_adat_istiadat);

        list = findViewById(R.id.list_view_adat);


        kebudayaan_adat_istiadat.MyAdapter adapter = new kebudayaan_adat_istiadat.MyAdapter(this, titles, imgs, description);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Toast.makeText(kebudayaan_adat_istiadat.this, "ROKAT TASE'...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_adat_istiadat.this, adat_rokattasek.class);
                    startActivity(tentrtase);
                }
                if (position==1){
                    Toast.makeText(kebudayaan_adat_istiadat.this, "ROKAT SOMOR BRUMBUNG...", Toast.LENGTH_SHORT).show();
                    Intent tenrokatsomor = new Intent(kebudayaan_adat_istiadat.this, adat_rokatsomor.class);
                    startActivity(tenrokatsomor);
                }
                if (position==2){
                    Toast.makeText(kebudayaan_adat_istiadat.this, "PELET KANDUNG...", Toast.LENGTH_SHORT).show();
                    Intent peletkandung = new Intent(kebudayaan_adat_istiadat.this, adat_peletkandung.class);
                    startActivity(peletkandung);

                }
                if (position==3){
                    Toast.makeText(kebudayaan_adat_istiadat.this, "BANCAGAN...", Toast.LENGTH_SHORT).show();
                    Intent tenbacangan = new Intent(kebudayaan_adat_istiadat.this, adat_bacangan.class);
                    startActivity(tenbacangan);

                }
                if (position==4){
                    Toast.makeText(kebudayaan_adat_istiadat.this, "TORON TANA...", Toast.LENGTH_SHORT).show();
                    Intent tentorontanah = new Intent(kebudayaan_adat_istiadat.this, adat_torontanah.class);
                    startActivity(tentorontanah);

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
            super(c,R.layout.rowkebudayaan_adat_istiadat, R.id.txt_judul_adat, titles);
            this.context=c;
            this.imgs=imgs;
            this.myTitles=titles;
            this.myDescriptions=description;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.rowkebudayaan_adat_istiadat, parent, false);
            ImageView images = row.findViewById(R.id.logo_adat);
            TextView myTilte = row.findViewById(R.id.txt_judul_adat);
            TextView myDescription = row.findViewById(R.id.txt_keterangan_adat);
            images.setImageResource(imgs[position]);
            myTilte.setText(titles[position]);
            myDescription.setText(description[position]);
            return row;
        }
    }
}

