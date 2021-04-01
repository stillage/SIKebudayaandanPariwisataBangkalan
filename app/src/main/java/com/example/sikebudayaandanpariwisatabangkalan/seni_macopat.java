package com.example.sikebudayaandanpariwisatabangkalan;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
public class seni_macopat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seni_macopat);

        TextView dscmacopat = (TextView)findViewById(R.id.descmacopat);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Tembheng Macapat\" adalah sebutan macopat dari Pulau Madura Khususnya Bangkalan. Biasanya dalam pembacaan macopat ini diiringi dengan alunan musik.\n" +
                "\n" +
                "Seiring dengan penyebaran dan perkembangan agama Islam di berbagai wilayah nusantara, Tembheng Macapat inipun menyebar ke Madura.\n";
        stringBuilder.append(someMessage);

        dscmacopat.setText(stringBuilder.toString());
    }
}
