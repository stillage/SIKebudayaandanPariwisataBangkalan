package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class kebudayaan_lagu extends AppCompatActivity {

    ListView list;
    String titles[] = {"Aduh Beremma", "Aer Mata", "Ba' Ambaan", "Ba' Amba'an", "E Nanggala", "Gei' Bintang", "Gowa Pajudan", "Kacong Tor Jebbhing", "Kacong Tor Jebbhing Theme Song", "Kapencot Taresna",
            "Karaban Sape", "Ke' Lesap", "Kelangan", "Kembang Malate Pothe", "Kembangnga Nagar", "Kembangnga Nagara Eros", "Lan Bulanan", "Lir Saalir", "Mariam Soto", "Ngodhu Dhuwa", "Nyandhang Taresna Lake",
            "Nyandang Taresna Bini'", "Olle Olang", "Oramba' Orambing", "Pahlawan Trunojoyo", "Pajjar Laggu", "Pangeran Cakraningrat", "Pangesto",
            "Paseser Jumiang eros", "Pelteng", "Pornama E Pengger Seros", "Potre Madura", "Ronggo Sukowati", "Rowak Lajar", "Se Nanggala", "Soto Madura",
            "Tak Goyang Tultul", "Tanduk Majang", "Theme Song Cong Kene' & Bhing Ana' Aransemen Hendra Gemma", "Trunojoyo"};
    int imgs[] = {R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music, R.drawable.music,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebudayaan_lagu);

        list = findViewById(R.id.list_view_lagu);
        kebudayaan_lagu.MyAdapter adapter = new kebudayaan_lagu.MyAdapter(this, titles, imgs);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Toast.makeText(kebudayaan_lagu.this, "Aduh Beremma...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_aduhberemma.class);
                    startActivity(tentrtase);
                }
                if (position==1){
                    Toast.makeText(kebudayaan_lagu.this, "Aer Mata...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_aermata.class);
                    startActivity(tentrtase);

                }
                if (position==2){
                    Toast.makeText(kebudayaan_lagu.this, "Ba' Ambaan...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_baambaan.class);
                    startActivity(tentrtase);


                }
                if (position==3){
                    Toast.makeText(kebudayaan_lagu.this, "Ba' Amba'an...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_baaambakan.class);
                    startActivity(tentrtase);



                }
                if (position==4){
                    Toast.makeText(kebudayaan_lagu.this, "E Nanggala...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_enanggala.class);
                    startActivity(tentrtase);
                }
                if (position==5){
                    Toast.makeText(kebudayaan_lagu.this, "Gei' Bintang...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_gheikbintang.class);
                    startActivity(tentrtase);


                }
                if (position==6) {
                    Toast.makeText(kebudayaan_lagu.this, "Gowa Pajudan...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_gowapajudan.class);
                    startActivity(tentrtase);


                }if (position==7){
                    Toast.makeText(kebudayaan_lagu.this, "Kacong Tor Jebbhing...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_kacongtorcebing.class);
                    startActivity(tentrtase);
                }
                if (position==8){
                    Toast.makeText(kebudayaan_lagu.this, "Kacong Tor Jebbhing Theme Song...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_kacongtorcebingthemsong.class);
                    startActivity(tentrtase);
                }

                if (position==9) {
                    Toast.makeText(kebudayaan_lagu.this, "Kapencot Taresna...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_kapencottaresna.class);
                    startActivity(tentrtase);

                }
                if (position==10) {
                    Toast.makeText(kebudayaan_lagu.this, "Karaban Sape...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_karabansape.class);
                    startActivity(tentrtase);
                }
                if (position==11) {
                    Toast.makeText(kebudayaan_lagu.this, "Ke' Lesap...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_keklesap.class);
                    startActivity(tentrtase);


                }if (position==12){
                    Toast.makeText(kebudayaan_lagu.this, "Kelangan...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_kelangan.class);
                    startActivity(tentrtase);
                }
                if (position==13){
                    Toast.makeText(kebudayaan_lagu.this, "Kembang Malate Pothe...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_kembangmalatepothe.class);
                    startActivity(tentrtase);

                }
                if (position==14) {
                    Toast.makeText(kebudayaan_lagu.this, "Kembangnga Nagar...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_kembangnganagar.class);
                    startActivity(tentrtase);

                }if (position==15){
                    Toast.makeText(kebudayaan_lagu.this, "Kembangnga Nagara Eros...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_kembangnganagaraeros.class);
                    startActivity(tentrtase);

                }
                if (position==16) {
                    Toast.makeText(kebudayaan_lagu.this, "Lan Bulanan...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_lanbulanan.class);
                    startActivity(tentrtase);

                }
                    if (position==17){
                        Toast.makeText(kebudayaan_lagu.this, "Lir Saalir...", Toast.LENGTH_SHORT).show();
                        Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_lirsaalir.class);
                        startActivity(tentrtase);
                    }
                if (position==18){
                    Toast.makeText(kebudayaan_lagu.this, "Mariam Soto...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_mariamsoto.class);
                    startActivity(tentrtase);
                }
                if (position==19){
                    Toast.makeText(kebudayaan_lagu.this, "Ngodhu Dhuwa..", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_ngodhudhuwa.class);
                    startActivity(tentrtase);
                }
                if (position==20){
                    Toast.makeText(kebudayaan_lagu.this, "Nyandhang Taresna Lake...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_nyandhangtaresnalake.class);
                    startActivity(tentrtase);
                }
                if (position==21){
                    Toast.makeText(kebudayaan_lagu.this, "Nyandang Taresna Bini...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_nyandangtaresnabini.class);
                    startActivity(tentrtase);
                }
                if (position==22){
                    Toast.makeText(kebudayaan_lagu.this, "Olle Olang...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_olleolang.class);
                    startActivity(tentrtase);
                }
                if (position==23){
                    Toast.makeText(kebudayaan_lagu.this, "Oramba' Orambing...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_orambakorambing.class);
                    startActivity(tentrtase);
                }
                if (position==24){
                    Toast.makeText(kebudayaan_lagu.this, "Pahlawan Trunojoyo...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_pahlawantrunojoyo.class);
                    startActivity(tentrtase);
                }
                if (position==25){
                    Toast.makeText(kebudayaan_lagu.this, "Pajjar Laggu...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_pajjarlaggu.class);
                    startActivity(tentrtase);
                }
                if (position==26){
                    Toast.makeText(kebudayaan_lagu.this, "Pangeran Cakraningrat...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_pangerancakraningrat.class);
                    startActivity(tentrtase);
                }
                if (position==27){
                    Toast.makeText(kebudayaan_lagu.this, "Pangesto...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_pangesto.class);
                    startActivity(tentrtase);
                }
                if (position==28){
                    Toast.makeText(kebudayaan_lagu.this, "Paseser Jumiang eros...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_paseserjumiangeros.class);
                    startActivity(tentrtase);
                } if (position==29){
                    Toast.makeText(kebudayaan_lagu.this, "Pelteng...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_pelteng.class);
                    startActivity(tentrtase);
                }
                if (position==30){
                    Toast.makeText(kebudayaan_lagu.this, "Pornama E Pengger Seros...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_pornama_e_penggerseros.class);
                    startActivity(tentrtase);
                }
                if (position==31){
                    Toast.makeText(kebudayaan_lagu.this, "Potre Madura...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_potremadura.class);
                    startActivity(tentrtase);
                }
                if (position==32){
                    Toast.makeText(kebudayaan_lagu.this, "Ronggo Sukowati...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_ronggosukowati.class);
                    startActivity(tentrtase);
                }
                if (position==33){
                    Toast.makeText(kebudayaan_lagu.this, "Rowak Lajar...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_rowaklajar.class);
                    startActivity(tentrtase);

                } if (position==34){
                    Toast.makeText(kebudayaan_lagu.this, "Se Nanggala...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_senanggala.class);
                    startActivity(tentrtase);

                } if (position==35){
                    Toast.makeText(kebudayaan_lagu.this, "Soto Madura...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_sotomadura.class);
                    startActivity(tentrtase);

                } if (position==36){
                    Toast.makeText(kebudayaan_lagu.this, "Tak Goyang Tultul...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_takgoyangtultul.class);
                    startActivity(tentrtase);

                } if (position==37){
                    Toast.makeText(kebudayaan_lagu.this, "Tanduk Majang...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_tandukmajang.class);
                    startActivity(tentrtase);

                } if (position==38){
                    Toast.makeText(kebudayaan_lagu.this, "Theme Song Cong Kene' & Bhing Ana' Aransemen Hendra Gemma...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_congkenedanbhing.class);
                    startActivity(tentrtase);

                } if (position==39){
                    Toast.makeText(kebudayaan_lagu.this, "Trunojoyo...", Toast.LENGTH_SHORT).show();
                    Intent tentrtase = new Intent(kebudayaan_lagu.this, kebudayaan_lagu_trunojoyo.class);
                    startActivity(tentrtase);


                }
            }
        });


    }
    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String myTitles[];
        int[] imgs;

        MyAdapter(Context c, String[] titles, int[] imgs){
            super(c,R.layout.rowkebudayaan_lagu_madura, R.id.txt_judul_lagu, titles);
            this.context=c;
            this.imgs=imgs;
            this.myTitles=titles;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.rowkebudayaan_lagu_madura, parent, false);
            TextView myTilte = row.findViewById(R.id.txt_judul_lagu);
            myTilte.setText(titles[position]);
            return row;
        }
    }
}
