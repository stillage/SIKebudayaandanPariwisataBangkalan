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

public class kebudayaan_kesenian extends AppCompatActivity {

    ListView list;
    String titles[] ={"HONG BAHONG", "GING GUNG", "THUK – THUK", "SLABADAN", "JARAN KENCA","GHUMBANG","ANGKLUNG TOPENG","TOPENG PATENG-TENG","MACOPPAT","TOPENG THAMBAK POCOK","MUSIK THANG-KATHENG","TANDHANG","GHAMANTAKA","TARI PECHUT","TARI PASEMOAN KERAPAN SAPI","TARI THAKTAK","TARI ANGHAS"};
    String description[] = {"Lokasi: Katol barat, Geger, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Arosbaya, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Bangkalan, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Socah, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Socah, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Tamba’ pocong, Tanjung Bumi, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Tamba’ pocong, Tanjung Bumi, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Tamba’ pocong, Tanjung Bumi, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Tamba’ pocong, Tanjung Bumi, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Modung, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Kecamatan Bangkalan, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Tanjung Bumi, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Burneh, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Bangkalan, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Bangkalan, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Bangkalan, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Bangkalan, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Bangkalan, Kabupaten Bangkalan, Jawa Timur.",
            "Lokasi: Bangkalan, Kabupaten Bangkalan, Jawa Timur."};


    int imgs[] = {R.drawable.alamjeddih, R.drawable.alamarosbaya, R.drawable.alamsiring, R.drawable.alammangrove, R.drawable.alambukitgeger, R.drawable.alampantairongkang, R.drawable.buatantaman, R.drawable.buatanpaseban, R.drawable.buatanmercusuar, R.drawable.religimasjid, R.drawable.religiairmataebu, R.drawable.religisultankadirun, R.drawable.religimakamkholil, R.drawable.kulinerbebek, R.drawable.kulinerbongko, R.drawable.kulinertajinsobhi, R.drawable.kulinernasiserpang};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebudayaan_kesenian);



        list = findViewById(R.id.list_view_kesenian);


        kebudayaan_kesenian.MyAdapter adapter = new kebudayaan_kesenian.MyAdapter(this, titles, imgs, description);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Toast.makeText(kebudayaan_kesenian.this, "HONG BAHONG...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_kesenian.this, seni_hongbahong.class);
                    startActivity(tentrtase);
                }
                if (position==1){
                    Toast.makeText(kebudayaan_kesenian.this, "GING GUNG...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_kesenian.this, seni_ginggung.class);
                    startActivity(tentrtase);

                }
                if (position==2){
                    Toast.makeText(kebudayaan_kesenian.this, "THUK THUK...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_kesenian.this, seni_thukthuk.class);
                    startActivity(tentrtase);


                }
                if (position==3){
                    Toast.makeText(kebudayaan_kesenian.this, "SLABADAN...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_kesenian.this, seni_slabadan.class);
                    startActivity(tentrtase);



                }
                if (position==4){
                    Toast.makeText(kebudayaan_kesenian.this, "JARAN KENCAK...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_kesenian.this, seni_jarankencak.class);
                    startActivity(tentrtase);

                }
                if (position==5){
                    Toast.makeText(kebudayaan_kesenian.this, "GHUMBANG...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_kesenian.this, seni_ghumbang.class);
                    startActivity(tentrtase);


                }
                if (position==6) {
                Toast.makeText(kebudayaan_kesenian.this, "ANGKLUNG TOPENG...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_kesenian.this, seni_angklungtopeng.class);
                    startActivity(tentrtase);


            }if (position==7){
                Toast.makeText(kebudayaan_kesenian.this, "TOPENG PETENG-TENG...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_kesenian.this, seni_topengpatengteng.class);
                    startActivity(tentrtase);

            }
                if (position==8){
                Toast.makeText(kebudayaan_kesenian.this, "MACOPAT...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_kesenian.this, seni_macopat.class);
                    startActivity(tentrtase);

            }

                if (position==9) {
                Toast.makeText(kebudayaan_kesenian.this, "TOPENG TAMBAK POCOG...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_kesenian.this, seni_topengtambakpocog.class);
                    startActivity(tentrtase);

            }
                if (position==10) {
                    Toast.makeText(kebudayaan_kesenian.this, "MUSIK TANG KATENG...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_kesenian.this, seni_musiktangkateng.class);
                    startActivity(tentrtase);

                }
                if (position==11) {
                    Toast.makeText(kebudayaan_kesenian.this, "TANDHANG...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_kesenian.this, seni_tandang.class);
                    startActivity(tentrtase);


                }if (position==12){
                    Toast.makeText(kebudayaan_kesenian.this, "GHAMANTAKAH...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_kesenian.this, seni_gemantaka.class);
                    startActivity(tentrtase);

                }
                if (position==13){
                    Toast.makeText(kebudayaan_kesenian.this, "TARI PECUT...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_kesenian.this, seni_taripecut.class);
                    startActivity(tentrtase);

                }
                if (position==14) {
                    Toast.makeText(kebudayaan_kesenian.this, "PASEMOAN KERAPAN SAPI...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_kesenian.this, seni_pasemoankerapansapi.class);
                    startActivity(tentrtase);

                }if (position==15){
                    Toast.makeText(kebudayaan_kesenian.this, "TARI TATAK...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_kesenian.this, seni_taritatak.class);
                    startActivity(tentrtase);

                }
                if (position==16){
                    Toast.makeText(kebudayaan_kesenian.this, "TARI ANGAS...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_kesenian.this, seni_tariangas.class);
                    startActivity(tentrtase);

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
            super(c,R.layout.rowkebudayan_kesenian, R.id.txt_judul_kesenian, titles);
            this.context=c;
            this.imgs=imgs;
            this.myTitles=titles;
            this.myDescriptions=description;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.rowkebudayan_kesenian, parent, false);
            TextView myTilte = row.findViewById(R.id.txt_judul_kesenian);
            TextView myDescription = row.findViewById(R.id.txt_keterangan_kesenian);
            myTilte.setText(titles[position]);
            myDescription.setText(description[position]);
            return row;
        }
    }
}



