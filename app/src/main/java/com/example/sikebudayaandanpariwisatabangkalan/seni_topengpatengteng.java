package com.example.sikebudayaandanpariwisatabangkalan;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class seni_topengpatengteng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seni_topengpatengteng);

        TextView dsctopeng = (TextView)findViewById(R.id.desctopengpatengteng);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Upacara adat Topeng Patenteng di Kecamatan Modung, yaitu upacara ritual untuk memohon turunnya hujan ketika kemarau panjang mencapai puncak kegarangannya.\n";
        stringBuilder.append(someMessage);

        dsctopeng.setText(stringBuilder.toString());
    }
}
